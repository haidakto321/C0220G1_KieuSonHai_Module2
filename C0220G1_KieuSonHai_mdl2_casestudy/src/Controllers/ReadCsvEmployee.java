package Controllers;

import Models.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class ReadCsvEmployee {
    public Map<String, Employee> readCsvEmployee() throws IOException {
        BufferedReader readEmployee = new BufferedReader(new FileReader("E:\\Java\\C0220G1_KieuSonHai_mdl2_casestudy\\src\\Data\\Employee.csv"));
        Map<String, Employee> mapEmployee = new TreeMap<>();
        ArrayList<Employee> listEmployee = new ArrayList<>();
        ArrayList<String> listId = new ArrayList<>();
        for (int i = 1; i < 11; i++) {
            if (i < 10) {
                listId.add("00" + i);
            } else {
                listId.add("0" + i);
            }
        }
        String line;
        while ((line = readEmployee.readLine()) != null) {
            String[] splitData = line.split(",");

            if (splitData[0].equals("id")) {
                continue;
            }
            Employee employee = new Employee(splitData[0],splitData[1], Integer.parseInt(splitData[2]), splitData[3]);
            listEmployee.add(employee);
        }

        for (int i = 0; i < listEmployee.size(); i++) {
            for (int j = i; j < listId.size(); j++) {
                mapEmployee.put(listId.get(j), listEmployee.get(i));
                break;
            }
        }
        return mapEmployee;
    }
}
