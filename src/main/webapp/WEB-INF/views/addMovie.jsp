<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

</head>
<body>
<div class="container mt-4">
    <form action="/addMovie" method="post">
        <div class="row">
            <div class="col-sm-6">
                <div class="form-group">
                    <label>Title</label>
                    <input type="text" class="form-control"  name="title" value="${movie.title}">
                </div>
                <div class="form-group">
                    <label>Country</label>
                    <input type="text" class="form-control"  name="country" value="${movie.country}">
                </div>
                <div class="form-group">
                    <label>Length</label>
                    <input type="number" class="form-control" name="length" value="${movie.category}">
                </div>
            </div>
            <div class="col-sm-6">
                <div class="form-group">
                    <label >Category</label>
                    <select class="form-control" name="category">
                        <c:forEach var="category" items="${categories}">
                            <option>${category}</option>
                        </c:forEach>
                    </select>
                </div>
                <div class="form-group">
                    <label>Filmaker</label>
                    <select class="form-control" name="authorId">
                        <%--<c:forEach var="author" items="${authors}">--%>
                            <%--<option value="${author.id}">${author.displayName}</option>--%>
                        <%--</c:forEach>--%>
                    </select>
                </div>
                <div class="form-group">
                    <label >Release</label>
                    <input type="date" class="form-control" name="release" value="${movie.release}">
                </div>
            </div>
        </div>
        <div class="row">
            <div class="col-sm-12">
                <div class="form-group">
                    <label>Summary</label>
                    <textarea rows="3"
                              class="form-control"
                              id="bookSummary"
                              name="summary">${movie.summary}</textarea>
                </div>
            </div>
        </div>
        <input type="submit" value="Add" class="btn btn-success">
        <a href="/">
            <button type="button" class="btn btn-outline-secondary">Cancel</button>
        </a>
    </form>
</div>
</body>
</html>
