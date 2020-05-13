<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculator</title>
</head>
<body>
<h1>Simple calculator</h1>
<form action="/simplecalculate" method="post">
    <table>
        <tr>
            <td>First operand:</td>
            <td><input type="text" name="first operand"></td>
        </tr>
        <tr>
            <td>Operator</td>
            <td>
                <select name="operator">
                    <option value="+">Addition</option>
                    <option value="-">Subtraction</option>
                    <option value="*">Multiplication</option>
                    <option value="/">Division</option>
                </select>
            </td>
        </tr>
        <tr>
            <td>Second operand: </td>
            <td><input type="text" name="second operand"></td>
        </tr>
        <tr>
            <td>
                <input type="submit" value="tinh">
            </td>
        </tr>

    </table>
</form>
</body>
</html>
