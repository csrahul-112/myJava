public class Constructor {
    public static void main(String args[]){
        Student s1 = new Student("Takla", "X");
        s1.roll = 88008828;
        System.out.println(s1.name + " " + s1.roll + " " + s1.gender);
        s1.marks[0] = 22;
        s1.marks[1] = 29;
        s1.marks[2] = 24;

        Student s2 = new Student(s1);

        s1.name  = "Wali";
        s1.marks[0] = 28;

        System.out.println(s1.name);
        System.out.println(s2.name);
        for(int i = 0; i < 3; i++){
            System.out.println(s2.marks[i] + " ");
        }
    }
}

class Student {
    String name;
    int roll;
    String gender;
    int marks[];
    //Shallow copy constructor
    // Student (Student s1){
    //     marks = new int[3];
    //     this.name = s1.name;
    //     this.marks = s1.marks;
    // }

    //Deep copy constructor
    Student (Student s1){
        marks = new int[3];
        this.name = s1.name;
        for(int i = 0; i < 3; i++){
            this.marks[i] = s1.marks[i];
        }
    }


    Student(String name, String gender){
        marks = new int[3];
        this.name = name;
        this.gender = gender;
    }
}