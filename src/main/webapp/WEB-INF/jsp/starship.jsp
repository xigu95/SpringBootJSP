<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/functions" prefix = "fn" %>
 
<!DOCTYPE HTML>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>Starship</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css"/>
  </head>
  <body>
    <h1>${starship.name}</h1>
    <div>
      <table id=StarshipTable">
        <tr>
          <th>Model</th>
          <th>Manufacturer</th>
          <th>Cost in Credits</th>
          <th>Length</th>
          <th>Max Atmosphering Speed</th>
          <th>Crew</th>
          <th>passengers</th>
          <th>Cargo Capacity</th>
          <th>Consumables</th>
          <th>Hyperdrive_rating</th>
          <th>MGLT</th>
          <th>Starship Class</th>
          <th>Pilots</th>
          <th>Films</th>
        </tr>
        <tr>
          <td>${starship.model}</td>
          <td>${starship.manufacturer}</td>
          <td>${starship.cost_in_credits}</td>
          <td>${starship.length}</td>
          <td>${starship.max_atmosphering_speed}</td>
          <td>${starship.crew}</td>
          <td>${starship.passengers}</td>
          <td>${starship.cargo_capacity}</td>
          <td>${starship.consumables}</td>
          <td>${starship.hyperdrive_rating}</td>
          <td>${starship.MGLT}</td>
          <td>${starship.starship_class}</td>
          <td>
          	<c:forEach items="${starship.pilots}" var ="pilot">
          		<c:set var = "length" value = "${fn:length(pilot)}"/>
	       		<c:set var = "id" value = "${fn:substring(pilot, 28, length-1)}"/>
	       		<a href="${pageContext.request.contextPath}/character/${id}">${id}</a> 
	        </c:forEach></td>
          <td>
          	<c:forEach items="${starship.films}" var ="film">
	       		<c:set var = "length" value = "${fn:length(film)}"/>
		        <c:set var = "id" value = "${fn:substring(film, 27, length-1)}"/>
	          	<c:out value="${filmMap[id]}"/><br/>
	        </c:forEach></td>
        </tr>
      </table>
    </div>
  </body>
</html>
