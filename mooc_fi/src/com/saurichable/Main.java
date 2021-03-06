package com.saurichable;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /*
            // Part 1
        Variables variablesObject = new Variables();
        variablesObject.variablesMethod();

        Numbers numbersObject = new Numbers();
        numbersObject.numbersMethod();

        Conditionals conditionalsObject = new Conditionals();
        conditionalsObject.conditionalsMethod();

            // Part 2
        Part_2 part_2Object = new Part_2();
        part_2Object.whileSum5();
        part_2Object.forSum5();
        part_2Object.factorial();
        part_2Object.fiveParts();

        Methods methodsObject = new Methods();
        methodsObject.methodsMethod(5,6);
        int number = methodsObject.alwaysReturnTen();
        System.out.println("The method returned: " + number);
        String str = methodsObject.returnString("Ellie");
        System.out.println("The method returned: " + str);
        System.out.println("The sumOfTwo method returned: " + methodsObject.sumOfTwo(5, 6));
        System.out.println("The smaller number is: " + methodsObject.smaller(10,5));
        System.out.println("The bigger number is: " + methodsObject.bigger(10,5));

        methodsObject.printStars(5);
        methodsObject.printSquare(4);
        methodsObject.printRectangle(17, 3);
        methodsObject.printLeftTriangle(4);
        methodsObject.printRightTriangle(4);
        methodsObject.printChristmasTree(10);

            // Part 3
        Lists listsObject = new Lists();
        listsObject.gettingFromLists(0);
        listsObject.printSecondPlusThird();
        System.out.println(listsObject.returnList());
        listsObject.loopingLists();
        listsObject.indexOfSmallest();
        listsObject.forEachLoop();
        listsObject.sumForEach();
        listsObject.onList();
        listsObject.testPrintNumbersInRange();

        Arrays arraysObject = new Arrays();
        arraysObject.creatingArrays();
        arraysObject.iteratingArrays();
        arraysObject.testingFindIndex();
        int[] numbers = {5, 1, 3, 4, 2};
        System.out.println(arraysObject.sumOfNumbersInArray(numbers));
        arraysObject.printNeatly(numbers);
        arraysObject.printArrayInStars(numbers);

        Strings stringsObject = new Strings();
        stringsObject.isItTrue();
        stringsObject.password();
        stringsObject.splittingString();
        stringsObject.containAV();
        stringsObject.firstCharacter("Hellu");
        stringsObject.personalDetails();

            // Part 4
        Person ada = new Person("Ada");
        Person antti = new Person("Antti");
        Person martin = new Person("Martin");
        ada.printPerson();
        antti.printPerson();
        martin.printPerson();
        ada.growOlder();
        ada.growOlder();
        ada.printPerson();
        antti.printPerson();
        System.out.println(martin.getName() + "'s age plus 15: " + (martin.getName() + 15));
        System.out.println(ada.isOfLegalAge());
        System.out.println(martin); // this calls toString method

        DecreasingCounter counter = new DecreasingCounter(3);
        counter.printValue();
        counter.reset();
        counter.printValue();
        counter.decrement();
        counter.printValue();
        counter.start(2);
        counter.printValue();
        counter.decrement();
        counter.printValue();

        OOP oopObject = new OOP();
        oopObject.objectsInList();
        oopObject.userInputObjectsInList();
        oopObject.userInputBooksList();
        oopObject.userInputArchive();

        Files filesObject = new Files();
        filesObject.fileReading();
        filesObject.teamsFileReading();

            // Part 5
        Clock clock = new Clock();
        for (int i = 0; i < 10000 ; i++){
            System.out.println(clock);
            clock.advance();
        }

        Person5 owo = new Person5("Napoleone Buonaparte", 51, 80, 1.70);
        System.out.println(owo);

        // since we have two constructors, both work
        Person paul = new Person("Paul", 24);
        Person ada = new Person("Ada");
        System.out.println(paul);
        System.out.println(ada);

        // primitives
        int i = 5;
        int j = i;
        j += 2; // this does NOT affect i
        System.out.println(i + ", " + j);
        // references
        Person john = paul; // now they both reference the same object
        john.growOlder(); // this DOES affect paul
        System.out.println(paul);

        john = new Person("John", 52);
        System.out.println(john);
        john = null;

        Person ellie = new Person("Ellie", 23, 158);
        AmusementParkRide rc = new AmusementParkRide("RollerCoaster", 150);
        if (rc.allowedToRide(ellie)) {
            System.out.println("Enjoy the ride, " + ellie.getName() + "!");
        } else {
            System.out.println("Sorry, you are too short.");
        }
        System.out.println(rc);

        HealthStation childrensHospital = new HealthStation();

        Person ethan = new Person("Ethan", 1, 110, 7);
        Person peter = new Person("Peter", 33, 176, 85);

        System.out.println(ethan.getName() + " weight: " + childrensHospital.weigh(ethan) + " kilos");
        System.out.println(peter.getName() + " weight: " + childrensHospital.weigh(peter) + " kilos");
        childrensHospital.feed(ethan);
        childrensHospital.feed(ethan);
        childrensHospital.feed(ethan);
        System.out.println("");
        System.out.println(ethan.getName() + " weight: " + childrensHospital.weigh(ethan) + " kilos");
        System.out.println(peter.getName() + " weight: " + childrensHospital.weigh(peter) + " kilos");
        System.out.println("weighings performed: " + childrensHospital.getWeighings());
        childrensHospital.weigh(ethan);
        childrensHospital.weigh(peter);
        System.out.println("weighings performed: " + childrensHospital.getWeighings());

        PaymentCard petesCard = new PaymentCard(10);
        System.out.println("money " + petesCard.getBalance());
        boolean wasSuccessful = petesCard.takeMoney(8);
        System.out.println("successfully withdrew: " + wasSuccessful);
        System.out.println("money " + petesCard.getBalance());
        wasSuccessful = petesCard.takeMoney(4);
        System.out.println("successfully withdrew: " + wasSuccessful);
        System.out.println("money " + petesCard.getBalance());

        PaymentTerminal unicafeExactum = new PaymentTerminal();
        double change = unicafeExactum.eatAffordably(10);
        System.out.println("remaining change " + change);
        change = unicafeExactum.eatAffordably(5);
        System.out.println("remaining change " + change);
        change = unicafeExactum.eatHeartily(4.3);
        System.out.println("remaining change " + change);
        System.out.println(unicafeExactum);

        PaymentTerminal unicafeExactum = new PaymentTerminal();
        System.out.println(unicafeExactum);
        PaymentCard annesCard = new PaymentCard(2);
        System.out.println("amount of money on the card is " + annesCard.getBalance() + " euros");
        boolean wasSuccessful = unicafeExactum.eatHeartily(annesCard);
        System.out.println("there was enough money: " + wasSuccessful);
        unicafeExactum.addMoneyToCard(annesCard, 100);
        wasSuccessful = unicafeExactum.eatHeartily(annesCard);
        System.out.println("there was enough money: " + wasSuccessful);
        System.out.println("amount of money on the card is " + annesCard.getBalance() + " euros");
        System.out.println(unicafeExactum);

        SimpleDate sd = new SimpleDate(5,9,1997);
        sd.todayDate();
        sd.todayTime();
        sd.todayDateTime();
        SimpleDate sd2 = new SimpleDate(5,2,1997);
        SimpleDate sd3 = new SimpleDate(5,8,2020);
        System.out.println(sd.equals(sd2));
        System.out.println(sd.equals(sd3));

        System.out.println(sd);
        PersonBirthday ellie = new PersonBirthday("Ellie", sd, 158);
        if (ellie.isOfLegalAge()) {
            System.out.println("Yassss, I'm an adult");
        } else {
            System.out.println("Not an adult just yet.");
        }
        System.out.println(ellie);

        Counter counter = new Counter(5);
        counter.increase();
        System.out.println(counter);
        Counter clone = counter.clone();
        clone.decrease(2);
        System.out.println(clone);
        System.out.println(counter);

        Money a = new Money(10,0);
        Money b = new Money(5,0);
        Money c = a.plus(b);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(a.lessThan(b));
        System.out.println(b.lessThan(c));

        Money a = new Money(10, 0);
        Money b = new Money(3, 50);
        Money c = a.minus(b);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        Menu menu = new Menu();
        menu.addMeal("Tofu ratatouille");
        menu.addMeal("Chilli coconut chicken");
        menu.addMeal("Chilli coconut chicken");
        menu.addMeal("Meatballs with mustard sauce");

        menu.printMeals();
        menu.clearMenu();

        System.out.println();
        menu.addMeal("Tomato and mozzarella salad");
        menu.printMeals();

        Room room = new Room();
        room.add(new Person("Lea", 1.83));
        room.add(new Person("Kenya", 1.82));
        room.add(new Person("Auli", 1.86));
        room.add(new Person("Nina", 1.72));
        room.add(new Person("Terhi", 1.85));

        while (!room.isEmpty()) {
            System.out.println(room.take());
        }

        Item book = new Item("The lord of the rings", 2);
        Item phone = new Item("Nokia 3210", 1);

        System.out.println("The book's name: " + book.getName());
        System.out.println("The book's weight: " + book.getWeight());

        System.out.println("Book: " + book);
        System.out.println("Phone: " + phone);

        Item book = new Item("Lord of the rings", 2);
        Item phone = new Item("Nokia 3210", 1);
        Item brick = new Item("brick", 4);
        Suitcase suitcase = new Suitcase(10);
        System.out.println(suitcase);
        suitcase.addItem(book);
        System.out.println(suitcase);
        suitcase.addItem(phone);
        System.out.println(suitcase);
        suitcase.addItem(brick);
        System.out.println(suitcase);
        System.out.println();
        System.out.println("The suitcase contains the following items:");
        suitcase.printItems();
        System.out.println("Total weight: " + suitcase.totalWeight() + " kg");
        Item heaviest = suitcase.heaviestItem();
        System.out.println("Heaviest item: " + heaviest);

        System.out.println();

        Suitcase adasCase = new Suitcase(10);
        adasCase.addItem(book);
        adasCase.addItem(phone);
        Suitcase pekkasCase = new Suitcase(10);
        pekkasCase.addItem(brick);
        Hold hold = new Hold(1000);
        hold.addSuitcase(adasCase);
        hold.addSuitcase(pekkasCase);
        System.out.println(hold);
        System.out.println();
        System.out.println("The suitcases in the hold contain the following items:");
        hold.printItems();

        System.out.println(adasCase.getItems());

        int[] numbers = {3, 2, 5, 4, 8};
        System.out.println("Smallest: " + Algorithms.smallest(numbers));
        System.out.println("Index of the smallest number: " + Algorithms.indexOfSmallest(numbers));

        System.out.println(Algorithms.indexOfSmallestFrom(numbers, 0));
        System.out.println(Algorithms.indexOfSmallestFrom(numbers, 1));
        System.out.println(Algorithms.indexOfSmallestFrom(numbers, 2));

        System.out.println(java.util.Arrays.toString(numbers));
        Algorithms.swap(numbers, 1, 0);
        System.out.println(java.util.Arrays.toString(numbers));
        Algorithms.swap(numbers, 0, 3);
        System.out.println(java.util.Arrays.toString(numbers));

        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        Algorithms.sort(numbers);

         */
        ArrayList<Books> books = new ArrayList<>();
        books.add(new Books("Hello", 20, 1998));
        books.add(new Books("sfa", 2470, 1999));
        books.add(new Books("Hesgdgllo", 250, 2001));
        books.add(new Books("Helsdgdslo", 202, 2005));
        books.add(new Books("Helgsdgdsglo", 202, 2011));
        books.add(new Books("Hesdgsdgllo", 210, 2016));
        books.add(new Books("Heldgsdglo", 201, 2020));
        System.out.println(Algorithms.linearSearch(books, 2015));
        System.out.println(Algorithms.binarySearch(books, 2011));
    }
}
