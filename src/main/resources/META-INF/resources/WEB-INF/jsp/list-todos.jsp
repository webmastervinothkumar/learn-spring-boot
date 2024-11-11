<%@ include file="common/header.jspf" %>
    <%@ include file="common/navigation.jspf" %>
    <div class="container">
        <h1>Your Todos</h1>
        <table class="table">
            <thead>
                <tr>
                    <!-- <th>Id</th> -->
                    <th>Name</th>
                    <th>Description</th>
                    <th>Done</th>
                    <th>Target Date</th>
                    <th></th>
				    <th></th>
                </tr>
            </thead>
            <tbody> 
                <c:forEach items="${todos}" var="todo">
                    <tr>
                        <!-- <td>${todo.id}</td> -->
                        <td>${todo.name}</td>
                        <td>${todo.description}</td>
                        <td>${todo.done}</td>
                        <td>${todo.targetDate}</td>
                        <td><a href="update-todo?id=${todo.id}" class="btn btn-primary">Edit</a></td>
                        <td><a href="delete-todo?id=${todo.id}" class="btn btn-danger">Delete</a></td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
        <a href="add-todo" class="btn btn-primary">Add Todo </a>
    </div>
    <%@ include file="common/footer.jspf" %>