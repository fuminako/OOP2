public class Car {
    private final String brand;
    private final String model;
    private final double engineVolume;
    private final String color;
    private final int productionYear;
    private final String productionCountry;

    Car (String brand, String model, double engineVolume, String color, int productionYear, String productionCountry) {
        if (brand.equals("")) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (model.equals("")) {
            this.model = "default";
        } else {
            this.model = model;
        }
        if (engineVolume<0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
        if (color.equals("")) {
            this.color = "белый";
        } else {
            this.color = color;
        }
        if (productionYear < 0) {
            this.productionYear = 2000;
        } else {
            this.productionYear = productionYear;
        }
        if (productionCountry.equals("")) {
            this.productionCountry = "default";
        } else {
            this.productionCountry = productionCountry;
        }
    }


    public String toString() {
        return brand + " " + model + ", " + productionYear + " год выпуска, сборка " + productionCountry + ", " + color + " цвет кузова, объем двигателя — " + engineVolume + " л.";
    }
}
