package Controllers;

import Commons.Validation;
import Models.House;
import Models.Room;
import Models.Villa;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class MainControllers extends Validation {
    public static void main(String[] args) throws IOException {
        MainControllers main = new MainControllers();
        main.displayMainMenu();
    }

    Scanner input = new Scanner(System.in);
    ArrayList<Villa> listVilla = new ArrayList<>();
    ArrayList<House> listHouse = new ArrayList<>();
    ArrayList<Room> listRoom = new ArrayList<>();
    private boolean isError;

    public MainControllers() {
    }

    public void displayMainMenu() throws IOException {
        System.out.println("Chọn chức năng: " + "\n1. Add New Services\n" +
                "2.Show Services\n" +
                "3.Add New Customer\n" +
                "4.Show Information of Customer\n" +
                "5.Add New Booking\n" +
                "6.Show Information of Employee\n" +
                "7.Booking Movie Ticket 4D\n" +
                "8.Find Employee\n" +
                "9.Exit\n");
        int select = input.nextInt();
        switch (select) {
            case 1:
                this.addNewServices();
                this.displayMainMenu();
                break;
        }
    }

    public void addNewServices() throws IOException {
        System.out.println("1.Add New Villa\n" +
                "2.Add New House\n" +
                "3.Add New Room\n" +
                "4.Back to menu\n" +
                "5.Exit");
        do {
            System.out.println("Chọn chức năng: ");
            String select = input.nextLine();
            switch (select) {
                case "1":
                    this.addNewVilla();
                    this.addNewServices();
                    break;
                case "2":
                    this.addNewHouse();
                    this.addNewServices();
                    break;
                case "3":
                    this.addNewRoom();
                    this.addNewServices();
                    break;
                case "4":
                    this.displayMainMenu();
                    break;
                case "5":
                    isError = false;
                    System.exit(0);
                    break;
                default:
                    System.out.println("Giá trị nhập vào không chính xác. Vui lòng nhập lại");
                    this.addNewServices();
                    break;
            }
        } while (isError);
    }

    public void addNewVilla() throws IOException {
        String character = "V";
        String name = "Villa";
        String id=inputId();
        String serviceCode=inputServiceCode(character);
        String areaUsed=inputAreaUsed();
        double cost=inputCost();
        int maxPeople=inputMaxPeople();
        String detail=inputDetail();
        String rentType=inputRentType();
        String otherUtilities=inputOtherUltilities();
        String poolArea=inputPoolArea();
        int floors=inputFloors();
//        System.out.println("Mã dịch vụ: ");
//        String serviceCode = input.nextLine();
//        System.out.println("Diện tích sử dụng: ");
//        String areaUsed = input.nextLine();
//        System.out.println("Giá thuê: ");
//        double cost = Double.parseDouble(input.nextLine());
//        System.out.println("Số người tối đa: ");
//        int maxPeople = Integer.parseInt(input.nextLine());
//        System.out.println("Rent type: ");
//        String rentType = input.nextLine();
//        System.out.println("Tiện ích khác ");
//        String otherUtilities = input.nextLine();
//        System.out.println("Diện tích hồ bơi: ");
//        String poolArea = input.nextLine();
//        System.out.println("Số tầng:  ");
//        int floors = Integer.parseInt(input.nextLine());
        Villa villa = new Villa(id,name,  areaUsed,  cost,  maxPeople,  rentType,  serviceCode,
                    detail,otherUtilities,  poolArea,  floors);
        listVilla.add(villa);
        WriteCsvVilla.writeCsvVillaFile(listVilla);
        System.out.println("Đã thêm mới villa!");
    }

    public void addNewHouse() {
        String character = "H";
        String name = "House";
        String id=inputId();
        String serviceCode=inputServiceCode(character);
        String areaUsed=inputAreaUsed();
        double cost=inputCost();
        int maxPeople=inputMaxPeople();
        String detail=inputDetail();
        String rentType=inputRentType();
        String otherUtilities=inputOtherUltilities();
        int floors=inputFloors();
        House house=new House( id,  name,  areaUsed,  cost,  maxPeople,  rentType,
                 serviceCode,   detail,  otherUtilities,  floors);
        listHouse.add(house);
        WriteCsvHouse.writeCsvHouse(listHouse);
        System.out.println("Da them moi House!");
    }

    public void addNewRoom() {
        String character = "R";
        String name = "Room";
        String id=inputId();
        String serviceCode=inputServiceCode(character);
        String areaUsed=inputAreaUsed();
        double cost=inputCost();
        int maxPeople=inputMaxPeople();
        String rentType=inputRentType();
        String freeService=inputFreeService();
        Room room=new Room( name,  areaUsed,  cost,  maxPeople,  rentType,  id,  freeService);
        listRoom.add(room);
        WriteCsvRoom.writeCsvRoom(listRoom);
        System.out.println("Da them moi Room!");
    }

    public void showServices() throws IOException {
        boolean flag = true;
        System.out.println("1.Show all Villa\n" +
                "2.Show all House\n" +
                "3.Show all Room\n" +
                "4.Show All Name Villa Not Duplicate\n" +
                "5.Show All Name House Not Duplicate\n" +
                "6.Show All Name Name Not Duplicate\n" +
                "7.Back to menu\n" +
                "8.Exit\n");
        int select = input.nextInt();
        switch (select) {
            case 1:
                this.showAllVilla();
                this.showServices();
                break;
            case 2:
                this.showAllHouse();
                this.showServices();
                break;
            case 3:
                this.showAllRoom();
                this.showServices();
                break;
            case 4:
                this.showServices();
                break;
            case 5:
                this.showServices();
                break;
            case 6:
                this.showServices();
                break;
            case 7:
                this.displayMainMenu();
                break;
            case 8:
                flag = false;
                System.exit(0);
                break;
            default:
                System.out.println("Giá trị nhập vào không chính xác. Vui lòng nhập lại");
                this.showServices();
                break;
        }
        while (flag) ;
    }

    public void showAllVilla() throws IOException  {
        ReadCsvVilla readCsvVilla = new ReadCsvVilla();
        listVilla = readCsvVilla.readCsvVilla();
        for (Villa villa:listVilla
             ) {
            System.out.println("-------------------------------------------------------");
            System.out.println(villa.showInfor());
            System.out.println("-------------------------------------------------------");
        }
    }

    private void showAllRoom() {
    }

    private void showAllHouse() {
    }
    //nhap du lieu
    public String inputId() {
        System.out.println("Nhập ID: ");
        String id=input.nextLine();
        return id;
    }
    public String inputServiceCode(String character) {
        String serviceCode;
        isError =false;
        do {
            System.out.println("Nhập mã dịch vụ");
            serviceCode = input.nextLine();
            if (checkServiceCode(serviceCode, character)) {
                isError = false;
            } else {
                System.out.println("Service code không chính xác. Vui lòng nhập lại!");
                isError=true;
            }
        } while (isError);
        return serviceCode;
    }
    public String inputAreaUsed() {
        String areaUsed;
        do {
            System.out.println("Nhập diện tích sử dụng");
            areaUsed = input.nextLine();
            if (checkAreaUsed(areaUsed)) {
                isError = false;
            } else {
                System.out.println("Diện tích nhập phải lớn hơn 30m2. Vui lòng nhập lại!");
                isError=true;
            }
        } while (isError);
        return areaUsed;
    }
    public double inputCost() {
        double cost;
        do {
            System.out.println("Nhập giá thuê");
            cost = input.nextDouble();
            if (checkCost(cost)) {
                isError = false;
            } else {
                System.out.println("Giá thuê phải là số dương. Vui lòng nhập lại!");
                isError=true;
            }
        } while (isError);
        return cost;
    }
    public int inputMaxPeople() {
        int maxPeople;
        do {
            System.out.println("Nhập số người đi chung");
            maxPeople = input.nextInt();
            if (checkMaxPeople(maxPeople)) {
                isError = false;
            } else {
                System.out.println("Số người phải từ 0-30. Vui lòng nhập lại!");
                isError=true;
            }
        } while (isError);
        return maxPeople;
    }
    public String inputRentType() {
        String inputRentType;
        do {
            System.out.println("Nhập kiểu thuê(Day/Month/Year)");
            inputRentType = input.nextLine();
            if (checkRentType(inputRentType)) {
                isError = false;
            } else {
                System.out.println("Kiểu thuê phải viết hoa chữ đầu. Vui lòng nhập lại!");
                isError=true;
            }
        } while (isError);
        return inputRentType;
    }
    public String inputDetail() {
        String inputDetail;
        isError=false;
        do {
            System.out.println("Nhập tiêu chuẩn phòng");
            inputDetail = input.nextLine();
            if (checkDetail(inputDetail)) {
                isError = false;
            } else {
                isError=true;
                System.out.println("Sai cú pháp. Vui lòng nhập lại!");

            }
        } while (isError);
        return inputDetail;
    }
    public String inputOtherUltilities() {
        String otherUltilities;
        do {
            System.out.println("Nhập dịch vụ khác");
            otherUltilities = input.nextLine();
            if (checkOtherUltilities(otherUltilities)) {
                isError = false;
            } else {
                System.out.println("Các dịch vụ khác bao gồm: massage, karaoke, food, drink, car. Vui lòng nhập lại!");
                isError=true;
            }
        } while (isError);
        return otherUltilities;
    }
    public String inputPoolArea() {
        String poolArea;
        do {
            System.out.println("Nhập diện tích hồ bơi");
            poolArea = input.nextLine();
            if (checkPoolArea(poolArea)) {
                isError = false;
            } else {
                System.out.println("Diện tích hồ bơi phải lớn hơn 30m2. Vui lòng nhập lại!");
                isError=true;
            }
        } while (isError);
        return poolArea;
    }
    public int inputFloors() {
        int floors;
        do {
            System.out.println("Nhập số tầng");
            floors = input.nextInt();
            if (checkFloors(floors)) {
                isError = false;
            } else {
                System.out.println(" Vui lòng nhập lại!");
                isError=true;
            }
        } while (isError);
        return floors;
    }
    public String inputFreeService() {
        String freeService;
        do {
            System.out.println("Nhập dịch vụ miễn phí(nếu có): ");
            freeService = input.nextLine();
            if (checkFreeService(freeService)) {
                isError = false;
            } else {
                System.out.println("Sai cú pháp. Vui lòng nhập lại!");
                isError=true;
            }
        } while (isError);
        return freeService;
    }
}



