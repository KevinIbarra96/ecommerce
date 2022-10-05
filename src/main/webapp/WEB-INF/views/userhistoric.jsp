<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix ="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User historic</title>
</head>
<body>



     <c:forEach items ="${purchases}" var="purchase">
     <div>
		<!-- p>${purchase.userId}</p-->
		<p>${purchase.total}</p>
		<p>${purchase.date}</p>
	</div>
	
	<table>
            <tr>
                <td>Product name </td>
                <td>Category </td>
                <td>Price </td>
                <!-- <td>Quantity </td> -->
            </tr>			
            <c:forEach items ="${purchase.products}" var="prod">
                <tr>
                    <td>${prod.productName}</td>
                    <td>${prod.category}</td>
                    <td>${prod.price}</td>
                    <!-- <td>${prod.producQuantity} </td>-->                    
                </tr>
            </c:forEach>
            
        
        </table>

	</br>
	</hr>
     </c:forEach>
	</br>
	</hr>
                <td><a href="getProducts?userId=${userId}">Get back to the list of products</a></td>



</body>
</html>