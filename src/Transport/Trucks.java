package Transport;

public class Trucks extends Car implements Competing {
    public enum LoadType {
        N1("до 3,5 тонн"), N2("от 3,5 до 12 тонн"), N3("более 12 тонн");
        private final String permissibleWeight;

        LoadType(String type) {
            this.permissibleWeight = type;
        }
        public String getPermissibleWeight() {
            return permissibleWeight;
        }
    }

    public Trucks(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
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
    public void getTypeTrucks(String typeTrucks) {
        LoadType passengerCars = LoadType.valueOf(typeTrucks);

        switch (passengerCars) {
            case N1:
                System.out.println("Грузовик вместимостью до 3,5 тонн");
                break;
            case N2:
                System.out.println("Грузовик вместимостью от 3,5 до 12 тонн");
                break;
            case N3:
                System.out.println("Грузовик вместимостью более 12 тонн");
                break;
            default:
                System.out.println("Данных недостаточно");
        }
    }
}
