import Transport.Car;
import Transport.Competing;

public class DriverC <C extends Car & Competing> extends Driver{
    public DriverC(String FIO, boolean havingDriverLicense, int experience) {
        super(FIO, havingDriverLicense, experience);
    }
    public void startMovement(C car) {
        System.out.println(getFIO() + " управляет автомобилем " + car.getBrand() + " " + car.getModel() + " и будет участвовать в заезде");
    }


    public void finishMovement (C car) {
        System.out.println(getFIO() + " закончил маршрут на " + car.getBrand() + car.getModel());
        System.out.println(car.finishMovement());
    }


    public void refill(C car) {
        System.out.println("Заправить автомобиль.");
        System.out.println(car.refill());
    }
}
