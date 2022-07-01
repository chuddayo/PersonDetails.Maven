package com.zipcodewilmington;

/**
 * Created by leon on 1/24/18.
 */
public class PersonHandler {
    private final Person[] personArray;

    public PersonHandler(Person[] personArray) {
        this.personArray = personArray;
    }

    public String whileLoop() {
        String result = "";
        int counter = 0;
        while (counter < personArray.length) {
            result += "\nMy first name is " + personArray[counter].getFirstName()
                     +"\nMy last name is " + personArray[counter].getLastName();
            counter++;
        }
        return result;
    }

    public String forLoop() {
        String result = "";
        for (int i = 0; i < personArray.length; i++) {
            result += "\nMy first name is " + personArray[i].getFirstName()
                    +"\nMy last name is " + personArray[i].getLastName();
        }
        return result;
    }

    public String forEachLoop() {
        String result = "";
        for (Person individual : personArray) {
            result += "\nMy first name is " + individual.getFirstName()
                    +"\nMy last name is " + individual.getLastName();
        }
        return result;
    }

    public Person[] getPersonArray() {
        return personArray;
    }
}
