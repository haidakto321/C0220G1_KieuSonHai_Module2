package src.Phan2_MangVaPhuongThuc.ThucHanh;

import java.util.Random;
import java.util.Scanner;

public class ArrayIndexOutOfBoundsException {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int[] arr=createRandom();
            Scanner scanner=new Scanner(System.in);
            System.out.println("Nhập chỉ số của 1 phần tử bất kì: ");
            int num=scanner.nextInt();
            try{
                System.out.println("Giá trị của phần tử có chỉ số: "+num+" là "+arr[num]);
            } catch(IndexOutOfBoundsException e) {
                System.err.println("Chỉ số vượt quá giới hạn của mảng.");
            }
        }
        public static int[] createRandom() {
            Random rd=new Random();
            int[] arr=new int[100];
            System.out.println("Danh sách phần tử của mảng:: ");
            for(int i=0;i<100;i++) {
                arr[i]=rd.nextInt(100);
                System.out.println(arr[i]+" ");
            }
            return arr;
        }
    }

