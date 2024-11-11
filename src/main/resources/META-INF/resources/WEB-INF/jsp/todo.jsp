<%@ include file="common/header.jspf" %>
    <%@ include file="common/navigation.jspf" %>
        <div class="container">
            <h1> Enter Todo Details</h1>
            <form:form action="add-todo" method="post" modelAttribute="todo">
                <div class="form-group">
                    <fieldset>
                        <form:label path="name">Name:</form:label>
                        <form:input type="text" path="name" class="form-control" required="required" />
                        <form:errors path="name" cssClass="text-danger" />
                    </fieldset>
                </div>
                <div class="form-group">
                    <fieldset>
                        <form:label path="description">Description:</form:label>
                        <form:input type="text" path="description" class="form-control" required="required" />
                        <form:errors path="description" cssClass="text-danger" />
                    </fieldset>
                </div>
                <div class="form-group">
                    <fieldset>
                        <form:label path="targetDate">Target Date:</form:label>
                        <form:input type="text" path="targetDate" class="form-control" required="required" />
                        <form:errors path="targetDate" cssClass="text-danger" />
                    </fieldset>
                </div>
                <form:input type="hidden" path="id" class="form-control" />
                <form:input type="hidden" path="done" class="form-control" />
                <button type="submit" class="btn btn-primary">Submit</button>
                <!--<form:errors path="*" cssClass="text-danger" />-->
            </form:form>
        </div>
        <%@ include file="common/footer.jspf" %>
            <script type="text/javascript">
                $('#targetDate').datepicker({
                    format: 'yyyy-mm-dd'
                });
            </script>