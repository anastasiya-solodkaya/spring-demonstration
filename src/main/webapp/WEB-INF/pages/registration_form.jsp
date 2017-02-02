<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags" %>
<t:layout title="Регистрация пользователя">
    <h1 class="text-center text-uppercase">Регистрация</h1>
    <div class="jumbotron">
        <form:form id="formRegister" modelAttribute="user" method="post" action="registeruser">
            <div class="form-group">
                <label for="emailId">Email</label>
                <form:errors path="login" cssClass="form-control label-danger"/>
                <form:input path="login" id="emailId" cssClass="form-control"/>
            </div>
            <div class="form-group">
                <label for="passwordId">Пароль</label>
                <form:errors path="password" cssClass="form-control label-danger"/>
                <form:password path="password" id="passwordId" cssClass="form-control"/>
            </div>
            <div class="form-group">
                <label for="passwordId">Подтверждение пароля</label>
                <form:errors cssClass="form-control label-danger"/>
                <form:password path="password1" id="passwordId1" cssClass="form-control"/>
            </div>
            <button type="submit" class="btn btn-success">Зарегистрироваться</button>
            <a href="list" class="danger-link">Отмена</a>
        </form:form>

    </div>
</t:layout>
