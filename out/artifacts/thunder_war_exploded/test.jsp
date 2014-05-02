<%--
  Created by IntelliJ IDEA.
  User: shakhov
  Date: 23.03.14
  Time: 18:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title></title>
</head>
<body>
<h1>${test}</h1>
Результат:
<c:choose>
    <c:when test="${test=='yes'}">
        ДА <c:out value="${test}"/>
    </c:when>
    <c:when test="${test=='no'}">
        НЕТ
    </c:when>
</c:choose>

</body>
</html>
