<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>请求参数绑定</title>
    <style type="text/css">
        .a{
            text-align: right;
            display: inline-block;
            width: 100px;
        }
        #param1{
            text-align: center;
            width: 500px;
            height: 200px;
            background-color: aqua;
        }
        #param2{
            margin-top: 50px;
            text-align: center;
            width: 500px;
            height: 400px;
            background-color: beige;
        }
        #param3{
            margin-top: 50px;
            text-align: center;
            width: 500px;
            height: 450px;
            background-color: cadetblue;
        }
        #param4 {
            margin-top: 50px;
            text-align: center;
            width: 500px;
            height: 200px;
            background-color: aliceblue;
        }
    </style>
</head>
<body style="text-align: center">
<div id="param1">
    <strong><h3>接收基本数据类型</h3></strong>
    <form action="${pageContext.request.contextPath}/param/testParam" method="post">
        <strong class="a">用户名：</strong><input type="text" name="username"><br/><br/>
        <strong class="a">密码：</strong><input type="password" name="password"><br/><br/>
        <button type="submit">提交</button>&nbsp;&nbsp;&nbsp;&nbsp;<button type="reset">重置</button>
    </form>
</div>
<div id="param2">
    <strong><h3>接收JavaBean数据类型</h3></strong>
    <form action="${pageContext.request.contextPath}/param/saveAccount" method="post">
        <strong class="a">姓名：</strong><input type="text" name="username"><br/><br/>
        <strong class="a">密码：</strong><input type="password" name="password"><br/><br/>
        <strong class="a">金额：</strong><input type="number" name="money"><br/><br/>
        <strong class="a">用户姓名：</strong><input type="text" name="user.uname"><br/><br/>
        <strong class="a">用户年龄：</strong><input type="number" name="user.age"><br/><br/>
        <button type="submit">提交</button>&nbsp;&nbsp;&nbsp;&nbsp;<button type="reset">重置</button>
    </form>
</div>
<div id="param3">
    <strong><h3>接收集合数据类型</h3></strong>
    <%--把数据封装到Manager类中，类中存在List、Map的集合数据类型--%>
    <form action="${pageContext.request.contextPath}/param/saveManager" method="post">
        <strong class="a" >姓名：</strong><input type="text" name="name"><br/><br/>
        <%--封装到list--%>
        <strong class="a">list用户姓名：</strong><input type="text" name="list[0].uname"><br/><br/>
        <strong class="a">list用户年龄：</strong><input type="number" name="list[0].age"><br/><br/>
        <%--封装到map--%>
        <strong class="a">map用户姓名：</strong><input type="text" name="map['user'].uname"><br/><br/>
        <strong class="a">map用户年龄：</strong><input type="number" name="map['user'].age"><br/><br/>
        <button type="submit">提交</button>&nbsp;&nbsp;&nbsp;&nbsp;<button type="reset">重置</button>
    </form>
</div>
<div id="param4">
    <%--
        自定义日期转换格式(yyyy-MM-dd)
    --%>
    <strong><h3>自定义类型转换器</h3></strong>
    <form action="${pageContext.request.contextPath}/param/saveBook" method="post">
        <strong class="a">图书名字：</strong><input type="text" name="name"><br/><br/>
        <strong class="a">图书作者：</strong><input type="text" name="author"><br/><br/>
        <strong class="a">出版日期：</strong><input type="text" name="date"><br/><br/>
        <button type="submit">提交</button>&nbsp;&nbsp;&nbsp;&nbsp;<button type="reset">重置</button>
    </form>
</div>
</body>
</html>
