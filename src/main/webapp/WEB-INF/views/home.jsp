<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<html>
<head>
	<title>Home</title>
</head>
<body>
 <h1>Hello world!</h1>
 
    <table>
        <thead>
            <tr>
                <th>영화이름</th>
                <th>감독</th>
                <th>장르</th>
            </tr>
        </thead>
        
        <tbody>
            <c:forEach items="${movieList}" var="movie">
                <tr>
                    <td>${movie.movie_name}</td>
                    <td>${movie.director}</td>
                    <td>&nbsp&nbsp&nbsp${movie.type}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>
