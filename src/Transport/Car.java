package Transport;

public abstract class Car extends Transport {

    private final double engineVolume;

    public Car(String brand,
               String model,
               double engineVolume) {
        super(brand, model);
        if (engineVolume < 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
    }

    public final double getEngineVolume() {
        return engineVolume;
    }

    public abstract String startMovement();

    public abstract String finishMovement();

    public abstract String refill();


    @Override
    public String toString() {
        return "Car{" + getBrand() + " " + getModel() + "engineVolume=" + engineVolume + '}';
    }

}
