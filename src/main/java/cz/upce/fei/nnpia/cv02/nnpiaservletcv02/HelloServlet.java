package cz.upce.fei.nnpia.cv02.nnpiaservletcv02;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", urlPatterns = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("<h2>Muj nadpis h2</h2>");
        out.println("</body></html>");

        System.out.println("the GET request has been made to /hello");
        
        String s2 = request.getServerName();
        out.println("<h2>Server name: "+s2+"</h2>");
        int i= request.getServerPort();
        out.println("<h2>Server Port: "+i+"</h2>");
        boolean b= request.isSecure();
        out.println("<h2>Is the server secure: "+b+"</h2>");
    }

    public void destroy() {
    }
}