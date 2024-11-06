<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="ISO-8859-1">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Product Form</title>
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <h2 class="mt-5">Product Order Form</h2>
    
    <span class="text-success">${success}</span> 
	<span class="text-danger">${failed}</span>
	<span>Total: ${total}</span>
		
    <form action="product" method="post" class="mt-4">
        <div class="form-group">
            <label for="companyName">Company Name</label>
            <input type="text" class="form-control" id="companyName" name="companyName" required value="${dto.companyName}">
        </div>
        <div class="form-group">
            <label for="productName">Product Name</label>
            <input type="text" class="form-control" id="productName" name="productName" required value="${dto.productName}">
        </div>
        <div class="form-group">
            <label for="productType">Product Type</label>
            <select class="form-control" id="productType" name="productType" required value="${dto.productType}">
                <option value="">SELECT</option>
                <option value="Food">Food</option>
                <option value="Furniture">Furniture</option>
                <option value="Clothes">Clothes</option>
                <option value="Electronics">Electronics</option>
                <option value="Grocery">Grocery</option>
            </select>
        </div>
        <div class="form-group">
            <label for="productQuantity">Product Quantity</label>
            <input type="number" class="form-control" id="productQuantity" name="productQuantity" required value="${dto.productQuantity}">
        </div>
        <div class="form-group">
            <label for="productCost">Product Cost</label>
            <input type="number" class="form-control" id="productCost" name="productCost" required value="${dto.productCost}">
        </div>
        <button type="submit" class="btn btn-primary">Order</button>
    </form>
</div>


</body>
</html>
