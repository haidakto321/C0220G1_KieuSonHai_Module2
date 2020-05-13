<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 5/12/2020
  Time: 4:38 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>View product</title>
</head>
<body>
<h1>Product detail</h1>
<p><a href="/products">Back to product list</a></p>
<table>
    <tr>
        <td>Name: </td>
        <td>${product.getName()}</td>
    </tr>
    <tr>
        <td>Type: </td>
        <td>${product.getType()}</td>
    </tr>
    <tr>
        <td>Producer: </td>
        <td>${product.getProducer()}</td>
    </tr>
</table>
</body>
</html>
