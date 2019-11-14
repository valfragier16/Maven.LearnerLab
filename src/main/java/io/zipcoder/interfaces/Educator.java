package io.zipcoder.interfaces;

public enum Educator implements Teacher{
    DOLIO(1, "Dolio"), FROILAN(2, "Froilan"), CHRIS(3,"Chris"), ROBERTO(4, "Roberto");

    private final Instructor instructor;
    private double timeWorked = 0;

    Educator(int i, String name){
        instructor = new Instructor(i, name);
    }

    @Override
    public void teach(Learner learner, double numberOfHours) {
        instructor.teach(learner, numberOfHours);
        timeWorked += numberOfHours;
    }

    @Override
    public void lecture(Learner[] learners, double numberOfHours) {
        instructor.lecture(learners, numberOfHours);
        timeWorked += numberOfHours;
    }

    public double getTimeWorked() {
        return timeWorked;
    }

    public Instructor getInstructor() {
        return instructor;
    }
}
