package Phan1_NgonNguJava.BaiTap;

import java.util.Scanner;

public class ReadNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number max 3 digits:  ");
        int number=sc.nextInt();
        int a=(int) (Math.floor(number/100));
        int b=(int) (Math.floor(number/10-10*a));
        int c=number-100*a-10*b;
        String strA="";
        String strB = "";
        String strC="";
        switch (a) {
            case 0:
                strA="";
                break;
            case 1:
                strA="One hundred and";
                break;
            case 2:
                strA="Two hundred and";
                break;
            case 3:
                strA="Three hundred and";
                break;
            case 4:
                strA="Four hundred and";
                break;
            case 5:
                strA="Five hundred and";
                break;
            case 6:
                strA="Six hundred and";
                break;
            case 7:
                strA="Seven hundred and";
                break;
            case 8:
                strA="Eight hundred and";
                break;
            case 9:
                strA="Nine hundred and";
                break;
        }
        switch (b) {
            case 0:
                strB="";
                break;
            case 1:
                strB="";
                switch(c) {
                    case 0:
                        strC="ten";
                        break;
                    case 1:
                        strC="eleven";
                        break;
                    case 2:
                        strC="twelve";
                        break;
                    case 3:
                        strC="thirteen";
                        break;
                    case 4:
                        strC="fourteen";
                        break;
                    case 5:
                        strC="fifteen";
                        break;
                    case 6:
                        strC="sixteen";
                        break;
                    case 7:
                        strC="seventeen";
                        break;
                    case 8:
                        strC="eighteen";
                        break;
                    case 9:
                        strC="nineteen";
                        break;
            }
            case 2:
                strB="twenty";
                break;
            case 3:
                strB="thirty";
                break;
            case 4:
                strB="fourty";
                break;
            case 5:
                strB="fifty";
                break;
            case 6:
                strB="sixty";
                break;
            case 7:
                strB="seventy";
                break;
            case 8:
                strB="eighty";
                break;
            case 9:
                strB="ninety";
                break;
        }
        if(b!=1) {
            switch (c) {
                case 0:
                    strC="";
                    break;
                case 1:
                    strC="one";
                    break;
                case 2:
                    strC="two";
                    break;
                case 3:
                    strC="three";
                    break;
                case 4:
                    strC="four";
                    break;
                case 5:
                    strC="five";
                    break;
                case 6:
                    strC="six";
                    break;
                case 7:
                    strC="seven";
                    break;
                case 8:
                    strC="eight";
                    break;
                case 9:
                    strC="nine";
                    break;
            }
        }
        if(strA=="") {
            if(strB=="") {
                System.out.println(strC);
                if(strC=="") {
                    System.out.println("Invalid input!");
                }
            } else {
                System.out.println(strB+" "+strC);
            }
        } else if(strB=="") {
            if(strC=="") {
                System.out.println(strA);
            } else {
                System.out.println(strA+" "+strC);
            }
        } else {
            System.out.println(strA+" "+strB+" "+strC);
        }
    }
}
//018 sai

