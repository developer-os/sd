<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<link href="js/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
    <link href="css/local/viewport.css" rel="stylesheet">
<title>login</title>
</head>
<body>

	<div class="container">
      <form class="form-signin">
        <h2 class="form-signin-heading">Please sign in </h2>
        <label for="inputEmail" class="sr-only">User name</label>
        <input type="text" id="username" class="form-control" placeholder="User name" required autofocus>
        <label for="inputPassword" class="sr-only">Password</label>
        <input type="password" id="password" class="form-control" placeholder="Password" required>
        <div class="checkbox">
          <label>
            <input type="checkbox" value="remember-me"> Remember me
          </label>
        </div>
        <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
      </form>

    </div> <!-- /container -->


    <script src="js/jquery-3.2.1.min.js"></script>
	<script src="js/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
	<script src="js/local/viewport.js"></script>
    <script src='js/local/login.js'></script>
</body>
</html>