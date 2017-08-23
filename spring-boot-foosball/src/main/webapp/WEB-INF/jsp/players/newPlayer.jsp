<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
        
<form:form modelAttribute="form">
	<form:errors path="" element="div" />
	<div>
		<form:label path="firstName">First Name</form:label>
		<form:input path="firstName" />
		<form:errors path="firstName" />
 	</div>
 	<div>
 		<form:label path="lastName">Last Name</form:label>
		<form:input path="lastName" />
		<form:errors path="lastName" />
	</div>
	<div>
 		<input type="submit" />
	</div>
</form:form>