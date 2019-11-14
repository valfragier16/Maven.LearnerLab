package io.zipcoder.interfaces;

public class Instructors extends People<Instructor> {
    private static final Instructors INSTANCE = new Instructors();

    public Instructors() {
        super();
        super.add(new Instructor(1, "Dolio"));
        super.add(new Instructor(2, "Froilan"));
        super.add(new Instructor(3, "Chris"));
        super.add(new Instructor(4, "Roberto"));
    }

    @Override
    Instructor[] toArray() {
        return INSTANCE.personList.toArray(new Instructor[0]);
    }

    public static Instructors getInstance(){
        return INSTANCE;
    }
}
