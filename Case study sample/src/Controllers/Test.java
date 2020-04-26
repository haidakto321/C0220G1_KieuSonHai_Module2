package Controllers;

import Models.Services;
import Models.Villa;

public class Test {
    public static void main(String[] args) {
//        String id,  String areaUsed, double cost, int maxPeople, String rentType,
//                String serviceCode, String roomStandard, String otherUtilities, String poolArea, int floors
        Services villa=new Villa("V1",300,200,6,"Day","SVVL-1234",
                "Vip","Phong xong hoi","30",4);
        villa.showInfor();
    }
}
