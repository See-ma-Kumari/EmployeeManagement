<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@include file="base.jsp" %>
<%@ taglib prefix =
"form" uri = "http://www.springframework.org/tags/form"
%>  
</head>

<body>

<div class ="container " >
<div class="row">
<div class="col-md-6 offset-md-3">
<h1 class="text-center mb-3">Fill the Employee detail</h1>
 <form  action="adding" method="post" >
 <div class="form-group">
    <label for="exampleFormControlInput1">Employee ID</label>
    <form:input type="text"  class="form-control" id="exampleFormControlInput1" 
    name="eid"/>
    
  </div>
  <div class="form-group">
    <label for="exampleFormControlInput1">Employee Name</label>
    <form type="text"  class="form-control" id="exampleFormControlInput1" 
    name="ename"/>
    
  </div>
  <div class="form-group">
    <label for="exampleFormControlInput1">Email Address</label>
    <input type="email" class="form-control" id="exampleFormControlInput1" placeholder="email@gmail.com"
    name="email">
  </div>
  <div class="form-group">
    <label for="exampleFormControlInput1">Mobile Number</label>
    <input type="text" class="form-control" id="exampleFormControlInput1" 
    name="enumb">
  </div>
  
  <div class="form-group">
    <label for="exampleFormControlTextarea1">Employee Address</label>
    <textarea class="form-control" id="exampleFormControlTextarea1" name="eadd" rows="2"></textarea>
  </div>
  <a href="${pageContext.request.contextPath }/" class="btn btn-primary">Back</a>
  <button type="submit" class="btn btn-primary">Add</button>
</form>
</div>
</div>
</div>


</body>
</html>