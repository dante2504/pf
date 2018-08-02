
package Controlador;

import Bean.StudentBean;
import java.util.ArrayList;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Studentservlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String opcad=request.getParameter("op");
       int   op=Integer.parseInt(opcad);
       String pagina="";
       switch(op){
           case 1:{
             getServletContext().getRequestDispatcher("/Vista/Seguridad/Estudiante/Loginstudent.jsp").forward(request,response);
           
           }
            case 2:{
           /*    String usuario=request.getParameter("txtusuario");
                String clave=request.getParameter("txtclave");
                StudentBean  objStudentBean=new StudentBean();
                             objStudentBean.setCOD_ALU(usuario);
                             objStudentBean.setPAS_ALU(clave);
                StudentDao   objStudentDAO=new StudentDao();
                       boolean estado= objStudentDAO.ValidarUsuario(objStudentBean);
                     if(estado==true)        
                     {         
                      pagina="/Vista/Principal/FrmPrincipalAlumno.jsp";   
                     }
                     else
                     {
                     request.setAttribute("mensaje","Usuario y clave Incorrecto"); 
                      pagina="/Vista/Seguridad/Estudiante/Loginstudent.jsp";    
                     }                      
                      break;

           */
            getServletContext().getRequestDispatcher("/Vista/Principal/FrmPrincipalAlumno.jsp").forward(request,response);
           }
            case 3:{
                getServletContext().getRequestDispatcher("/Vista/Alumno/FrmMostrarDatosAlumno.jsp").forward(request,response);  
            }
             case 4:{
                getServletContext().getRequestDispatcher("/Vista/Alumno/Update.jsp").forward(request,response); 
            }
              case 5:{
                getServletContext().getRequestDispatcher("/Vista/Alumno/ReporteNotas.jsp").forward(request,response); 
            }
               case 6:{
                getServletContext().getRequestDispatcher("/Vista/Seguridad/Estudiante/Loginstudent.jsp").forward(request,response); 
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
