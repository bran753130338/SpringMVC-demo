<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>响应数据和结果视图</title>
    <link rel="stylesheet" type="text/css" href="css/response.css">
</head>
<body>
<div id="resp1">
    <strong><h3>测试返回字符串类型</h3></strong>
    <a href="response/testString">testString</a>
</div>
<div id="resp2">
    <strong><h3>测试返回void类型</h3></strong>
    <a href="response/testVoid">testVoid</a>
</div>
<div id="resp3">
    <strong><h3>测试返回ModelAndView类型</h3></strong>
    <a href="response/testModelAndView">testModelAndView</a>
</div>
<div id="resp4">
    <strong><h3>测试响应使用forward和redirect进行页面跳转</h3></strong>
    <a href="response/testForward">testForward转发</a><br/>
    <a href="response/testRedirect">testRedirect重定向</a>
</div>
</body>
</html>
