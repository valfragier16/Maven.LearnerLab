package io.zipcoder.interfaces;

import java.util.Arrays;
import java.util.HashMap;

public class ZipCodeWilmington {
    private static final ZipCodeWilmington INSTANCE = new ZipCodeWilmington();
    Students students;
    Instructors instructors;

    public ZipCodeWilmington(){
        this.students = Students.getInstance();
        this.instructors = Instructors.getInstance();
    }

    public void hostLecture(Teacher teacher, double numberOfHours){
        //Learner[] newArr = Arrays.(students.toArray(), students.count(), Learner[].class);
        teacher.lecture(students.toArray(), numberOfHours);

    }
    public void hostLecture(long id, double numberOfHours){
        hostLecture((instructors.findById(id)), numberOfHours);
    }

    public HashMap<Student,Double> getStudyMap() {
        HashMap<Student, Double> map = new HashMap<Student, Double>();
        for (Student student : students.toArray()) {
            Student s = student;
            map.put(s, s.getTotalStudyTime());
        }
        return map;
    }
    public static ZipCodeWilmington getInstance(){
        return INSTANCE;
    }
}
