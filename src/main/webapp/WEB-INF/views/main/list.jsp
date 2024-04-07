<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="/css/style.css"> 
<title>User List 조회 </title>
</head>
<body>
list 조회 
<c:forEach var="list" items="${list}"> </c:forEach>
<h1> css test </h1>
  <div> Hello World ${list}</div>  
</body>
</html>