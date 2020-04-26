package Models;

public abstract class Services {
    private String id;
    private String serviceCode;
    private double areaUsed;
    private double cost;
    private int maxPeople;
    private String rentType;


    public Services() {
    }

    public Services(String id, double areaUsed, double cost, int maxPeople, String rentType, String serviceCode) {
        this.id = id;
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
        return rentType;
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

    public abstract void showInfor();
}
