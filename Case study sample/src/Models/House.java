package Models;

public class House extends Services {
    private String roomStandard ;
    private String otherUtilities;
    private int floors;

    public House() {
    }

    public House(String id, double areaUsed, double cost, int maxPeople, String rentType,
                 String serviceCode, String roomStandard, String otherUtilities, int floors) {
        super(id,  areaUsed, cost, maxPeople, rentType, serviceCode);
        this.roomStandard = roomStandard;
        this.otherUtilities = otherUtilities;
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
                        +"\nNumber of floors: "+this.getFloors());

    }
}
