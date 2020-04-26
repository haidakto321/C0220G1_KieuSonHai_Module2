package Controllers;

import Commons.CustomerComparator;
import Models.Customer;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadCsvCustomer {
    BufferedReader readCustomer = null;
    ArrayList listCustomer = new ArrayList<>();

    public ReadCsvCustomer() throws FileNotFoundException {
    }

    public ArrayList<Customer> readCsvCustomer()  {

        String line;
        try {
            readCustomer = new BufferedReader(new FileReader("E:\\Java\\C0220G1_KieuSonHai_mdl2_casestudy\\src\\Data\\Customer.csv"));
            while ((line = readCustomer.readLine()) != null) {
                String[] splitData = line.split(",");
                if (splitData[0].equals("name")) {
                    continue;
                }
                Customer customer = new Customer(splitData[0],
                        splitData[1],
                        splitData[2],
                        splitData[3],
                        splitData[4],
                        splitData[5],
                        splitData[6],
                        splitData[7]);
                listCustomer.add(customer);
//                listCustomer.sort(new CustomerComparator());
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                readCustomer.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        return listCustomer;
    }
}