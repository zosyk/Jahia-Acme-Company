<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<%@page import="net.sf.ehcache.Cache" %>
<%@page import="net.sf.ehcache.CacheManager" %>
<%@page import="org.jahia.services.cache.CacheHelper" %>
<%@page import="org.jahia.utils.FileUtils" %>
<%@ page import="java.util.Arrays" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="functions" uri="http://www.jahia.org/tags/functions" %>
<c:set var="showActions" value="${functions:default(fn:escapeXml(param.showActions), 'false')}"/>
<c:set var="showBytes" value="${functions:default(fn:escapeXml(param.showBytes), 'false')}"/>
<c:set var="showConfig" value="${functions:default(fn:escapeXml(param.showConfig), 'false')}"/>
<% pageContext.setAttribute("clusterActivated", Boolean.getBoolean("cluster.activated")); %>
<c:set var="flushIcon"><img src="<c:url value='/icons/showTrashboard.png'/>" height="16" width="16" alt=" "
                            align="top"/></c:set>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <link rel="stylesheet" href="tools.css" type="text/css"/>
    <c:if test="${showConfig}">
        <link type="text/css" href="<c:url value='/modules/assets/css/jquery.fancybox.css'/>" rel="stylesheet"/>
        <script type="text/javascript" src="<c:url value='/modules/jquery/javascript/jquery.min.js'/>"></script>
        <script type="text/javascript"
                src="<c:url value='/modules/assets/javascript/jquery.fancybox.pack.js'/>"></script>
        <script type="text/javascript">
            $(document).ready(function () {
                $('.configLink').fancybox({
                    'hideOnContentClick': false,
                    'titleShow': false,
                    'transitionOut': 'none',
                    'autoDimensions': false,
                    'width': 800,
                    'height': 600
                });
            });
        </script>
    </c:if>
    <script type="text/javascript">
        function go(id1, value1, id2, value2, id3, value3) {
            if (id1) {
                document.getElementById(id1).value = value1;
            }
            if (id2) {
                document.getElementById(id2).value = value2;
            }
            if (id3) {
                document.getElementById(id3).value = value3;
            }
            document.getElementById('navigateForm').submit();
        }
    </script>
    <title>Cache Management</title>
</head>
<body>
<h1>Cache Management</h1>
<fieldset style="position: absolute; right: 20px;">
    <legend><strong>Settings</strong></legend>
    <p>
        <input id="cbActions" type="checkbox" ${showActions ? 'checked="checked"' : ''}
               onchange="go('showActions', '${!showActions}')"/>&nbsp;<label for="cbActions">Show actions</label><br/>
        <input id="cbConfig" type="checkbox" ${showConfig ? 'checked="checked"' : ''}
               onchange="go('showConfig', '${!showConfig}')"/>&nbsp;<label for="cbConfig">Show config
        details</label><br/>
        <input id="cbBytes" type="checkbox" ${showBytes ? 'checked="checked"' : ''}
               onchange="go('showBytes', '${!showBytes}')"/>&nbsp;<label for="cbBytes">Show size in bytes
        (expensive)</label><br/>
    </p>

    <form id="navigateForm" action="?" method="get">
        <input type="hidden" id="showActions" name="showActions" value="${showActions}"/>
        <input type="hidden" id="showConfig" name="showConfig" value="${showConfig}"/>
        <input type="hidden" id="showBytes" name="showBytes" value="${showBytes}"/>
        <input type="hidden" id="action" name="action" value=""/>
        <input type="hidden" id="name" name="name" value=""/>
        <input type="hidden" id="propagate" name="propagate" value="false"/>
    </form>
</fieldset>

<c:if test="${not empty param.action}">
    <c:choose>
        <c:when test="${param.action == 'flushOutputCaches'}">
            <% CacheHelper.flushOutputCaches(Boolean.valueOf(request.getParameter("propagate"))); %>
            <p style="color: blue">Output HTML caches were successfully flushed</p>
        </c:when>
        <c:when test="${param.action == 'flushCaches' && not empty param.name}">
            <% CacheHelper.flushCachesForManager(request.getParameter("name"), Boolean.valueOf(request.getParameter("propagate"))); %>
            <p style="color: blue">Caches for manager ${param.name} were successfully flushed</p>
        </c:when>
        <c:when test="${param.action == 'flush' && not empty param.name}">
            <% CacheHelper.flushEhcacheByName(request.getParameter("name"), Boolean.valueOf(request.getParameter("propagate"))); %>
            <p style="color: blue">Cache ${param.name} was successfully flushed</p>
        </c:when>
        <c:when test="${param.action == 'flushAllCaches'}">
            <% CacheHelper.flushAllCaches(Boolean.valueOf(request.getParameter("propagate"))); %>
            <p style="color: blue">All caches were successfully flushed</p>
        </c:when>
    </c:choose>
