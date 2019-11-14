package io.zipcoder.interfaces;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class People<E extends Person> implements Iterable<E>{

    List<E> personList;

    public People(){
        personList = new ArrayList<E>();
    }

    public void add(E person){
        personList.add(person);
    }

    public E findById(long id){
        for(E p: personList){
            if(p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    public boolean contains(E person){
        return personList.contains(person);
    }

    public boolean remove(E person){
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

    abstract E[] toArray();

    // Other option
    public E[] toArray(E[] arr){
        return personList.toArray(arr);
    }


    public Iterator iterator(){
        return personList.iterator();
    }
}
