<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html>
<html>
<jsp:include page="header.jsp"></jsp:include>
<head>
<meta charset="UTF-8">
<script src="//code.jquery.com/jquery-3.3.1.min.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<title>Hello World</title>
</head>

<body>
 
<div>
  <label for ="userid"> Name: </label>
  <input id= "userid" type="text" name="userid"/>
  <button onclick ="submit()">조회</button>
</div>

<div>
 <label id = "data"></label>
  
</div>
  
  <div>
  <a href="/main/getList.do" class="button">리스트 조회</a>
  </div>
</body>
<script>

function submit() {
	var params =  { userid: $("#userid").val() };
	
	
	alert(params);
	
	$.ajax({
		type :"GET",
        url:'main/searchUserList.do',
        data : params,
        async : false,
        success:function(data){
        	console.log(data);

        	
        	//location.href = "../main/getList.do"
        },
        error : function(XMLHttpRequest, textStatus, errorThrown){ // 비동기 통신이 실패할경우 error 콜백으로 들어옵니다.
            alert("통신 실패.")
        }
    });
}

</script>

<jsp:include page="footer.jsp"></jsp:include>
</html>