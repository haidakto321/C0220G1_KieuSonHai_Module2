<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit customer</title>
</head>
<body>
<h1>Edit customer</h1>
<p>
    <c:if test='${"message" != null}'>
    <span class="message">${"message"}</span>
    </c:if>
</p>
<p>
    <a href="/products">Back to product list</a>
</p>
<form method="post">
    <fieldset>
        <legend>
            <table>
                <tr>
                    <td>Name: </td>
                    <td><input type="text" name="name" id="name" value="${product.getName()}"></td>
                </tr>
                <tr>
                    <td>Type: </td>
                    <td><input type="text" name="type" id="type" value="${product.getType()}"></td>
                </tr>
                <tr>
                    <td>Producer: </td>
                    <td><input type="text" name="producer" id="producer" value="${product.getProducer()}"></td>
                </tr>
                <tr>
                    <td><input type="submit" value="Update product"></td>
                </tr>
            </table>
        </legend>
    </fieldset>
</form>
</body>
</html>
