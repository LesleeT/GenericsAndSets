package common;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class Dog {
    private String name;
    private int rabiesId;

    public Dog() {
    }

    public Dog(String name, int rabiesId) {
        this.name = name;
        this.rabiesId = rabiesId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRabiesId() {
        return rabiesId;
    }

    public void setRabiesId(int rabiesId) {
        this.rabiesId = rabiesId;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + Objects.hashCode(this.name);
        hash = 41 * hash + this.rabiesId;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Dog other = (Dog) obj;
        if (this.rabiesId != other.rabiesId) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }


    @Override
    public String toString() {
        return "Dog's name is: " + name + ", rabiesId is: " + rabiesId;
    }
 
    
    public static void main(String[] args) {
//        Dog dog = new Dog("Fido", "1234");
//        Dog dog2 = new Dog("Bubbles", "4567");
//        Dog dog3 = new Dog("Fido", "1234");
//        Dog dog4 = new Dog("Woofie", "4512");
         
        List <String> list = new ArrayList<>();
        list.add("Fido");
        list.add("Fido");
        list.add("Bubbles");
        list.add("Woofie");
        list.set(1, "Oreo");
        //list.remove(1);
        
        Set <String> noDupes = new HashSet <>();     
        list = new ArrayList<>(noDupes);
        String s = list.get(0);
        for(int i=0; i < noDupes.size(); i++){
            System.out.println(noDupes);
        }
        
        
        
        
        
    }

    
    
    

}
