<%@page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Spring Mvc</title>
</head>
<body>
<h2>Hello World!</h2>
<a href="hello" >入门程序</a><br/>
<a href="${pageContext.request.contextPath}/test/testRequestMapping">测试RequestMapping</a><br/>
<a href="${pageContext.request.contextPath}/test/testRequestMapping2?username=kris">测试RequestMapping2</a><br/>
<a href="${pageContext.request.contextPath}/param.jsp">请求参数绑定测试</a><br/>
<a href="${pageContext.request.contextPath}/servlet/testServlet">测试原生ServletAPI对象</a><br/>
<a href="annotation.jsp">常用注解练习</a><br/>
<a href="response.jsp">响应数据和结果视图</a><br/>
<a href="jsonresponse.jsp">响应返回JSON格式数据</a>
</body>
</html>
