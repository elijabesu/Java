package parts.eight;

import java.util.HashMap;

public class HashMapL {
    /*
    A HashMap is, in addition to ArrayList, one of the most widely used of Java's pre-built data structures. The hash
    map is used whenever data is stored as key-value pairs, where values can be added, retrieved, and deleted using
    keys. If the hash map does not contained the key used for the search, its get method returns a null reference.

    Adding to the hash map is done through the /put(*key*, *value*)/ method that has two parameters, one for the key,
    the other for the value. Retrieving from a hash map happens with the help of the /get(*key*)/ method that is passed
    the key as a parameter and returns a value.

    The hash map has a maximum of one value per key. If a new key-value pair is added to the hash map, but the key has
    already been associated with some other value stored in the hash map, the old value will vanish from the hash map.
     */
    public static void main(String[] args) {
        HashMap<String, String> postalCodes = new HashMap<>();
        postalCodes.put("643 00", "Brno-Chrlice");
        postalCodes.put("664 61", "Rajhrad");
        System.out.println(postalCodes.get("643 00"));
        System.out.println(postalCodes.get("664 42"));
    }
    public static void bookHasMap() {
        Book prideAndSensibility = new Book("Pride and Sensibility", 200, 1811);
        Book prideAndPrejudice = new Book("Pride and Prejudice", 200, 1813);

        HashMap<String, Book> directory = new HashMap<>();
        directory.put(prideAndSensibility.getTitle(), prideAndSensibility);
        directory.put(prideAndPrejudice.getTitle(), prideAndPrejudice);

        Book book = directory.get("Persuation");
        System.out.println(book);
        book = directory.get("Pride and Prejudice");
        System.out.println(book);
    }
    /*
    The hash map is implemented internally in such a way that searching by a key is very fast. The hash map generates
    a "hash value" from the key, i.e. a piece of code, which is used to store the value of a specific location. When
    a key is used to retrieve information from a hash map, this particular code identifies the location where the value
    associated with the key is. In practice, it's not necessary to go through all the key-value pairs in the hash map
    when searching for a key; the set that's checked is significantly smaller.

    Hash maps work well when we know exactly what we are looking for. If we wanted to identify books whose title
    contains a particular string, the hash map would be of little use. The hash maps also have no internal order, and
    it is not possible to search the hash map based on the indexes. The items in a list are in the order they were
    added to the list.

    Typically, hash maps and lists are used together. The hash map provides quick access to a specific key or keys,
    while the list is used, for instance, to maintain order.
     */
    public static void libraryHashMap() {
        Book prideAndSensibility = new Book("Pride and Sensibility", 200, 1811);
        Book prideAndPrejudice = new Book("Pride and Prejudice", 200, 1813);

        Library library = new Library();
        library.addBook(prideAndPrejudice);
        library.addBook(prideAndSensibility);

        System.out.println(library.getBook("pride and prejudice"));
        System.out.println(library.getBook("sense"));
    }
    public static void abbreviationHashMap() {
        Abbreviations abbreviations = new Abbreviations();
        abbreviations.addAbbreviation("e.g.", "for example");
        abbreviations.addAbbreviation("etc.", "and so on");
        abbreviations.addAbbreviation("i.e.", "more precisely");

        String text = "e.g. i.e. etc. lol";

        for (String part: text.split(" ")) {
            if(abbreviations.hasAbbreviation(part)) {
                part = abbreviations.findExplanationFor(part);
            }

            System.out.print(part);
            System.out.print(" ");
        }

        System.out.println();
    }
    public static void printKeys(HashMap<String, String> hashmap) {
        for (String key: hashmap.keySet()) {
            System.out.println(key);
        }
    }
    public static void printKeysWhere(HashMap<String,String> hashmap, String text) {
        for (String key: hashmap.keySet()) {
            if (key.contains(text)) {
                System.out.println(key);
            }
        }
    }
    public static void printValuesOfKeysWhere(HashMap<String,String> hashmap, String text) {
        for (String key: hashmap.keySet()) {
            if (key.contains(text)) {
                System.out.println(hashmap.get(key));
            }
        }
    }
    public static void printingValuesOfHashMap() {
        HashMap<String, String> hashmap = new HashMap<>();
        hashmap.put("f.e", "for example");
        hashmap.put("etc.", "and so on");
        hashmap.put("i.e", "more precisely");

        printKeys(hashmap);
        System.out.println("---");
        printKeysWhere(hashmap, "i");
        System.out.println("---");
        printValuesOfKeysWhere(hashmap, ".e");
    }
    public static void printingValuesOfLibrary() {
        HashMap<String, Book> hashmap = new HashMap<>();
        hashmap.put("sense", new Book("Sense and Sensibility", 200,1811));
        hashmap.put("prejudice", new Book("Pride and prejudice", 200, 1813));

        Library.printValues(hashmap);
        System.out.println("---");
        Library.printValueIfNameContains(hashmap, "prejud");
    }

    /*
    Java converts primitive variables to reference-types automatically as they are added to either a HashMap or
    an ArrayList. This automatic conversion to a reference-type variable is termed auto-boxing in Java, i.e. putting
    something in a box automatically. The automatic conversion is also possible in the other direction.

    When performing automatic conversion, we should ensure that the value to be converted is not null.
    The /getOrDefault/ method of the HashMap searches for the key passed to it as a parameter from the HashMap.
    If the key is not found, it returns the value of the second parameter passed to it.
     */

    public static void testIOU() {
        IOU mattsIOU = new IOU();
        mattsIOU.setSum("Arthur", 51.5);
        mattsIOU.setSum("Michael", 30);
        mattsIOU.setSum("Arthur", 10.5);

        System.out.println(mattsIOU.howMuchDoIOweTo("Arthur"));
        System.out.println(mattsIOU.howMuchDoIOweTo("Michael"));
    }
}
