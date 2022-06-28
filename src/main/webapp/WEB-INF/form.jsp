<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<%@include file="base.jsp" %>
<meta charset="ISO-8859-1">
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
</head>
<body>
<div class ="container " >
<div class="row">
<div class="col-md-12 ">
<h1 class="container text-center">Employee Management App</h1>
<table class="table">
  <thead class="thead-dark">
    <tr>
      <th scope="col">EmployeeId</th>
      <th scope="col">Name</th>
      <th scope="col">Email</th>
      <th scope="col">Number</th>
      <th scope="col">Address</th>
      <th scope="col">More</th>
    </tr>
  </thead>
  <tbody>
  <c:forEach items="${employeeList }" var="item">
    <tr>
      <th scope="row">${item.eid }</th>
      <td>${item.ename }</td>
      <td>${item.email }</td>
      <td>${item.enumb }</td>
      <td>${item.eadd }</td>
      <td >
<a href="delete_employee/${item.eid }" class="btn btn-primary">Delete Employee</a>
<a href="edit_employee/${item.eid }" class="btn btn-primary">Edit Employee</a></td>
    </tr>
    </c:forEach>
  </tbody>
</table>

<div class="container text-center">
<a href="add_employee" class="btn btn-primary">Add Employee</a>
</div>
</div>
</div>
</div>
</body>
</html>