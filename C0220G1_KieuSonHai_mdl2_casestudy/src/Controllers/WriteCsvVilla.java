package Controllers;


import Models.Villa;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class WriteCsvVilla {
    private static final String COMMA = ",";
    private static final String NEW_LINE = "\n";
    private static final String FILE_HEADER="Name,ServiceCode,Area,Cost,Max People,Cost,Other ultilities," +
            "Pool area,Number of floors";
    public WriteCsvVilla() throws IOException {
    }

    //    public static void writeCsvVillaFile(String serviceCode, double areaUsed, double cost,
//                                         int maxPeople, String rentType, String otherUtilities,
//                                         double poolArea, int floors) throws IOException {
//    }
    public static void writeCsvVillaFile(ArrayList<Villa> listVilla) throws IOException {
        FileWriter fileVilla=null;
        try {
            fileVilla = new FileWriter("E:\\Java\\C0220G1_KieuSonHai_mdl2_casestudy\\src\\Data\\Villa.csv");
            for(Villa villa : listVilla) {
                fileVilla.append(FILE_HEADER);
                fileVilla.append(NEW_LINE);
                fileVilla.append(villa.getName());
                fileVilla.append(COMMA);
                fileVilla.append(villa.getServiceCode());
                fileVilla.append(COMMA);
                fileVilla.append(villa.getAreaUsed());
                fileVilla.append(COMMA);
                fileVilla.append(String.valueOf(villa.getCost()));
                fileVilla.append(COMMA);
                fileVilla.append(String.valueOf(villa.getMaxPeople()));
                fileVilla.append(COMMA);
                fileVilla.append(String.valueOf(villa.getRentType()));
                fileVilla.append(COMMA);
                fileVilla.append(villa.getOtherUtilities());
                fileVilla.append(COMMA);
                fileVilla.append(String.valueOf(villa.getPoolArea()));
                fileVilla.append(COMMA);
                fileVilla.append(String.valueOf(villa.getFloors()));

                fileVilla.append(NEW_LINE);
            }
        } catch (Exception e) {
            System.out.println("Error in csv filevilla!");
        } finally {
            try {
                fileVilla.flush();
                fileVilla.close();
            } catch (Exception e1) {
                System.out.println("Error when flush or close!");
            }

        }

    }



}
