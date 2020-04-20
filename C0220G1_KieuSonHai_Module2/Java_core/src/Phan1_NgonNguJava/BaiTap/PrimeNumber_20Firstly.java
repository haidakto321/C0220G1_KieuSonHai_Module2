package Phan1_NgonNguJava.BaiTap;

public class PrimeNumber_20Firstly {
    public static void main(String[] args) {


    int number=2;
    int count=0;
    boolean isPrime=true;
    while (count<20) {
        for(int i=2;i<Math.sqrt(number);i++) {
            if(number%i==0) {
                isPrime=false;
            }
        }
        if(isPrime) {
            System.out.println(number+" ");
            count++;
        } else{
            isPrime=true;
        }
        number++;
    }
}}
