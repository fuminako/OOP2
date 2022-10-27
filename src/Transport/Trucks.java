package Transport;

import java.util.concurrent.ThreadLocalRandom;

public class Trucks extends Car implements Competing {
    private final LoadType loadType;

    public Trucks(String brand, String model, double engineVolume, LoadType loadType) {
        super(brand, model, engineVolume);
        this.loadType = loadType;
    }

    public String startMovement() {
        return "Повернуть ключ зажигания и медленно поехать";
    }

    public String finishMovement() {
        return "Заглушить матор и медленно остановиться";
    }

    @Override
    public String refill() {
        return "Заправить другим бензином на заправке";
    }

    @Override
    public void getPitStop(int pitStopTime) {
        System.out.println("Грузовик " + getBrand() + " " + getModel() + " затратил на пит-стоп " + pitStopTime + " секунд.");
    }

    @Override
    public void getBestLapTime(int bestLapTime) {
        System.out.println("Лучшее время круга грузовика " + getBrand() + " " + getModel() + " составило " + bestLapTime + " секунд.");
    }

    @Override
    public void maxSpeed(int maxSpeed) {
        System.out.println("Максимальная скорость грузовика " + getBrand() + " " + getModel() + " составила " + maxSpeed + " км/ч");
    }

    public void printType() {
        if (this.loadType != null) {
            System.out.println(this.loadType);
        } else {
            System.out.println("Информации недостаточно");
        }
    }

    public void passDiagnostics() {
        if (ThreadLocalRandom.current().nextBoolean()) {
            throw new DiagnosticsException("Грузовик " + getBrand() + " " + getModel() + " не прошёл диагностику");
        }
    }
}
