package Instructor;

public class Subject {
    private static int next=0;
    private int id;
    private String code;
    private String title;
    private Instructor instructor;
    public Subject(String code, String title, Instructor instructor){
        this.code=code;
        this.title=title;
        this.instructor=instructor;
        this.id=next++;
    }
    //getters and setters first
    public int getId(){
        return this.id;
    }
    public String getCode(){
        return this.code;
    }
    public String getTitle(){
        return this.title;
    }
    public Instructor getInstructor(){
        return this.instructor;
    }
    public void setCode(String code){
        this.code=code;
    }
    public void setTitle(String title){
        this.title=title;
    }
    public void setInstructor(Instructor instructor){
        this.instructor=instructor;
    }
    public String normalizedCode(){
        return this.code.replace(" ", "").toUpperCase();
    }
    public String properTitle(){
        String[] splittedTitle=this.title.split(" ");
        for (int i=0; i<splittedTitle.length; i++){
            splittedTitle[i]=splittedTitle[i].substring(0, 1).toUpperCase()+splittedTitle[i].substring(1);
        }
        return String.join(" ", splittedTitle);
    }
    public boolean isIntroCourse(){
        return properTitle().contains("Intro") || this.code.startsWith("INTRO-");
    }
    public String syllabusLine(){
        StringBuilder sb=new StringBuilder();
        sb.append(String.format("%s - %s (Instructor: %s %s)", normalizedCode(), properTitle(), this.instructor.getSecondName(), this.instructor.getFirstName()));
        return sb.toString();
    }







}
