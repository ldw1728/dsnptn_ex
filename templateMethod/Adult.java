package templateMethod;

public class Adult extends Person{

    public Adult(String name, int age) {
        super(name, age);
    }

    @Override
    public void drink() {
        System.out.println("drink alchol...");
    }
    
}
