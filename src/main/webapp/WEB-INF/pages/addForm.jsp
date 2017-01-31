<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="<c:url value="/assets/css/bootstrap.min.css" />" rel="stylesheet">
    <link href="<c:url value="/assets/css/styles.css" />" rel="stylesheet">
    <link href='https://fonts.googleapis.com/css?family=Oxygen:400,300,700' rel='stylesheet' type='text/css'>
    <title>Новая идея</title>
</head>
<body>

<header class="navbar navbar-default">
    <div class="container">
        <ul class="nav navbar-nav navbar-left">
            <li>
                <a href="list"><span class="glyphicon glyphicon-list-alt"></span> Список идей</a>
            </li>
            <li class="active">
                <a href="create"><span class="glyphicon glyphicon-plus"></span> Добавить новую</a>
            </li>
        </ul>
    </div>
</header>

<div class="container">
    <h1 class="text-center text-uppercase">Добавление новой идеи</h1>
    <div class="jumbotron">
        <form:form id="formCreate" modelAttribute="newIdea" method="post" action="submitNew">
            <div class="form-group">
                <label for="captionId">Название</label>
                <form:input path="caption" id="captionId" cssClass="form-control"/>
            </div>
            <div class="form-group">
                <label for="contentId">Текст</label>
                <form:textarea path="content" id="contentId" cssClass="form-control"/>
            </div>
            <form:hidden path="id"/>
            <button type="submit" class="btn btn-success">Сохранить</button>
            <a href="list" class="danger-link">Отмена</a>
        </form:form>

    </div>
</div>


<footer class="panel-footer">
    <div class="container">
        <div class="row">
            <div class="col-md-12 text-center">&copy; Анастасия Солодкая</div>
        </div>
    </div>
</footer>

<script src="<c:url value="/assets/js/jquery-3.1.1.min.js"/>"></script>
<script src="<c:url value="/assets/js/bootstrap.min.js"/>"></script>
</body>
</html>

