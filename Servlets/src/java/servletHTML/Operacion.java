package servletHTML;

/**
 *
 * @author EMMANUEL
 */
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class Operacion extends HttpServlet {
    //Inicializamos las variables que usaremos en el programa
    int num1=0;
    int num2=0;
    String op="";
    //Creamos un método doPost para enviar una respuesta
    public void doPost(HttpServletRequest peticion, HttpServletResponse respuesta)
            throws ServletException, IOException {
        //Pedimos los valores ingresados en el HTML
        num1 = Integer.parseInt(peticion.getParameter("num1"));
        num2 = Integer.parseInt(peticion.getParameter("num2"));
        op = peticion.getParameter("Op");
        PrintWriter out = new PrintWriter(respuesta.getOutputStream());
        //Creamos un documento HTML para enviar el resultado
        out.println("<html>");
        out.println("<head><title>Resultado</title></head>");
        out.println("<body>");
        //Dependiendo la operación seleccionada en el combobox se realiza la operación correspondiente
        if(op.equals("s")){
        out.println("<p><h2><center>Resultado: <br> "+(num1+num2)+" </center></h2></p>");
        }
        else if(op.equals("r")){
        out.println("<p><h2><center>Resultado: <br> "+(num1-num2)+" </center></h2></p>");
        }
        else if(op.equals("m")){
        out.println("<p><h2><center>Resultado: <br> "+(num1*num2)+" </center></h2></p>");
        }
        else if(op.equals("d")){
        out.println("<p><h2><center>Resultado: <br> "+(num1/num2)+" </center></h2></p>");
        }
        out.println("</body></html>");
        //Se envía el resultado y termina el HTML
        out.close();
    }
}
