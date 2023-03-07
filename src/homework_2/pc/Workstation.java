package homework_2.pc;

public class Workstation extends Laptop{
    private int monitorCount;
    private boolean hasDedicatedGraphicsCard;

    public Workstation() {
    }

    public Workstation(String brand, String model, double price, String processor, String motherboard, String keyboard, String ram, String operating_system, String hard_drive, String screenResolution, int monitorCount, boolean hasDedicatedGraphicsCard) {
        super(brand, model, price, processor, motherboard, keyboard, ram, operating_system, hard_drive, screenResolution);
        this.monitorCount = monitorCount;
        this.hasDedicatedGraphicsCard = hasDedicatedGraphicsCard;
    }

    public int getMonitorCount() {
        return monitorCount;
    }

    public boolean isHasDedicatedGraphicsCard() {
        return hasDedicatedGraphicsCard;
    }

    public void setMonitorCount(int monitorCount) {
        this.monitorCount = monitorCount;
    }

    public void setHasDedicatedGraphicsCard(boolean hasDedicatedGraphicsCard) {
        this.hasDedicatedGraphicsCard = hasDedicatedGraphicsCard;
    }

    @Override
    public String toString() {
        return "Workstation{" +
                "monitorCount=" + monitorCount +
                ", hasDedicatedGraphicsCard=" + hasDedicatedGraphicsCard +
                "} " + super.toString();
    }
}
