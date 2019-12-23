<%@ page import="aaa.dataB" %>
<html>
<body>
<h2><%=new dataB().getResult()%></h2>

<form class="form-plus" role="form" method="get" action="plus">
    <input type=text"" name="a">+
    <input type="text" name="b">
    <input id="getresult" type="submit">
</form>

<form class="form-minus" role="form" method="get" action="minus">
    <input type=text"" name="a">-
    <input type="text" name="b">
    <input id="getresult2" type="submit">
</form>

<form class="form-plus" role="form" method="get" action="multiply">
    <input type=text"" name="a">*
    <input type="text" name="b">
    <input id="getresult3" type="submit">
</form>

<form class="form-plus" role="form" method="get" action="divide">
    <input type=text"" name="a">/
    <input type="text" name="b">
    <input id="getresult4" type="submit">
</form>
</body>
</html>
