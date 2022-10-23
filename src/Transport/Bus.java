package Transport;

public class Bus extends Car implements Competing {
    public Bus(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    public String startMovement(){
        return "Помолиться, повернуть ключ зажигания и поехать";
    }

    public String finishMovement(){
        return "Помолиться, заглушить матор и остановиться";
    }

    @Override
    public void getPitStop(int pitStopTime) {
        System.out.println("Автобус " + getBrand() +" " + getModel() + " затратил на пит-стоп " + pitStopTime + " секунд.");
    }

    @Override
    public void getBestLapTime(int bestLapTime) {
        System.out.println("Лучшее время круга автобуса " + getBrand() + " " + getModel() + " составило " + bestLapTime + " секунд.");
    }

    @Override
    public void maxSpeed(int maxSpeed) {
        System.out.println("Максимальная скорость автобуса " +getBrand() + " " + getModel() + " составила "+ maxSpeed + " км/ч" );
    }
//    public Bus(String brand, String model, String color, int productionYear, String productionCountry, int maxMovementSpeed) {
//        super(brand, model, color, productionYear, productionCountry, maxMovementSpeed);
//    }
//
//    @Override
//    public String toString() {
//        return "Бренд: " + getBrand() + ", модель: " + getModel() + ", цвет: " + getColor() + ", год производства: " + getProductionYear() + ", страна производства: " + getProductionCountry() + ", максимальная скорость:  " + getMaxMovementSpeed() + " " + refill();
//    }
//
    public String refill() {
        return "Заправлять бензином или дизелем на заправке";
    }
}
