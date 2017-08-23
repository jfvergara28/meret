<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
        
<form:form modelAttribute="form">
	<form:errors path="" element="div" />
	<div>
		<form:label path="teamOne">Team One</form:label>
		<form:input path="teamOne" />
		<form:errors path="teamOne" />
 	</div>
 	<div>
 		<form:label path="teamTwo">Team Two</form:label>
		<form:input path="teamTwo" />
		<form:errors path="teamTwo" />
	</div>
	<div>
 		<input type="submit" />
	</div>
</form:form>