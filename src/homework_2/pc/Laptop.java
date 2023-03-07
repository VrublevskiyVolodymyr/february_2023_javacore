package homework_2.pc;

public class Laptop extends PC{
    private String screenResolution;

    public Laptop() {
    }

    public Laptop(String brand, String model, double price, String processor, String motherboard, String keyboard, String ram, String operating_system, String hard_drive, String screenResolution) {
        super(brand, model, price, processor, motherboard, keyboard, ram, operating_system, hard_drive);
        this.screenResolution = screenResolution;
    }


    public String getScreenResolution() {
        return screenResolution;
    }

    public void setScreenResolution(String screenResolution) {
        this.screenResolution = screenResolution;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "screenResolution='" + screenResolution + '\'' +
                "} " + super.toString();
    }
}
