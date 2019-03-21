
package ru.avalon.java.dev.j10.labs;

import ru.avalon.java.dev.j10.labs.models.Person;
import ru.avalon.java.dev.j10.labs.models.Passport;
import ru.avalon.java.dev.j10.labs.commons.Address;
public class Main {

    public static void main(String args[]) {

      Person ivanov = new Person("Иван", "Иванов", "Иванович", null);
      Person smith = new Person ("John", "Smith", null, "Edward");
       
      String ivanovName = ivanov.getFullName();
      String smithName = smith.getFullName();
   
      ivanov.setAddress(new Address("Russia, Moscow, Bolshoy, patrialshiy pereulok, 12 stroenie 1, 111"));
      smith.setAddress(new Address("United States of America, West Palm Beach, Park place, 10"));
      
     String ivanovAddress = ivanov.getAddress();
     String smithAddress = smith.getAddress();
        
      System.out.println(ivanovName+ "\n" + ivanovAddress+ "\n" +smithName+  "\n" + smithAddress);
           
    }
}  