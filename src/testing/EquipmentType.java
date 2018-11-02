package testing;

public enum EquipmentType {

    WIRELESS("wireless"),
    LANDLINE("landline"),
    NOT_AVAILABLE("not available");

    private final String value;

    EquipmentType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
