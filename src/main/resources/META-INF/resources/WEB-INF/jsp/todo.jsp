<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <link rel="stylesheet" href="/webjars/bootstrap/5.3.3/css/bootstrap.min.css">
    <link rel="stylesheet" href="/webjars/bootstrap-datepicker/1.9.0/css/bootstrap-datepicker.standalone.min.css">
    <title>Add Todo Page</title>
</head>
<body>
    <div class="container">
       <h1> Enter Todo Details</h1>
       <form:form action="add-todo" method="post" modelAttribute="todo">
           <div class="form-group">
               <label for="name">Name:</label>
               <form:input type="text" path="name" class="form-control" required="required"/>
               <form:input type="hidden" path="id" class="form-control"/>
               <form:input type="hidden" path="done" class="form-control"/>
           </div>
           <div class="form-group">
               <label for="description">Description:</label>
               <form:input type="text" path="description" class="form-control" required="required"/>
           </div>
           <div class="form-group">
               <label for="targetDate">Target Date:</label>
               <form:input type="text" path="targetDate" class="form-control" required="required"/>
           </div>
           <button type="submit" class="btn btn-primary">Submit</button>
           <form:errors path="*" cssClass="text-danger"/>
       </form:form>
    </div>
    <script src="/webjars/bootstrap/5.3.3/js/bootstrap.min.js"></script>
    <script src="/webjars/jquery/3.7.1/jquery.min.js"></script>
    <script src="/webjars/bootstrap-datepicker/1.9.0/js/bootstrap-datepicker.min.js"></script>
    <script type="text/javascript">
        $('#targetDate').datepicker({
            format: 'yyyy-mm-dd'
        });
    </script>
</body>
</html>