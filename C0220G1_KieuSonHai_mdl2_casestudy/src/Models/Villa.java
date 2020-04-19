package Models;

public class Villa extends Services {
    private String name="Villa";
    private String detail="Detail";
    private String otherUtilities="Các tiện ích";
    private double areaOfPool=20.0;
    private int floors=4;
    private Villa() {
    }

    public Villa(String name, double areaUsed, double cost, int maxPeople, String rentType, String id) {
        super(name, areaUsed, cost, maxPeople, rentType, id);
//        this.detail()=detail;
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

    public double getAreaOfPool() {
        return areaOfPool;
    }

    public void setAreaOfPool(double areaOfPool) {
        this.areaOfPool = areaOfPool;
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
                +"Area of pool: "+this.getAreaOfPool()
                +"Number of floors: "+this.getFloors();
    }
}
