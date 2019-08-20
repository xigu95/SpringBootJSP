<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/functions" prefix = "fn" %>
 
<!DOCTYPE HTML>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>Species</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css"/>
  </head>
  <body>
    <h1>${species.name}</h1>
    <div>
      <table id=SpeciesTable">
        <tr>
          <th>Classification</th>
          <th>Designation</th>
          <th>Average Height</th>
          <th>Average Lifespan</th>
          <th>Hair Color</th>
          <th>Skin Color</th>
          <th>Eye Color</th>
          <th>language</th>
          <th>Homeworld</th>
          <th>People</th>
          <th>Films</th>
        </tr>
        <tr>
          <td>${species.classification}</td>
          <td>${species.designation}</td>
          <td>${species.average_height}</td>
          <td>${species.average_lifespan}</td>
          <td>${species.hair_color}</td>
          <td>${species.skin_color}</td>
          <td>${species.eye_color}</td>
          <td>${species.language}</td>
          <td>
          		<c:set var = "length" value = "${fn:length(species.homeworld)}"/>
	       		<c:set var = "id" value = "${fn:substring(species.homeworld, 29, length-1)}"/>
	       		<a href="${pageContext.request.contextPath}/planet/${id}">${id}</a> 
          </td>
          <td>
          	<c:forEach items="${species.people}" var ="people">
	       		<c:set var = "length" value = "${fn:length(people)}"/>
	       		<c:set var = "id" value = "${fn:substring(people, 28, length-1)}"/>
	       		<a href="${pageContext.request.contextPath}/character/${id}">${id}</a> 
	        </c:forEach></td>
          <td>
	       	<c:forEach items="${species.films}" var ="film">
	       		<c:set var = "length" value = "${fn:length(film)}"/>
		        <c:set var = "id" value = "${fn:substring(film, 27, length-1)}"/>
	          	<c:out value="${filmMap[id]}"/><br/>
	        </c:forEach></td>
          <td>
        </tr>
      </table>
    </div>
  </body>
  
</html>