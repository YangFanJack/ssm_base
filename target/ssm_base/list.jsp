<%--
  Created by IntelliJ IDEA.
  User: jack1024
  Date: 2021/4/22
  Time: 下午4:30
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>

<!DOCTYPE html>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>list</h1>
    <table>
        <tr>
            <th>编号</th>
            <th>名字</th>
            <th>工资</th>
        </tr>
        <c:forEach items="${accounts}" var="keyword">
            <tr>
                <td>${keyword.id}</td>
                <td>${keyword.name}</td>
                <td>${keyword.money}</td>
            </tr>
        </c:forEach>
    </table>

</body>
</html>
