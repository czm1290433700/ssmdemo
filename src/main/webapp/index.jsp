<%@ page contentType="text/html;charset=UTF-8"%> <%--设置文档类型  防止页面中文乱码--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>         <%--引入jstl核心标签库--%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>   <%--引入jstl函数标签库--%>
<c:set var="ctx" value="${pageContext.request.contextPath }"/>
<html>
<body>
<h2>Hello World!</h2>
<a href="register.jsp">点我注册</a><br>
<a href="/login">点我登录</a>
</body>
</html>
