package Transport;

import Transport.Driver.Driver;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class Transport {
    private String brand;
    private String model;

    private final List<Driver> drivers = new ArrayList<>();
    private final List<Sponsor> sponsors = new ArrayList<>();
    private final List<Mechanic<?>> mechanics = new ArrayList<>();
    public Transport(String brand, String model) {
        setBrand(brand);
        setModel(model);
    }

    public List<Driver> getDrivers() {
        return drivers;
    }


    public List<Sponsor> getSponsors() {
        return sponsors;
    }

    public List<Mechanic<?>> getMechanics() {
        return mechanics;
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
    public void addDriver(Driver driver){
        drivers.add(driver);
    }

    public void addSponsor(Sponsor sponsor){
        sponsors.add(sponsor);
    }

    public void addMechanic(Mechanic<?> mechanic){
        mechanics.add(mechanic);
    }

}
