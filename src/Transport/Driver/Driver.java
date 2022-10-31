package Transport.Driver;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver driver = (Driver) o;
        return Objects.equals(FIO, driver.FIO);
    }

    @Override
    public int hashCode() {
        return Objects.hash(FIO);
    }
}
