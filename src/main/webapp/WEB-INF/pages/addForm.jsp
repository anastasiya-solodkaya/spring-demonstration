<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
    <title>Добавьте свою идею!</title>
</head>
<body>

<form:form id="formCreate" modelAttribute="newIdea" method="post" action="submitNew">
    Название
    <form:input path="caption"/>
    Текст
    <form:textarea path="content"/>
    <form:hidden path="id"/>
    <button type="submit">Сохранить</button>
</form:form>
<a href="list">Отмена</a>

</body>
</html>
