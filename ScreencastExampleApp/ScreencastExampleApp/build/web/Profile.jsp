<%-- 
    Document   : Profile
    Created on : Feb 24, 2014, 1:27:41 PM
    Author     : Dmitry
--%>

<%@page import="ru.dmitryborody.webexampleapp.model.Message"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Profile</title>
    </head>
    <body>
        <jsp:useBean class="ru.dmitryborody.webexampleapp.model.LoginBean" id="loginBean"/>
        <%
            loginBean.setName(request.getParameter("userName"));
            loginBean.setPassword(request.getParameter("userPassword"));
            loginBean.login();
        %>
        <table>
            <tr>
                <td>Name:</td>
                <td><%=loginBean.getMe().getName()%></td>
            </tr>
            <tr>
                <td>Email:</td>
                <td><%=loginBean.getMe().getEmail()%></td>
            </tr>
        </table>
        <h2>Messages:</h2>
        <table>
            <tr>
                <td>From:</td>
                <td>Message:</td>
            </tr>
            <%
            for (Message msg : loginBean.getMe().getMessages()) {
                out.println("<tr><td>" + msg.getFrom().getName() + "</td>"
                    + "<td>" + msg.getMessage() + "</td></tr>");
            }
            %>
        </table>
    </body>
</html>
