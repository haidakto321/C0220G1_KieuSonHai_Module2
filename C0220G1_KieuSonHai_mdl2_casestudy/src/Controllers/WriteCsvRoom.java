package Controllers;

import Models.Room;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class WriteCsvRoom {
    private static final String COMMA = ",";
    private static final String NEW_LINE = "\n";
    private static final String FILE_HEADER = "ID,Name,ServiceCode,Area,Cost,Max People,Cost,Free Service";

    public WriteCsvRoom() {
    }

    public static void writeCsvRoom(ArrayList<Room> listRoom) {
        FileWriter fileRoom = null;
        try {
            fileRoom = new FileWriter("E:\\Java\\C0220G1_KieuSonHai_mdl2_casestudy\\src\\Data\\Room.csv");
            for (Room room : listRoom
            ) {
//               String id, String name, String areaUsed, double cost, int maxPeople, String rentType,
//                String serviceCode, String freeService
                fileRoom.append(FILE_HEADER);
                fileRoom.append(NEW_LINE);
                fileRoom.append(room.getId());
                fileRoom.append(COMMA);
                fileRoom.append(room.getName());
                fileRoom.append(COMMA);
                fileRoom.append(room.getAreaUsed());
                fileRoom.append(COMMA);
                fileRoom.append(String.valueOf(room.getCost()));
                fileRoom.append(COMMA);
                fileRoom.append(String.valueOf(room.getMaxPeople()));
                fileRoom.append(COMMA);
                fileRoom.append(String.valueOf(room.getRentType()));
                fileRoom.append(COMMA);
                fileRoom.append(room.getServiceCode());
                fileRoom.append(COMMA);
                fileRoom.append(room.getFreeService());

                fileRoom.append(NEW_LINE);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileRoom.flush();
                fileRoom.close();
            } catch (Exception e1) {
                System.out.println("Error when flush or close!");
            }

        }
    }
}

