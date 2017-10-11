<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>

<head>
<title>LIST CUSTOMER</title>
<!-- references our style sheet -->
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/style.css">
<style>table, th, td {
    border: 1px solid black;
    
}
th, td {
    padding: 5px;
    text-align: left;  
      
}erorKojiJaHocu
</style>
</head>
<body bgcolor="#999966">

	<div id="wrapper">
		<div id="header" align="center">
			 
          WELCOME TO ADMIN WEB APP 
		</div>
	</div>

	<div id="container">

		<div id="content">
			<!-- dodavanje dugmeta  -->
			<input type="button" value="Add customer"
				onclick="window.location.href='/admin/showFormADD';return false;"
				class="add-button" />
			
				 <input type="button" value="Sort by: Salary"
				onclick="window.location.href='/admin/sortBySalary';return false;"
				class="add-button" />
				
				 <input id ="sortButton" type="button" value="Sort by: Last name"
				onclick="window.location.href='/admin/home';return false;"
				class="add-button" />
				
				<input type="button" value="Sort by Registration date"
				onclick="window.location.href='/admin/sortByRegistrationDate';return false;"
				class="add-button" />
				
				<input type="button" value="LOG OFF"
				onclick="window.location.href='/login'"
				class="add-button" />
				
			<table>

				<tr>

					<th>First name:</th>
					<th>Last Name:</th>
					<th>birthday:</th>
					<th>Email:</th>
					<th>Salary:</th>
					<th>Gross salary:</th>
					<th>JIB:</th>
					<th>Phone number:</th>
					<th>Team:</th>
					<th>Registration date:</th>
					<th>Action</th>
                    
				</tr>

				<!-- loop over and print our customers -->
				<c:forEach var="tempCustomer" items="${customers}">
				
					<!-- construct an "UPDATE" link with customer id -->
					<c:url var="updateLink" value="/admin/showFormForUpdate">
						<c:param name="customerId" value="${tempCustomer.id}" />
					</c:url>	
					
					<!-- construct an "DELETE" link with customer id -->
					<c:url var="deleteLink" value="/admin/delete">
						<c:param name="customerId" value="${tempCustomer.id}" />
					</c:url>					
					
					<tr>
						<td> ${tempCustomer.firstName} </td>
						<td> ${tempCustomer.lastName} </td>
					<td> ${tempCustomer.birthday} </td>
						<td> ${tempCustomer.email} </td>
						<td> ${tempCustomer.salary} </td>
						<td> ${tempCustomer.brutoSalary=Math.round(tempCustomer.salary*1.17)} </td>
						<td> ${tempCustomer.jib} </td>
						<td> ${tempCustomer.phoneNumber} </td>
						<td> ${tempCustomer.team} </td>
						<td> ${tempCustomer.registrationDate} </td>
						<td>
							<!-- display the update link -->
							<a href="${updateLink}">Update</a>
						
							<a href="${deleteLink}"
							onclick="if(!(confirm('Are you sure you wont to delete customrer?')))return false">Delete </a>
						</td>
					
					</tr>
				
				</c:forEach>
						
			</table>
				
		</div>
	
	</div>
	
</body>

</html>