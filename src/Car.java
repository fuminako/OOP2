public class Car {
    private final String brand;
    private final String model;
    private final double engineVolume;
    private final String color;
    private final int productionYear;
    private final String productionCountry;

    Car (String brand, String model, double engineVolume, String color, int productionYear, String productionCountry) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.productionYear = productionYear;
        this.productionCountry = productionCountry;
    }

    public String toString() {
        return brand + " " + model + ", " + productionYear + " год выпуска, сборка " + productionCountry + ", " + color + " цвет кузова, объем двигателя — " + engineVolume + " л.";
    }
}
