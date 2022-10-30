
import Transport.Driver.DriverB;
import Transport.Driver.DriverC;
import Transport.Driver.DriverD;
import Transport.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Mechanic<PassengerCars> oleg = new Mechanic<PassengerCars>("Олег", "Магнит");
        Mechanic<Car> vasily = new Mechanic<Car>("Василий", "Пятёрочка");
        Sponsor ladoga = new Sponsor("ООО Ладога", 700599);
        Sponsor nikiforov = new Sponsor("Никифоров Олег Дмитриевич", 75000);

        PassengerCars ladaGranta = new PassengerCars("Lada", "Granta", 1.7, BodyType.COUPE);
        ladaGranta.addDriver(new DriverB<PassengerCars>("Геннадий Борисович Тартаковский", true, 15));
        ladaGranta.addMechanic(oleg);
        ladaGranta.addSponsor(ladoga);

        Trucks hyundaiHD = new Trucks("Hyundai", "HD78", 3.9, LoadType.N2);
        hyundaiHD.addDriver(new DriverC<Trucks>("Олег Михайлович Газманов", true, 27));
        hyundaiHD.addMechanic(vasily);
        hyundaiHD.addSponsor(ladoga);


        Bus fordTransit = new Bus("Ford", "Transit", 2.2, CapacityType.SMALL);
        fordTransit.addDriver(new DriverD<Bus>("Валерий Александрович Кипелов", true, 25));
        fordTransit.addMechanic(vasily);
        fordTransit.addSponsor(nikiforov);

        List<Transport> cars = List.of(ladaGranta, hyundaiHD, fordTransit);

        printInfo(fordTransit);
    }

    private static void printInfo(Car transports) {
        System.out.println(transports.getBrand() + " " + transports.getModel() + " " + transports.getDrivers() + " " + transports.getSponsors() + " " + transports.getMechanics());
    }
}