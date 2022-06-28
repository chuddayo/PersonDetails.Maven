package com.zipcodewilmington;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by leon on 1/24/18.
 */
public class PersonHandlerTest {
    PersonHandler personHandler;
    private String expected;

    @Before
    public void setup() {
        // : Given
        Person person1 = new Person("Leon", "Hunter");
        Person person2 = new Person("Tariq", "Hook");
        Person person3 = new Person("Dolio", "Durant");
        Person[] personArray = {person1, person2, person3};

        this.personHandler = new PersonHandler(personArray);
        this.expected = "\nMy first name is Leon\n" +
                "My first name is Tariq\n" +
                "My first name is Dolio";
    }

    @Test
    public void testWhileLoop() {
        // : When
        String actual = personHandler.whileLoop();

        // : Then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testForLoop() {
        // : When
        String actual = personHandler.forLoop();

        // : Then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testForEachLoop() {
        // : When
        String actual = personHandler.forEachLoop();

        // : Then
        Assert.assertEquals(expected, actual);
    }


}
