package Transport;

public class Trucks extends Car implements Competing{
    public Trucks(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }
    public String startMovement(){
        return "Повернуть ключ зажигания и медленно поехать";
    }

    public String finishMovement(){
        return "Заглушить матор и медленно остановиться";
    }
    @Override
    public String refill() {
        return "Заправить другим бензином на заправке";
    }

    @Override
    public void getPitStop(int pitStopTime) {
        System.out.println("Грузовик " + getBrand() +" " + getModel() + " затратил на пит-стоп " + pitStopTime + " секунд.");
    }

    @Override
    public void getBestLapTime(int bestLapTime) {
        System.out.println("Лучшее время круга грузовика " + getBrand() + " " + getModel() + " составило " + bestLapTime + " секунд.");
    }

    @Override
    public void maxSpeed(int maxSpeed) {
        System.out.println("Максимальная скорость грузовика " +getBrand() + " " + getModel() + " составила "+ maxSpeed + " км/ч" );
    }
}
