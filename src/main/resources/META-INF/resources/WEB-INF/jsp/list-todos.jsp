<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <link rel="stylesheet" href="/webjars/bootstrap/5.3.3/css/bootstrap.min.css">
    <title>Todo Page</title>
</head>
<body>
    <div class="container">
        <div>Welcome to JSP learning ${username}</div>
        <h1>Todo List</h1>
        <table class="table">
            <thead>
                <tr>
                    <th>Id</th>
                    <th>Name</th>
                    <th>Description</th>
                    <th>Done</th>
                    <th>Target Date</th>
                </tr>
            </thead>
            <tbody
                <c:forEach items="${todos}" var="todo">
                    <tr>
                        <td>${todo.id}</td>
                        <td>${todo.name}</td>
                        <td>${todo.description}</td>
                        <td>${todo.done}</td>
                        <td>${todo.targetDate}</td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
        <a href="add-todo" class="btn btn-primary">Add Todo </a>
    </div>
    <script src="/webjars/bootstrap/5.3.3/js/bootstrap.min.js"></script>
    <script src="/webjars/jquery/3.7.1/jquery.min.js"></script>
</body>
</html>