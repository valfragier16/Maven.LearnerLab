package io.zipcoder.interfaces;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class TestStudents {

    @Test
    public void getINSTANCE() {
        Students s = Students.getInstance();
        Person p = s.findById(1);

        Assert.assertTrue(s.findById(1).getName().equals("Don"));

    }
}