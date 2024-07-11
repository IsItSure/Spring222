package web.model;

public class Car {
    private int year;
    private String brand;
    private String color;

    public Car(int year, String brand, String color) {
        this.year = year;
        this.brand = brand;
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "year=" + year +
                ", brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
