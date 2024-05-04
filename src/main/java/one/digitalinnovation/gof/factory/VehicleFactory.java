package one.digitalinnovation.gof.factory;

public class VehicleFactory {
    public static Vehicle getVehicle(String type) {
        if (type == null) {
            return null;
        }
        if (type.equalsIgnoreCase("CAR")) {
            return new Car();
        } else if (type.equalsIgnoreCase("MOTORCYCLE")) {
            return new Motorcycle();
        }
        return null;
    }
}
