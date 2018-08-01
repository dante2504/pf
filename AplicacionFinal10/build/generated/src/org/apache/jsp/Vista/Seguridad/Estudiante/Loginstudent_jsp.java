package org.apache.jsp.Vista.Seguridad.Estudiante;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Loginstudent_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Login</title>\n");
      out.write("        <link href=\"");
      out.print(request.getContextPath());
      out.write("/css/estilo.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <script src=\"");
      out.print(request.getContextPath());
      out.write("/jquery-ui/jquery.js\"></script>  \n");
      out.write("        <script src=\"");
      out.print(request.getContextPath());
      out.write("/jquery-ui/jquery.alerts.js\" ></script>        \n");
      out.write("        <script src=\"");
      out.print(request.getContextPath());
      out.write("/js/bootstrap.min1.js\" ></script>     \n");
      out.write("        <script  src=\"");
      out.print(request.getContextPath());
      out.write("/js/javascript.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <input type=\"hidden\" name=\"op\" >\n");
      out.write("        <div class=\"login-box\">\n");
      out.write("            <img src=\"");
      out.print(request.getContextPath());
      out.write("/images/avatar.png\" class=\"avatar\"/>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label for=\"usuario\" class=\"col-lg-3 control-label\">Usuario:</label>\n");
      out.write("                <div class=\"col-lg-8\">\n");
      out.write("                    <input type=\"text\" id=\"txtusu\"  name=\"txtusu\" class=\"form-control\" placeholder=\"Ingrese su Usuario\" value=\"\" >\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label for=\"clave\" class=\"col-lg-3 control-label\">Clave:</label>\n");
      out.write("                <div class=\"col-lg-8\">\n");
      out.write("                    <input type=\"password\"   id=\"txtcla\"   name=\"txtcla\" class=\"form-control\" placeholder=\"Ingrese su Clave\" value=\"\"  >\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"form-group text-center\">\n");
      out.write("\n");
      out.write("                <button type=\"button\" class=\"btn btn-primary\"   onclick=\"usuario()('");
      out.print(request.getContextPath());
      out.write("','/Studentservlet', 1)\">\n");
      out.write("                   Iniciar Sesión\n");
      out.write("                </button>\n");
      out.write("            </div>   \n");
      out.write("\n");
      out.write("        </form>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
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
