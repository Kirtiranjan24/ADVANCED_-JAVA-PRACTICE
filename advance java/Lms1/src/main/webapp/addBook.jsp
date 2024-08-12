<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
String message=(String)request.getAttribute("message");
if(message!=null)
	out.print(message);
%>
<form action="addBook" method="post">
     Book Name:<input type="text" name="book_name"><br>
     Author :<input type="text" name="author"><br>
     Publisher:<input type="text" name="publisher"><br>
     <input type="submit" value="Add Book"/><br>
     </form>
</body>
</html>