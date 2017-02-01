<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags" %>
<t:layout title="Новая идея">
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
</t:layout>
