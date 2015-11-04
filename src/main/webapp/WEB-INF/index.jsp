<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
<p>This is index.jsp</p>
<c:out value="${'taglibs c:out'}"/><br>
<c:if test="${msg!=null}">
    <p>
        The message is <b><c:out value="${msg}"/></b>
    </p>
</c:if>
</body>
</html>