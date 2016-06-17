
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/operatiiMatematiceTraditional")
public class OperatiiMatematiceTraditional extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out =resp.getWriter();

        String sNr1=req.getParameter("nr1");
        String sNr2=req.getParameter("nr2");
        String sOp=req.getParameter("op");

        int nr1=Integer.parseInt(sNr1);
        int nr2=Integer.parseInt(sNr2);
        double resultValue=0;

        switch (sOp) {
            case "1":
                resultValue = nr1 + nr2;
                break;
            case "2":
                resultValue = nr1 - nr2;
                break;
            case "3":
                resultValue = nr1 * nr2;
                break;
            case "4":
                resultValue = (double) nr1 / nr2;
                break;
        }



        out.println("<html>");
        out.println("<head>");
        out.println("<title>Calcule </title>");
        out.println("</head>");

        out.println("<body>");


        out.println("result is: <b>"+resultValue+"</b>");

        out.close();



        out.println("</body>");
    }
}