</c:if>
<p>
    <a href="#refresh" onclick="go(); return false;" title="Refresh"><img src="<c:url value='/icons/refresh.png'/>"
                                                                          height="16" width="16" alt=" " align="top"/>Refresh</a>
    &nbsp;&nbsp;
    <a href="#flushOutputCaches" onclick="go('action', 'flushOutputCaches'); return false;"
       title="Performs flush of module output caches that are responsible for caching HTML page and fragment output, rendered in Live mode">${flushIcon}Flush
        HTML output caches</a>
    &nbsp;&nbsp;
    <c:if test="${clusterActivated}">
        <a href="#flushOutputCaches" onclick="go('action', 'flushOutputCaches', 'propagate', 'true'); return false;"
           title="Does the same flush as 'Flush HTML output caches' also propagating flush to all cluster nodes">${flushIcon}Flush
            HTML output caches (all across the cluster)</a>
        &nbsp;&nbsp;
    </c:if>
    <a href="#flushAllCaches" onclick="go('action', 'flushAllCaches'); return false;"
       title="Triggers the flush of all caches, including back-end and front-end (module output)">${flushIcon}Flush
        all caches</a>
    <c:if test="${clusterActivated}">
        <a href="#flushAllCaches" onclick="go('action', 'flushAllCaches', 'propagate', 'true'); return false;"
           title="Does the same flush as 'Flush all caches' also propagating flush to all cluster nodes">${flushIcon}Flush
            all caches (all across the cluster)</a>
        &nbsp;&nbsp;
    </c:if>
