<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>

<title>FIRIST WEB APP</title>
<style>.erorKojiJaHocu{
	color: red;
}</style>
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/style.css">

<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/add-customer-style.css">


</head>
<body bgcolor=#0099ff>
	<div id="wraper">

		<div id="header" >
			<b >ADD CUSTOMER:</b>
		</div>
	</div>

	<div id="container">
		<h6>Fill blank fields:</h6>
		<form:form action="/admin/saveCustomer" modelAttribute="customer"
			method="POST">
			<!-- potrebno je da asociate ovaj podatak sasa customer id -->
			<form:hidden path="id" />
			<table>
				<tbody>
					<tr>
						<td><label>Firist name(*):</label></td>
						<td><form:input path="firstName" /> <form:errors
								path="firstName" cssClass="erorKojiJaHocu" /></td>
					</tr>
					<tr>
						<td><label>Last name(*):</label></td>
						<td><form:input path="lastName" /> <form:errors
								path="lastName" cssClass="erorKojiJaHocu" /></td>
					</tr>
					<tr>
						<td><label>Birthday:</label></td>
						<td><form:input path="birthday" /> <form:errors
								path="birthday" cssClass="erorKojiJaHocu" /></td>
					</tr>
					<tr>
						<td><label>Email:</label></td>
						<td><form:input path="email" /> <form:errors path="email"
								cssClass="erorKojiJaHocu" /></td>
					</tr>
					<tr>
						<td><label>Salary:</label></td>
						<td><form:input path="salary" />
						<form:errors path="salary"
								cssClass="erorKojiJaHocu" /></td>
					</tr>

					<tr>
						<td><label>Jib:</label></td>
						<td><form:input path="jib" /> <form:errors path="jib"
								cssClass="erorKojiJaHocu" /></td>

					</tr>
					<tr>
						<td><label>Phone:</label></td>
						<td><form:input path="phoneNumber" />  <form:errors path="phoneNumber"
								cssClass="erorKojiJaHocu" /></td>
					</tr>

					<tr>
						<td><label>Select team</label></td>
						<td><select name="team">
								<option value="NONE">--- Select ---</option>
								<option value="Team 1">1</option>
								<option value="Team 2">2</option>
								<option value="Team 3">3</option>
								<option value="Team 4">4</option>
								<option value="Team 5">5</option>
						</select></td>
					</tr>
					<tr>
						<td><label></label></td>
						<td><input type="submit" value="Save!" class="save"/></td>
							
					</tr>

				</tbody>

			</table>




		</form:form>
		<!-- bec to customer list -->
		<div style=""></div>
		<p>
			<input type="submit" value="MAIN MENU"
				onclick="window.location.href='/admin/home';return false;"
				class="add-button" /> <a
				href="${pageContext.request.contextPath}/admin/home"> Back to
				list customer in DB</a>
		</p>
	</div>


</body>
</html>