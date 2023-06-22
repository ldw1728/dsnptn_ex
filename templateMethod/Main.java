import templateMethod.*;

class Main{
    public static void main(String[] args) {
        Person child = new Child("ldw", 5);
        child.intro();
        Person adult = new Adult("kdw", 30);
        adult.intro();
    }
}