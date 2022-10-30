package Transport.Driver;

import Transport.Car;

public class DriverD <D extends Car> extends Driver {
    public DriverD(String FIO, boolean havingDriverLicense, int experience) {
        super(FIO, havingDriverLicense, experience);
    }

    public void startMovement(D car) {
        System.out.println(getFIO() + " управляет автомобилем " + car.getBrand() + " " + car.getModel() + " и будет участвовать в заезде");
    }


    public void finishMovement (D car) {
        System.out.println(getFIO() + " закончил маршрут на " + car.getBrand() + car.getModel());
        System.out.println(car.finishMovement());
    }


    public void refill(D car) {
        System.out.println("Заправить автомобиль.");
        System.out.println(car.refill());
    }

    public String toString(){
        return getFIO();
    }
}
