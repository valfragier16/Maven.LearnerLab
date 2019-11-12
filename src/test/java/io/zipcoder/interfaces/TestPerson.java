package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

    @Test
    public void testConstructor (){
        // Given
        String expectedName = "Val";
        long expectedId = 6;
        Person person = new Person(expectedId, expectedName);

        // When
        long actualId = person.getId();
        String actualName = person.getName();

        // Then
        Assert.assertEquals(expectedId, actualId);
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void testSetName(){
        // Given
        String expectedName = "Vanessa";
        Person person = new Person(4, expectedName);

        // When
        String actualName = person.getName();

        Assert.assertEquals(expectedName, actualName);
    }

}
