import Transport.Car;

public class Driver {
    private final String FIO;
    private final boolean havingDriverLicense;
    private final int Experience;

    public Driver(String FIO, boolean havingDriverLicense, int experience) {
        this.FIO = FIO;
        this.havingDriverLicense = havingDriverLicense;
        Experience = experience;
    }

    public final String getFIO() {
        return FIO;
    }

    public final boolean getHavingDriverLicense() {
        return havingDriverLicense;
    }

    public final int getExperience() {
        return Experience;
    }

}
