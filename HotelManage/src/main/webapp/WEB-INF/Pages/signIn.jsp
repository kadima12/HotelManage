<%--
  Created by IntelliJ IDEA.
  User: 刘浩伟
  Date: 2021/5/18
  Time: 10:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <script type="text/javascript" src="js/jquery-3.4.1.js"></script>
    <script type="text/javascript"></script>
    <title>Title</title>
</head>
<body>
<div align="center">
    <form action="toWelcome.do" method="post">
        <table>
            <tr>
                <td>姓名：</td>
                <td><input type="text" name="managerName"></td>
            </tr>
            <tr>
                <td>工号：</td>
                <td><input type="text" name="managerId"></td>
            </tr>
            <tr>
                <td>&nbsp;&nbsp;&nbsp;&nbsp;</td>
                <td><input type="submit" value="登录"></td>
            </tr>
            ${tips}
        </table>
    </form>
</div>
</body>
</html>
