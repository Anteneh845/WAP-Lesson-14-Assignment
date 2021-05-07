<%@ page import="cs.edu.wap.models.Quiz" %><%--
  Created by IntelliJ IDEA.
  User: Anteneh
  Date: 5/7/2021
  Time: 2:09 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>The Number Quiz</title>
</head>
<body>
<h1>The Number Quiz  </h1>
<p>
    Your score is ${Quiz.getScore()} <br/>
    You have completed the Number Quiz, with  a score of ${Quiz.getScore()} out of ${Quiz.getQuestionCount()}
</p>
</body>
</html>
