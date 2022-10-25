package Transport;

public class PassengerCars extends Car implements Competing {

    public enum BodyType {
        SEDAN("Седан"),
        HATCHBACK("Хетчбек"),
        COUPE("Купе"),
        UNIVERSAL("Универсал"),
        SUV("Внедорожник"),
        CROSSOVER("Кроссовер"),
        PICKUP("Пикап"),
        VAN("Фургон"),
        MINIVAN("Минивэн");
        private final String type;

        BodyType(String type) {
            this.type = type;
        }

        public String getType() {
            return type;
        }
    }

    public PassengerCars(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);

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

    public void getTypePassengerCars(String typePassengerCars) {
         BodyType bodyType = BodyType.valueOf(typePassengerCars);

        switch (bodyType) {
            case SEDAN:
                System.out.println("Легковой автомобиль с типом кузова «седан»");
                break;
            case HATCHBACK:
                System.out.println("Легковой автомобиль с типом кузова «хетчбек»");
                break;
            case COUPE:
                System.out.println("Легковой автомобиль с типом кузова «купе»");
                break;
            case SUV:
                System.out.println("Легковой автомобиль с типом кузова «внедорожник»");
                break;
            case VAN:
                System.out.println("Легковой автомобиль с типом кузова «фургон»");
                break;
            case PICKUP:
                System.out.println("Легковой автомобиль с типом кузова «пикап»");
                break;
            case MINIVAN:
                System.out.println("Легковой автомобиль с типом кузова «минивэн»");
                break;
            case CROSSOVER:
                System.out.println("Легковой автомобиль с типом кузова «кроссовер»");
                break;
            case UNIVERSAL:
                System.out.println("Легковой автомобиль с типом кузова «нниверсал»");
                break;
            default:
                System.out.println("Данных недостаточно");
        }
    }
}
