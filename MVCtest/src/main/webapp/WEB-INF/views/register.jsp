<jsp:include page="form.jsp" />
<h1>Fill the below form</h1>

<form action="save" method="post">
	Name: <input type="text" name="name"> <br>
	Salary : <input type="text" name="salary"> <br>
	Skills : <input type="text" name="skill"> <br>
	<button type="submit">Submit</button>
</form>

<jsp:include page="pagination.jsp" />
