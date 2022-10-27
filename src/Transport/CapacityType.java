package Transport;

public enum CapacityType {
    EXTRA_SMALL("до 10 мест"),
    SMALL("до 25"),
    MEDIUM("от 40 до 50"),
    LARGE("от 60 до 80"),
    ESPECIALLY_LARGE("от 100 до 120");
    private final String capacity;

    CapacityType(String capacity) {
        this.capacity = capacity;
    }

    public String getCapacity() {
        return capacity;
    }

    public String toString(){
        return "Автобус вместимостью " + capacity + " мест";
    }
}
