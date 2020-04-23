package Models;

public class Customer {
    private String name;
    private String birthday;
    private String gender;
    private String CMND;
    private String numberPhone;
    private String email;
    private String typeOfCustomer;
    private String address;
    private Services services;

    Customer() {
    }

    public Customer(String name, String birthday, String gender, String CMND, String numberPhone, String email, String typeOfCustomer, String address) {
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this.CMND = CMND;
        this.numberPhone = numberPhone;
        this.email = email;
        this.typeOfCustomer = typeOfCustomer;
        this.address = address;
        this.services = services;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCMND() {
        return CMND;
    }

    public void setCMND(String CMND) {
        this.CMND = CMND;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTypeOfCustomer() {
        return typeOfCustomer;
    }

    public void setTypeOfCustomer(String typeOfCustomer) {
        this.typeOfCustomer = typeOfCustomer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Services getServices() {
        return services;
    }

    public void setServices(Services services) {
        this.services = services;
    }

    public String showInfor() {
        return "1.Ho va ten: " + this.getName()
                + "\n2.Ngay sinh: " + this.getBirthday()
                + "\n3.Gioi tinh: " + this.getGender()
                + "\n4.CMND: " + this.getCMND()
                + "\n5.So dien thoai: " + this.getNumberPhone()
                + "\n6.Email: " + this.getEmail()
                + "\n7.Loai khach hang: " + this.getTypeOfCustomer()
                + "\n8.Dia chi: " + this.getAddress();
    }
}
