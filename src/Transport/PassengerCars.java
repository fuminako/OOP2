package Transport;

import java.util.concurrent.ThreadLocalRandom;

public class PassengerCars extends Car implements Competing {
    private final BodyType bodyType;

    public PassengerCars(String brand, String model, double engineVolume, BodyType bodyType) {
        super(brand, model, engineVolume);
        this.bodyType = bodyType;
    }

    public String startMovement() {
        return "Повернуть ключ зажигания и поехать";
    }

    public String finishMovement() {
        return "Заглушить матор и остановиться";
    }

    @Override
    public String refill() {
        return "Заправиться бензином на заправке или зарядить";
    }

    public void printType() {
        if (this.bodyType != null) {
            System.out.println(this.bodyType);
        } else {
            System.out.println("Информации недостаточно");
        }
    }

    public void passDiagnostics() {
        if (ThreadLocalRandom.current().nextBoolean()) {
            throw new DiagnosticsException("Машина " + getBrand() + " " + getModel() + " не прошла диагностику");
        }
    }

    @Override
    public void getPitStop(int pitStopTime) {
        System.out.println("Автомобиль " + getBrand() + " " + getModel() + " затратила на пит-стоп " + pitStopTime + " секунд.");
    }

    @Override
    public void getBestLapTime(int bestLapTime) {
        System.out.println("Лучшее время круга автомобиля " + getBrand() + " " + getModel() + " составило " + bestLapTime + " секунд.");
    }

    @Override
    public void maxSpeed(int maxSpeed) {
        System.out.println("Максимальная скорость автомобиля " + getBrand() + " " + getModel() + " составила " + maxSpeed + " км/ч");
    }
}
