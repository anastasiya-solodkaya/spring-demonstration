<%@ page language="java" contentType="text/html; UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<body>
<h2>Список идей:</h2>
<a href="create">Создать новую.</a>
<table border="2px">
    <tr>
        <th>Id</th>
        <th>Caption</th>
        <th>Text</th>
        <th>Likes/Dislikes</th>
        <th></th>
    </tr>
    <%--
    for(Idea item : list ){
    ...
    }
    --%>
    <c:forEach items="${list}" var="item">
        <tr>
            <td><c:out value="${item.id}"/></td>
            <td><c:out value="${item.caption}"/></td>
            <td><c:out value="${item.content}"/></td>
            <td><c:out value="${item.likes}"/>/<c:out value="${item.dislikes}"/></td>
            <td>
                <span><a href="update?id=${item.id}">edit</a></span>
                <span><a href="delete?id=${item.id}">delete</a></span>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
