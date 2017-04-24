package Practice;

import common.Address;
import common.Employee;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Vector;

public class Practice1 {
    public static void main(String[] args) {
        Address address = new Address();
        address.setAddress1("1234 Main street");
        
        Address address2 = new Address();
        address2.setAddress1("1234 Main street");
        
//        if(address.equals(address2)){
//            System.out.println("The addresses are the same");
//        }else{
//            System.out.println("they are not the same");
//        }
        
        List<Address> addresses = new ArrayList<>();
        if(address.getCity().equals("Milwaukee")){
            addresses.add(address);
        }
        if(address2.equals(address)){
            addresses.add(address2);
        }
//        addresses.add(address);
//        addresses.add(address2);
//        for(Address a : addresses){
//
//        }
//        
        
        
        
//        ArrayList list = new ArrayList();
//        list.add("hello");
//        list.add(1);//auto boxing auto unboxing allows 1 to be stored here since its a primitive not an object
//        Integer value = (Integer)list.get(1);
                
//        List <String> list = new ArrayList<>();//says you can only store strings in list
//        list.add("hello");
//        list.add("goodbye");
//        String value = list.get(0);
//        String value2 = list.get(1);
//        System.out.println(value + "\n" + value2);
     
//        List <String> list = new ArrayList<>();
//        
//        list.add("Beer");
//        list.add("Chips");
//        list.add("Vodka");
//        list.add("Beer");
//        list.add("Beer");
        //boolean b = list.contains("Vodka");
        //System.out.println(b);
        //list.add(2, "Steak");
        //list.set(3, "Bourbon");
        //list.remove(1);
        
//        Set<String> noDupes = new HashSet <>(list);
//        list = new ArrayList<>(noDupes);
         
        // String s = list.get(0);
        //old school for loop
//        for(int i=0; i < list.size(); i++){
//            System.out.println(list.get(i));
//        }
        
//      new school for loop-make sure you know what version of java you're on before using this advanced for loop
//      for(String item : list){
//          System.out.println(item);
//        }


//        Employee e1 = new Employee("Smith", "bob", "333-33-3333");
//        Employee e2 = new Employee("Smith", "bob", "333-33-3333");
//        Employee e3 = new Employee("Smith", "bob", "333-33-3333");
//        Employee e4 = new Employee("Smith", "bob", "333-33-3333");
//         
//        List <String> employeeList = new ArrayList<>();
//        for(Employee e : employeeList){
//            Employee emp = (Employee)e;
//        }
         
         
         
    }    
    
}
