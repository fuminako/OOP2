package Transport;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Objects;

public class Car extends Transport {


    private double engineVolume;
    private String transmission;
    private final String bodyType;
    private String registrationNumber;
    private final int numberOfSeats;
    private String tireCover;

    private Insurance insurance;
    private Key key;

    public Car(String brand,
               String model,
               double engineVolume,
               String color,
               int productionYear,
               String productionCountry,
               int maxMovementSpeed,
               String transmission,
               String bodyType,
               String registrationNumber,
               int numberOfSeats,
               String tireCover) {
        super(brand, model, color, productionYear, productionCountry, maxMovementSpeed);

        if (engineVolume < 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
        if ((transmission == null || transmission.isBlank())) {
            this.transmission = "default";
        } else {
            this.transmission = transmission;
        }
        if ((bodyType == null || bodyType.isBlank())) {
            this.bodyType = "default";
        } else {
            this.bodyType = bodyType;
        }
        if ((registrationNumber == null || registrationNumber.isBlank())) {
            this.registrationNumber = "x000xx000";
        } else {
            this.registrationNumber = registrationNumber;
        }
        if (tireCover.equals("зима") || tireCover.equals("лето")) {
            this.tireCover = tireCover;
        } else {
            this.tireCover = "default";
        }
        this.numberOfSeats = Math.max(numberOfSeats, 0);
    }


    public String getTransmission() {
        return transmission;
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public String getTireCover() {
        return tireCover;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume == 0) {
            engineVolume = 0;
        }
        this.engineVolume = engineVolume;
    }


    public void setTransmission(String transmission) {
        if (tireCover.equals("")) {
            tireCover = "default";
        }
        this.transmission = transmission;
    }

    public void setRegistrationNumber(String registrationNumber) {
        if (registrationNumber.equals("")) {
            registrationNumber = "x000xx000";
        }
        this.registrationNumber = registrationNumber;
    }

    public void setTireCover(String tireCover) {
        if (tireCover.equals("")) {
            tireCover = "default";
        }
        this.tireCover = tireCover;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public Key getKey() {
        return key;
    }


    @Override
    public String toString() {
        return "Car{" + getBrand() + " " + getModel() + " " + getColor() + " " + getProductionYear() + " " + getProductionCountry() + " " + getMaxMovementSpeed() + " " + refill() + " " +
                "engineVolume=" + engineVolume +
                ", transmission='" + transmission + '\'' +
                ", bodyType='" + bodyType + '\'' +
                ", registrationNumber='" + registrationNumber + '\'' +
                ", numberOfSeats=" + numberOfSeats +
                ", tireCover='" + tireCover + '\'' +
                ", insurance=" + insurance +
                ", key=" + key +
                '}';
    }

    public boolean isrRegistrationNumberValid() {
        if (registrationNumber.length() != 9) {
            return false;
        }
        char[] chars = registrationNumber.toCharArray();
        if (!Character.isAlphabetic(chars[0]) || !Character.isAlphabetic(chars[4]) || !Character.isAlphabetic(chars[5])) {
            return false;
        }
        if (!Character.isDigit(chars[1]) || !Character.isDigit(chars[2]) || !Character.isDigit(chars[3])
                || !Character.isDigit(chars[6]) || !Character.isDigit(chars[7]) || !Character.isDigit(chars[8])) {
            return false;
        }
        return true;
    }

    public void tireReplacement(String tireCover) {
        Calendar calendar = Calendar.getInstance();
        int month = calendar.get(Calendar.MONTH);
        String season = null;
        if (month > 0 && (month < 3 || month > 11)) {
            season = "зима";
        } else if (month > 0) {
            season = "лето";
        }
        if (!Objects.equals(tireCover, season)) {
            System.out.println("Сменить шины на сезонные");
        }
    }

    public String refill() {
        return "Можно заправлять бензином, дизелем на заправке или заряжать на специальных электропарковках, если это электрокар";
    }

    public static class Key {
        private final String remoteEngineStart;
        private final String keylessAccess;

        public Key(String remoteEngineStart, String keylessAccess) {
            if (remoteEngineStart == null || remoteEngineStart.isBlank()) {
                this.remoteEngineStart = "default";
            } else {
                this.remoteEngineStart = remoteEngineStart;
            }
            if (keylessAccess == null || keylessAccess.isBlank()) {
                this.keylessAccess = "default";
            } else {
                this.keylessAccess = keylessAccess;
            }
        }

        public String getRemoteEngineStart() {
            return remoteEngineStart;
        }

        public String getKeylessAccess() {
            return keylessAccess;
        }


        @Override
        public String toString() {
            return remoteEngineStart + " " + keylessAccess;
        }
    }

    public static class Insurance {
        private final LocalDate insuranceValidityPeriod;
        private final float insuranceCost;
        private final String insuranceNumber;

        Insurance(LocalDate insuranceValidityPeriod, float insuranceCost, String insuranceNumber) {
            if (insuranceValidityPeriod == null) {
                this.insuranceValidityPeriod = LocalDate.now().plusDays(20);
            } else {
                this.insuranceValidityPeriod = insuranceValidityPeriod;
            }
            this.insuranceCost = Math.max(insuranceCost, 1f);
            if ((insuranceNumber == null || insuranceNumber.isBlank())) {
                this.insuranceNumber = "default";
            } else {
                this.insuranceNumber = insuranceNumber;
            }
        }

        public LocalDate getInsuranceValidityPeriod() {
            return insuranceValidityPeriod;
        }

        public float getInsuranceCost() {
            return insuranceCost;
        }

        public String getInsuranceNumber() {
            return insuranceNumber;
        }

        public boolean isInsuranceNumberValid() {
            return insuranceNumber.length() == 9;
        }

        public boolean isInsuranceValid() {
            return LocalDate.now().isBefore(this.insuranceValidityPeriod);
        }

        public String toString() {
            return insuranceValidityPeriod + " " + insuranceCost + " " + insuranceNumber;
        }
    }
}
