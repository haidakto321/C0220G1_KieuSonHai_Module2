package Commons;

import Models.House;
import Models.Villa;
import com.opencsv.CSVWriter;
import com.opencsv.ICSVWriter;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;

public class FuncWriteAndReadFileCSV {
    public static final char DEFAULT_SEPARATOR = ',';
    public static final char DEFAULT_QUOTE_CHARACTER = '"';
    public static final int NUM_OF_LINE_SKIP = 1;
    public static final String pathVilla = "src/Data/Villa.csv";
    public static final String pathRoom = "src/Data/Room.csv";
    public static final String pathHouse = "src/Data/House.csv";
    public static final String pathCustomer = "src/Data/Customer.csv";
    public static final String pathBooking = "src/Data/Booking.csv";
    public static final String pathEmployee = "src/Data/Employee.csv";

    public static String[] headerRecordVilla = new String[]{"id", "areaUsed", "cost", "maxPeople", "rentType",
            "serviceCode", "roomStandard", "otherUtilities", "poolArea", "floors"};
    public static String[] headerRecordHouse = new String[]{"id", "areaUsed", "cost", "maxPeople", "rentType",
            "serviceCode", "roomStandard", "otherUtilities", "floors"};
    public static String[] headerRecordRoom = new String[]{"id", "areaUsed", "cost", "maxPeople", "rentType",
            "serviceCode", "free service "};
    public static String[] headerRecordCustomer = new String[]{"id", "areaUsed", "cost", "maxPeople", "rentType",
            "serviceCode", "roomStandard", "otherUtilities", "poolArea", "floors"};
    public static String[] headerRecordEmployee = new String[]{"id", "areaUsed", "cost", "maxPeople", "rentType",
            "serviceCode", "roomStandard", "otherUtilities", "poolArea", "floors"};
    public static String[] headerRecordBooking = new String[]{"id", "areaUsed", "cost", "maxPeople", "rentType",
            "serviceCode", "roomStandard", "otherUtilities", "poolArea", "floors"};

    public static void writeVillaToFileCsv(ArrayList<Villa> arrayList) {
        try (Writer writer = new FileWriter(pathVilla);
             CSVWriter csvWriter = new CSVWriter(writer,
                     CSVWriter.DEFAULT_SEPARATOR,
                     CSVWriter.NO_QUOTE_CHARACTER,
                     CSVWriter.DEFAULT_ESCAPE_CHARACTER,
                     CSVWriter.DEFAULT_LINE_END);) {
            csvWriter.writeNext(headerRecordVilla);
            for (Villa villa : arrayList) {
                csvWriter.writeNext(new String[]{
//                        String id,  String areaUsed, double cost, int maxPeople, String rentType,
//                            String serviceCode, String roomStandard, String otherUtilities, String poolArea, int floors
                    villa.getId(), String.valueOf(villa.getAreaUsed()), String.valueOf(villa.getCost()), String.valueOf(villa.getMaxPeople()),
                        villa.getRentType(), villa.getServiceCode(), villa.getRoomStandard(), villa.getOtherUtilities()
                        , villa.getPoolArea(), String.valueOf(villa.getFloors())});

            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void writeHouseToFileCsv(ArrayList<House> arrayList) {
        try (Writer writer = new FileWriter(pathHouse);
             CSVWriter csvWriter = new CSVWriter(writer,
                     CSVWriter.DEFAULT_SEPARATOR,
                     CSVWriter.NO_QUOTE_CHARACTER,
                     CSVWriter.DEFAULT_ESCAPE_CHARACTER,
                     CSVWriter.DEFAULT_LINE_END);) {
            csvWriter.writeNext(headerRecordVilla);
            for (House house : arrayList) {
                csvWriter.writeNext(new String[]{
//                        String id,  String areaUsed, double cost, int maxPeople, String rentType,
//                            String serviceCode, String roomStandard, String otherUtilities, String poolArea, int floors
                        house.getId(), String.valueOf(house.getAreaUsed()), String.valueOf(house.getCost()), String.valueOf(house.getMaxPeople()),
                        house.getRentType(), house.getServiceCode(), house.getRoomStandard(), house.getOtherUtilities()
                        ,  String.valueOf(house.getFloors())});

            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }


}
