package io.zipcoder.interfaces;

public class Students extends People{
    private static final Students INSTANCE = new Students();

    public Students() {
        super();
        super.add(new Student(1, "Don"));
        super.add(new Student(2, "Julio"));
        super.add(new Student(3, "Jose"));
        super.add(new Student(4, "Cuervo"));
    }

    public static Students getInstance(){
        return INSTANCE;
    }
}


