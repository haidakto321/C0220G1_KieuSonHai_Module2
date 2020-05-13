
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h2> Product Discount Calculator</h2>
    <form action="/calculate" method="post">
        <input type="text" name="description" placeholder="product description"><br/>
        <input type="text" name="list price" placeholder="list price"><br/>
        <input type="text" name="discount percent" placeholder="discount percent (%)"><br/>
        <input type="submit" id="submit" placeholder="calculate discount">

    </form>
</body>
</html>
