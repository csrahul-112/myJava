public class Abstraction {
    static int n;
    static{
        n = 5;
    }

    // n = 5;  --> cannot initialize n like this because it's a static variable we can do so in a static block like above

    public static void main(String args[]){
        Arabians chetak = new Arabians();
        System.out.println(chetak.color);
        


    }
}

abstract class Animal {
    String color;

    Animal(){
        System.out.println("Animal constructor is called.");
        color = "red";
    }
    void eats() {
        System.out.println("Animal eats to live");
    }

    abstract void live();
        
}

class Horse extends Animal {
    Horse(){
        System.out.println("Horse constructor is called.");
        
    }
    void live(){
        System.out.println("15 to 20 years.");
    }
    void changeColor(){
        color = "Brown";
    }
}

class Arabians extends Horse {
    Arabians(){
        System.out.println("Arabians is a popular horse breed");
        color = "White";
    }
}