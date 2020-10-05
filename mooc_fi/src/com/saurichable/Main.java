package com.saurichable;

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

        Files filesObject = new Files();
        filesObject.fileReading();
        filesObject.teamsFileReading();

            // Part 5
        Clock clock = new Clock();
        for (int i = 0; i < 10000 ; i++){
            System.out.println(clock);
            clock.advance();
        }

         */
        Person5 owo = new Person5("Napoleone Buonaparte", 51, 80, 1.70);
        System.out.println(owo);

        // since we have two constructors, both work
        Person paul = new Person("Paul", 24);
        Person ada = new Person("Ada");
        System.out.println(paul);
        System.out.println(ada);
    }
}
