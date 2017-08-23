<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<h1>List of Players</h1>

<div>
<ul>
<c:forEach items="${players}" var="player">
   <li>${player}</li>
</c:forEach>
</ul>
</div>

<div>
<a href="../home.html">Home</a>
</div>