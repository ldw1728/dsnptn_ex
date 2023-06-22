package templateMethod;

public class Child extends Person{

    public Child(String name, int age) {
        super(name, age);
    }

    @Override
    public void drink() {
        System.out.println("drink milk...");
    }

 
    
}
