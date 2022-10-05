<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix ="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<!DOCTYPE html> 
<html>

<head>
<meta charset ="ISO-8859-1">
<title>Shopping Cart</title>
</head>

<body>

    <h1>Shopping Cart</h1>


    <div align="center">
    
    <form:form action="buyingCart" method="post" modelAttribute="cart">
    <!--input path="userId" name="userId" type="hidden" value="${userId}"-->
        <table>
            <tr>
                <td>Product name </td>
                <td>Category </td>
                <td>Price </td>
                <td>Quantity </td>
            </tr>			
            <c:forEach items ="${cartProducts}" var="prod" varStatus="tagStatus">
                <tr>
                    <td>${prod.productName}</td>
                    <td>${prod.category}</td>
                    <td>${prod.price}</td>
                    <td>${prod.producQuantity} </td>                                    
                </tr>
            </c:forEach>              
              <input path="userId" name="userId" type="hidden" value="${userId}">
                    
            <tr>
                <td><a href="getProducts?userId=${userId}">Get back to the list of products</a></td>
                <td>
                    <input type="submit" value ="Buy cart">
                </td>
            </tr>
        </table>
        
    </form:form>

 

    </div>

 

</body>