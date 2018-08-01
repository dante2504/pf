/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Bean.AdministradorBean;
import Dao.AdministradorDao;
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
public class AdministradorServlet extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
   String opcad=request.getParameter("op");
       int   op=Integer.parseInt(opcad);
       String pagina="";
       switch(op){
           case 1:{
               pagina="/Vista/Seguridad/Personal/Loginpersonal.jsp";  break;
           
           }
           case 2:{
                   String usuario=request.getParameter("txtusua");
                String clave=request.getParameter("txtcla");
             
             AdministradorBean  objAdministradorBean=new AdministradorBean();
                             objAdministradorBean.setCOD_DIR(usuario);
                             objAdministradorBean.setPAS_DIR(clave);
             AdministradorDao   objAdmiDao=new AdministradorDao();
                       boolean estado= objAdmiDao.ValidarUsuario(objAdministradorBean);
                     if(estado==true)        
                     {         
                      pagina="/Vista/Principal/Administrador/PrincipalAdministrador.jsp";   
                     }
                     else
                     {
                      request.setAttribute("mensaje","Usuario y clave Incorrecto");
                      pagina="/Vista/Seguridad/Administrador/LoginAdministrador.jsp";
                     }                      
                      break;
           }
            
       }
       getServletContext().getRequestDispatcher(pagina).forward(request, response);
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
