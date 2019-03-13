package ru.avalon.java.dev.j10.labs.models;

/**
 * Представление о паспортных данных человека.
 * <p>
 * Паспортные данные должны включать:
 * <ol>
 *  <li> серию и номер документа;
 *  <li> имя;
 *  <li> фамилию;
 *  <li> отчество;
 *  <li> второе имя;
 *  <li> день рождения;
 *  <li> дату выдачи;
 *  <li> орган, выдавший документ.
 * </ol>
 */

public class Passport {
        
    private int seriesAndNumber;
    private String name;
    private String surname;
    private String patronymic;
    private String secondName;
    private String birthDate;
    private String dateOfIssue;
    private String issuingAuthority;
    
    public Passport(Person person){
        
        name = person.getName();
        surname = person.getSurname();
        patronymic = person.getPatronymic();
        secondName = person.getSecondName();
      
    }
    
    public Passport (int seriesAndNumber , String birthDate, String dateOfIssue, String issuingAuthority){
       
        this.seriesAndNumber = seriesAndNumber;
        this.birthDate = birthDate;
        this.dateOfIssue = dateOfIssue;
        this.issuingAuthority = issuingAuthority;       
    }
   
   //get
    
    public int getSeriesAndNumber(){
        return seriesAndNumber;
    }
    public String getBirthDate(){
        return birthDate;
    }
    public String getDateOfIssue(){
        return dateOfIssue;
    }
    public String getIssuingAuthority(){
        return issuingAuthority;
    }
    
}

   
