package parts.nine.interfaces;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        testReadable();
        owo();
        testPackable();

        System.out.print("Size of a List: ");
        testList();
        System.out.print("Size of a Map: ");
        testMap();
        System.out.print("Size of a Set: ");
        testSet();

        testWarehouse();
        testShoppingCart();
        testStore();
    }

    /*
    We can use interfaces to define behavior that's required from a class, i.e., its methods. They're defined the same
    way that regular Java classes are, but /public interface .../ is used instead of public class ... at the beginning
    of the class. Interfaces define behavior through method names and their return values. However, they don't always
    include the actual implementations of the methods. A visibility attribute on interfaces is not marked explicitly
    as they're always public.

    The classes that implement the interface decide how the methods defined in the interface are implemented. A class
    implements the interface by adding the keyword /implements/ after the class name followed by the name of the
    interface being implemented.

        // An Interface Is a Contract of Behaviour //
        When a class implements an interface, it signs an agreement. The agreement dictates that the class will
        implement the methods defined by the interface. If those methods are not implemented in the class, the program
        will not function.

        The interface defines only the names, parameters, and return values of the required methods. The interface,
        however, does not have a say on the internal implementation of its methods. It is the responsibility of the
        programmer to define the internal functionality for the methods.
     */

    public static void testReadable() {
        ArrayList<String> pages = new ArrayList<>();
        pages.add("Split your method into short, readable entities.");
        pages.add("Separate the user-interface logic from the application logic.");
        pages.add("Always program a small part initially that solves a part of the problem.");
        pages.add("Practice makes the master. Try different out things for yourself and work on your own projects.");

        Ebook book = new Ebook("Tips for programming.", pages);

        int page = 0;
        while (page < book.pages()) {
            System.out.println(book.read());
            page = page + 1;
        }
    }

    /*
    An object's type can be other than its class. For example, the type of the Ebook class that implements the Readable
    interface is both Ebook and Readable. Similarly, the text message also has multiple types. Because the TextMessage
    class implements the Readable interface, it has a Readable type in addition to the TextMessage type.

    Because an interface can be used as a type, it's possible to create a list that contains objects of the interfaces.
    The true benefits of interfaces are reaped when they are used as the type of parameter provided to a method. Since
    an interface can be used as a variable's type, it can also be used as a parameter type in method calls.
     */

    public static void owo() {
        ArrayList<Readable> readingList = new ArrayList<>();

        readingList.add(new TextMessage("ope", "never been programming before..."));
        readingList.add(new TextMessage("ope", "gonna love it i think!"));
        readingList.add(new TextMessage("ope", "give me something more challenging! :)"));
        readingList.add(new TextMessage("ope", "you think i can do it?"));
        readingList.add(new TextMessage("ope", "up here we send several messages each day"));


        ArrayList<String> pages = new ArrayList<>();
        pages.add("A method can call itself.");

        readingList.add(new Ebook("Introduction to Recursion.", pages));

        for (Readable readable: readingList) {
            System.out.println(readable.read());
        }
    }

    /*
    For example, the print method in the Printer class of the class below gets a variable of type read.

    public class Printer {
        public void print(Readable readable) {
            System.out.println(readable.read());
        }
    }

    The value of the print method of the printer class lies in the fact that it can be given any class that implements
    the Readable interface as a parameter. Were we to call the method with any object instantiated from a class that
    inherits the Readable class, the method would function as desired.
     */

    public static void testPackable() {
        Box box = new Box(10);

        box.add(new Book("Fyodor Dostoevsky", "Crime and Punishment", 2)) ;
        box.add(new Book("Robert Martin", "Clean Code", 1));
        box.add(new Book("Kent Beck", "Test Driven Development", 0.7));

        box.add(new CD("Pink Floyd", "Dark Side of the Moon", 1973));
        box.add(new CD("Wigwam", "Nuclear Nightclub", 1975));
        box.add(new CD("Rendezvous Park", "Closer to Being Here", 2012));

        System.out.println(box);
    }

    /*
    Interfaces can be used as return types in methods — just like regular variable types. Using interfaces in
    programming enables reducing dependencies between classes.

     // The List interface // defines the basic functionality related to lists. Because the ArrayList class
        implements the `List` interface, one can also use it through the `List` interface. As we can see fom the Java
        API of List, there are many classes that implement the `List` interface. One list is a linked list. A linked
        list can be used through the List interface exactly the same way as an object created from ArrayList.

        From the perspective of the user, both implementations of the List interface work the same way. The interface
        abstracts their inner functionality. The internal structures of ArrayList and LinkedList differ quite a bit.
        ArrayList saves objects to an array where fetching an object with a specific index is very fast. On the other
        hand LinkedList constructs a list where each element contains a reference to the next element in the list.
        When one searches for an object by index in a linked list, one has to go though the list from the beginning
        until the index.

        One can see noticeable performance differences between list implementations if the lists are big enough. The
        strength of a linked list is that adding to it is always fast. ArrayList, on the other hand, is backed by
        an array, which needs to be resized each time it gets full. Resizing the array requires creating a new array
        and copying the values from the old array to the new one. On the other hand, searching objects by index is much
        faster in an array list compared to a linked list.
     */
    public static void testList() {
        List<String> names = new ArrayList<>();
        names.add("First");
        names.add("Second");
        names.add("Third");

        System.out.println(returnListSize(names));
    }
    public static int returnListSize(List<String> list) {
        return list.size();
    }

    /*
     // The Map interface // defines the basic behavior associated with hash tables. Because the HashMap class
        implements the Map interface, it can also be accessed through the Map interface. The keys to the hash table are
        obtained using the keySet method. The keySet method returns a set of elements that implement the Set interface.
        You can use a for-each statement to go through a set that implements the Set interface. The hash values can be
        obtained from the hash table using the values method. The values method returns a set of elements that implement
        the Collection interface.
    */
    public static void testMap() {
        Map<String, String> names = new HashMap<>();
        names.put("1", "first");
        names.put("2", "second");

        System.out.println(returnMapSize(names));
    }
    public static int returnMapSize(Map<String, String> map) {
        return map.size();
    }

    /*
     // The Set interface// describes functionality related to sets. In Java, sets always contain either 0 or 1
        amounts of any given object. As an example, the set interface is implemented by HashSet.

        Note that HashSet in no way assumes the order of a set of elements. If objects created from custom classes are
        added to the HashSet object, they must have both the equals and hashCode methods defined.
     */
    public static void testSet() {
        Set<String> names = new HashSet<>();
        names.add("first");
        names.add("first");
        names.add("second");
        names.add("second");
        names.add("second");

        System.out.println(returnSetSize(names));
    }
    public static int returnSetSize(Set<String> set) {
        return set.size();
    }

    /*
     // The Collection interface // describes functionality related to collections. Among other things, lists and
        sets are categorized as collections in Java — both the List and Set interfaces implement the Collection
        interface. The Collection interface provides, for instance, methods for checking the existence of an item
        (the method contains) and determining the size of a collection (the method size).

        The Collection interface also determines how the collection is iterated over. Any class that implements the
        Collection interface, either directly or indirectly, inherits the functionality required for a for-each loop.
     */

    public static void testWarehouse() {
        Warehouse warehouse = new Warehouse();
        warehouse.addProduct("coffee", 5, 1);
        warehouse.addProduct("buttermilk", 2, 20);

        System.out.println("stock:");
        System.out.println("coffee: " + warehouse.stock("coffee"));
        System.out.println("sugar: " + warehouse.stock("sugar"));

        System.out.println("products:");
        for (String product: warehouse.products()) {
            System.out.println(product);
        }

        System.out.println("taking coffee " + warehouse.take("coffee"));
        System.out.println("taking coffee " + warehouse.take("coffee"));
        System.out.println("taking sugar " + warehouse.take("sugar"));

        System.out.println("stock:");
        System.out.println("coffee: " + warehouse.stock("coffee"));
        System.out.println("sugar: " + warehouse.stock("sugar"));
    }

    public static void testShoppingCart() {
        ShoppingCart cart = new ShoppingCart();
        cart.add("milk", 3);
        cart.print();
        System.out.println("cart price: " + cart.price() + "\n");

        cart.add("buttermilk", 2);
        cart.print();
        System.out.println("cart price: " + cart.price() + "\n");

        cart.add("milk", 3);
        cart.print();
        System.out.println("cart price: " + cart.price() + "\n");

        cart.add("milk", 3);
        cart.print();
        System.out.println("cart price: " + cart.price() + "\n");
    }

    public static void testStore() {
        Warehouse warehouse = new Warehouse();
        warehouse.addProduct("coffee", 5, 10);
        warehouse.addProduct("milk", 3, 20);
        warehouse.addProduct("cream", 2, 55);
        warehouse.addProduct("bread", 7, 8);

        Scanner scanner = new Scanner(System.in);

        Store store = new Store(warehouse, scanner);
        store.shop("Ellie");
    }
}
