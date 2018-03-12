package models;

public class Guitar {
    private String model;
    private String manufacturer;
    private int number_of_strings;

    public Guitar() {}

    public Guitar(String model, String manufacturer, int number_of_strings) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.number_of_strings = number_of_strings;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getNumber_of_strings() {
        return number_of_strings;
    }

    public void setNumber_of_strings(int number_of_strings) {
        this.number_of_strings = number_of_strings;
    }
}
