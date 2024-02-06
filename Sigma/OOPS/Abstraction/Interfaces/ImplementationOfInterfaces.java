public class ImplementationOfInterfaces {
    public static void main(String args[]){
        Gt800 C1 = new Gt800();
        C1.wheels();
        C1.operationModes();
        

        Fortuner ChapriF1 = new Fortuner();
        ChapriF1.operationModes();
        ChapriF1.autoMobiles("Fortuner", "KTM");

        Tesla T1 = new Tesla();
        T1.VeichleType = "FourWheeler";//"FourWheeler" is a value assigned to a static variable of a class so if we create any other instance of that class the same value for this variable will be assigned to it or if we change it's value for it same will be assigned to this one.



        TeslaMustang TM1 = new TeslaMustang();
        System.out.println(TM1.VeichleType);
        TM1.wheels();
        TM1.cc();

        T1.VeichleType = "Fourwheeler";

        System.out.println(TM1.VeichleType);
        System.out.println(T1.VeichleType);
        
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

class Tesla implements Cars {
    static String VeichleType;
    public void wheels(){
        System.out.println("Best for high speed and performance and also with some high tech features");
    }
    public void cc(){
        System.out.println(1550);
    }
    public void operationModes(){
        System.out.println("AutoPilot, Drive, AutoGear");
    }


}

class TeslaMustang extends Tesla {

}

class Fortuner implements Cars, Chapri {
    public void wheels(){
        System.out.println("Some above average tyre");
    }
    public void cc(){
        System.out.println(500);
    }

    public void faltuHawaBazi(){
        System.out.println("Aand na Paand ke gyan chode brahmand ke.");
    }
    public void autoMobiles(String Car, String Bike){
        System.out.println(Car + " " + Bike);
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

