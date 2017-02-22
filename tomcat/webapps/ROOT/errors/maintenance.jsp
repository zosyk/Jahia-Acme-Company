<%@page language="java" contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<%@ taglib prefix="utility" uri="http://www.jahia.org/tags/utilityLib" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<utility:setBundle basename="JahiaInternalResources"/>
<html>
<head>
    <meta charset="utf-8">
    <meta name="robots" content="noindex, nofollow"/>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/errors.css" type="text/css"/>
    <title><fmt:message key="label.error.maintenance.title"/></title>
</head>
<body class="error-page">
<div class="row-fluid login-wrapper">
    <div class="span4 box error-box">
        <div class="content-wrap">
            <h1 class="message-big"><fmt:message key="label.error.maintenance.title"/></h1>
            <p><fmt:message key="label.error.maintenance.description"/></p>
        </div>
    </div>
</div>
</body>
</html>