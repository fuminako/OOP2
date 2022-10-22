package Transport;

public class Train extends Transport {
    private int tripPrice;
    private int travelTime;
    private final String departureStationName;
    private String endingStation;
    private final int wagonsAmount;

    public Train(String brand, String model, String color, int productionYear, String productionCountry, int maxMovementSpeed,
                 int tripPrice,
                 int travelTime,
                 String departureStationName,
                 String endingStation,
                 int wagonsAmount) {
        super(brand, model, color, productionYear, productionCountry, maxMovementSpeed);
        setTripPrice(tripPrice);
        setTravelTime(travelTime);
        if ((departureStationName == null || departureStationName.isBlank())) {
            this.departureStationName = "default";
        } else {
            this.departureStationName = departureStationName;
        }
        setEndingStation(endingStation);
        if (wagonsAmount < 0) {
            this.wagonsAmount = 1;
        } else {
            this.wagonsAmount = wagonsAmount;
        }
    }

    public int getTripPrice() {
        return tripPrice;
    }

    public int getTravelTime() {
        return travelTime;
    }

    public String getDepartureStationName() {
        return departureStationName;
    }

    public String getEndingStation() {
        return endingStation;
    }

    public int getWagonsAmount() {
        return wagonsAmount;
    }

    public void setTripPrice(int tripPrice) {
        if (tripPrice < 0) {
            this.tripPrice = 0;
        } else {
            this.tripPrice = tripPrice;
        }
    }

    public void setTravelTime(int travelTime) {
        if (travelTime < 0) {
            this.travelTime = 0;
        } else {
            this.travelTime = travelTime;
        }
    }

    public void setEndingStation(String endingStation) {
        if ((endingStation == null || endingStation.isBlank())) {
            this.endingStation = "конечная";
        } else {
            this.endingStation = endingStation;
        }
    }

    @Override
    public String toString() {
        return "Train{" + getBrand() + " " + getModel() + " " + getColor() + " " + getProductionYear() + " " + getProductionCountry() + " " + getMaxMovementSpeed() + " " + refill() + " " +
                "tripPrice=" + tripPrice +
                ", travelTime=" + travelTime +
                ", departureStationName='" + departureStationName + '\'' +
                ", endingStation='" + endingStation + '\'' +
                ", wagonsAmount=" + wagonsAmount +
                '}';
    }

    public String refill() {
        return "Нужно заправлять дизелем";
    }
}
