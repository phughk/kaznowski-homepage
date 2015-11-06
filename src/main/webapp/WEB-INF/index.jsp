<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>
        <link rel="stylesheet"
            href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css"
            integrity="sha512-dTfge/zgoMYpP7QbHy4gWMEGsbsdZeCXz7irItjcC3sPUFtf0kuFbDz/ixG7ArTxmDjLXDmezHubeNikyKGVyQ=="
            crossorigin="anonymous"/>
        <link href="https://maxcdn.bootstrapcdn.com/bootswatch/3.3.5/paper/bootstrap.min.css"
            rel="stylesheet"
            integrity="sha256-hMIwZV8FylgKjXnmRI2YY0HLnozYr7Cuo1JvRtzmPWs= sha512-k+wW4K+gHODPy/0gaAMUNmCItIunOZ+PeLW7iZwkDZH/wMaTrSJTt7zK6TGy6p+rnDBghAxdvu1LX2Ohg0ypDw=="
            crossorigin="anonymous"/>
    </head>

    <body>
        <div class="jumbotron text-center">
            <h1>This is index.jsp</h1>
        </div>

        <div class="page-header">
            <p>This is page-header</p>
        </div>
        <p class="lead"><c:out value="${'taglibs c:out with lead'}"/></p>
        <c:if test="${msg!=null}">
            <div class="panel panel-primary">
                <div class="panel-heading">
                    <h3 class="panel-title">The message parameter</h3>
                </div>
                <div class="panel-body">
                            <p><c:out value="${msg}"/></p>
                            <span class="label label-success">Success</span>
                </div>
            </div>
        </c:if>
        <a href="mailto:#">first.last@example.com</a>

    </body>

</html>