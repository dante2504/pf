package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import Bean.StudentBean;

public final class FrmMostrarDatosAlumno_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

    if(session.getAttribute("datos")==null) {
        response.sendRedirect("Vista/Acceso/index_1.jsp");
    }

      out.write('\n');
      out.write('\n');
 StudentBean objEstu=null; 
      out.write('\n');
 objEstu=(StudentBean)session.getAttribute("datos");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("       <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <!--css-->\n");
      out.write("<link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("<link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("<link rel=\"stylesheet\" href=\"css/ken-burns.css\" type=\"text/css\" media=\"all\" />\n");
      out.write("<link rel=\"stylesheet\" href=\"css/animate.min.css\" type=\"text/css\" media=\"all\" />\n");
      out.write("<!--css-->\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<meta name=\"keywords\" content=\"Studies Plus Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, \n");
      out.write("Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, Sony Ericsson, Motorola web design\" />\n");
      out.write("<script type=\"application/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>\n");
      out.write("<!--js-->\n");
      out.write("<script src=\"js/jquery.min.js\"></script>\n");
      out.write("<script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("<!--js-->\n");
      out.write("<!--webfonts-->\n");
      out.write("<link href='//fonts.googleapis.com/css?family=Cagliostro' rel='stylesheet' type='text/css'>\n");
      out.write("<link href='//fonts.googleapis.com/css?family=Open+Sans:400,300,300italic,400italic,600,600italic,700,700italic,800,800italic' rel='stylesheet' type='text/css'>\n");
      out.write("<!--webfonts-->\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"header\">\n");
      out.write("\t\t\n");
      out.write("\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t<nav class=\"navbar navbar-default\">\n");
      out.write("\t\t\t\t\t<div class=\"container-fluid\">\n");
      out.write("\t\t\t\t<!---Brand and toggle get grouped for better mobile display--->\n");
      out.write("\t\t\t\t\t\t<div class=\"navbar-header\">\n");
      out.write("\t\t\t\t\t\t\t<button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\" aria-expanded=\"false\">\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t\t\t\t\t</button>\t\t\t\t  \n");
      out.write("\t\t\t\t\t\t\t<div class=\"navbar-brand\">\n");
      out.write("\t\t\t\t\t\t\t\t<h1><a href=\"index.jsp\">Datos</a></h1>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t<!-- Collect the nav links, forms, and other content for toggling -->\n");
      out.write("\t\t\t\t\t\t<div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\n");
      out.write("\t\t\t\t\t\t\t<nav class=\"link-effect-2\" id=\"link-effect-2\">\n");
      out.write("\t\t\t\t\t\t\t\t<ul class=\"nav navbar-nav\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"");
      out.print(request.getContextPath());
      out.write("/Studentservlet?op=3\">Mostrar Datos</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"");
      out.print(request.getContextPath());
      out.write("/Studentservlet?op=4\">Actualizar Informacion</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"");
      out.print(request.getContextPath());
      out.write("/Studentservlet?op=5\">NOTAS</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"");
      out.print(request.getContextPath());
      out.write("/Studentservlet?op=6\">Cerrar sesion </a></li>\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t</nav>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</nav>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("    <center>\n");
      out.write("            <form name=\"form\">\n");
      out.write("                <input type=\"hidden\" name=\"op\">\n");
      out.write("\n");
      out.write("              \n");
      out.write("                        <table style=\"float: left\">\n");
      out.write("                            <tr class=\"filap\">\n");
      out.write("                                <td class=\"columna1\">Codigo</td>\n");
      out.write("                                <td class=\"columna2\">");
      out.print(objEstu.getCOD_ALU());
      out.write("</td>\n");
      out.write("                                <td class=\"columna1\">Dni</td>\n");
      out.write("                                <td class=\"columna2\">");
      out.print(objEstu.getDNI_ALU());
      out.write("</td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr class=\"filap\">\n");
      out.write("                                <td class=\"columna1\">Nombre</td>\n");
      out.write("                                <td class=\"columna2\">");
      out.print(objEstu.getNOMB_ALU());
      out.write("</td>\n");
      out.write("                                <td class=\"columna1\">Telefono</td>\n");
      out.write("                                <td class=\"columna2\">");
      out.print(objEstu.getTEL_ALU());
      out.write("</td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr class=\"filap\">\n");
      out.write("                                <td class=\"columna1\">Apellido Paterno</td>\n");
      out.write("                                <td class=\"columna2\">");
      out.print(objEstu.getAPEPAT_ALU());
      out.write("</td>\n");
      out.write("                                <td class=\"columna1\">Apellido Materno</td>\n");
      out.write("                                <td class=\"columna2\">");
      out.print(objEstu.getAPEMAT_ALU());
      out.write("</td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr class=\"filap\">\n");
      out.write("                                <td class=\"columna1\">Turno</td>\n");
      out.write("                                <td class=\"columna2\">");
      out.print(objEstu.getTURN_ALU());
      out.write("</td>\n");
      out.write("                                <td class=\"columna1\">Fecha Nacimiento</td>\n");
      out.write("                                <td class=\"columna2\">");
      out.print(objEstu.getFEC_NAC_ALU());
      out.write("</td>\n");
      out.write("                            </tr>\n");
      out.write("                            \n");
      out.write("                       \n");
      out.write("                        </table>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("      \n");
      out.write("            </form>\n");
      out.write("        </center>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
