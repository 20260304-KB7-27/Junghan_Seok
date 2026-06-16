<%--
  Created by IntelliJ IDEA.
  User: student
  Date: 2026-06-11
  Time: 오후 1:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType =" text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="ko">
<head>
  <meta charset="utf-8">
  <title>Title</title>
</head>
<body>
  username 값 : <%=request.getAttribute ("username")%><br>
  useraddress 값 : <%=request.getAttribute ("useraddress")%><br>
</body>
</html>
