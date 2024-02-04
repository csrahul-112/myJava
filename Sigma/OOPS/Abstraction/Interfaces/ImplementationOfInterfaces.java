public class ImplementationOfInterfaces {
    public static void main(String args[]){
        Gt800 C1 = new Gt800();
        C1.wheels();
        C1.operationModes();
    }
}

interface Cars {
    void wheels();
    void cc();
    void operationModes();

}

interface Chapri {
    void faltuHawaBazi();
    void autoMobiles(String car, String Bike);
}

abstract class lamborghini {
    void wheels(){
        System.out.println("Best type for high speed and performance");
    }
    void operationModes(){
        System.out.println("Drive Only No AutoPilot");
    }
}

class Tesla {
    void wheels(){
        System.out.println("Best for high speed and performance and also with some high tech features");
    }
}

class Fortuner implements Cars, Chapri {
    public void wheels(){
        System.out.println("Some above average wheels");
    }
    public void cc(){
        System.out.println(500);
    }

    public void faltuHawaBazi(){
        System.out.println("Aand na Paand ke gyan chode brahmand ke.");
    }
    public void autoMobiles(String Car, String Bike){
        Car = "Fortuner";
        Bike = "Ktm";
    }
    public void operationModes(){
        System.out.println("Khud hi bakchodi krte firte hai petrol jalate hue.");
    }
}

class Gt800 extends lamborghini {
    void wheels(){
        System.out.println("Nothing less then the racing car wheels");
    }
}

