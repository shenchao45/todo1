<%--
  Created by IntelliJ IDEA.
  User: shenchao
  Date: 17/5/24
  Time: 下午10:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>
    <title>Hello World</title>
  </head>
  <body>
  <table>
    <tr>
      <th>姓名</th>
      <th>密码</th>
    </tr>
    <c:forEach items="${users}" var="user">
      <tr>
        <td>${user.username}</td>
        <td>${user.password}</td>
      </tr>
    </c:forEach>
  </table>
  </body>
</html>
