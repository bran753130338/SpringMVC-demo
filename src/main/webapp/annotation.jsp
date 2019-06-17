<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>常用的注解测试</title>
    <style type="text/css">
        .a{
            text-align: right;
            display: inline-block;
            width: 100px;
        }
        #anno1{
            text-align: center;
            width: 500px;
            height: 100px;
            background-color: aqua;
        }
        #anno2{
            margin-top: 50px;
            text-align: center;
            width: 500px;
            height: 200px;
            background-color: bisque;
        }
    </style>
</head>
<body>
<div id="anno1">
<strong><h3>@RequestParam测试</h3></strong>
<a href="${pageContext.request.contextPath}/anno/testRequestParam?name=kris">RequestParam注解测试</a>
</div>
<div id="anno2">
    <strong><h3>@RequestBody测试</h3></strong>
    <form action="${pageContext.request.contextPath}/anno/testRequestBody" method="post">
        <strong class="a">姓名：</strong><input type="text" name="name"><br/><br/>
        <strong class="a">年龄：</strong><input type="number" name="age"><br/><br/>
        <button type="submit">提交</button>&nbsp;&nbsp;&nbsp;&nbsp;<button type="reset">重置</button>
    </form>
</div>
</body>
</html>
