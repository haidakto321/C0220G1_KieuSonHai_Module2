package models;

public class Product {
    private int id;
    private String name;
    private String type;
    private String producer;

    public Product() {
    }

    public Product(int id, String name, String type, String producer) {
        this.id=id;
        this.name = name;
        this.type = type;
        this.producer = producer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }
}