</p>
<% pageContext.setAttribute("cacheManagers", CacheHelper.getCacheManagerInfos(Boolean.valueOf((String) pageContext.getAttribute("showConfig")), Boolean.valueOf((String) pageContext.getAttribute("showBytes")))); %>
<c:forEach items="${cacheManagers}" var="managerEntry" varStatus="managerStatus">
    <c:set var="manager" value="${managerEntry.value}"/>
    <h2>Cache Manager: ${manager.name}
        <c:if test="${showConfig}">
            &nbsp;
            <a class="configLink" title="Cache configuration details" href="#managerconfig-${managerStatus.index}"><img
                    src="<c:url value='/icons/help.png'/>" width="16" height="16" alt="?"
                    title="Cache configuration details"/></a>

            <div style="display: none;">
                <div id="managerconfig-${managerStatus.index}">
                    <h3>${manager.name}</h3>
                    <pre>${fn:escapeXml(manager.config)}</pre>
                </div>
            </div>
        </c:if>
    </h2>
    <c:if test="${showActions}">
        <a href="#flushCaches" onclick="go('action', 'flushCaches', 'name', '${manager.name}'); return false;"
           title="Flushes all caches of this manager">${flushIcon}Flush caches for this manager</a>
        <c:if test="${clusterActivated}">
            &nbsp;&nbsp;
            <a href="#flushCaches"
               onclick="go('action', 'flushCaches', 'name', '${manager.name}', 'propagate', 'true'); return false;"
               title="Does the same flush as 'Flush caches for this manager' also propagating flush to all cluster nodes">${flushIcon}Flush
                caches for this manager (all across the cluster)</a>
        </c:if>
    </c:if>
    <table border="1" cellspacing="0" cellpadding="5">
        <thead>
        <tr>
            <th rowspan="2">#</th>
            <c:if test="${showConfig}">
                <th rowspan="2">?</th>
            </c:if>
            <th rowspan="2">Name</th>
            <th colspan="${manager.overflowToOffHeap ? 4 : 3}">Entries</th>
            <c:if test="${showBytes}">
                <th colspan="${manager.overflowToOffHeap ? 3 : 2}">Size</th>
            </c:if>
            <th colspan="4">Access statistics</th>
            <c:if test="${showActions}">
                <th rowspan="2">Actions</th>
            </c:if>
        </tr>
        <tr>
            <th>total</th>
            <th>memory</th>
            <th>disk</th>
            <c:if test="${manager.overflowToOffHeap}">
                <th>off-heap</th>
            </c:if>
            <c:if test="${showBytes}">
                <th>memory</th>
                <th>disk</th>
                <c:if test="${manager.overflowToOffHeap}">
                    <th>off-heap</th>
                </c:if>
            </c:if>
            <th>total</th>
            <th>hits</th>
            <th>misses</th>
            <th>rate, %</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${manager.caches}" var="cacheEntry" varStatus="status">
            <c:set var="cache" value="${cacheEntry.value}"/>
            <tr>
                <td><strong>${status.index + 1}</strong></td>
                <c:if test="${showConfig}">
                    <td align="center">
                        <a class="configLink" title="Cache configuration details"
                           href="#config-${managerStatus.index}-${status.index}"><img
                                src="<c:url value='/icons/help.png'/>" width="16" height="16"
                                alt="?" title="Cache configuration details"/></a>

                        <div style="display: none;">
                            <div id="config-${managerStatus.index}-${status.index}">
                                <h3>${cache.name}</h3>
                                <pre>${fn:escapeXml(cache.config)}</pre>
                            </div>
                        </div>
                    </td>
                </c:if>
                <td>${cache.name}</td>
                <td align="center">${cache.size}</td>
                <td align="center">${cache.localHeapSize}</td>
                <td align="center">${cache.overflowToDisk ? cache.localDiskSize : '-'}</td>
                <c:if test="${manager.overflowToOffHeap}">
                    <td align="center">${cache.overflowToOffHeap ? cache.localOffHeapSize : '-'}</td>
                </c:if>

                <c:if test="${showBytes}">
                    <td align="center">${cache.localHeapSizeInBytesHumanReadable}</td>
                    <td align="center">${cache.overflowToDisk ? cache.localDiskSizeInBytesHumanReadable : '-'}</td>
                    <c:if test="${manager.overflowToOffHeap}">
                        <td align="center">${cache.overflowToOffHeap ? cache.localOffHeapSizeInBytesHumanReadable : '-'}</td>
                    </c:if>
                </c:if>

                <td align="center">${cache.accessCount}</td>
                <td align="center">${cache.hitCount}</td>
                <td align="center">${cache.missCount}</td>
                
                <c:set var="cacheEfficiency" value="${cache.hitRatio}"/>
                <c:set var="effColour" value="#222222"/>
                <c:choose>
                    <c:when test="${cacheEfficiency > 0 && cacheEfficiency < 30}">
                        <c:set var="effColour" value="red"/>
                    </c:when>
                    <c:when test="${cacheEfficiency >= 30 && cacheEfficiency < 70}">
                        <c:set var="effColour" value="blue"/>
                    </c:when>
                    <c:when test="${cacheEfficiency >= 70}">
                        <c:set var="effColour" value="green"/>
                    </c:when>
                </c:choose>
                <td align="center">
                    <span style="color: ${effColour}">
                        <fmt:formatNumber value="${cacheEfficiency}" pattern="0.00"/>
                    </span>
                </td>
                <c:if test="${showActions}">
                    <td align="center"><a href="#flush"
                                          onclick="go('action', 'flush', 'name', '${cache.name}'); return false;"
                                          title="Remove all entries from the ${cache.name}">${flushIcon}</a></td>
                </c:if>
            </tr>
        </c:forEach>

        <tr>
            <td colspan="${showConfig ? '3' : '2'}">Total</td>
            <td align="center">${manager.size}</td>
            <td align="center">${manager.localHeapSize}</td>
            <td align="center">${manager.overflowToDisk ? manager.localDiskSize : '-'}</td>
            <c:if test="${manager.overflowToOffHeap}">
                <td align="center">${manager.localOffHeapSize}</td>
            </c:if>
            <c:if test="${showBytes}">
                <td align="center">${manager.localHeapSizeInBytesHumanReadable}</td>
                <td align="center">${manager.localDiskSizeInBytesHumanReadable}</td>
                <c:if test="${manager.overflowToOffHeap}">
                    <td align="center">${manager.localOffHeapSizeInBytesHumanReadable}</td>
                </c:if>
            </c:if>
            <td align="center">${manager.accessCount}</td>
            <td align="center">${manager.hitCount}</td>
            <td align="center">${manager.missCount}</td>
            <td>&nbsp;</td>
            <c:if test="${showActions}">
                <td align="center">&nbsp;</td>
            </c:if>
        </tr>
        </tbody>
    </table>
</c:forEach>
<%@ include file="gotoIndex.jspf" %>
</body>
</html>