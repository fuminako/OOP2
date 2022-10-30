package Transport;

public enum LoadType {
    N1("до 3,5 тонн"),
    N2("от 3,5 до 12 тонн"),
    N3("более 12 тонн");
    private final String permissibleWeight;

    LoadType(String type) {
        this.permissibleWeight = type;
    }

    public String getPermissibleWeight() {
        return permissibleWeight;
    }

    public String toString() {
        return "Грузовик вместимостью " + permissibleWeight;
    }
}
