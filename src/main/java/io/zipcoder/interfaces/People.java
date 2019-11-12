package io.zipcoder.interfaces;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class People implements Iterable{

    List<Person> personList;

    public People(){
        personList = new ArrayList<Person>();
    }

    public void add(Person person){
        personList.add(person);
    }

    public Person findById(long id){
        for(Person p: personList){
            if(p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    public boolean contains(Person person){
        return personList.contains(person);
    }

    public boolean remove(Person person){
        return personList.remove(person);
    }

    public boolean removeId(long id){
        return personList.remove(findById(id));
    }
    public void removeAll(){
        personList.clear();
    }

    public int count(){
        return personList.size();
    }

    public Person[] toArray(){
        Person[] newArr = new Person[personList.size()];
        return personList.toArray(newArr);
    }

    public Iterator iterator(){
        return personList.iterator();
    }
}
