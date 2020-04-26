package Commons;

import Models.Customer;

import java.util.Comparator;

public class CustomerComparator implements Comparator<Customer> {
    public int compare(Customer kh1, Customer kh2) {
        String[] nameCustomer1 = kh1.getName().split(" ");
        String[] nameCustomer2 = kh2.getName().split(" ");
        if (!nameCustomer1[nameCustomer1.length - 1].equals(nameCustomer2[nameCustomer2.length - 1])) {
            return nameCustomer1[nameCustomer1.length - 1].compareTo(nameCustomer2[nameCustomer2.length - 1]);
        } else if (!kh1.getName().equals(kh2.getName())) {
            return kh1.getName().compareTo(kh2.getName());
        } else {
            String[] birthdayCustomer1 = kh1.getBirthday().split("/");
            String[] birthdayCustomer2 = kh2.getBirthday().split("/");
            int monthCustomer1 = Integer.parseInt(birthdayCustomer1[1]);
            int yearCustomer1 = Integer.parseInt(birthdayCustomer1[2]);
            int monthCustomer2 = Integer.parseInt(birthdayCustomer2[1]);
            int yearCustomer2 = Integer.parseInt(birthdayCustomer2[2]);
            if (yearCustomer1 != yearCustomer2) {
                return birthdayCustomer1[2].compareTo(birthdayCustomer2[2]);
            } else {
                if (monthCustomer1 != monthCustomer2) {
                    return birthdayCustomer1[1].compareTo(birthdayCustomer2[1]);
                } else {
                    return birthdayCustomer1[0].compareTo(birthdayCustomer2[0]);
                }
            }
        }
    }
}
