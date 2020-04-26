package Models;

public abstract class Services {
    private String id;
    private String name;
    private String areaUsed;
    private double cost;
    private int maxPeople;
    private String rentType;
    private String serviceCode;

    public Services(String id, String name, String areaUsed, double cost, int maxPeople, String rentType, String serviceCode) {
        this.id= id;
        this.name = name;
        this.areaUsed = areaUsed;
        this.cost = cost;
        this.maxPeople = maxPeople;
        this.rentType = rentType;
        this.serviceCode = serviceCode;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAreaUsed() {
        return String.valueOf(areaUsed);
    }

    public void setAreaUsed(String areaUsed) {
        this.areaUsed = areaUsed;
    }

    public double getCost() {
        return this.cost;
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
        return this.rentType;
    }

    public void setRentType(String rentType) {
        this.rentType = rentType;
    }

    public String getServiceCode() {
        return this.serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    public abstract String showInfor();
}
