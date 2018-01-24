<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
	    <base href="<%=basePath%>">
	    
	    <title>爬吖</title>
		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">    
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">
		<!--
		<link rel="stylesheet" type="text/css" href="styles.css">
		-->
		<link rel="stylesheet" href="css/index.css" />
	  <script type="text/javascript" src="js/jquery-1.6.3.min.js"></script>
	  <script type="text/javascript" src="js/index.js"></script>
 	</head>
  
  <body>
		<!-- start title -->
		<span class="textCenter">
			<h1 style="display: inline-block;">Pa</h1>
			<h2 style="display: inline-block;">Pa</h2>
			<h3 style="display: inline-block;">Pa</h3>
			<h4 style="display: inline-block;">Pa</h4>
			<h5 style="display: inline-block;">Pa</h5>
			<h6 style="display: inline-block;">Ya</h6>
		</span>
		<!-- end title -->
		
		<!-- start search -->
		<div class="search textCenter">
			<input type="text" placeholder="目标网址..."  id="url" />
			<button id="search">搜索</button>
		</div>
		<!-- end search -->
		
		<!-- start result -->
		<div class="result">
			<div class="content_title">
				<p>Result</p>
				<hr>
			</div>
			<div class="content">
				<div class="item">
					<img alt="" src="http://localhost:8080/TaoBao/img/main.png">			
				</div>
			</div>
				
		</div>
		<!-- end result -->
		
	</body>
</html>
