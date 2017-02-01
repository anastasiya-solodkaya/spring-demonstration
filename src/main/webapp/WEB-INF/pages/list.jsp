<%@ page language="java" contentType="text/html; UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags" %>


<t:layout title="Список идей">

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

</t:layout>
