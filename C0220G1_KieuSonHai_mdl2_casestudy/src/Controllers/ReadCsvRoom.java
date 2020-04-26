package Controllers;

import Models.House;
import Models.Room;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.TreeSet;

public class ReadCsvRoom {
    BufferedReader readRoom = null;
    ArrayList listRoom = new ArrayList<>();
    TreeSet listRoomNotDuplicate = new TreeSet<>();

    public ReadCsvRoom() throws FileNotFoundException {
    }

    public ArrayList<Room> readCsvRoom() {
        String line;
        try {
            readRoom = new BufferedReader(new FileReader("E:\\Java\\C0220G1_KieuSonHai_mdl2_casestudy\\src\\Data\\Room.csv"));
            while ((line = readRoom.readLine()) != null) {
                String[] splitData = line.split(",");
                if (splitData[0].equals("Name")) {
                    continue;
                }
//                String id, String name, String areaUsed, double cost, int maxPeople, String rentType,
//                String serviceCode, String freeService
                Room room = new Room(splitData[0], splitData[1],splitData[2], Double.parseDouble(splitData[3]),
                        Integer.parseInt(splitData[4]), splitData[5],
                        splitData[6], splitData[7]);

                listRoom.add(room);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                readRoom.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        return listRoom;
    }

    public TreeSet<String> readCsvRoomNotDuplicate() throws IOException {
        String line;
        while ((line = readRoom.readLine()) != null) {
            String[] splitData = line.split(",");
            listRoomNotDuplicate.add(splitData[1]);
        }
        return listRoomNotDuplicate;
    }
}
