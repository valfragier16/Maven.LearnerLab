package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class TestZipCodeWilmington {

    @Test
    public void testHostLecture(){
        ZipCodeWilmington zcw = ZipCodeWilmington.getInstance();
        zcw.hostLecture(1,20);
        HashMap<Student, Double> map = zcw.getStudyMap();
        for(Student student : map.keySet()){
            Assert.assertEquals(5.0, student.getTotalStudyTime(), .01);
        }
    }


}