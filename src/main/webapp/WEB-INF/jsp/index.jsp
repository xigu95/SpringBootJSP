<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/functions" prefix = "fn" %>
 
<!DOCTYPE HTML>
<html>
   <head>
      <meta charset="UTF-8" />
      <title>Star War App</title>
      <link rel="stylesheet" type="text/css"
                href="${pageContext.request.contextPath}/css/style.css"/>
   </head>
   <body>
      <h1>Star War</h1>
      <div>
      <table id="FilmTable">
        <tr>
          <th>Title</th>
          <th>Episode ID</th>
          <th>Opening Crawl</th>
          <th>Director</th>
          <th>Producer</th>
          <th>Release Date</th>
          <th>Characters</th>
          <th>Planets</th>
          <th>Starships</th>
          <th>Vehicles</th>
          <th>Species</th>
        </tr>
        <c:forEach  items="${films}" var ="film">
        <tr>
          <td>${film.title}</td>
          <td>${film.episode_id}</td>
          <td>${film.opening_crawl}</td>
          <td>${film.director}</td>
          <td>${film.producer}</td>
          <td>${film.release_date}</td>
          <td>
	       	<c:forEach items="${film.characters}" var ="character">
	       		<c:set var = "length" value = "${fn:length(character)}"/>
	       		<c:set var = "id" value = "${fn:substring(character, 28, length-1)}"/>
	       		<a href="${pageContext.request.contextPath}/character/${id}">${id}</a> 
	        </c:forEach></td>
          <td>
          	<c:forEach items="${film.planets}" var ="planet">
	       		<c:set var = "length" value = "${fn:length(planet)}"/>
	       		<c:set var = "id" value = "${fn:substring(planet, 29, length-1)}"/>
	       		<a href="${pageContext.request.contextPath}/planet/${id}">${id}</a> 
	        </c:forEach></td>
          <td>
          	<c:forEach items="${film.starships}" var ="starship">
	          	<c:set var = "length" value = "${fn:length(starship)}"/>
		        <c:set var = "id" value = "${fn:substring(starship, 31, length-1)}"/>
		       	<a href="${pageContext.request.contextPath}/starship/${id}">${id}</a>
	        </c:forEach></td>
          <td>
          	<c:forEach items="${film.vehicles}" var ="vehicle">
	          	<c:set var = "length" value = "${fn:length(vehicle)}"/>
		        <c:set var = "id" value = "${fn:substring(vehicle, 30, length-1)}"/>
		       	<a href="${pageContext.request.contextPath}/vehicle/${id}">${id}</a>
	        </c:forEach></td>
          <td>
          	<c:forEach items="${film.species}" var ="species">
          		<c:set var = "length" value = "${fn:length(species)}"/>
		        <c:set var = "id" value = "${fn:substring(species, 29, length-1)}"/>
		       	<a href="${pageContext.request.contextPath}/species/${id}">${id}</a>
	        </c:forEach></td>
        </tr>
        </c:forEach>
      </table>
    </div>
   </body>
   
</html>