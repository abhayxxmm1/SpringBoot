<jsp:include page="form.jsp" />

<h1>Update </h1>



<form action="saveMe" method="post">
	id: <input type="number" name="id">
	name: <input type="text" name="name">
	salary: <input type="number" name="salary">
	skills: <input type="text" name="skill"><br> <br>
	<input type="submit" value="submit">
</form>

<jsp:include page="pagination.jsp" />