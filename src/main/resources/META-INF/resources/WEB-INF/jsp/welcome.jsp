<%@ include file="common/header.jspf" %>
    <%@ include file="common/navigation.jspf" %>
    <div class="container">
        <div>Welcome to JSP learning</div>
        <div>Your name: ${username}</div>
        <div><a href="list-todos">Manage</a> your todos</div>
    </div>
    <%@ include file="common/footer.jspf" %>