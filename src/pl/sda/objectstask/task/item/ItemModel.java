package pl.sda.objectstask.task.item;

public class ItemModel {
    private String title;
    private String description;
    private double price;

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public ItemModel(String title, String description, double price) {
        this.title = title;
        this.description = description;
        this.price = price;
    }
}
