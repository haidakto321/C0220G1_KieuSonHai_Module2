package Models;

public class Room extends Services {
    private String freeService;

    public Room() {
    }

    public Room(String id,  double areaUsed, double cost, int maxPeople, String rentType, String serviceCode, String freeService) {
        super(id,  areaUsed, cost, maxPeople, rentType, serviceCode);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
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
                        +"\nFree service: "+this.getFreeService());
    }
}
