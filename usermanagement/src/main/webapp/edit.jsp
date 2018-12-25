<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<jsp:useBean id="user" class="com.artem.stasiuk.User" scope="session" />
<html>
<head>
<title>User Management. Edit</title>
</head>
<body>
	<form action="<%=request.getContextPath()%>/edit" method= "post">
		<input type ="hidden" name="id" value="${user.id}">
		First Name <input type ="text" name="firstName" value="${user.firstName}">
		Last Name <input type ="text" name="lastName" value="${user.lastName}">
		Date of Birth <input type ="text" name="dateOfBirth" value="<fmt:formatDate value="${user.dateOfBirth} type="date" dateStyle="medium"/>">
		<input type="submit" name="okButton" value="Ok">
		<input type="submit" name="cancelButton" value="Cancel">
	</form>
<c:if test="${requestScope.error != null}">
	<script>
		alert('${request.Scope.error}');
	</script>
</c:if>
</body>
</html>