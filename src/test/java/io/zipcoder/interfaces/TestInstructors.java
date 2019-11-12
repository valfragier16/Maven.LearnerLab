package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestInstructors {

    @Test
    public void getINSTANCE(){
        Instructors i = Instructors.getInstance();
        Person p = i.findById(1);

        Assert.assertTrue(i.findById(1).getName().equals("Dolio"));

    }
}