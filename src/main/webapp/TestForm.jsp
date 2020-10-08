<%@ page import="com.wulf.function.entities.Car" %>
<%@ page import="java.util.List" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
    <link rel="stylesheet" href="css/style.css">
    <script src="myStuff.js"></script>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<%!
    public String doThis(String to, String sub, String msg) {
        String res = null;
        System.out.println("HI");
        return res;
    }
%>

<%
    String a = request.getParameter("to");
    if(a != null){
        doThis(request.getParameter("to"),request.getParameter("sub"),request.getParameter("msg"));
    }
%>
<body><center>
    <form action="car.jsp" method="post">
        <label>Email To</label><br />
        <input type="text" name="to" /><br /> <br />
        <label>Subject</label><br />
        <input type="text" name="sub" /><br /> <br />
        <label >Message</label><br />
        <input type="text" name="msg" /><br /> <br />
        <input type="submit"/>
    </form>
</center></body>
</html>