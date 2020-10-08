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
<body>
<div class="container">
    <div class="row">
        <img src="images/carrentalFog.png">
        <nav class="navbar-expand-md bg-dark navbar-dark">
            <div class="collapse navbar-collapse" id="collapsibleNavbar">
                <ul class="navbar-nav ml-auto">
                    <li class="active"><a href="#">Home</a></li>
                    <li><a href="#">Find us</a></li>
                    <li><a href="#">Fog Airline</a></li>
                    <li><a href="#">Fog Design</a></li>
                </ul>
            </div>
        </nav>
    </div>
    <div class="row">
        <p></p>
    </div>
    <div class="row">
        <div class="col-md-3 ">
            <div class="jumbotron">
                <form action="car.jsp" method="post">
                    <ul class="m-1 list-group">
                        <li class="list-group-item" >Audi A6</li>
                        <li class="list-group-item">Sporty</li>
                        <li class="list-group-item">One week for only $200</li>
                    </ul>
                    <input type="hidden" name="userId" value="take">
                    <button class="btn btn-outline-info" type="submit">Take offer </button>
                    </form>
            </div>
        </div>
        <div class="col-md-4 col-sm">
            <img src="images/As6.jpg">
        </div>
    </div>
    <!--<div id="bannerimage"></div>-->
    <form >
        <div class="form-group">
            <label for="ecocars">Eco</label>
            <select id="ecocars" name="ecocars">
                <c:forEach var="car" items="${ecobiler}">
                    <option value="${car.id}">${car.model} ${car.make} ${car.MPG_City}</option>
                </c:forEach>
            </select>
        </div>

        <div class="form-group">
            <input type="radio" id="gold" name="membertype" value="gold">
            <label for="gold">Gold</label><br>
            <input type="radio" id="premium" name="membertype" value="premium">
            <label for="premium">Premium</label><br>
            <input type="radio" id="custom" name="membertype" value="custom" checked>
            <label for="custom">First customer</label>
        </div>
        <div class="form-group">
            <input type="checkbox" id="insurance" name="insurance" value="insurance">
            <label for="insurance"> I want insurance</label><br>
            <input type="checkbox" id="childseat" name="childseat" value="childseat">
            <label for="childseat"> I want a child seat</label><br>
            <input type="checkbox" id="dropdiff" name="dropdiff" value="dropdiff" onclick="dropLocations()">
            <label for="dropdiff"> I want a different drop</label><br>
            <div class="drops" style="visibility: hidden">
                <input type="text" id="droplocation" name="droplocation">
            </div>
        </div>
        <div class="form-group">
            <label for="comment">Comment on car</label><br>
            <input type="text" id="comment" name="comment">
        </div>
        <button class="btn btn-primary" type="submit">Indsend</button>
    </form>


    <footer class="page-footer font-small blue">

        <!-- Copyright -->
        <div class="footer-copyright text-center py-3">© 2020 Copyright:
            <a href="cars.html">More Cars </a>
            <a href="locations.html">More Locations </a>
            <a href="offers.html">Special offers </a>
        </div>
        <!-- Copyright -->

    </footer>
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js" integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV" crossorigin="anonymous"></script>
</div>
</body>
</html>

