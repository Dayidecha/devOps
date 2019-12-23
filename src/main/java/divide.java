import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class divide extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String a=request.getParameter("a");
        String b=request.getParameter("b");
        response.setContentType("text/plain; charset=utf-8");
        PrintWriter out=response.getWriter();

        if(b.equals("0"))
        {
            out.println("除数不能为0");
            out.close();
            return;
        }

        out.println(Double.valueOf(a)/Double.valueOf(b));
        out.close();
    }
}
