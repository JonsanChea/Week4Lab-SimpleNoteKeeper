<%-- 
    Document   : editnote
    Created on : 1-Oct-2022, 7:47:36 PM
    Author     : Jonat
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit Note</title>
    </head>
    <body>
        <h1>Simple Note Keeper</h1>
        <h2>Edit Note</h2>
        <form method="post" action="note">
            <p><strong>Title:</strong> </p> <div>
                <input type="text" name="title" value="${note.title}">
            </div>
               <br>
               <p><strong>Content:</strong> </p> <div>
                   <input type="text" name="content" value="${note.content}">
               </div>
               <br>
            <input type="submit" value="Save">
        </form>
        
    </body>
</html>
