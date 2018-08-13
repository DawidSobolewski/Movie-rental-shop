<page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>List of movies</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>

<div class="container mt-4">
    <table class="table table-hover">
        <thead>
        <tr>
            <th>#</th>
            <th>ID</th>
            <th>Title</th>
            <th>Category</th>
            <th>Country</th>
            <th>Release</th>
            <th>Length</th>
            <th></th>
        </tr>
        </thead>
        <tbody>
        <form action="/deleteMovie" method="post">
            <c:forEach var="movie" items="${movies}" varStatus="loop">
            <tr>
                <th scope="row">${loop.index + 1}</th>
                <td>${movie.id}</td>
                <td>${movie.title}</td>
                <td>${movie.category}</td>
                <td>${movie.country}</td>
                <td>${movie.release}</td>
                <td>${movie.length}</td>
                <td><input class="form-check-input" type="radio" name="id" value="${movie.id}">
                </td>
            </tr>
            </c:forEach>
        </tbody>
    </table>
    <input type="submit" value="Delete" class="btn btn-outline-danger">
    </form>

    <a href="/">
        <button type="button" class="btn btn-outline-secondary">Home</button>
    </a>
</div>

</body>
</html>