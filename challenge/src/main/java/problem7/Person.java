package problem7;

public class Person {
    private String name;
    public Person(String name){ this.name=name; }
    //getters&setters
    public String getName(){ return this.name; }
    public void setName(String name){ this.name=name; }
    public void display(){
        System.out.printf("i am %s the %s\n", this.name, this.getClass().getSimpleName());;
    }
}
