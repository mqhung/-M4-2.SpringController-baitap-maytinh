
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculator</title>
</head>
<body>
<h2>Simple Calculator</h2>
<form method="post">
    <input type="text" name="firstNumber" placeholder="Input first number">
    <input type="text" name="secondNumber" placeholder="Input second number"> <br>
    <input type="submit" value="Addition" name="calculation">
    <input type="submit" value="Subtraction" name="calculation">
    <input type="submit" value="Multiplication" name="calculation">
    <input type="submit" value="Division" name="calculation">
</form>
<h3>Result ${calculation}: ${result}</h3>
</body>
</html>
