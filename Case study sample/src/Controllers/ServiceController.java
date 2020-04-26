package Controllers;

import Commons.FuncGeneric;
import Commons.FuncWriteAndReadFileCSV;
import Commons.ScannerUtils;
import Models.House;
import Models.Services;
import Models.Villa;

import java.util.ArrayList;

import static Commons.Menu.displayMenuAddNewService;
import static Controllers.MainControllers.backMainMenu;
import static Controllers.MainControllers.processMain;

public class ServiceController {
    public static void addNewServices() {
        displayMenuAddNewService() ;
        processMenuAddNewService();

    }
    public static void processMenuAddNewService() {
        switch (ScannerUtils.scanner.nextLine()) {
            case "1":
                addNewVilla();
                break;
            case "2":
                addNewHouse();
                break;
            case "3":
                addNewRoom();
                break;
            case "4":
                processMain();
                System.out.println("\n---------------------------------");
                break;
            case "5":
                System.exit(0);
                break;
            default:
        }
    }
    public static void addNewVilla() {
        Services villa=new Villa();
        villa=addNewService(villa);

        System.out.println("Enter room standard:");
        ((Villa) villa).setRoomStandard(ScannerUtils.scanner.nextLine());
        System.out.println("Enter tien ich khac: ");
        ((Villa) villa).setOtherUtilities(ScannerUtils.scanner.nextLine());
        System.out.println("Enter area pool: ");
        ((Villa) villa).setPoolArea(ScannerUtils.scanner.nextLine());
        System.out.println("Enter number of floors: ");
        ((Villa) villa).setFloors(Integer.parseInt(ScannerUtils.scanner.nextLine()));
        //Get list villa from CSV
        ArrayList<Villa> villaList=FuncGeneric.getListFromCSV(FuncGeneric.EntityType.VILLA);

        villaList.add((Villa) villa);
        //Write to csv
        FuncWriteAndReadFileCSV.writeVillaToFileCsv(villaList);

        System.out.println("-----Add villa: "+villa.getServiceCode()+" successfully");
        backMainMenu();
    }
    public static void addNewHouse() {
        Services house=new House();
        house=addNewService(house);
        System.out.println("Enter room standard:");
        ((Villa) house).setRoomStandard(ScannerUtils.scanner.nextLine());
        System.out.println("Enter tien ich khac: ");
        ((Villa) house).setOtherUtilities(ScannerUtils.scanner.nextLine());
        System.out.println("Enter number of floors: ");
        ((Villa) house).setFloors(Integer.parseInt(ScannerUtils.scanner.nextLine()));

        ArrayList<House> houseList=FuncGeneric.getListFromCSV(FuncGeneric.EntityType.HOUSE);
        houseList.add((House) house);
        FuncWriteAndReadFileCSV.writeHouseToFileCsv(houseList);

        System.out.println("------------ Add house: "+house.getServiceCode()+" successfully");
        backMainMenu();
    }
    public static void addNewRoom() {

    }
    private static Services addNewService(Services services) {
        System.out.println("Enter id: ");
        services.setId(ScannerUtils.scanner.nextLine());
        System.out.println("Enter service code: ");
        services.setServiceCode(ScannerUtils.scanner.nextLine());
        System.out.println("Enter area used: ");
        services.setAreaUsed(Double.parseDouble(ScannerUtils.scanner.nextLine()));
        System.out.println("Enter cost: ");
        services.setCost(Double.parseDouble(ScannerUtils.scanner.nextLine()));
        System.out.println("Enter max number of people: ");
        services.setMaxPeople(Integer.parseInt(ScannerUtils.scanner.nextLine()));
        System.out.println("Enter rent type: ");
        services.setRentType(ScannerUtils.scanner.nextLine());
        return services;
    }
    public static void showServices() {}


}
