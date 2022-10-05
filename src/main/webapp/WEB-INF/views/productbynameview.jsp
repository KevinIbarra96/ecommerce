<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <h1>products list</h1>
    
    <div align="center">
        
        <table>
            <tr>
                <td>Product Name: </td>
                <td>Product Category: </td>
                <td>Price: </td>
                <td>Available Quantity: </td>
            </tr>
            <c:forEach items="${products}" var="prod" >
                <tr>
                    <form:form action="addToCart" method="post" modelAttribute="product">
                    
                    <input path="productId" name="productId" type="hidden" value="${prod.productId}">
                    <input path="productName" name="productName" type="hidden" value="${prod.productName}">
                    <input path="category" name="category" type="hidden" value="${prod.category}">
                    <input path="price" name="price" type="hidden" value="${prod.price}">
                    <input path="producQuantity"  name="producQuantity" type="hidden" value="${prod.producQuantity}">
                    
                    <input path="userId" name="userId" type="hidden" value="${userId}">
                    <td>${prod.productName}</td> 
                    <td>${prod.category}</td>
                    <td>${prod.price}</td>
                    <td>${prod.producQuantity}</td>
                    <td><input type="submit" value="add to cart"></td>
                    </form:form>
                    
                </tr>
                
            </c:forEach>
            <tr>
				<td><a href="getProducts?userId=${userId}">Get back to the list of products</a></td>

            </tr>
        </table>
    </div>

 

</body>
</html>