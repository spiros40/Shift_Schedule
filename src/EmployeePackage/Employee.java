package EmployeePackage;

import java.util.Date;

public class Employee {


    private int ID;
    private String FirstName;
    private String LastName;
    private String Department;
    private String Profession;
    private Date BirthDate;
    private int PhoneNumber;
    private String HomeAddress;
    private int AMKA;
    private int AFM;
    private int AMA;
    private String WorkAtShift;

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public String getProfession() {
        return Profession;
    }

    public void setProfession(String profession) {
        Profession = profession;
    }

    public Date getBirthDate() {
        return BirthDate;
    }

    public void setBirthDate(Date birthDate) {
        BirthDate = birthDate;
    }

    public int getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public String getHomeAddress() {
        return HomeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        HomeAddress = homeAddress;
    }

    public int getAMKA() {
        return AMKA;
    }

    public void setAMKA(int AMKA) {
        this.AMKA = AMKA;
    }

    public int getAFM() {
        return AFM;
    }

    public void setAFM(int AFM) {
        this.AFM = AFM;
    }

    public int getAMA() {
        return AMA;
    }

    public void setAMA(int AMA) {
        this.AMA = AMA;
    }

    public String getWorkAtShift() {
        return WorkAtShift;
    }

    public void setWorkAtShift(String workAtShift) {
        WorkAtShift = workAtShift;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }




    public Employee(int ID, String firstName, String lastName, String department, String profession,
                    Date birthDate, int phoneNumber, String homeAddress, int AMKA, int AFM, int AMA,
                    String workAtShift) {
        this.ID = ID;
        FirstName = firstName;
        LastName = lastName;
        Department = department;
        Profession = profession;
        BirthDate = birthDate;
        PhoneNumber = phoneNumber;
        HomeAddress = homeAddress;
        this.AMKA = AMKA;
        this.AFM = AFM;
        this.AMA = AMA;
        WorkAtShift = workAtShift;
    }
}
