import JSP_va_JSTL_2.DisplayCustomer.Customer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "DisplayCustomerServlet",urlPatterns = "/customer_list")
public class DisplayCustomerServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Customer> listcustomer=new ArrayList<>();
        listcustomer.add(new Customer("cus1","22/1/1990","Da nang","../models/cus1.jpg"));
        listcustomer.add(new Customer("cus2","7/1/1990","Nghe An","../models/cus2.jpg"));
        listcustomer.add(new Customer("cus3","12/6/1995","Da nang","../models/cus3.jpg"));
        listcustomer.add(new Customer("cus4","7/7/1997","Quang Nam","../models/cus4.jpg"));
        listcustomer.add(new Customer("cus5","22/1/1996","Binh Dinh","../models/cus5.jpg"));

        request.setAttribute("danhsachkhachhang",listcustomer);
        request.getRequestDispatcher("JSP_va_JSTL/display_customer_list.jsp").forward(request,response);

    }
}
