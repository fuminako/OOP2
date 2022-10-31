package Transport;

import Transport.Driver.Driver;

import java.util.*;

public abstract class Transport {
    private String brand;
    private String model;

    private final Set<Driver> drivers = new HashSet<>();
    private final Set<Sponsor> sponsors = new HashSet<>();
    private final Set<Mechanic<?>> mechanics = new HashSet<>();
    public Transport(String brand, String model) {
        setBrand(brand);
        setModel(model);
    }

    public Set<Driver> getDrivers() {
        return drivers;
    }


    public Set<Sponsor> getSponsors() {
        return sponsors;
    }

    public Set<Mechanic<?>> getMechanics() {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return Objects.equals(brand, transport.brand) && Objects.equals(model, transport.model) && Objects.equals(drivers, transport.drivers) && Objects.equals(sponsors, transport.sponsors) && Objects.equals(mechanics, transport.mechanics);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, drivers, sponsors, mechanics);
    }

    @Override
    public String toString() {
        return "Машина " + getBrand() + " " + getModel();
    }
}
