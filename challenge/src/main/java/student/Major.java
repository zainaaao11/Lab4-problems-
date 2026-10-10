package student;

import java.util.Locale;
public class Major {
    private static int nextId = 1;
    private int id;
    private String code;
    private String name;
    private Student[] students;
    private int studentCount;

    public Major(String code, String name) {
        this.id=nextId++;
        this.code=code;
        this.name=name;
        students= new Student[50];
        studentCount=0;
    }

    // Method to add a student
    public void addStudent(Student s) {
        for (int i=0; i<students.length; i++){
            if (students[i]==null){
                students[i]=s;
                studentCount++;
                break;
            }
        }
    }

    // Getters
    public int getStudentCount(){
        return studentCount;
    }
    public String getCode(){
        return this.code;
    }
    public String getName(){
        return this.name;
    }
    public Student[] getStudents(){
        return students;
    }


    // Display all students in the major
    public void displayStudents() {
        //we will use the getStudentListAsString() which returns a StringBuilder containing the fullname of all the students in the major
        System.out.printf("The list of students in the %s major is: %n", this.name);
        for (Student s: students){
            System.out.println(s.toString());
        }
    }

    public Boolean findStudentByCNE(String cne){
        Boolean flag=null;
        for (Student s: students){
            if (s!=null){
                if (s.getCne().equalsIgnoreCase(cne)){
                    flag= true;
                    break;
                }
            }
        }
        return flag;
    }


    public boolean removeStudent(String cne){
        boolean flag=false;
        int indx=0; //safe because we first check if the element exist so if does this idx will be changed to the real position where the element was found
        if (findStudentByCNE(cne)==null){
            return flag;
        }
        for (int i=0; i<students.length-1; i++){
            if (students[i]!=null){
                if (students[i].getCne().equalsIgnoreCase(cne)){
                    flag=true;
                    indx=i;
                    break;
                }
            }
        }
        for (int j=indx; j<students.length-1; j++){
            students[j]=students[j+1];
        }
        students[students.length-1]=null;
        studentCount--;
        return flag;
    }

    public void getOccupancyRate(){
        double occupancyRate=(double) (studentCount*100)/students.length;
        System.out.println(this.toString());
        System.out.printf("Occupancy rate = %.2f%% %n", occupancyRate);
    }

    public StringBuilder getStudentListAsString(){
        StringBuilder sb= new StringBuilder();
        for (Student s: students){
            sb.append(s.getFullNameFormatted());
            sb.append("%n");
        }
        return sb;
    }

    @Override
    public String toString(){
        return this.name+" capacity: "+students.length+" students%n"+"Current enrollment: "+studentCount+" students";
    }

}
