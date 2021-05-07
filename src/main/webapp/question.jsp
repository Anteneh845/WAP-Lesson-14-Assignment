<%--
  Created by IntelliJ IDEA.
  User: Anteneh
  Date: 5/7/2021
  Time: 1:44 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>The Number Quiz</title>
</head>
<body>
<h1> The Number Quiz</h1>
<p>
    Your current score is ${Quiz.getScore()} <br/>
    Guess the number in the sequence
    ${Quiz.getNextQuestion()}
    <form method="post" action="quiz">
        <input type="number" name="answer" required/>
        <input type="submit" value="Submit"/>
    </form>
</p>
</body>
</html>

