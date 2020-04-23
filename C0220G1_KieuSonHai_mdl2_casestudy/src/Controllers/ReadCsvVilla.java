package Controllers;

import Models.Villa;
import com.opencsv.CSVWriter;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.TreeSet;

public class ReadCsvVilla {
    BufferedReader readVilla = null;
    ArrayList listVilla = new ArrayList<>();
    TreeSet listVillaNotDuplicate = new TreeSet<>();

    public ReadCsvVilla() throws FileNotFoundException {
    }

    public ArrayList<Villa> readCsvVilla() {
        String line;
        try {
            readVilla = new BufferedReader(new FileReader("E:\\Java\\C0220G1_KieuSonHai_mdl2_casestudy\\src\\Data\\Villa.csv"));
            while ((line = readVilla.readLine()) != null) {
                String[] splitData = line.split(",");
                if (splitData[0].equals("ID")) {
                    continue;
                }
//                String id, String name, String areaUsed, double cost, int maxPeople, String rentType, String serviceCode,
//                        String roomStandard, String otherUtilities, String poolArea, int floors
                Villa villa = new Villa(splitData[0], splitData[1], splitData[2], Double.parseDouble(splitData[3]),
                        Integer.parseInt(splitData[4]), splitData[5],
                        splitData[6], splitData[7], splitData[8], splitData[9], Integer.parseInt(splitData[10]));

                listVilla.add(villa);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                readVilla.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        return listVilla;
    }
}
