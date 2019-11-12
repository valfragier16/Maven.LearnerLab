package io.zipcoder.interfaces;

public class Instructors extends People {
    private static final Instructors INSTANCE = new Instructors();

    public Instructors() {
        super();
        super.add(new Student(1, "Dolio"));
        super.add(new Student(2, "Froilan"));
        super.add(new Student(3, "Chris"));
        super.add(new Student(4, "Roberto"));
    }

    public static Instructors getInstance(){
        return INSTANCE;
    }
}
