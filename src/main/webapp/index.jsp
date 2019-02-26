<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@page isELIgnored="false" %>
<%@ page trimDirectiveWhitespaces="true" %>
<!DOCTYPE html>
<html>
<head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Coming Soon - Start Bootstrap Theme</title>

    <!-- Bootstrap core CSS -->
    <link href="https://cdn.bootcss.com/twitter-bootstrap/4.2.1/css/bootstrap.css" rel="stylesheet">

    <!-- Custom fonts for this template -->
    <link href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:200,200i,300,300i,400,400i,600,600i,700,700i,900,900i"
          rel="stylesheet">
    <link href="https://fonts.googleapis.com/css?family=Merriweather:300,300i,400,400i,700,700i,900,900i"
          rel="stylesheet">
    <link href="//netdna.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="${pageContext.request.contextPath}/css/index.css" rel="stylesheet">

</head>

<body>

<div class="overlay"></div>
<video playsinline="playsinline" autoplay="autoplay" muted="muted" loop="loop">
    <source src="${pageContext.request.contextPath }/mp4/bg.mp4" type="video/mp4">
</video>

<div class="masthead">
    <div class="masthead-bg"></div>
    <div class="container h-100">
        <div class="row h-100">
            <div class="col-12 my-auto">
                <div class="masthead-content text-white py-5 py-md-0">
                    <h1 class="mb-3">We're Here!</h1>
                    <p class="mb-5">We're working hard to finish the development of this site. Now our site has been
                        <strong>launched</strong> !<br/>Use it !</p>
                    <ul class="list-inline">
                        <li class="list-inline-item">
                            <button class="btn btn-secondary" id="login" type="button">Go in !</button>
                        </li>
                    </ul>


                </div>
            </div>
        </div>
    </div>
</div>

<div class="social-icons">
    <ul class="list-unstyled text-center mb-0">
        <li class="list-unstyled-item">
            <a href="#">
                <i class="fa fa-twitter"></i>
            </a>
        </li>
        <li class="list-unstyled-item">
            <a href="#">
                <i class="fa fa-facebook-f"></i>
            </a>
        </li>
        <li class="list-unstyled-item">
            <a href="#">
                <i class="fa fa-instagram"></i>
            </a>
        </li>
    </ul>
</div>

</body>
<script src="http://code.jquery.com/jquery-1.12.4.min.js"></script>
<script>
    $("#login").click(function () {
        window.location.href = "${pageContext.request.contextPath }/customer/list";
    });
</script>
</html>
