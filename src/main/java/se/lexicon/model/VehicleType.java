package se.lexicon.model;

public enum VehicleType {

    CAR(1, "Car"),
    MOTORCYCLE(2, "Motorcycle"),
    ELECTRIC(3, "Electric Vehicle");

    final int code;
    final String name;

    VehicleType(int code, String name) {
        this.code = code;
        this.name = name;
    }

    public int getCode() {
        return this.code;
    }

    public String getName() {
        return this.name;
    }

    public static VehicleType getVehicleType(int code) {
        for (VehicleType vehicleType: VehicleType.values()) {
            if (vehicleType.getCode() == code) {
                return vehicleType;
            }
        }
        throw new EnumConstantNotPresentException(VehicleType.class, String.valueOf(code));
    }
}
