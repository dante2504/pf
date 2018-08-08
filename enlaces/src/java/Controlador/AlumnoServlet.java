/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Bean.AlumnoBean;
import DAO.AlumnoDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author JESUS HAYLEN
 */
public class AlumnoServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      String opcad=request.getParameter("op"); //se almacenara en una vaiable el  valor del parametro
        int op=Integer.parseInt(opcad); //se almacenara el valor em una variable tipo entero
        String pagina=""; //refresca la pagina
        switch(op){  //segun el valor de la variable
            case 1:{
                pagina="/RegistrarAlumno.jsp";
                break;
            }
            
            case 3:{
               String codigocad=request.getParameter("txtcodigo");
               //estas allli??si cual es la diferencia de codigo y opcad y CodigoCad
               int codigo=Integer.parseInt(codigocad);
               String nombre=request.getParameter("txtnombre");
               String apellido=request.getParameter("txtapellido");
               String adni=request.getParameter("txtdni");
               int dni=Integer.parseInt(adni);
               String atelefono=request.getParameter("txttelefono");
                  int telefono=Integer.parseInt(atelefono);
                  String direccion=request.getParameter("txtdireccion");
                  String correo=request.getParameter("txtcorreo");
                  String aedad=request.getParameter("txtedad");
                  int edad=Integer.parseInt(aedad);
                  String clave=request.getParameter("txtclave");
                  String aapod=request.getParameter("txtcodigoApoderado");
                  int codigoApoderado=Integer.parseInt(aapod);
                  String amod=request.getParameter("txtcodigoModulo");
                  int codigoModulo=Integer.parseInt(amod);
                                       
               AlumnoBean  objAlumBean=new AlumnoBean();
                           objAlumBean.setCodAlum(codigo);
                           objAlumBean.setNomAlum(nombre);
                           objAlumBean.setApelliAlum(apellido);
                           objAlumBean.setDniAlum(dni);
                           objAlumBean.setTelefAlum(telefono);
                           objAlumBean.setDirecAlum(direccion);
                           objAlumBean.setCorreoAlum(correo);
                           objAlumBean.setEdadAlum(edad);
                           objAlumBean.setPswAlum(clave);
                           objAlumBean.setCodApod1(codigoApoderado);
                           objAlumBean.setCodMod1(codigoModulo);
               ArrayList<AlumnoBean> lista;
               AlumnoDAO   objAlumDAO=new AlumnoDAO();
                           objAlumDAO.GrabarAlumno(objAlumBean);
                     lista=objAlumDAO.ListarAlumnos();
               request.setAttribute("lista", lista);
               
               pagina="/RegistrarAlumno.jsp";
               break; 
           }
            case 4:{ //puede tomar este caso
             ArrayList<AlumnoBean> lista;  //se crea un arraylist
             
             AlumnoDAO objalumDAO=new AlumnoDAO(); //se crea al obj de persona dao
             lista=objalumDAO.ListarAlumnos(); //se llena el arraylist con los valores almacdnados
             
             request.setAttribute("lista",lista); //el requerimiento de las variables de lista 
             
             pagina="/Mostrar.jsp"; // terminara abrir a este jsp
             break;
            }
            case 5:{
                String codigocad=request.getParameter("codigo");
                int codigo=Integer.parseInt(codigocad);
                AlumnoBean objAlumBean = new AlumnoBean();
                            objAlumBean.setCodAlum(codigo);
                ArrayList<AlumnoBean> lista;
                
                AlumnoDAO objAlumDAO= new AlumnoDAO();
                           objAlumDAO.EliminarPersona(objAlumBean);
                     lista=objAlumDAO.ListarAlumnos();
                request.setAttribute("lista", lista);
                pagina="/Mostrar.jsp";
                break;
            }
           case 6:{ //o este caso
                pagina="/index.jsp"; //te manda a este jsp
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
