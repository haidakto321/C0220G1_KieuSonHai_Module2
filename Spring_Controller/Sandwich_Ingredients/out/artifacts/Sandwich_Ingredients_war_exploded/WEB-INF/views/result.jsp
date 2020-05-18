<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h3>
        <c:forEach items="${condiment}" var="result">
            ${result}</br>
        </c:forEach>
    </h3>
</body>
</html>
