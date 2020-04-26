package Controllers;

import Models.Customer;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class WriteCsvCustomer {
    private static final String COMMA = ",";
    private static final String NEW_LINE = "\n";
    private static final String FILE_HEADER=" name,  birthday,  gender,  CMND,  numberPhone,  email, " +
            " typeOfCustomer,  address";

    public WriteCsvCustomer() throws IOException {
    }


    public void writeCsvCustomerFile(ArrayList<Customer> listCustomer) {
        FileWriter fileCustomer=null;
        try {
            fileCustomer=new FileWriter("E:\\Java\\C0220G1_KieuSonHai_mdl2_casestudy\\src\\Data\\Customer.csv");
            for (Customer customer : listCustomer) {
                if (listCustomer.get(0).equals("name")) {
                    continue;
                }
                fileCustomer.append(FILE_HEADER);
                fileCustomer.append(NEW_LINE);
                fileCustomer.append(customer.getName());
                fileCustomer.append(COMMA);
                fileCustomer.append(customer.getBirthday());
                fileCustomer.append(COMMA);
                fileCustomer.append(customer.getGender());
                fileCustomer.append(COMMA);
                fileCustomer.append(customer.getCMND());
                fileCustomer.append(COMMA);
                fileCustomer.append(customer.getNumberPhone());
                fileCustomer.append(COMMA);
                fileCustomer.append(customer.getEmail());
                fileCustomer.append(COMMA);
                fileCustomer.append(customer.getTypeOfCustomer());
                fileCustomer.append(COMMA);
                fileCustomer.append(customer.getAddress());
                fileCustomer.append(NEW_LINE);

            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileCustomer.flush();
                fileCustomer.close();
            } catch (Exception e1) {
                System.out.println("Error when flush or close!");
            }

        }
    }
}
