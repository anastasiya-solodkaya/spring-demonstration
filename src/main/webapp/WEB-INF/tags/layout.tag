<%@tag pageEncoding="UTF-8" description="Base layout" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@attribute name="title" type="java.lang.String" required="true"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="<c:url value="/assets/css/bootstrap.min.css" />" rel="stylesheet">
    <link href="<c:url value="/assets/css/styles.css" />" rel="stylesheet">
    <link href='https://fonts.googleapis.com/css?family=Oxygen:400,300,700' rel='stylesheet' type='text/css'>
    <title><c:out value="${title}"/></title>
</head>
<body>

<header class="navbar navbar-default">
    <div class="container">
        <ul class="nav navbar-nav navbar-left">
            <li>
                <a href="list"><span class="glyphicon glyphicon-list-alt"></span> Список идей</a>
            </li>
            <li>
                <a href="create"><span class="glyphicon glyphicon-plus"></span> Добавить новую</a>
            </li>
            <li>
                <a href="register"><span class="glyphicon glyphicon-user"></span> Зарегистрироваться</a>
            </li>
        </ul>
    </div>
</header>

<div class="container">
    <jsp:doBody/>
</div>


<footer class="panel-footer">
    <div class="container">
        <div class="row">
            <div class="text-center">&copy; Анастасия Солодкая</div>
        </div>
    </div>
</footer>

</body>
<script src="<c:url value="/assets/js/jquery-3.1.1.min.js" />"></script>
<script src="<c:url value="/assets/js/bootstrap.min.js" />"></script>
</html>
