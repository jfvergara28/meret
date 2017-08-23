<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
        
<form:form modelAttribute="form">
	<form:errors path="" element="div" />
	<div>
		<form:select path="allPlayers">
		   <form:option value="NONE" label="Select"/>
		   <form:options items="${allPlayers}" />
		</form:select> 
	</div>
	<div>
 		<input type="submit" />
	</div>
</form:form>