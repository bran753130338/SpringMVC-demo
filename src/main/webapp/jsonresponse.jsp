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
                    url:"ajax/testJson",
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
            });
            $("#btn1").click(function () {
                //发送ajax请求
                $.ajax({
                    //请求方式
                    type:"post",
                    //请求路径
                    url:"ajax/testXml",
                    //发送信息到服务器时内容编码类型
                    contentType:"text/xml;charset=UTF-8",
                    //服务器返回的数据类型
                    dataType:"XML",
                    //向服务器发送的数据
                    data:'<user><uname>雷神</uname><age>16</age></user>',
                    //成功回调函数
                    success:function (data) {
                        //data是服务器端响应返回的数据
                        var name = data.getElementsByTagName("uname")[0].childNodes[0].nodeValue;
                        var age = data.getElementsByTagName("age")[0].childNodes[0].nodeValue;
                        alert("用户名："+name+" 年龄："+age)
                        //将XMLDocument对象转换成字符串
                        // var str = (new XMLSerializer()).serializeToString(data);
                        // alert(str)

                    }
                });
            })
        });
    </script>
</head>
<body>
<div id="json1">
    <h3>发送ajax请求返回json数据</h3>
    <button id="btn">发送ajax请求</button>
</div>
<div id="xml1">
    <h3>发送ajax请求返回xml数据</h3>
    <button id="btn1">发送ajax请求</button>
</div>
</body>
</html>
