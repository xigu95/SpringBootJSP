<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/functions" prefix = "fn" %>
 
<!DOCTYPE HTML>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>Planet</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css"/>
  </head>
  <body>
    <h1>${planet.name}</h1>
    <div>
      <table id=PlanetTable>
        <tr>
          <th>Rotation Period</th>
          <th>Orbital Period</th>
          <th>Diameter</th>
          <th>Climate</th>
          <th>Gravity</th>
          <th>Terrain</th>
          <th>Surface Water</th>
          <th>Population</th>
          <th>Residents</th>
          <th>Films</th>
        </tr>
        <tr>
          <td>${planet.rotation_period}</td>
          <td>${planet.orbital_period}</td>
          <td>${planet.diameter}</td>
          <td>${planet.climate}</td>
          <td>${planet.gravity}</td>
          <td>${planet.terrain}</td>
          <td>${planet.surface_water}</td>
          <td>${planet.population}</td>
          <td>
	       	<c:forEach items="${planet.residents}" var ="resident">
          		<c:set var = "length" value = "${fn:length(resident)}"/>
	       		<c:set var = "id" value = "${fn:substring(resident, 28, length-1)}"/>
	       		<a href="${pageContext.request.contextPath}/character/${id}">${id}</a> 
	        </c:forEach></td>
          <td>
          	<c:forEach items="${planet.films}" var ="film">
	       		<c:set var = "length" value = "${fn:length(film)}"/>
		        <c:set var = "id" value = "${fn:substring(film, 27, length-1)}"/>
	          	<c:out value="${filmMap[id]}"/><br/>
	        </c:forEach></td>
        </tr>
      </table>
    </div>
  </body>
  
</html>