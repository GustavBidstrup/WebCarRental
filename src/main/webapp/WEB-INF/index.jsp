<%@ page import="com.wulf.function.entities.Car" %>
<%@ page import="java.util.List" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html>
<body>
<p>Try</p>
<%
    List<Car> cars = (List<Car>) request.getAttribute("billiste");
    List<Car> allcars = (List<Car>) request.getAttribute("allebiler");

%>
<c:out value="${navn}"> </c:out>
<p>Navn;</p>
<%= cars %>
<p>AllNavn;</p>
<c:forEach var="car" items="${allebiler}">
Item <c:out value = "${car.model} ${car.make}"/><p>
</c:forEach>
<%= allcars %>
<h2>Hello World!</h2>
</body>
