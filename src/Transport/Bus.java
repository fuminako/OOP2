package Transport;

public class Bus extends Transport {
    public Bus(String brand, String model, String color, int productionYear, String productionCountry, int maxMovementSpeed) {
        super(brand, model, color, productionYear, productionCountry, maxMovementSpeed);
    }

    @Override
    public String toString() {
        return "Бренд: " + getBrand() + ", модель: " + getModel() + ", цвет: " + getColor() + ", год производства: " + getProductionYear() + ", страна производства: " + getProductionCountry() + ", максимальная скорость:  " + getMaxMovementSpeed() + " " + refill();
    }

    public String refill() {
        return "Можно заправлять бензином или дизелем на заправке";
    }
}
