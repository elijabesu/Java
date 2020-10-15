package parts.eight;

import java.util.ArrayList;
import java.util.HashMap;

public class StorageFacility {
    HashMap<String, ArrayList<String>> units;

    public StorageFacility() {
        units = new HashMap<>();
    }

    public void add(String unit, String item) {
        if (!units.containsKey(unit)) units.put(unit, new ArrayList<>());
        units.get(unit).add(item);
    }

    public ArrayList<String> contents(String unit) {
        return units.get(unit);
    }

    public void remove(String unit, String item) {
        if (units.containsKey(unit)) {
            if (units.get(unit).contains(item)) units.get(unit).remove(item);
            if (units.get(unit).size() == 0) units.remove(unit);
        }
    }

    public ArrayList<String> storageUnits() {
        ArrayList<String> unitsList = new ArrayList<>();
        for (String unit: units.keySet()) {
            unitsList.add(unit);
        }
        return unitsList;
    }
}
