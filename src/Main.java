import Transport.Car;
import Transport.Train;
import Transport.Bus;


public class Main {
    public static void main(String[] args) {
        Car[] cars = new Car[4];
        cars[0] = new Car("Lada", "Granta", 1.7, "желтый", 2015, null, 60, "", "", "", 0, "зима");
        printCars(cars);

        cars[0].tireReplacement("зима");

        Train[] trains = new Train[2];
        trains[0] = new Train("Поезд «Ласточка»", "B-901", null, 2011, null, 301, 3500, -5, "Белорусский вокзал", "Минск-Пассажирский", 11);
        printTrain(trains);

        Bus bus1 = new Bus("ГАЗель", "NEXT", null, 2020, null, 120);
        System.out.println(bus1);
    }

    static void printCars(Car[] cars) {
        for (Car car : cars) {
            if (car != null) {
                System.out.println(car);
            }
        }
    }

    static void printTrain(Train[] trains) {
        for (Train train : trains) {
            if (train != null) {
                System.out.println(train);
            }
        }
    }

}