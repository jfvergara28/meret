<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<h1>View Matches</h1>

<div>
<ul>
<c:forEach items="${matches}" var="match">
   <li>${match}</li>
</c:forEach>
</ul>
</div>

<div>
<a href="../home.html">Home</a>
</div>