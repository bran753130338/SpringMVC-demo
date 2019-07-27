<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>响应返回JSON格式数据</title>
    <link rel="stylesheet" type="text/css" href="css/response.css"/>
    <script src="js/jquery.js"></script>
    <script>
        //页面加载，绑定事件
        $(function () {
            $("#btn").click(function () {
                //发送ajax请求
                $.ajax({
                    //请求方式
                    type:"post",
                    //请求路径
                    url:"json/testAjax",
                    //发送信息到服务器时内容编码类型
                    contentType:"application/json;charset=UTF-8",
                    //向服务器发送的数据
                    data:'{"uname":"admin","age":18}',
                    //服务器返回的数据类型
                    dataType:"json",
                    //成功回调函数
                    success:function (data) {
                        //data是服务器端响应返回的数据
                        alert("用户名："+data.uname+" 年龄："+data.age)
                    }
                });
            })
        });
    </script>
</head>
<body>
<div id="json1">
    <h3>发送ajax请求</h3>
    <button id="btn">发送ajax请求</button>
</div>
</body>
</html>
