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
        while (counter < this.personArray.length) {
            result += "\nMy first name is " + this.personArray[counter].getFirstName();
            counter++;
        }
        return result;
    }

    public String forLoop() {
        String result = "";
        for (int i = 0; i < this.personArray.length; i++) {
            result += "\nMy first name is " + this.personArray[i].getFirstName();
        }
        return result;
    }

    public String forEachLoop() {
        String result = "";
        for (Person name : this.personArray) {
            result += "\nMy first name is " + name.getFirstName();
        }
        return result;
    }


    public Person[] getPersonArray() {
        return personArray;
    }
}
