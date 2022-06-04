<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculator</title>
    <style>
        <%@include file="style_1.css" %>
    </style>
    <script type="text/javascript">
        <%@include file="script.js" %>
    </script>
</head>
<body>
<label for="inp">
    Choose operation:
</label><select name="operation" id="inp" onchange="setInp()">
    <option value="1" selected>-</option>
    <option value="2">+</option>
    <option value="3">*</option>
    <option value="4">/</option>
    <option value="5">sin(x)</option>
    <option value="6">cos(x)</option>
    <option value="7">tg(x)</option>
    <option value="8">ctg(x)</option>
    <option value="9">ln(x)</option>
    <option value="10">lg(x)</option>
    <option value="11">sec(x)</option>
    <option value="12">cosec(x)</option>
    <option value="13">sh(x)</option>
    <option value="14">ch(x)</option>
    <option value="15">a^b</option>
</select>
<br><br>
<form action="Answer" method="post" id="form">
    A:<input name="a"/><br><br>B:<input name="b"/><br><br><input type="submit"  name='oper' value='-'>
</form>
</body>
</html>