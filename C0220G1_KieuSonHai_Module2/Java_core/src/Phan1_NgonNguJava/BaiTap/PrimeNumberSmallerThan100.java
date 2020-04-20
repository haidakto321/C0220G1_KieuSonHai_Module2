package Phan1_NgonNguJava.BaiTap;

public class PrimeNumberSmallerThan100 {
    public static void main(String[] args) {
//        int count = 0;
//        int i = 2;
//        while (i<100) {
//            boolean isPrime = true;
//            for (int j = 2; j < i; j++) {
//                if (i % j == 0) {
//                    isPrime = false;
//                }
//            }
//            if (isPrime) {
//                count++;
//                System.out.println(count + ".So nguyen to la: " + i);
//            }
//            i++;
//        }

        boolean isPrime = true;
        int number = 2;
        while (number < 100) {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(number);
            } else {
                isPrime = true;
            }
            number++;
        }
    }
}
