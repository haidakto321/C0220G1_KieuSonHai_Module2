package Models;

public class Room extends Services {
    private String freeService="abc";

    public Room(String freeService) {
        this.freeService = freeService;
    }

    public Room(String name, double areaUsed, double cost, int maxPeople, String rentType, String id, String freeService) {
        super(name, areaUsed, cost, maxPeople, rentType, id);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String showInfor() {
        return null;
    }
}
