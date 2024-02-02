public class Inheritance {
    public static void main(String args[]){
        Human H1 = new Human();
        H1.name = "Rahul";
        H1.intelligence();
        H1.walk();
    }
}
//Hybrid inheritance
class Animals {
    String type;
    String name;
    void eat(){
        System.out.println("Eats");
    }
    
}

class Bird extends Animals {
    void fly() {
        System.out.println("can fly");
    }
}

class Mammal extends Animals {
    void walk() {
        System.out.println("Walks");
    }
}

class Fish extends Animals {
    void Swim() {
        System.out.println("Swims");
    }
}

class Tuna extends Fish{
    void Edible(){
        System.out.println("Yes");
    }
}
class Shark extends Fish{
    void Danger(){
        System.out.println("can eat us");
    }
}

class Peacock extends Bird {
    void fly(){
        System.out.println("Cannot fly higher");
    }
}
class Dog extends Mammal{
    int legs;
}
class Cat extends Mammal{
    void sleep(){
        System.out.println("Whole Day");
    }
}
class Human extends Mammal{
    void intelligence(){
        System.out.println("IsIntelligent");
    }
}
