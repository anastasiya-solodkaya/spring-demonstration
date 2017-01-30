<%@ page language="java" contentType="text/html; UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<body>
<h2>Hello, table!</h2>
<table border="2px">
    <tr>
        <th>Id</th>
        <th>Caption</th>
        <th>Text</th>
        <th>Likes/Dislikes</th>
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
        </tr>
    </c:forEach>
</table>
</body>
</html>
