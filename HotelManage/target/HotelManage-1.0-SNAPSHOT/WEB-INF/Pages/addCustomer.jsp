<%--
  Created by IntelliJ IDEA.
  User: 刘浩伟
  Date: 2021/5/14
  Time: 9:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <div align="center">
        <form action="addCustomer.do" method="post">
            <table>
                <tr>
                    <td>身份证号：</td>
                    <td><input type="text" name="identityId"></td>
                </tr>
                <tr>
                    <td>姓名：</td>
                    <td><input type="text" name="customerName"></td>
                </tr>
                <tr>
                    <td>性别：</td>
                    <td><input type="text" name="sex"></td>
                </tr>
                <tr>
                    <td>年龄：</td>
                    <td><input type="text" name="age"></td>
                </tr>
                <tr>
                    <td>&nbsp;&nbsp;&nbsp;&nbsp;</td>
                    <td><input type="submit" value="注册"></td>
                </tr>
            </table>
        </form>
    </div>
</body>
</html>
