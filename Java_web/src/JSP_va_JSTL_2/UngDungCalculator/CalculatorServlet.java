package JSP_va_JSTL_2.UngDungCalculator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CalculatorServlet ", urlPatterns ="/simplecalculate")
public class CalculatorServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        double firstOperand=Double.parseDouble(request.getParameter("first operand"));
        double secondOperand=Double.parseDouble(request.getParameter("second operand"));
        char operator=request.getParameter("operator").charAt(0);
        PrintWriter writer=response.getWriter();
        double result=Calculator.calculate(firstOperand,secondOperand,operator);
        writer.println("<html>");
        writer.println(firstOperand + operator +secondOperand+" = "+result);
        writer.println("</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
