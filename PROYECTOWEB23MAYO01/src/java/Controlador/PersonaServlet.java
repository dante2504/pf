
package Controlador;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import  java.util.ArrayList;
import Bean.PersonaBean;
import DAO.PersonaDAO;

public class PersonaServlet extends HttpServlet { 
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       String  opcad=request.getParameter("op");
       int op=Integer.parseInt(opcad);
       String pagina="";
       switch(op)
       {   case 1:{
           ArrayList<PersonaBean> lista;
           
           PersonaDAO    objPersoDAO=new PersonaDAO();
           
                         lista =objPersoDAO.ListarPersonas();
           
               request.setAttribute("lista", lista);                     
           
               pagina="/FrmPersonaMant.jsp";
               break;  }
           case 2:{ 
                pagina="/index.jsp";
               break;  } 
           case 3:{
               String codigocad=request.getParameter("codigo");
               int codigo=Integer.parseInt(codigocad);
               PersonaBean  objPersoBean= new PersonaBean();
                            objPersoBean.setCodigo(codigo);
                            
           ArrayList<PersonaBean> lista;
           
           PersonaDAO    objPersoDAO=new PersonaDAO();
                         objPersoDAO.EliminarPersona(objPersoBean);
                         lista =objPersoDAO.ListarPersonas();
           
               request.setAttribute("lista", lista);                     
           
               pagina="/FrmPersonaMant.jsp";
               break;  }
            case 4:{
               String codigocad=request.getParameter("txtcodigo");
               int codigo=Integer.parseInt(codigocad);
               String nombre=request.getParameter("txtnombre");
               String apellido=request.getParameter("txtapellido");
               PersonaBean  objPersoBean= new PersonaBean();
                            objPersoBean.setCodigo(codigo);
                            objPersoBean.setNombre(nombre);
                            objPersoBean.setApellido(apellido);
                            
           ArrayList<PersonaBean> lista;
           
           PersonaDAO    objPersoDAO=new PersonaDAO();
                         objPersoDAO.GrabarPersona(objPersoBean);
                         lista =objPersoDAO.ListarPersonas();
           
               request.setAttribute("lista", lista);                     
           
               pagina="/FrmPersonaMant.jsp";
               break;  }
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
