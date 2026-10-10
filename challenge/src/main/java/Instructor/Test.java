package Instructor;

public class Test {
    public static void main(String[] args) {

        Instructor instructor = new Instructor("John", "Smith", "0612345678", "john.smith@gmail.com", " AB 123 ", null);
        Instructor inst=new Instructor(null, "man", "06169378", "man@gmail.com", "AP45", null);
        Subject s1 = new Subject(" cs- 101 ", "introduction to java", instructor);
        System.out.println(instructor.cleanEmployeeNumber());
        // AB123
        System.out.println(s1.normalizedCode());
        // CS-101
        System.out.println(s1.properTitle());
        // Introduction To Java
        System.out.println(instructor.summaryLine());
        System.out.println(s1.isIntroCourse());
        // true
        System.out.println(instructor.toCard());
        System.out.println(s1.syllabusLine());
        System.out.println(inst.displayName());
    }
}