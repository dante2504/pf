/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Dante Quispe
 */
public class GeneralServlet extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String opcad=request.getParameter("op");
        int op=Integer.parseInt(opcad);
        switch(op){
            case 1:{
                getServletContext().getRequestDispatcher("/Vista/Acerca/about.jsp").forward(request, response);
            break;
            }
              case 2:{
                getServletContext().getRequestDispatcher("/Vista/Servicios/services.jsp").forward(request, response);
            break;
            }
                case 3:{
                getServletContext().getRequestDispatcher("/Vista/Cursos/courses.jsp").forward(request, response);
            break;
            }
                   case 4:{
                getServletContext().getRequestDispatcher("/Vista/Acceso/index_1.jsp").forward(request, response);
            break;
            }
                        case 5:{
                getServletContext().getRequestDispatcher("/Vista/Contacto/contact.jsp").forward(request, response);
            break;
            }
            
        }
         
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
