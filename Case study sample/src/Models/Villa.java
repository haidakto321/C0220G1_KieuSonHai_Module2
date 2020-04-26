package Models;

public class Villa extends Services {
    private String roomStandard ;
    private String otherUtilities;
    private String poolArea;
    private int floors;

    public Villa() {
    }

    public Villa(String id, double areaUsed, double cost, int maxPeople, String rentType,
                 String serviceCode, String roomStandard, String otherUtilities, String poolArea, int floors) {
        super(id,  areaUsed, cost, maxPeople, rentType, serviceCode);
        this.roomStandard = roomStandard;
        this.otherUtilities = otherUtilities;
        this.poolArea = poolArea;
        this.floors = floors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
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
    public void showInfor() {
        System.out.println(
                "Id: "+super.getId()
                +"\nService name: "+super.getServiceCode()
                +" \nDien tích sử dụng: "+super.getAreaUsed()
                +"\nCost: "+super.getCost()
                +" \nMaximum number of people: "+super.getMaxPeople()
                +"\nRent type: "+super.getRentType()
                +"\nTiêu chuẩn phòng: "+this.getRoomStandard()
                +"\nTiện ích khác: "+this.getOtherUtilities()
                +"\nArea of pool: "+this.getPoolArea()
                +"\nNumber of floors: "+this.getFloors());

    }
}
