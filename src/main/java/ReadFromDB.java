import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by icondor on 18/06/16.
 */
@WebServlet("/readFromDB")
public class ReadFromDB extends HttpServlet {



    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        // call db and obtain the result in a List
        // like
        //   DB d = new DB();
        //   d.readFromDB();
        //


        // list is simulated here
        List<Double> demolistaVenitaDinDB = new ArrayList<Double>();
        demolistaVenitaDinDB.add(44.6);
        demolistaVenitaDinDB.add(3544.6);
        demolistaVenitaDinDB.add(454.6);
        demolistaVenitaDinDB.add(443.6);


        // output in the traditional manner
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out =resp.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Calcule </title>");
        out.println("</head>");

        out.println("<body>");
        for (Double value: demolistaVenitaDinDB) {  // iterate through all the values in the list
            out.println("Item:"+" <b>"+value+"</b>"); // print them as html
            out.println("</br>"); // new html line
        }
        out.close();
    }
}
