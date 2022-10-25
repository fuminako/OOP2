package Transport;


import java.util.Arrays;

public class Bus extends Car implements Competing {
    public enum CapacityType {
        EXTRA_SMALL("до 10 мест"),
        SMALL("до 25"),
        MEDIUM("от 40 до 50"),
        LARGE("от 60 до 80"),
        ESPECIALLY_LARGE("от 100 до 120");

        public static CapacityType determineTypeCar(String capacity) {
            for (CapacityType type : values()) {
                if (type.getCapacity().equals(capacity)) {
                    return type;
                }
            }
           return null;
        }

        private final String capacity;

        CapacityType(String capacity) {
            this.capacity = capacity;
        }
        public String getCapacity() {
            return capacity;
        }

    }

   private final CapacityType[] capacityType = new CapacityType[0];

    public Bus(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
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


//    public void setTypeCar(String typeCar) {
//       CapacityType capacityType = CapacityType.valueOf(typeCar);
//
//        capacityType = Arrays.copyOf(capacityType, capacityType.lenght + 1);
//        capacityType[capacityType.lenght - 1] = capacityType;
//    }

    public void getTypeBus(String typeBus) { // если бус не равен нулю
        CapacityType capacityType = CapacityType.valueOf(typeBus);
//      if (capacityType == null) {
//          capacityType = CapacityType.determineTypeCar(typeBus);
//      }

        switch (capacityType) {
            case EXTRA_SMALL:
                System.out.println("Автобус вместимостью до 10 мест");
                break;
            case SMALL:
                System.out.println("Автобус вместимостью до 25");
                break;
            case MEDIUM:
                System.out.println("Автобус вместимостью от 40 до 50");
                break;
            case LARGE:
                System.out.println("Автобус вместимостью от 60 до 80 мест");
                break;
            case ESPECIALLY_LARGE:
                System.out.println("Автобус вместимостью от 100 до 120 мест");
            default:
                System.out.println("Данных недостаточно");
        }
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
