<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 5/14/2020
  Time: 8:51 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>

<form method="post" action="calculator">
    <h1>Calculator</h1>
    <fieldset>
        <legend>Calculator information</legend>
        <table>
            <tr>
                <td>First operand:</td>
                <td><input type="text" name="firstOperand" id="firstOperand" value="${firstOperand}"></td>
            </tr>
            <tr>
                <td>Second operand:</td>
                <td><input type="text" name="secondOperand" id="secondOperand" value="${secondOperand}"></td>
            </tr>
        </table>
        <input type="submit" value="Addition" name="calculator">
        <input type="submit" value="Subtraction" name="calculator">
        <input type="submit" value="Multiplication" name="calculator">
        <input type="submit" value="Division" name="calculator">
    </fieldset>
</form>
</body>
</html>
