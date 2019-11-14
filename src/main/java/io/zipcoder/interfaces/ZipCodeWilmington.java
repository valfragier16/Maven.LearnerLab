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
        Learner[] newArr = Arrays.copyOf(students.toArray(), students.count(), Learner[].class);
        teacher.lecture(newArr, numberOfHours);

    }
    public void hostLecture(long id, double numberOfHours){
        hostLecture((Teacher)instructors.findById(id), numberOfHours);
    }

    public HashMap<Student,Double> getStudyMap() {
        HashMap<Student, Double> map = new HashMap<Student, Double>();
        for (Object student : students.toArray()) {
            Student s = (Student) student;
            map.put(s, s.getTotalStudyTime());
        }
        return map;
    }
    public static ZipCodeWilmington getInstance(){
        return INSTANCE;
    }
}
