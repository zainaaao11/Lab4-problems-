package Instructor;
import student.Person;

public class Instructor extends Person {
    private String employeeNumber;
    private Subject subject;
    public Instructor(String firstname, String lastname, String phone, String email, String employeeNumber, Subject subject){
        super(firstname, lastname, phone, email);
        this.employeeNumber=employeeNumber;
        this.subject=subject;
    }
    //getters and setters first
    public String getEmployeeNumber(){
        return this.employeeNumber;
    }
    public Subject getSubject(){
        return this.subject;
    }
    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber=employeeNumber;
    }
    public void setSubject(Subject subject){
        this.subject=subject;
    }
    public String cleanEmployeeNumber(){
        return this.employeeNumber.replace(" ", "");
    }
    public String summaryLine(){
        return String.format("Instructor[employeeNumber= %s, lastName= %s, firstName= %s]", this.employeeNumber, this.secondName, this.firstName);
    }
    public String toCard(){
        StringBuilder sb=new StringBuilder();
        String str=String.format("Instructor\nEmployee#: %s\nName: %s, %s\nEmail: %s\nPhone: %s\n", this.employeeNumber,this.secondName, this.firstName, this.email, this.phone);
        sb.append(str);
        return sb.toString();
    }
    public String displayName(){
        StringBuilder sb=new StringBuilder();
        sb.append((this.firstName==null && this.secondName==null)? "No name": ((this.secondName!=null)? String.format("Last name: %s", this.secondName): String.format("First name: %s", this.firstName)));
        return sb.toString();
    }
}
