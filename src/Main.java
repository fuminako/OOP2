
import Transport.*;

public class Main {
    public static void main(String[] args) {
        PassengerCars ladaGranta = new PassengerCars("Lada", "Granta", 1.7, BodyType.COUPE);
        PassengerCars peugeot = new PassengerCars("Peugeot", "206", 1.4, BodyType.CROSSOVER);

        Trucks fusoCanter = new Trucks("Furso", "Canter", 4.9, LoadType.N1);
        Trucks hyundaiHD = new Trucks("Hyundai", "HD78", 3.9, LoadType.N2);

        Bus gazelleNext = new Bus("ГАЗ ГАЗель", "Next", 2.7, CapacityType.MEDIUM);
        Bus fordTransit = new Bus("Ford", "Transit", 2.2, CapacityType.SMALL);

        DriverB<PassengerCars> gennadyTartakovsky = new DriverB<>("Геннадий Борисович Тартаковский", true, 15);
        DriverC<Trucks> olegGazmanov = new DriverC<>("Олег Михайлович Газманов", true, 27);
        DriverD<Bus> valeryKipelov = new DriverD<>("Валерий Александрович Кипелов", false, 25);


        try {
            ladaGranta.passDiagnostics();
            gazelleNext.passDiagnostics();
        } catch (DiagnosticsException e) {
            System.out.println("Транспортное средство не прошло диагностику: " + e.getMessage());
        }

    }
}