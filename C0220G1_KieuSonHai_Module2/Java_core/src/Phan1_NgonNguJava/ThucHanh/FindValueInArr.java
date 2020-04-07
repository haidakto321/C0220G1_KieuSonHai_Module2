package Phan1_NgonNguJava.ThucHanh;

import java.util.Scanner;

public class FindValueInArr {
    public static void main(String[] args) {
        String[] students={"Christain","Michael","Camilla","Sienna","Tanya","Connor","Zachariah","Mallory","Zoe","Emily"};
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a name's student: ");
        String input_name=sc.nextLine();
        boolean isExist=false;
        for(int i=0;i<students.length;i++) {
            if(students[i].equals(input_name)) {
                System.out.println("Position of the student in the list: "+input_name+" is "+(i+1));
                isExist=true;
                break;
            }
        }
        if(!isExist) {
            System.out.println("Not found "+input_name+" in the list");
        }
    }
}
