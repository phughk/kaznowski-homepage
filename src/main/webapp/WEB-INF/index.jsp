<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>

    </head>

    <body>
        <p class="lead"><c:out value="${'taglibs c:out with lead'}"/></p>
        <c:if test="${msg!=null}">
            <h3>The message parameter</h3>
            <p><c:out value="${msg}"/></p>
        </c:if>
        <ul>
        </ul>

    </body>

</html>