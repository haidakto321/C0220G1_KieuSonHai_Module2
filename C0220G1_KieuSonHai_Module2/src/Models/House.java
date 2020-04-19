package Models;

public class House extends Services{
    private String name="House";
    private String detail="Detail";
    private String otherUtilities="Các tiện ích";
    private int floors=2;

    public House() {
    }

    public House(String name, double areaUsed, double cost, int maxPeople, String rentType, String id) {
        super(name, areaUsed, cost, maxPeople, rentType, id);
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
                +"Number of floors: "+this.getFloors();
    }
}
