<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@include file="base.jsp" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
</head>

<body>

<div class ="container " >
<div class="row">
<div class="col-md-6 offset-md-3">
<h1 class="text-center mb-3">Edit the Employee detail</h1>
 <form action="${pageContext.request.contextPath }/adding" method="post">
 <div class="form-group">
    <label for="exampleFormControlInput1">Employee ID</label>
    <input type="text" value="${emp.eid }"class="form-control" id="exampleFormControlInput1" 
    name="eid">
  </div>
  <div class="form-group">
    <label for="exampleFormControlInput1">Employee Name</label>
    <input type="text" class="form-control" id="exampleFormControlInput1" 
    name="ename" value="${emp.ename }">
  </div>
  <div class="form-group">
    <label for="exampleFormControlInput1">Email Address</label>
    <input type="email" class="form-control" id="exampleFormControlInput1" placeholder="email@gmail.com"
    name="email" value="${emp.email }">
  </div>
  <div class="form-group">
    <label for="exampleFormControlInput1">Mobile Number</label>
    <input type="text" class="form-control" id="exampleFormControlInput1" 
    name="enumb" value="${emp.enumb }">
  </div>
  
  <div class="form-group">
    <label for="exampleFormControlTextarea1" value="${emp.eadd }">Employee Address</label>
    <input type="text" class="form-control" id="exampleFormControlInput1" 
    name="eadd" value="${emp.eadd }">
  </div>
  <a href="${pageContext.request.contextPath }/" class="btn btn-primary">Back</a>
  <button type="submit" class="btn btn-primary">Add</button>
</form>
</div>
</div>
</div>


</body>
</html>