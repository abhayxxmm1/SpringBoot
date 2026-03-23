<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>



<jsp:include page="form.jsp" />

<table class="table table-bordered table-striped" style="border: 2px black;">
  <thead class="table-dark">
    <tr>
      <th>Id</th>
      <th>Name</th>
      <th>Salary</th>
      <th>Skills</th>
	  <th scope="col">Update Operation</th>
	  <th scope="col">Delete Operation</th>
    </tr>
  </thead>

  <tbody>
    <c:forEach var="emp" items="${employees}">
      <tr>
        <td>${emp.id}</td>
        <td>${emp.name}</td>
        <td>${emp.salary}</td>
        <td>${emp.skill}</td>
 		<td><a href="up">Update</a></td>
		<td><a href="delete?id=${emp.id}">Delete</a></td>
      </tr>
    </c:forEach>
  </tbody>
</table>





<jsp:include page="pagination.jsp" />