
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;


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

        if(sOp.equals("1"))
            resultValue=nr1+nr2;
      else
        if(sOp.equals("2"))
            resultValue=nr1-nr2;
        else
        if(sOp.equals("3"))
            resultValue=nr1*nr2;
        else
        if(sOp.equals("4"))
            resultValue=(double)nr1/nr2;



        out.println("<html>");
        out.println("<head>");
        out.println("<title>Calcule </title>");
        out.println("</head>");

        out.println("<body>");


        out.println("rezultatul este: <b>"+resultValue+"</b>");

        out.close();



        out.println("</body>");
    }
}