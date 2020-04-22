package Controllers;

import Models.Villa;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.TreeSet;

public class ReadCsvVilla {
    FileReader readVilla=new FileReader("E:\\Java\\C0220G1_KieuSonHai_mdl2_casestudy\\src\\Data\\Villa.csv");
    ArrayList listVilla = new ArrayList<>();
    TreeSet listVillaNotDuplicate = new TreeSet<>();

    public ReadCsvVilla() throws FileNotFoundException {
    }

    public ArrayList<Villa> readCsvVilla() {

        return null;
    }
}
