package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestInstructors {

    @Test
    public void getINSTANCE(){
        String expected = Instructors.getInstance().findById(1).getName();
        Assert.assertEquals(expected, "Dolio");

    }
}