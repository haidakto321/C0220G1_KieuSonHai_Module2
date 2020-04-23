package Models;

public class Villa extends Services {
    private String name="Villa";
    private String roomStandard ="Detail";
    private String otherUtilities="Các tiện ích";
    private String poolArea="20.0m2";
    private int floors=4;

    public Villa(String id, String name, String areaUsed, double cost, int maxPeople, String rentType, String serviceCode,
                 String roomStandard, String otherUtilities, String poolArea, int floors) {
        super(id,name, areaUsed, cost, maxPeople, rentType, serviceCode);

        this.roomStandard = roomStandard;
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
    public String showInfor() {
        return "Dịch vụ: "+this.getName()+
                " \nDien tích sử dụng: "+this.getAreaUsed()
                +"\nCost: "+this.getCost()
                +" \nMaximum number of people: "+this.getMaxPeople()
                +"\nRent type: "+this.getRentType()
                +"\nTiêu chuẩn phòng: "+this.getRoomStandard()
                +"\nTiện ích khác: "+this.getOtherUtilities()
                +"\nArea of pool: "+this.getPoolArea()
                +"\nNumber of floors: "+this.getFloors();
    }
}
