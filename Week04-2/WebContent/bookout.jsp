<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List, java.util.LinkedList" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>도서정보</title>
</head>
<body>
<%
	request.setCharacterEncoding("utf-8");
%>
<jsp:useBean id="book" class="el.web04.BookBean" scope="request" />
<c:set var="title" target="${book}" value="${param.title}"/> 
<c:set var="author" target="${book}" value="${param.author}"/> 
<c:set var="publish" target="${book}" value="${param.publish}"/>
<h1>도서정보</h1>
책 제목 : ${title} <br>
저자 :  ${author} <br>
출판사 : ${publish}
</body>
</html>