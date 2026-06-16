<%--
  Created by IntelliJ IDEA.
  User: student
  Date: 2026-06-11
  Time: 오전 11:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="utf-8">
    <title>Insert title here</title>
</head>
<body>
username 값 : <%=request.getAttribute("username")%><br>
useraddress 값 : <%=request.getAttribute("useraddress")%><br>
</body>
</html>
