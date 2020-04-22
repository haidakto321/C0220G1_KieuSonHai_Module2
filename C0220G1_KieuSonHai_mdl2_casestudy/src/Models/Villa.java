package Models;

public class Villa extends Services {
    private String name="Villa";
    private String detail="Detail";
    private String otherUtilities="Các tiện ích";
    private String poolArea="20.0m2";
    private int floors=4;

    public Villa(String id,String name, String areaUsed, double cost, int maxPeople, String rentType, String serviceCode,
                 String detail,String otherUtilities, String poolArea, int floors) {
        super(id,name, areaUsed, cost, maxPeople, rentType, serviceCode);

        this.detail = detail;
        this.otherUtilities = otherUtilities;
        this.poolArea = poolArea;
        this.floors = floors;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getOtherUtilities() {
        return otherUtilities;
    }

    public void setOtherUtilities(String otherUtilities) {
        this.otherUtilities = otherUtilities;
    }

    public String getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(String poolArea) {
        this.poolArea = poolArea;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    @Override
    public String showInfor() {
        return "Dịch vụ: "+this.getName()+
                " \nDien tích sử dụng: "+this.getAreaUsed()
                +"\nCost: "+this.getCost()
                +" \nMaximum number of people: "+this.getMaxPeople()
                +"\nRent type: "+this.getRentType()
                +"Tiêu chuẩn phòng: "+this.getDetail()
                +"Tiện ích khác: "+this.getOtherUtilities()
                +"Area of pool: "+this.getPoolArea()
                +"Number of floors: "+this.getFloors();
    }
}
