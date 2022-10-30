package Transport;

public class Mechanic <T extends Transport> {
    private final String name;
    private final String company;

    public Mechanic(String name, String company) {
        this.name = name;
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public String getCompany() {
        return company;
    }

    public void makeInspection(T car) {
        try {
            car.passDiagnostics();
        } catch (
                DiagnosticsException e) {
            System.out.println("Транспортное средство не прошло диагностику: " + e.getMessage());
        }
    }
    public void fixCar(T car){
        System.out.println("Ремонт тренспортного средства закончен");
    }

    public String toString(){
        return "Механик " + getName() + " из компании " + getCompany();
    }
}
