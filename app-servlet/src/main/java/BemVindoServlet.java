import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BemVindoServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        // Define que a resposta será enviada no formato HTML
        response.setContentType("text/html;charset=UTF-8");
        
        // Obtém o objeto PrintWriter para enviar o texto ao cliente (navegador)
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Aplicação Servlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Bem-vindo à aplicação Servlet!</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}