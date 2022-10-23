package Transport;

public class PassengerCars extends Car implements Competing{

    public PassengerCars(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);

    }

    public String startMovement(){
        return "Повернуть ключ зажигания и поехать";
    }

    public String finishMovement(){
        return "Заглушить матор и остановиться";
    }

    @Override
    public String refill() {
        return "Заправиться бензином на заправке или зарядить";
    }

    @Override
    public void getPitStop(int pitStopTime) {
        System.out.println("Автомобиль " + getBrand() +" " + getModel() + " затратила на пит-стоп " + pitStopTime + " секунд.");
    }

    @Override
    public void getBestLapTime(int bestLapTime) {
        System.out.println("Лучшее время круга автомобиля " + getBrand() + " " + getModel() + " составило " + bestLapTime + " секунд.");
    }

    @Override
    public void maxSpeed(int maxSpeed) {
        System.out.println("Максимальная скорость автомобиля " +getBrand() + " " + getModel() + " составила "+ maxSpeed + " км/ч" );
    }
}
