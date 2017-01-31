<%@ page language="java" contentType="text/html; UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="<c:url value="/assets/css/bootstrap.min.css" />" rel="stylesheet">
    <link href="<c:url value="/assets/css/styles.css" />" rel="stylesheet">
    <link href='https://fonts.googleapis.com/css?family=Oxygen:400,300,700' rel='stylesheet' type='text/css'>
    <title>Список идей</title>
</head>
<body>

<header class="navbar navbar-default">
    <div class="container">
        <ul class="nav navbar-nav navbar-left">
            <li class="active">
                <a href="list"><span class="glyphicon glyphicon-list-alt"></span> Список идей</a>
            </li>
            <li>
                <a href="create"><span class="glyphicon glyphicon-plus"></span> Добавить новую</a>
            </li>
        </ul>
    </div>
</header>

<div class="container">
    <h1 class="text-center text-uppercase">Список идей</h1>

    <div class="jumbotron">
        <c:forEach items="${list}" var="item" varStatus="loop">
            <c:if test="${loop.index % 2 == 0}">
                <div class="row">
            </c:if>
            <div class="col-md-6">
                <div class="idea-note">
                    <div class="idea-header">
                        <span class="idea-caption"><c:out value="${item.caption}"/></span>
                    </div>
                    <div class="idea-body">
                        <span class="idea-caption"><c:out value="${item.content}"/></span>
                    </div>
                    <div class="idea-footer">
                        <span class="idea-likes-dislikes ">
                            <span class="glyphicon glyphicon-triangle-top idea-likes-button" title="Нравится"></span>
                            <span class="idea-likes"><c:out value="${item.likes}"/></span>/
                            <span class="idea-dislikes"><c:out value="${item.dislikes}"/></span>
                            <span class="glyphicon glyphicon-triangle-bottom idea-dislikes-button" title="Не нравится"></span>
                        </span>
                        <span class="idea-edit-block ">
                            <a href="update?id=${item.id}" title="Редактировать" class="idea-edit"><span class="glyphicon glyphicon-pencil"></span></a>
                            <a href="delete?id=${item.id}" title="Удалить" class="idea-delete"><span class="glyphicon glyphicon-remove"></span></a>
                        </span>

                    </div>
                </div>
            </div>

            <c:if test="${loop.index % 2 == 1}">
                </div>
            </c:if>
        </c:forEach>

    </div>

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
