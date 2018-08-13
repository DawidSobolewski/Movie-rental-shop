<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Movie Rental</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <link rel="stylesheet" href="../../style.css" type="text/css">
</head>
<body>

<div class="jumbotron jumbotron-fluid">
    <div class="container" id="banner">
        <%--<img src="../../paramount-header-image1.jpg" alt="mountain" class ="img-fluid">--%>
        <div class="cointainer" id="textWrapperOnBanner">
            <a href="/addMovie/view">
                <button type="button" class="btn btn-outline-success btn-lg">ADD</button>
            </a>
            <a href="/updateMovie/view">
                <button type="button" class="btn btn-outline-warning btn-lg">UPDATE</button>
            </a>
            <a href="/showMovies">
                <button type="button" class="btn btn-outline-light btn-lg">SHOW</button>
            </a>
            <a href="/deleteMovie/view">
                <button type="button" class="btn btn-outline-danger btn-lg">DELETE</button>
            </a>
        </div>
    </div>
</div>


<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
        integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
        crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
        integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
        crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
        integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
        crossorigin="anonymous"></script>

</body>
</html>
