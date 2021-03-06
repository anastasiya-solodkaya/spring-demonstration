<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="t" %>
<t:layout title="Редактирование идеи">
    <h1 class="text-center text-uppercase">Редактирование идеи</h1>
    <div class="jumbotron">
        <form:form id="formCreate" modelAttribute="newIdea" method="post" action="submitUpdate">
            <div class="form-group">
                <label for="captionId">Название</label>
                <form:input path="caption" id="captionId" cssClass="form-control"/>
            </div>
            <div class="form-group">
                <label for="contentId">Текст</label>
                <form:textarea path="content" id="contentId" cssClass="form-control"/>
            </div>
            <form:hidden path="id"/>
            <button type="submit" class="btn btn-success">Обновить</button>
            <a href="list" class="danger-link">Отмена</a>
        </form:form>

    </div>
</t:layout>
