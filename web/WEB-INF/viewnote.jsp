<%-- 
    Document   : viewnote
    Created on : 1-Oct-2022, 7:47:28 PM
    Author     : Jonat
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View Note</title>
    </head>
    <body>
        <h1>Simple Note Keeper</h1>
        <h2>View Note</h2>
        
            <p><strong>Title:</strong> </p>
            <div> ${note.title}
               
            </div> <br>
               
                     <p><strong>Content:</strong> </p>
                      <div>
                          ${note.content}
                      </div> <br>
                
                      <a href="note?edit">Edit</a>
                      
    </body>
</html>
