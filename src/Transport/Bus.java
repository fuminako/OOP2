package Transport;

import java.util.concurrent.ThreadLocalRandom;

public class Bus extends Car implements Competing {

    private final CapacityType capacityType;

    public Bus(String brand, String model, double engineVolume, CapacityType capacityType) {
        super(brand, model, engineVolume);
        this.capacityType = capacityType;
    }

    public String startMovement() {
        return "Помолиться, повернуть ключ зажигания и поехать";
    }

    public String finishMovement() {
        return "Помолиться, заглушить матор и остановиться";
    }

    @Override
    public void getPitStop(int pitStopTime) {
        System.out.println("Автобус " + getBrand() + " " + getModel() + " затратил на пит-стоп " + pitStopTime + " секунд.");
    }

    @Override
    public void getBestLapTime(int bestLapTime) {
        System.out.println("Лучшее время круга автобуса " + getBrand() + " " + getModel() + " составило " + bestLapTime + " секунд.");
    }

    @Override
    public void maxSpeed(int maxSpeed) {
        System.out.println("Максимальная скорость автобуса " + getBrand() + " " + getModel() + " составила " + maxSpeed + " км/ч");
    }

    public void printType() {
        if (this.capacityType != null) {
            System.out.println(this.capacityType);
        } else {
            System.out.println("Информации недостаточно");
        }
    }

    public void passDiagnostics() {
        if (ThreadLocalRandom.current().nextBoolean()) {
            throw new DiagnosticsException("Автобус " + getBrand() + " " + getModel() + " в диагностике не требуется");
        }
    }

    //    public String toString() {
//        return "Бренд: " + getBrand() + ", модель: " + getModel() + ", цвет: " + getColor() + ", год производства: " + getProductionYear() + ", страна производства: " + getProductionCountry() + ", максимальная скорость:  " + getMaxMovementSpeed() + " " + refill();
//    }
//
    public String refill() {
        return "Заправлять бензином или дизелем на заправке";
    }

}
