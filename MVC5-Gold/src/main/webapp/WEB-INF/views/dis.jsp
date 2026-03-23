<jsp:include page="form.jsp" />

<pre>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
</pre>
	

<h3>need to take this tag ☝🏿🏿</h3>
<h3>for importing the jstl code</h3>

<br>
<br>
<br>
<h1>Data is ${cars}</h1>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Car List</title>

    <!-- Bootstrap CDN -->
    <link
        href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
        rel="stylesheet">
</head>
<body>

<div class="container mt-5">
    <h2 class="text-center mb-4">🚗 Car Details</h2>

    <table class="table table-bordered table-striped table-hover text-center">
        <thead class="table-dark">
            <tr>
                <th>ID</th>
                <th>Brand</th>
                <th>Model</th>
            </tr>
        </thead>

        <tbody>
            <c:forEach var="car" items="${cars}">		
                <tr>
                    <td>${car.id}</td>
                    <td>${car.brand}</td>
                    <td>${car.model}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>

    <c:if test="${empty cars}">
        <div class="alert alert-warning text-center">
            No car records found!
        </div>
    </c:if>
</div>

</body>
</html>









<br>
<br>
<h1>this code using Bootstrap 👇🏿</h1>

<br>
<br>
<table class="table">
  <thead>
    <tr>
      <th scope="col">id</th>
      <th scope="col">Brand</th>
      <th scope="col">Model</th>
      <th scope="col">Update Operation</th>
      <th scope="col">Delete Operation</th>
    </tr>
  </thead>
  <tbody>
	<c:forEach var="car" items="${cars}">
	    <tr>
	      <td>${car.id}</td>
	      <td>${car.brand}</td>
	      <td>${car.model}</td>
	      <td><a href="update">Update</a></td>
	      <td><a href="delete?id=${car.id}">Delete</a></td>
	    </tr>
	</c:forEach>
    
  </tbody>
</table>







