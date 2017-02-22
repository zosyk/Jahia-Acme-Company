<%@ page contentType="text/html; charset=UTF-8" language="java"
%><?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<%@ page import="org.jahia.services.content.JCRContentUtils" %>
<%@page import="org.jahia.utils.DateUtils"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<link rel="stylesheet" href="tools.css" type="text/css" />
<title>JCR Data Store Garbage Collection</title>
</head>
<body>
<h1>JCR Data Store Garbage Collection</h1>
<c:if test="${param.gc == 'true'}">
<% System.gc(); %>
</c:if>
<c:if test="${param.action == 'gc'}">
<%
long timer = System.currentTimeMillis();
int deleted = 0;
try {
    deleted = JCRContentUtils.callDataStoreGarbageCollector();
} catch (Exception e) {

} finally {
    pageContext.setAttribute("took", DateUtils.formatDurationWords(System.currentTimeMillis() - timer));
    pageContext.setAttribute("deleted", deleted);
}
%>
<p style="color: blue">Successfully executed in <strong>${took}</strong>. <strong>${deleted}</strong> data record(s) deleted.</p>
</c:if>
<p>Available actions:</p>
<ul>
    <li><a href="?action=gc" onclick="return confirm('You are about to start the DataStore Garbage Collector. All unused files in the data store will be permanently deleted. Do you want to continue?');">Run JCR DataStore garbage collector now</a></li>
    <li><a href="?action=gc&amp;gc=true" onclick="return confirm('You are about to start the DataStore Garbage Collector. All unused files in the data store will be permanently deleted. Do you want to continue?');">Run Java GC first and than run JCR DataStore garbage collector now</a></li>
</ul>
<%@ include file="gotoIndex.jspf" %>
</body>
</html>