package Models;

public abstract class Services {
    private String name;
    private double areaUsed;
    private double cost;
    private int maxPeople;
    private String rentType;
    private String serviceCode;
    public Services() {
    }

    public Services(String name, double areaUsed, double cost, int maxPeople, String rentType, String serviceCode) {
        this.name = name;
        this.areaUsed = areaUsed;
        this.cost = cost;
        this.maxPeople = maxPeople;
        this.rentType = rentType;
        this.serviceCode = serviceCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAreaUsed() {
        return areaUsed;
    }

    public void setAreaUsed(double areaUsed) {
        this.areaUsed = areaUsed;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getMaxPeople() {
        return maxPeople;
    }

    public void setMaxPeople(int maxPeople) {
        this.maxPeople = maxPeople;
    }

    public String getRentType() {
        return "Year/Month/Day/Hour";
    }

    public void setRentType(String rentType) {
        this.rentType = rentType;
    }

    public String getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    public abstract String showInfor();
}
