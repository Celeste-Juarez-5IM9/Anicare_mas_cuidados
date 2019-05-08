<%-- 
    Document   : Historial_Med
    Created on : 21-abr-2019, 21:02:53
    Author     : celeste.juarez
--%>

<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Historial M&eacute;dico</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="../CSS/css_background.css" rel="stylesheet" type="text/css"/>
        <link href="../CSS/HTMLtoPDF.css" rel="stylesheet" type="text/css"/>
        <link href="../CSS/css_menu.css" rel="stylesheet" type="text/css"/>
        <link href="../CSS/HM_Button.css" rel="stylesheet" type="text/css"/>
        
        <script src="../JS/HM/jquery-2.1.3.js" type="text/javascript"></script>
        <script src="../JS/HM/jspdf.js" type="text/javascript"></script>
        <script src="../JS/HM/pdfFromHTML.js" type="text/javascript"></script>
        <script src="../JS/HM/Button.js" type="text/javascript"></script>
    </head>
    <body>
    <div class="background">
       
          <div class="container2">
            
<!--ICONO DE DESCAGA INICIO-->      
                <div class="btn-circle-download" onclick="HTMLtoPDF()">
                  <svg id="arrow" width="14px" height="20px" viewBox="17 14 14 20">
                    <path d="M24,15 L24,32"></path>
                    <polyline points="30 27 24 33 18 27"></polyline>
                  </svg>
                  <svg id="check" width="21px" height="15px" viewBox="13 17 21 15">
                    <polyline points="32.5 18.5 20 31 14.5 25.5"></polyline>
                  </svg>
                  <svg  id="border" width="48px" height="48px" viewBox="0 0 48 48">
                    <path d="M24,1 L24,1 L24,1 C36.7025492,1 47,11.2974508 47,24 L47,24 L47,24 C47,36.7025492 36.7025492,47 24,47 L24,47 L24,47 C11.2974508,47 1,36.7025492 1,24 L1,24 L1,24 C1,11.2974508 11.2974508,1 24,1 L24,1 Z"></path>
                  </svg>
                </div>

                       <!-- here we call the function that makes PDF
                       <a href="#" onclick="HTMLtoPDF()">Download PDF</a> -->
<!--ICONO DE DESCAGA FIN-->
 
 <!-- TEXTO-->  
              <div id="HTMLtoPDF">
                  <div id="texto" style="margin-top: 15%; font-family: sans-serif;font-size: 25px; text-align: justify;">
               
                    <%
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
%>
                    
                  </div>
                </div>

               

          </div> 
  <!-- TEXTO FIN-->  
  
 <!-- Menú-->         
                      <input type="checkbox" id="myInput">
                <label for="myInput">
                    <span class="bar top"></span>
                    <span class="bar middle"></span>
                    <span class="bar bottom"></span>
                </label>

            <aside>
              <div class="aside-section aside-left">
                  <div class="aside-content">
                      <p> &#191;Quieres saber qui&eacute;nes somos? </p><br><br>
                      <a href="../Quienes_somos.html"><button class="button"> Da click aqu&iacute;. </button></a>
                  </div>
              </div>

              <div class="aside-section aside-right">
                  <ul class="aside-list">
                    <li><a href="" class="aside-anchor">Inicio</a></li>
                    <li><a href="" class="aside-anchor">Localizaci&oacute;n</a></li>
                    <li><a href="" class="aside-anchor">Animal Crossing</a></li>
                    <li><a href="../index.html" class="aside-anchor">+Cuidados</a></li>
                  </ul>
              </div>
            </aside>
 <!-- Menú FIN-->                        
    </div> 
    </body>
</html>

    
