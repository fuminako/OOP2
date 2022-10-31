package Transport;

import java.util.Objects;

public class Sponsor {
    private final String name;
    private final int donationAmount;

    public Sponsor(String name, int donationAmount) {
        this.name = name;
        this.donationAmount = donationAmount;
    }


    public String getName() {
        return name;
    }

    public int getDonationAmount() {
        return donationAmount;
    }

    public void makeDonation(String name, int donationAmount) {
        System.out.println("Внесено пожертвование от " + name + " на сумму в " + donationAmount);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sponsor sponsor = (Sponsor) o;
        return Objects.equals(name, sponsor.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public String toString() {
        return getName();
    }
}
