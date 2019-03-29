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
        
    private String seriesAndNumber;
    private String birthDate;
    private String dateOfIssue;
    private String issuingAuthority;
    

      
    public Passport (String seriesAndNumber , String birthDate, String dateOfIssue, String issuingAuthority){
        this.seriesAndNumber = seriesAndNumber;
        this.birthDate = birthDate;
        this.dateOfIssue = dateOfIssue;
        this.issuingAuthority = issuingAuthority;       
    }

    public String getSeriesAndNumber() {
        return seriesAndNumber;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getDateOfIssue() {
        return dateOfIssue;
    }

    public String getIssuingAuthority() {
        return issuingAuthority;
    }
    
    public String getPassport(){
       return birthDate + " " + dateOfIssue + " " + issuingAuthority + " " +
               seriesAndNumber;
    }

    public void setSeriesAndNumber(String seriesAndNumber) {
        this.seriesAndNumber = seriesAndNumber;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public void setDateOfIssue(String dateOfIssue) {
        this.dateOfIssue = dateOfIssue;
    }

    public void setIssuingAuthority(String issuingAuthority) {
        this.issuingAuthority = issuingAuthority;
    } 
}
