package Controllers;

import Models.House;
import Models.Room;
import Models.Villa;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class MainControllers {
    public static void main(String[] args) throws IOException {
        MainControllers main=new MainControllers();
        main.displayMainMenu();
    }

    Scanner input = new Scanner(System.in);
    ArrayList<Villa> listVilla = new ArrayList<>();
    ArrayList<House> listHouse = new ArrayList<>();
    ArrayList<Room> listRoom = new ArrayList<>();
    private boolean flag;

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
            int select = input.nextInt();
            switch (select) {
                case 1:
                    addNewVilla();
                    this.addNewServices();
                    break;
                case 2:
                    this.addNewHouse();
                    this.addNewServices();
                    break;
                case 3:
                    this.addNewRoom();
                    this.addNewServices();
                    break;
                case 4:
                    this.displayMainMenu();
                    break;
                case 5:
                    flag = false;
                    System.exit(0);
                    break;
                default:
                    System.out.println("Giá trị nhập vào không chính xác. Vui lòng nhập lại");
                    this.addNewServices();
                    break;
            }
        } while (flag);
    }

    public void addNewVilla() throws IOException {
        System.out.println("Mã dịch vụ: ");
        String serviceCode = input.nextLine();
        System.out.println("Diện tích sử dụng: ");
        double areaUsed = input.nextDouble();
        System.out.println("Giá thuê: ");
        double cost = input.nextDouble();
        System.out.println("Số người tối đa: ");
        int maxPeople = input.nextInt();
        System.out.println("Rent type: ");
        String rentType = input.nextLine();
        System.out.println("Tiện ích khác ");
        String otherUtilities = input.nextLine();
        System.out.println("Diện tích hồ bơi: ");
        double poolArea = input.nextDouble();
        System.out.println("Số tầng:  ");
        int floors = input.nextInt();
        Villa villa=new Villa(serviceCode, areaUsed, cost,
                maxPeople, rentType, otherUtilities,
                poolArea, floors);
        listVilla.add(villa);
        WriteCsvVilla.writeCsvVillaFile(listVilla);
    }

    public void addNewHouse() {
        System.out.println("Mã dịch vụ: ");
        String serviceCode = input.nextLine();
        System.out.println("Diện tích sử dụng: ");
        double areaUsed = input.nextDouble();
        System.out.println("Giá thuê ");
        double cost = input.nextDouble();
        System.out.println("Số người tối đa: ");
        int maxPeople = input.nextInt();
        System.out.println("Rent type: ");
        String rentType = input.nextLine();
        System.out.println("Tiện ích khác ");
        String otherUtilities = input.nextLine();
        System.out.println("Số tầng:  ");
        int floors = input.nextInt();
    }

    public void addNewRoom() {
        System.out.println("Mã dịch vụ: ");
        String serviceCode = input.nextLine();
        System.out.println("Diện tích sử dụng: ");
        double areaUsed = input.nextDouble();
        System.out.println("Giá thuê ");
        double cost = input.nextDouble();
        System.out.println("Số người tối đa: ");
        int maxPeople = input.nextInt();
        System.out.println("Rent type: ");
        String rentType = input.nextLine();
        System.out.println("Dịch vụ miễn phí đi kèm: ");
        String freeService = input.nextLine();
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

    public void showAllVilla() throws FileNotFoundException {
        ReadCsvVilla readCsvVilla = new ReadCsvVilla();
    }
    private void showAllRoom() {
    }
    private void showAllHouse() {
    }
}



