package student;


import java.util.Locale;

public class Student extends Person {
    private static final Major DEFAULT_MAJOR=new Major("code: 23", "Computer science");
    private String cne;
    private Major major;
    private static int next=1;
    private int id;

    public Student(String nom, String prenom, String telephone, String email, String cne, Major major) {
        super(prenom, nom, telephone, email);
        this.cne=cne;
        this.major=major;
        id=next++;
    }
    public Student(String nom, String prenom, String telephone, String email, String cne) {
        this(nom, prenom, telephone, email, cne, Student.DEFAULT_MAJOR);
    }


    // Getters
    public String getFullNameFormatted(){
        String lastNameUpper=this.secondName.toUpperCase();
        return String.format("%s , %s", lastNameUpper, firstName);
    }
    public String getCne(){
        return this.cne;
    }

    public Major getMajor(){
        return this.major;
    }

   // Setters
    public void setMajor(Major major){
        this.major=major;
    }
    public void setCne(String cne){
        this.cne=cne;
    }

    //toString method
    @Override
    public String toString(){
        return this.id+". "+this.cne+" "+this.getFullNameFormatted();
    }
}

