<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>文件上传</title>
</head>
<body>
<div style="width: 500px;height: 100px;text-align: center;background-color: chartreuse">
    <h3>传统的文件上传方式</h3>
    <form action="file/fileupload1" method="post" enctype="multipart/form-data">
        <strong>选择文件</strong><input type="file" name="upload"/><br/>
        <button type="submit">上传</button>
    </form>
</div>
<div style="width: 500px;height: 100px;text-align: center;background-color: cadetblue">
    <h3>SpringMVC的文件上传方式</h3>
    <form action="file/fileupload2" method="post" enctype="multipart/form-data">
        <strong>选择文件</strong><input type="file" name="upload"/><br/>
        <button type="submit">上传</button>
    </form>
</div>
</body>
</html>
