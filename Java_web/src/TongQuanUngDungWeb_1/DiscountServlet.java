package TongQuanUngDungWeb_1;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DiscountServlet ", urlPatterns = "/calculate")
public class DiscountServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String description=request.getParameter("description");
        Float fullprice=Float.parseFloat(request.getParameter("list price"));
        Float discount=Float.parseFloat(request.getParameter("discount percent"))/100;
        double discount_amount= fullprice*discount*0.1;
        double price=fullprice-discount_amount;
        PrintWriter writer=response.getWriter();
        writer.println("<html>");
        writer.println("<h1>Product description: "+description);
        writer.println("<h3>Full price: "+fullprice);
        writer.println("<h3>Discount amount: "+discount_amount);
        writer.println("<h3>Price after discount: "+price);
        writer.println("</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
