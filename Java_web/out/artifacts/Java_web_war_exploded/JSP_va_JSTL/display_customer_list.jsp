<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="var" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 5/11/2020
  Time: 4:12 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <c:forEach var="khachhang" items="${danhsachkhachhang}">
    <tr>
        <td><c:out value="${khachhang.getName()}"/></td>
        <td><c:out value="${khachhang.getBirthday()}"/> </td>
        <td><c:out value="${khachhang.getAddress()}"/></td>
        <td><img src="<c:out value="${khachhang.getImage()}"/>"></td>
    </tr>
    </c:forEach>
</table>
</body>
</html>
