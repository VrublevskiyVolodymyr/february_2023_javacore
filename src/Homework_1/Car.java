package Homework_1;

public class Car {
    private String model;
    private int power;

    private double volumeEngine;
    private boolean turbo;

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", power=" + power +
                ", volumeEngine=" + volumeEngine +
                ", turbo=" + turbo +
                '}';
    }

    public Car() {
    }

    public Car(String model, int power, double volumeEngine, boolean turbo) {
        this.model = model;
        this.power = power;
        this.volumeEngine = volumeEngine;
        this.turbo = turbo;
    }

    public String getModel() {
        return model;
    }

    public int getPower() {
        return power;
    }

    public double getVolumeEngine() {
        return volumeEngine;
    }

    public boolean isTurbo() {
        return turbo;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setVolumeEngine(double volumeEngine) {
        this.volumeEngine = volumeEngine;
    }

    public void setTurbo(boolean turbo) {
        this.turbo = turbo;
    }
}
