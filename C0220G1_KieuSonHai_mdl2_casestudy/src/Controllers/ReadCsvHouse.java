package Controllers;

import Models.House;
import Models.Villa;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.TreeSet;

public class ReadCsvHouse {
    BufferedReader readHouse = null;
    ArrayList listHouse = new ArrayList<>();
    TreeSet listHouseNotDuplicate = new TreeSet<>();

    public ReadCsvHouse() throws FileNotFoundException {
    }

    public ArrayList<House> readCsvHouse() {
        String line;
        try {
            readHouse = new BufferedReader(new FileReader("E:\\Java\\C0220G1_KieuSonHai_mdl2_casestudy\\src\\Data\\House.csv"));
            while ((line = readHouse.readLine()) != null) {
                String[] splitData = line.split(",");
                if (splitData[0].equals("Name")) {
                    continue;
                }
//                String id, String name, String areaUsed, double cost, int maxPeople, String rentType,
//                 String serviceCode, String roomStandard, String otherUtilities, int floors
                House house = new House(splitData[0], splitData[1], splitData[2], Double.parseDouble(splitData[3]),
                        Integer.parseInt(splitData[4]), splitData[5],
                        splitData[6], splitData[7], splitData[8],  Integer.parseInt(splitData[9]));

                listHouse.add(house);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                readHouse.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        return listHouse;
    }
}
