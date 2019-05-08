package org.apache.jsp.Pag;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class Historial_005fMed_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Historial M&eacute;dico</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link href=\"../CSS/css_background.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"../CSS/HTMLtoPDF.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"../CSS/css_menu.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"../CSS/HM_Button.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        \n");
      out.write("        <script src=\"../JS/HM/jquery-2.1.3.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"../JS/HM/jspdf.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"../JS/HM/pdfFromHTML.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"../JS/HM/Button.js\" type=\"text/javascript\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    <div class=\"background\">\n");
      out.write("       \n");
      out.write("          <div class=\"container2\">\n");
      out.write("            \n");
      out.write("<!--ICONO DE DESCAGA INICIO-->      \n");
      out.write("                <div class=\"btn-circle-download\" onclick=\"HTMLtoPDF()\">\n");
      out.write("                  <svg id=\"arrow\" width=\"14px\" height=\"20px\" viewBox=\"17 14 14 20\">\n");
      out.write("                    <path d=\"M24,15 L24,32\"></path>\n");
      out.write("                    <polyline points=\"30 27 24 33 18 27\"></polyline>\n");
      out.write("                  </svg>\n");
      out.write("                  <svg id=\"check\" width=\"21px\" height=\"15px\" viewBox=\"13 17 21 15\">\n");
      out.write("                    <polyline points=\"32.5 18.5 20 31 14.5 25.5\"></polyline>\n");
      out.write("                  </svg>\n");
      out.write("                  <svg  id=\"border\" width=\"48px\" height=\"48px\" viewBox=\"0 0 48 48\">\n");
      out.write("                    <path d=\"M24,1 L24,1 L24,1 C36.7025492,1 47,11.2974508 47,24 L47,24 L47,24 C47,36.7025492 36.7025492,47 24,47 L24,47 L24,47 C11.2974508,47 1,36.7025492 1,24 L1,24 L1,24 C1,11.2974508 11.2974508,1 24,1 L24,1 Z\"></path>\n");
      out.write("                  </svg>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                       <!-- here we call the function that makes PDF\n");
      out.write("                       <a href=\"#\" onclick=\"HTMLtoPDF()\">Download PDF</a> -->\n");
      out.write("<!--ICONO DE DESCAGA FIN-->\n");
      out.write(" \n");
      out.write(" <!-- TEXTO-->  \n");
      out.write("              <div id=\"HTMLtoPDF\">\n");
      out.write("                  <div id=\"texto\" style=\"margin-top: 15%; font-family: sans-serif;font-size: 25px; text-align: justify;\">\n");
      out.write("               \n");
      out.write("                    ");

                    try
                    {
                    // Conexion con bd
                    Class.forName("com.mysql.jdbc.Driver").newInstance();;
                    Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/Anicare","root","flordemaria117");
                    if (!conexion.isClosed())
                    {
                       // La consulta
                       Statement st = conexion.createStatement();
                       ResultSet rs = st.executeQuery("select * from Historial where IdDueño = 1" );
                

                       // Ponemos los resultados en un table de html
                       out.println("<center><table border=\"1\"><tr><td>Fecha</td><td>Vacunas</td><td>Enfermedad</td><td>Operaci&oacute;n</td></tr>");
                       while (rs.next())
                       {
                          out.println("<tr>");
                          out.println("<td>"+rs.getObject("Fecha")+"</td>");
                          out.println("<td>"+rs.getObject("Vacunas")+"</td>");
                          out.println("<td>"+rs.getObject("Enfermedad")+"</td>");
                          out.println("<td>"+rs.getObject("Oper")+"</td>");

                          out.println("</tr>");
                       }
                       out.println("</table></center>");

                       // cierre de la conexion
                       conexion.close();
                    }
                    else
                       // Error en la conexion
                       out.println("fallo");
                 }
                 catch (Exception e)
                 {
                    // Error en algun momento.
                    out.println("Excepcion "+e);
                    e.printStackTrace();
                 }

      out.write("\n");
      out.write("                    \n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("               \n");
      out.write("\n");
      out.write("          </div> \n");
      out.write("  <!-- TEXTO FIN-->  \n");
      out.write("  \n");
      out.write(" <!-- Menú-->         \n");
      out.write("                      <input type=\"checkbox\" id=\"myInput\">\n");
      out.write("                <label for=\"myInput\">\n");
      out.write("                    <span class=\"bar top\"></span>\n");
      out.write("                    <span class=\"bar middle\"></span>\n");
      out.write("                    <span class=\"bar bottom\"></span>\n");
      out.write("                </label>\n");
      out.write("\n");
      out.write("            <aside>\n");
      out.write("              <div class=\"aside-section aside-left\">\n");
      out.write("                  <div class=\"aside-content\">\n");
      out.write("                      <p> &#191;Quieres saber qui&eacute;nes somos? </p><br><br>\n");
      out.write("                      <a href=\"../Quienes_somos.html\"><button class=\"button\"> Da click aqu&iacute;. </button></a>\n");
      out.write("                  </div>\n");
      out.write("              </div>\n");
      out.write("\n");
      out.write("              <div class=\"aside-section aside-right\">\n");
      out.write("                  <ul class=\"aside-list\">\n");
      out.write("                    <li><a href=\"\" class=\"aside-anchor\">Inicio</a></li>\n");
      out.write("                    <li><a href=\"\" class=\"aside-anchor\">Localizaci&oacute;n</a></li>\n");
      out.write("                    <li><a href=\"\" class=\"aside-anchor\">Animal Crossing</a></li>\n");
      out.write("                    <li><a href=\"../index.html\" class=\"aside-anchor\">+Cuidados</a></li>\n");
      out.write("                  </ul>\n");
      out.write("              </div>\n");
      out.write("            </aside>\n");
      out.write(" <!-- Menú FIN-->                        \n");
      out.write("    </div> \n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("    \n");
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
