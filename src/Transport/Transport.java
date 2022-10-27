package Transport;

public abstract class Transport {
    private String brand;
    private String model;

    public Transport(String brand, String model) {
        setBrand(brand);
        setModel(model);
//        setColor(color);
//        this.productionYear = Math.max(productionYear, 2000);
//        if ((productionCountry == null || productionCountry.isBlank())) {
//            this.productionCountry = "Россия";
//        } else {
//            this.productionCountry = productionCountry;
//        }
//        setMaxMovementSpeed(maxMovementSpeed);
    }

    public final String getBrand() {
        return brand;
    }

    public final void setBrand(String brand) {
        if (brand == null || brand.isBlank()) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
    }

    public abstract void printType();

    public abstract void passDiagnostics();

    public final String getModel() {
        return model;
    }

    public final void setModel(String model) {
        if ((model == null || model.isBlank())) {
            this.model = "default";
        } else {
            this.model = model;
        }
    }
}
