package Transport;

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

    public void makeDonation (String name, int donationAmount){
        System.out.println("Внесено пожертвование от " + name + " на сумму в " + donationAmount);
    }

    public String toString (){
        return name;
    }
}
