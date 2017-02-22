<%@page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<%@ taglib uri="http://www.jahia.org/tags/internalLib" prefix="internal"%>
<%@ taglib prefix="ui" uri="http://www.jahia.org/tags/uiComponentsLib" %>
<%@ taglib prefix="utility" uri="http://www.jahia.org/tags/utilityLib" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<utility:setBundle basename="JahiaInternalResources"/>
<html>
<head>
    <meta charset="utf-8">
    <meta name="robots" content="noindex, nofollow"/>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/errors.css" type="text/css"/>
    <title><fmt:message key="label.error.404.title"/></title>
</head>
<body class="error-page" onLoad="if (history.length > 1) { document.getElementById('backLink').style.display=''; }">
    <div class="row-fluid login-wrapper">
        <div class="span4 box error-box">
            <div class="content-wrap">
                <h1 class="message-big"><fmt:message key="label.error.404.title"/></h1>
                <p><fmt:message key="label.error.404.description"/></p>
                <p id="backLink" style="display:none">
                    <a class="btn btn-large btn-block" href="javascript:history.back()">
                        <i class="icon-chevron-left"></i>
                        &nbsp;<fmt:message key="label.error.backLink.1"/>
                        &nbsp;<fmt:message key="label.error.backLink.2"/>
                        &nbsp;<fmt:message key="label.error.backLink.3"/>
                    </a>
                </p>
                <p><fmt:message key="label.error.homeLink"/></p>
                <a class="btn btn-large btn-block btn-primary" href="<c:url value='/'/>">
                    <i class="icon-home icon-white"></i>
                    &nbsp;<fmt:message key="label.homepage"/>
                </a>
            </div>
        </div>
    </div>
</body>