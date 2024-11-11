<%@ include file="common/header.jspf" %>
    <%@ include file="common/navigation.jspf" %>
    <div class="container">
       <h1> Enter Todo Details</h1>
       <form:form action="update-todo" method="post" modelAttribute="todo">
           <div class="form-group">
               <label for="name">Name:</label>
               <form:input type="text" path="name" class="form-control" id="name" name="name" required="required"/>
               <form:input type="hidden" path="id" class="form-control" id="id" name="id"/>
               <form:input type="hidden" path="done" class="form-control" id="done" name="done"/>
           </div>
           <div class="form-group">
               <label for="description">Description:</label>
               <form:input type="text" path="description" class="form-control" id="description" name="description" required="required"/>
           </div>
           <div class="form-group">
               <label for="targetDate">Target Date:</label>
               <form:input type="text" path="targetDate" class="form-control" id="targetDate" name="targetDate" required="required"/>
           </div>
           <button type="submit" class="btn btn-primary">Submit</button>
           <form:errors path="*" cssClass="text-danger"/>
       </form:form>
    </div>
    <%@ include file="common/footer.jspf" %>