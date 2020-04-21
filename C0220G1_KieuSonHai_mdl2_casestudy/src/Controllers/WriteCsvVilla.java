package Controllers;


import Models.Villa;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class WriteCsvVilla<listVilla> {
    private static final String COMMA = ",";
    private static final String XUONG_DONG = "\n";
    public WriteCsvVilla() throws IOException {
    }

    //    public static void writeCsvVillaFile(String serviceCode, double areaUsed, double cost,
//                                         int maxPeople, String rentType, String otherUtilities,
//                                         double poolArea, int floors) throws IOException {
//    }
    public static void writeCsvVillaFile(ArrayList<Villa> listVilla) {
    }

//    FileWriter fileVilla = new FileWriter("E:\\Java\\C0220G1_KieuSonHai_mdl2_casestudy\\src\\Data\\Villa.csv");
//    for(Villa villa : listVilla) {
//        fileVilla.append(villa.getServiceCode());
//        fileVilla.append(COMMA);
//
//
//    }

}
