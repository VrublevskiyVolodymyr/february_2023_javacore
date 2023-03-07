package homework_2.pc;

public class Ultrabook extends Laptop{
    private double thickness;
    private int batteryLife;

    public Ultrabook() {
    }

    public Ultrabook(String brand, String model, double price, String processor, String motherboard, String keyboard, String ram, String operating_system, String hard_drive, String screenResolution, double thickness, int batteryLife) {
        super(brand, model, price, processor, motherboard, keyboard, ram, operating_system, hard_drive, screenResolution);
        this.thickness = thickness;
        this.batteryLife = batteryLife;
    }

    public double getThickness() {
        return thickness;
    }

    public int getBatteryLife() {
        return batteryLife;
    }

    public void setThickness(double thickness) {
        this.thickness = thickness;
    }

    public void setBatteryLife(int batteryLife) {
        this.batteryLife = batteryLife;
    }


    @Override
    public String toString() {
        return "Ultrabook{" +
                "thickness=" + thickness +
                ", batteryLife=" + batteryLife +
                "} " + super.toString();
    }
}
