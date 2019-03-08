package pl.sda.objectstask.Car;

public class Car {

    private String brand;
    private String color;
    private Entertainment radio;

    public Car(String brand, String color, Entertainment radio) {
        this.brand = brand;
        this.color = color;
        this.radio = radio;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public Entertainment getRadio() {
        return radio;
    }

    @Override
    public String toString() {
        return "Car1{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", radio=" + radio +
                '}';
    }

//    Car1 pizduj = new Car1("Ford", "Silver", true);
//
//    public Car1 getPizduj() {
//        return pizduj;
//    }
}
