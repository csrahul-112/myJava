public class ClassNObject {
    public static void main(String args[]){
        Pen p1 = new Pen();

        p1.name = "Jupiter";
        p1.color = "red";

        p1.setTip(6);

       
        System.out.println(p1.getTip());
        System.out.println(p1.getName());
    }
}

class Pen {
    String name;
    String color;
    private int tip;

    void setTip(int tip){
        this.tip = tip;
    }
    int getTip(){
        return tip;
    }

    void setName(String name){
        this.name = name;
    }
    String getName(){
        return this.name;
    }

    void setColor(String color){
        this.color = color;
    }
    String getColor(){
        return this.color;
    }
}