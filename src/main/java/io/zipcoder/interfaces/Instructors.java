package io.zipcoder.interfaces;

public class Instructors extends People<Instructor> {
    private static final Instructors INSTANCE = new Instructors();

    private Instructors() {
        super();
        super.add(Educator.DOLIO.getInstructor());
        super.add(Educator.FROILAN.getInstructor());
        super.add(Educator.CHRIS.getInstructor());
        super.add(Educator.ROBERTO.getInstructor());
    }

    @Override
    Instructor[] toArray() {
        return INSTANCE.personList.toArray(new Instructor[0]);
    }

    public static Instructors getInstance(){
        return INSTANCE;
    }
}
