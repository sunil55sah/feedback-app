<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.*" %>

<html>
<head>
    <title>All Feedback</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="container mt-5">
    <h2>Feedback List</h2>
    <table class="table table-bordered">
        <thead>
            <tr>
                <th>Name</th><th>Email</th><th>Message</th>
            </tr>
        </thead>
        <tbody>
        <%
            List<String[]> feedbackList = (List<String[]>) request.getAttribute("feedbackList");
            for (String[] fb : feedbackList) {
        %>
            <tr>
                <td><%= fb[0] %></td>
                <td><%= fb[1] %></td>
                <td><%= fb[2] %></td>
            </tr>
        <%
            }
        %>
        </tbody>
    </table>
    <a href="feedback_form.jsp" class="btn btn-primary">Back to Form</a>
</body>
</html>
