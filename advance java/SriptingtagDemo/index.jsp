<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

               <%!
               
               int a =10;
               String s ="kirti";
               
               int square(){
            	   
            	   return a*a;
               }
               
               %>
               
               <%
                
               out.println("a"+a);
               out.println("name"+s);
               out.println(square());
               
               int b=20;
               if(a<b){
            	   out.println("b is bigger");
               }
               else{
            	   out.println("a is bigger");
               }
               
               %>

</body>
</html>