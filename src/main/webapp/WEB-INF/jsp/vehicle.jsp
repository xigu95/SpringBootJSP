<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/functions" prefix = "fn" %>
 
<!DOCTYPE HTML>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>Vehicle</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css"/>
  </head>
  <body>
    <h1>${vehicle.name}</h1>
    <div>
      <table id=VehicleTable">
        <tr>
          <th>Model</th>
          <th>Vehicle Class</th>
          <th>Manufacturer</th>
          <th>Cost in Credits</th>
          <th>Length</th>
          <th>Max Atmosphering Speed</th>
          <th>Crew</th>
          <th>passengers</th>
          <th>Cargo Capacity</th>
          <th>Consumables</th>
          <th>Pilots</th>
          <th>Films</th>
        </tr>
        <tr>
          <td>${vehicle.model}</td>
          <td>${vehicle.vehicle_class}</td>
          <td>${vehicle.manufacturer}</td>
          <td>${vehicle.cost_in_credits}</td>
          <td>${vehicle.length}</td>
          <td>${vehicle.max_atmosphering_speed}</td>
          <td>${vehicle.crew}</td>
          <td>${vehicle.passengers}</td>
          <td>${vehicle.cargo_capacity}</td>
          <td>${vehicle.consumables}</td>
          <td>
          	<c:forEach items="${vehicle.pilots}" var ="pilot">
          		<c:set var = "length" value = "${fn:length(pilot)}"/>
	       		<c:set var = "id" value = "${fn:substring(pilot, 28, length-1)}"/>
	       		<a href="${pageContext.request.contextPath}/character/${id}">${id}</a> 
	        </c:forEach></td>
          <td>
          	<c:forEach items="${vehicle.films}" var ="film">
	       		<c:set var = "length" value = "${fn:length(film)}"/>
		        <c:set var = "id" value = "${fn:substring(film, 27, length-1)}"/>
	          	<c:out value="${filmMap[id]}"/><br/>
	        </c:forEach></td>
        </tr>
      </table>
    </div>
  </body>
</html>
