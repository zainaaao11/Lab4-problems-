package student;
public class Test {
    public static void main(String[] args) {

        Major cs = new Major("23", "Computer Science");
        Major industrial = new Major("24", "Industrial Engineering");

        Student s1 = new Student("Samir", "Ali", "0611111111", "ali@gmail.com", "CNE001", cs);

        Student s2 = new Student("Alami", "Sara", "0622222222", "sara@gmail.com", "CNE002", cs);

        Student s3 = new Student("Karim", "Yassine", "0633333333", "yassine@gmail.com", "CNE003", industrial);
        cs.addStudent(s1);
        cs.addStudent(s2);

        System.out.println(s1.getFullNameFormatted());

        System.out.println("CS students: " + cs.getStudentCount());

        System.out.println("Found: " + cs.findStudentByCNE("CNE002"));
        System.out.println("Found: " + cs.findStudentByCNE("CNE063")); //returns null because no student has this cne

        System.out.println("Remove CNE002: " + cs.removeStudent("CNE002"));
        System.out.println("Found: " + cs.findStudentByCNE("CNE002")); //returns null since the student was removed
        System.out.println("Remove CNE063: " + cs.removeStudent("CNE063")); //returns false because no student with that cne exist

        System.out.println("CS students after removal: "+ cs.getStudentCount());

        cs.getOccupancyRate();
    }
}