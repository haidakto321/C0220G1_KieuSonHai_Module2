package Controllers;

import Models.Customer;
import Models.Villa;

import java.io.FileWriter;
import java.io.IOException;

public class WriteCsvBooking {
    private static final String COMMA = ",";
    private static final String NEW_LINE = "\n";
    private static final String FILE_HEADER = "  name,  birthday,  gender,  CMND, numberPhone,  email,  typeOfCustomer,  address," +
            " ID, name, area used, cost, max people, rent type, service code, Room standard, Other ultilities, Pool area, floors";
    FileWriter fileBooking = null;

    public WriteCsvBooking() throws IOException {
    }

    public void writeCsvBookingVillaFile(Customer customer, Villa services) {
        try {
            fileBooking = new FileWriter("E:\\Java\\C0220G1_KieuSonHai_mdl2_casestudy\\src\\Data\\Booking.csv");
            fileBooking.append(FILE_HEADER);
            fileBooking.append(NEW_LINE);
            fileBooking.append(customer.getName());
            fileBooking.append(COMMA);
            fileBooking.append(customer.getBirthday());
            fileBooking.append(COMMA);
            fileBooking.append(customer.getGender());
            fileBooking.append(COMMA);
            fileBooking.append(customer.getCMND());
            fileBooking.append(COMMA);
            fileBooking.append(customer.getNumberPhone());
            fileBooking.append(COMMA);
            fileBooking.append(customer.getEmail());
            fileBooking.append(COMMA);
            fileBooking.append(customer.getTypeOfCustomer());
            fileBooking.append(COMMA);
            fileBooking.append(customer.getAddress());
            fileBooking.append(COMMA);

//            ID, name, area used, cost, max people, rent type, service code, Room standard, Other ultilities, Pool area, floors
            fileBooking.append(services.getId());
            fileBooking.append(COMMA);
            fileBooking.append(services.getName());
            fileBooking.append(COMMA);
            fileBooking.append(String.valueOf(services.getAreaUsed()));
            fileBooking.append(COMMA);
            fileBooking.append(String.valueOf(services.getCost()));
            fileBooking.append(COMMA);
            fileBooking.append(Integer.toString((int) services.getMaxPeople()));
            fileBooking.append(COMMA);
            fileBooking.append(String.valueOf(services.getRentType()));
            fileBooking.append(COMMA);
            fileBooking.append(services.getServiceCode());
            fileBooking.append(COMMA);
            fileBooking.append(services.getRoomStandard());
            fileBooking.append(COMMA);
            fileBooking.append(String.valueOf(services.getPoolArea()));
            fileBooking.append(COMMA);
            fileBooking.append(services.getOtherUtilities());
            fileBooking.append(String.valueOf(services.getFloors()));
            fileBooking.append(NEW_LINE);
            fileBooking.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}


