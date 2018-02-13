<%--
  Created by IntelliJ IDEA.
  User: jesse
  Date: 2/5/18
  Time: 6:52 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>

  <h1>Dog</h1>
  <form action="/animals/dog" method="post">
    Name: <input type="text" name="name">
    Breed: <input type="text" name="breed">
    Weight: <input type="number" step=".1" name="weight">
  <input type="submit" value="Submit">
  </body>
  </form>
  <h1>Cat</h1>
  <form action="/animals/cat">
    Name: <input type="text" name="name">
    Breed: <input type="text" name="breed">
    Weight: <input type="number" step=".1">
    <input type="submit" value="Submit">
  </form>
</html>
