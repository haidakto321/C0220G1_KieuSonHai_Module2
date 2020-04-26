package Commons;

public class Menu {
    public static void displayMenuMain() {
        System.out.println("------------------ Main menu--------------------");
        System.out.println( "\n1. Add New Services\n" +
                "2.Show Services\n" +
                "3.Add New Customer\n" +
                "4.Show Information of Customer\n" +
                "5.Add New Booking\n" +
                "6.Show Information of Employee\n" +
                "7.Booking Movie Ticket 4D\n" +
                "8.Find Employee\n" +
                "9.Exit\n");
    }
    public static void displayMenuBackToMain() {
        System.out.println("------------- Enter to continue ---------------");
        ScannerUtils.scanner.nextLine();
    }
    public static void displayMenuAddNewService() {
        System.out.println("-------------- Add new service menu ----------------");
        System.out.println("1.Add new villa."+
                "\n2.Add new house."+
                "\n3.Add new room."+
                "\n4.Back to menu."+
                "\n5.Exit.");
        System.out.println("Select one function below: ");
    }

}
