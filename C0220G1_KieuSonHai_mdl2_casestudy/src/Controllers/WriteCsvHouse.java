package Controllers;

import Models.House;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class WriteCsvHouse {
    private static final String COMMA = ",";
    private static final String NEW_LINE = "\n";
    private static final String FILE_HEADER = "ID,Name,ServiceCode,Area,Cost,Max People,Cost,Other ultilities," +
            "Number of floors";

    public WriteCsvHouse() {
    }

    public static void writeCsvHouse(ArrayList<House> listHouse) {
        FileWriter fileHouse = null;
        try {
            fileHouse = new FileWriter("E:\\Java\\C0220G1_KieuSonHai_mdl2_casestudy\\src\\Data\\House.csv");
            for (House house:listHouse
                 ) {
//                String id, String name, String areaUsed, double cost, int maxPeople, String rentType,
//                 String serviceCode, String roomStandard, String otherUtilities, int floors
                fileHouse.append(FILE_HEADER);
                fileHouse.append(NEW_LINE);
                fileHouse.append(house.getId());
                fileHouse.append(COMMA);
                fileHouse.append(house.getName());
                fileHouse.append(COMMA);
                fileHouse.append(house.getAreaUsed());
                fileHouse.append(COMMA);
                fileHouse.append(String.valueOf(house.getCost()));
                fileHouse.append(COMMA);
                fileHouse.append(String.valueOf(house.getMaxPeople()));
                fileHouse.append(COMMA);
                fileHouse.append(String.valueOf(house.getRentType()));
                fileHouse.append(COMMA);
                fileHouse.append(house.getServiceCode());
                fileHouse.append(COMMA);
                fileHouse.append(house.getRoomStandard());
                fileHouse.append(COMMA);
                fileHouse.append(house.getOtherUtilities());
                fileHouse.append(COMMA);
                fileHouse.append(String.valueOf(house.getFloors()));

                fileHouse.append(NEW_LINE);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileHouse.flush();
                fileHouse.close();
            } catch (Exception e1) {
                System.out.println("Error when flush or close!");
            }

        }
    }
}
