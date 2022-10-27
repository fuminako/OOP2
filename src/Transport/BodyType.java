package Transport;

public enum BodyType {
    SEDAN("Седан"),
    HATCHBACK("Хетчбек"),
    COUPE("Купе"),
    UNIVERSAL("Универсал"),
    SUV("Внедорожник"),
    CROSSOVER("Кроссовер"),
    PICKUP("Пикап"),
    VAN("Фургон"),
    MINIVAN("Минивэн");
    private final String type;

    BodyType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Легковой автомобиль с типом кузова " + type;
    }
}
