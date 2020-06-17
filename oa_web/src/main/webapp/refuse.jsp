<%--
  Created by IntelliJ IDEA.
  User: Lin
  Date: 2020/6/15
  Time: 12:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>EasyOffice 自动化办公系统</title>
    <style>
        *{
            margin: 0;
            padding: 0;
            background-color: #f4f4f4;
        }
        div{
            width: 200px;
            height: 200px;
        }
        .center-in-center{
            position: absolute;
            top: 50%;
            left: 50%;
            -webkit-transform: translate(-50%, -50%);
            -moz-transform: translate(-50%, -50%);
            -ms-transform: translate(-50%, -50%);
            -o-transform: translate(-50%, -50%);
            transform: translate(-50%, -50%);
        }
    </style>
</head>
<body>
    <div class="center-in-center">
        <h2>REFUSE</h2>
        <h4>你没有访问该资源的权限</h4>
        <a href="javascript:history.go(-1)">返回</a>
    </div>
</body>
</html>
