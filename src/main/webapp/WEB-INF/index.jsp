<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
This is index.jsp
<c:if test="${not empty message}">The message is ${message}</c:if>
</body>
</html>