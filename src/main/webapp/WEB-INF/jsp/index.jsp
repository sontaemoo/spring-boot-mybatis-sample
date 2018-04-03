<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Hello Millky</title>
</head>
<body>
<h3>hotel :</h3>
<ul>
    <li>
        city: ${hotel.city}
    </li>
    <li>
        name: ${hotel.name}
    </li>
    <li>
        address : ${hotel.address}
    </li>
    <li>
        zip : ${hotel.zip}
    </li>
</ul>
<h3>City :</h3>
<ul>
    <li>
        id: ${city.id}
    </li>
    <li>
        name: ${city.name}
    </li>
    <li>
        state : ${city.state}
    </li>
    <li>
        country : ${city.country}
    </li>
</ul>

<h3>Rest API</h3>
<ul>
    <li>
        <a href="./api/hotel/1">hotel</a>
    </li>
    <li>
        <a href="./api/city/1">city</a>
    </li>
</ul>

</body>
</html>