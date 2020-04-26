package Controllers;

import Commons.ScannerUtils;

import java.util.Scanner;

import static Commons.Menu.displayMenuBackToMain;
import static Commons.Menu.displayMenuMain;
import static Controllers.BookingController.addNewBooking;
import static Controllers.BookingController.bookingMovieTicket4D;
import static Controllers.CustomerController.addNewCustomer;
import static Controllers.CustomerController.showInformationCustomers;
import static Controllers.EmployeeController.findEmployeeFromResume;
import static Controllers.EmployeeController.showInformationOfEmployee;
import static Controllers.ServiceController.addNewServices;
import static Controllers.ServiceController.showServices;

public class MainControllers {
    public static void processMain() {
        try {
            displayMenuMain();
            processMenuMain();
        } catch (Exception e) {
            backMainMenu();
        }
    }

    public static void backMainMenu() {
        displayMenuBackToMain();
        processMain();
    }

    public static void processMenuMain() {
        switch (ScannerUtils.scanner.nextLine()) {
            case "1":
                addNewServices();
                displayMenuMain();
                break;
            case "2":
                showServices();
                displayMenuMain();
                break;
            case "3":
                addNewCustomer();
                displayMenuMain();
                break;
            case "4":
                showInformationCustomers();
                displayMenuMain();
                break;
            case "5":
                addNewBooking();
                displayMenuMain();
                break;
            case "6":
                showInformationOfEmployee();
                displayMenuMain();
                break;
            case "7":
                bookingMovieTicket4D();
                displayMenuMain();
                break;
            case "8":
                findEmployeeFromResume();
                displayMenuMain();
                break;
            case "9":
                System.exit(0);
            default:
                System.out.println("Error! Back to main menu!");
                backMainMenu();
        }
    }
}
