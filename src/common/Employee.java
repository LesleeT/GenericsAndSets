package common;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Employee {
    private String lastName;
    private String firstName;
    private String ssn;
    private Address address;

    public Employee(String lastName, String firstName, String ssn) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.ssn = ssn;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return lastName= "Last Name: "+ lastName + ", First Name: " + firstName + ", SSN: " + ssn;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.lastName);
        hash = 97 * hash + Objects.hashCode(this.firstName);
        hash = 97 * hash + Objects.hashCode(this.ssn);
        hash = 97 * hash + Objects.hashCode(this.address);
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
        final Employee other = (Employee) obj;
        if (!Objects.equals(this.lastName, other.lastName)) {
            return false;
        }
        if (!Objects.equals(this.firstName, other.firstName)) {
            return false;
        }
        if (!Objects.equals(this.ssn, other.ssn)) {
            return false;
        }
        if (!Objects.equals(this.address, other.address)) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Walters", "Joe", "245-456-7890");
        Employee e2 = new Employee("Walters", "Joe", "245-456-7890");

//        List emp = new ArrayList();
//        emp.add(e1);
//        emp.add(e2);
//
//        
//        Employee s = (Employee)emp.get(0);
//        Employee s2 = (Employee)emp.get(1);
//
//        for(int i= 0; i < emp.size(); i++){
//            System.out.println(emp.get(i));
//        }
        
//        List <Employee> empList = new ArrayList <>();
//        if(e1.equals(e2)){
//            empList.add(e2);
//        }
//        
//        if(e2.equals(e1)){
//            empList.add(e1);
//        }
//        System.out.println(empList.toString());
//
//    
    }
    
    
}
