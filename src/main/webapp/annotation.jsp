<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>常用的注解测试</title>
    <link rel="stylesheet" type="text/css" href="css/annotation.css">
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
<div id="anno3">
    <strong><h3>@PathVariable测试</h3></strong>
    <a href="${pageContext.request.contextPath}/anno/testPathVariable/100">PathVariable注解测试</a>
</div>
<div id="anno4">
    <strong><h3>@RequestHeader测试</h3></strong>
    <a href="${pageContext.request.contextPath}/anno/testRequestHeader">PathVariable注解测试</a>
</div>
<div id="anno5">
    <strong><h3>@CookieValue测试</h3></strong>
    <a href="${pageContext.request.contextPath}/anno/testCookieValue">CookieValue注解测试</a>
</div>
<div id="anno6">
    <strong><h3>@ModelAttribute测试</h3></strong>
    <form action="${pageContext.request.contextPath}/anno2/testModelAttribute" method="post">
        <strong class="a">书名：</strong><input type="text" name="name"><br/><br/>
        <strong class="a">作者：</strong><input type="text" name="author"><br/><br/>
        <button type="submit">提交</button>&nbsp;&nbsp;&nbsp;&nbsp;<button type="reset">重置</button>
    </form>
</div>
<div id="anno7">
    <strong><h3>@SessionAttributes测试</h3></strong>
    <a href="${pageContext.request.contextPath}/anno/testSessionAttributes">SessionAttributes注解存入session数据测试</a><br/>
    <a href="${pageContext.request.contextPath}/anno/testSessionAttribute">SessionAttribute注解取出已存储的session数据测试</a>
</div>
</body>
</html>
