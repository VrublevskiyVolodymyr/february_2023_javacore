package homework_2.pc;

public class PC {
    private String brand;
    private String model;
    private double price;
    private String processor;
    private String motherboard;
    private String keyboard;
    private String ram;
    private String operating_system;
    private String hard_drive;


    public PC() {
    }

    public PC(String brand, String model, double price, String processor, String motherboard, String keyboard, String ram, String operating_system, String hard_drive) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.processor = processor;
        this.motherboard = motherboard;
        this.keyboard = keyboard;
        this.ram = ram;
        this.operating_system = operating_system;
        this.hard_drive = hard_drive;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public String getProcessor() {
        return processor;
    }

    public String getMotherboard() {
        return motherboard;
    }

    public String getKeyboard() {
        return keyboard;
    }

    public String getRam() {
        return ram;
    }

    public String getOperating_system() {
        return operating_system;
    }

    public String getHard_drive() {
        return hard_drive;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public void setMotherboard(String motherboard) {
        this.motherboard = motherboard;
    }

    public void setKeyboard(String keyboard) {
        this.keyboard = keyboard;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public void setOperating_system(String operating_system) {
        this.operating_system = operating_system;
    }

    public void setHard_drive(String hard_drive) {
        this.hard_drive = hard_drive;
    }

    @Override
    public String toString() {
        return "PC{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", processor='" + processor + '\'' +
                ", motherboard='" + motherboard + '\'' +
                ", keyboard='" + keyboard + '\'' +
                ", ram='" + ram + '\'' +
                ", operating_system='" + operating_system + '\'' +
                ", hard_drive='" + hard_drive + '\'' +
                '}';
    }
}
