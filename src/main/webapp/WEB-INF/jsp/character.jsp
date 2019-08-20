<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri ="http://java.sun.com/jsp/jstl/functions" prefix = "fn" %>
 
<!DOCTYPE HTML>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>Character</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css"/>
  </head>
  <body>
    <h1>${character.name}</h1>
    <div>
      <table id=CharacterTable">
        <tr>
          <th>Height</th>
          <th>Mass</th>
          <th>Hair Color</th>
          <th>Skin Color</th>
          <th>Eye Color</th>
          <th>Birth Year</th>
          <th>Gender</th>
          <th>Homeworld</th>
          <th>Films</th>
          <th>Species</th>
          <th>Vehicles</th>
          <th>Starships</th>
        </tr>
        <tr>
          <td>${character.height}</td>
          <td>${character.mass}</td>
          <td>${character.hair_color}</td>
          <td>${character.skin_color}</td>
          <td>${character.eye_color}</td>
          <td>${character.birth_year}</td>
          <td>${character.gender}</td>
          <td>
          		<c:set var = "length" value = "${fn:length(character.homeworld)}"/>
	       		<c:set var = "id" value = "${fn:substring(character.homeworld, 29, length-1)}"/>
	       		<a href="${pageContext.request.contextPath}/planet/${id}">${id}</a> 
          </td>
          <td>
	       	<c:forEach items="${character.films}" var ="film">
	       		<c:set var = "length" value = "${fn:length(film)}"/>
		        <c:set var = "id" value = "${fn:substring(film, 27, length-1)}"/>
	          	<c:out value="${filmMap[id]}"/><br/>
	        </c:forEach></td>
          <td>
          	<c:forEach items="${character.species}" var ="species">
          		<c:set var = "length" value = "${fn:length(species)}"/>
		        <c:set var = "id" value = "${fn:substring(species, 29, length-1)}"/>
		       	<a href="${pageContext.request.contextPath}/species/${id}">${id}</a>
	        </c:forEach></td>
          <td>
          	<c:forEach items="${character.vehicles}" var ="vehicle">
	          	<c:set var = "length" value = "${fn:length(vehicle)}"/>
		        <c:set var = "id" value = "${fn:substring(vehicle, 30, length-1)}"/>
		       	<a href="${pageContext.request.contextPath}/vehicle/${id}">${id}</a>
	        </c:forEach></td>
          <td>
          	<c:forEach items="${character.starships}" var ="starship">
	          	<c:set var = "length" value = "${fn:length(starship)}"/>
		        <c:set var = "id" value = "${fn:substring(starship, 31, length-1)}"/>
		       	<a href="${pageContext.request.contextPath}/starship/${id}">${id}</a>
	        </c:forEach></td>
        </tr>
      </table>
    </div>
  </body>
  
</html>