/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Note;

/**
 *
 * @author Jonat
 */
public class NoteServlet extends HttpServlet {

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
           
               String edit = request.getParameter("edit");
                
                String path = getServletContext().getRealPath("/WEB-INF/note.txt");
                BufferedReader br = new BufferedReader(new FileReader (new File(path)));
                String title = br.readLine();
                String content = br.readLine();
               
             
                Note note = new Note(title, content);
                request.setAttribute("note", note);
                
                if(edit == ""){
                    getServletContext().getRequestDispatcher("/WEB-INF/editnote.jsp").forward(request, response);
                }else{
                getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp")
                .forward(request, response);
                }
                
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        String path = getServletContext().getRealPath("/WEB-INF/note.txt");
        
        PrintWriter pw = new PrintWriter (new BufferedWriter (new FileWriter(path, false)));
        
       String title = request.getParameter("title");
       String content = request.getParameter("content");
    
       Note note = new Note(request.getParameter("title"),request.getParameter("content"));
       request.setAttribute("note", note);
  
       pw.print(title);
       pw.print("/n");
       pw.print(content);
       pw.close();
 
         getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp")
               .forward(request, response);

    }
}
