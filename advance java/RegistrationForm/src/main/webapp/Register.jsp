<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration Form</title>
</head>
<body>
     <form action="regForm" method="post">
        Name: <input type="text" name="name1"/><br/><br/>
        Email: <input type="text" name="email1"/><br/><br/>
        Password: <input type="password" name="password"/><br/><br/>
        Gender: 
        <input type="radio" name="gender1" value="Male"/> Male 
        <input type="radio" name="gender1" value="Female"/> Female 
        <br/><br/>
        City: 
        <select name="city1">
            <option value="">Select City</option>
            <option value="Cuttack">Cuttack</option>
            <option value="Bhubaneswar">Bhubaneswar</option>
            <option value="Khorda">Khorda</option>
            <option value="Kalahandi">Kalahandi</option>
        </select>
        <br/><br/>
        <input type="submit" value="Register" />
    </form>
</body>
</html>
