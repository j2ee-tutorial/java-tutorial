<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>New Product</title>
</head>
<body>
<header>
    <h1>Product Entry</h1>
</header>

<main>
    <form action="${pageContext.request.contextPath}/product/save" method="post">
        <label for="name"></label>
        <input type="text" name="name" id="name">

        <input type="submit" value="save">
    </form>
</main>

<footer>

</footer>
</body>
</html>
