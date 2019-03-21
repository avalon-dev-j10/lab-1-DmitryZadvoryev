package ru.avalon.java.dev.j10.labs.models;

import ru.avalon.java.dev.j10.labs.commons.Address;

/**
 * Представление о человеке.
 * <p>
 * С точки зрения задания человек представляется как сущность,
 * наделённая:
 * <ol>
 *     <li>именем;
 *     <li>паспортными данными;
 *     <li>пропиской по месту жительства.
 * </ol>
 */

public class Person {
    
   private String name;
   private String surname;
   private String patronymic;
   private String secondName;
   
   private Passport passport;
   private Address address;
  
   
   public Person (String name, String surname, String patronymic, String secondName){
        this.name = name;
        this.surname = surname; 
        this.patronymic = patronymic;
        this.secondName = secondName;   
   }
   
    public void setAddress(Address address){
        this.address = address;  
    }
    
    public void setPassport(Passport passport){
         this.passport = passport;     
    }
    
     public String getName(){
        return name;
    }
     
    public String getSurname(){
        return surname;
    }
    public String getPatronymic(){
        return patronymic;
    }
    
    public String getSecondName(){
        return secondName;
    }
    
    /**
     * Возврвщает полное имя человека.
     * <p>
     * Если у человека есть Имя, Фамилия и Отчество, то
     * возвращет Имя, Фимилию и Отчество, разделённые пробелом.
     * <p>
     * Если у человека нет Отчества, но есть второе имя, то
     * возвращает Имя, Первую букву второго имени, и Фамилию,
     * разделённые пробелом. После Инициала второго имени
     * должна стоять точка. Например, "Джером К. Джером".
     * <p>
     * Если у человека нет ни Отчества ни Второго имени, а
     * есть только Имя и Фамилия, то возвращает их, разделённые
     * пробелом.
     *
     * @return имя человека в виде строки.
     */
    
    public String getFullName() {
        if ((secondName == null)&(patronymic == null)){           
            return name+ " " +surname;
        } else if(patronymic == null){
            return name+ " " +secondName.charAt(0)+ "." + " " +surname;
        } else 
            return surname+ " " +name+ " " +patronymic;
    }
    
    public String getAddress(){
        return address.getAddress();     
     }
}