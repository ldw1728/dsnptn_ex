package templateMethod;

public abstract class Person {

    private String  name;
    private int     age;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void intro(){
        System.out.println("I'm " + this.name + " and " + this.age + " years old");
        drink();
    }
    
    public abstract void drink();
}
