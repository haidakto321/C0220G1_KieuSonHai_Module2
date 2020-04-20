package Phan2_MangVaPhuongThuc.BaiTap;

import java.util.Scanner;

public class SumOfColumnInArray {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double [][] arr=new double[3][3];
        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr[0].length;j++) {
                System.out.println("Nhập phần tử hàng "+i+" cột "+j);
                arr[i][j]=input.nextDouble();
            }
        }
        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr[0].length;j++) {
                System.out.print(arr[i][j]+ " ");
            }
        }
        System.out.println("\nChọn số cột muốn tính tổng: ");
        int column=input.nextInt();
        double sum=0;
        for(int i=0;i<arr.length;i++) {
            sum+=arr[i][column];
        }
        System.out.println("Tổng các phần tử cột "+column+" là "+sum);
    }
}
