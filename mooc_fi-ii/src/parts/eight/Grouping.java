package parts.eight;

import java.util.ArrayList;
import java.util.HashMap;

public class Grouping {
    /*
    Since keys and values in a hash map can be any variable, it is also possible to use lists as values in a hash map.
    You can add more values to a single key by attaching a list to the key.
     */

    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> phoneNumbers = new HashMap<>();

        phoneNumbers.put("Ellie", new ArrayList<>());
        phoneNumbers.get("Ellie").add("+420 xxx xxx xxx");
        phoneNumbers.get("Ellie").add("+420 yyy yyy yyy");

        System.out.println("Ellie's numbers: " + phoneNumbers.get("Ellie"));
    }

    public static void testDictionaryOfManyTranslations() {
        DictionaryOfManyTranslations dictionary = new DictionaryOfManyTranslations();
        dictionary.add("lie", "maata");
        dictionary.add("lie", "valehdella");

        dictionary.add("bow", "jousi");
        dictionary.add("bow", "kumartaa");

        System.out.println(dictionary.translate("lie"));
        dictionary.remove("bow");
        System.out.println(dictionary.translate("bow"));
    }

    public static void testStorageFacility() {
        StorageFacility facility = new StorageFacility();
        facility.add("a14", "ice skates");
        facility.add("a14", "ice hockey stick");
        facility.add("a14", "ice skates");

        facility.add("f156", "rollerblades");
        facility.add("f156", "rollerblades");

        facility.add("g63", "six");
        facility.add("g63", "pi");

        facility.remove("f156", "rollerblades");

        System.out.println(facility.contents("f156"));

        facility.remove("f156", "rollerblades");

        System.out.println(facility.storageUnits());
    }
}
