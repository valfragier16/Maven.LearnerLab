package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestEducator {
    @Test
    public void testImplementation(){
        Assert.assertTrue(Educator.DOLIO instanceof Teacher);
    }

    @Test
    public void testInheritance (){
        Instructor instructor = new Instructor(1, "Dolio");
        Assert.assertTrue(instructor instanceof Person);
    }

    @Test
    public void testTeach(){
        Student student = new Student(3, "Marcus");
        Educator.DOLIO.teach(student, 6.0);
        Assert.assertEquals(6.0, student.getTotalStudyTime(), .000001);
        Educator.DOLIO.teach(student, 2.0);
        Assert.assertEquals(8.0, student.getTotalStudyTime(), .000001);
    }

    @Test
    public void testLecture () {
        Instructor instructor = Educator.DOLIO.getInstructor();
        Student s1 = new Student(3, "Marcus");
        Student s2 = new Student(2, "Sebastian");
        Student s3 = new Student(1, "Liam");
        Student[] stuArr = {s1,s2,s3};
        instructor.lecture(stuArr, 6);
        Assert.assertEquals(2,s1.getTotalStudyTime(), .00001);
        Assert.assertEquals(2,s2.getTotalStudyTime(), .00001);
        Assert.assertEquals(2,s3.getTotalStudyTime(), .00001);


    }

}