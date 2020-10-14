package parts.eight;

import java.util.HashMap;

public class VehicleRegistry {
    private HashMap<LicensePlate, String> registry;

    public VehicleRegistry() {
        registry = new HashMap<>();
    }

    public boolean add(LicensePlate licensePlate, String owner) {
        if (registry.containsKey(licensePlate)) return false;
        registry.put(licensePlate, owner);
        return true;
    }

    public String get(LicensePlate licensePlate) {
        if (!registry.containsKey(licensePlate)) return null;
        return registry.get(licensePlate);
    }

    public boolean remove(LicensePlate licensePlate) {
        if (!registry.containsKey(licensePlate)) return false;
        registry.remove(licensePlate);
        return true;
    }

    public void printLicensePlates() {
        for (LicensePlate licensePlate: registry.keySet()) {
            System.out.println(licensePlate);
        }
    }

    public void printOwners() {
        for (LicensePlate licensePlate: registry.keySet()) {
            System.out.println(registry.get(licensePlate));
        }
    }
}
