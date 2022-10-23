package Transport;

public abstract class Transport {
    private String brand;
    private String model;
//    private String color;
//    private final int productionYear;
//    private final String productionCountry;
//    private int maxMovementSpeed;

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

//    public String getColor() {
//        return color;
//    }
//
//    public void setColor(String color) {
//        if ((color == null || color.isBlank())) {
//            this.color = "белый";
//        } else {
//            this.color = color;
//        }
//    }
//
//    public int getProductionYear() {
//        return productionYear;
//    }
//
//    public String getProductionCountry() {
//        return productionCountry;
//    }
//
//    public int getMaxMovementSpeed() {
//        return maxMovementSpeed;
//    }
//
//    public void setMaxMovementSpeed(int maxMovementSpeed) {
//        this.maxMovementSpeed = Math.max(maxMovementSpeed, 0);
//    }
//
//    public abstract String refill();
}
