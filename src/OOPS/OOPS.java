package OOPS;

class Pen{
    String color;
    String Type;  // ballpoint, gel

    public void write(){
        System.out.println("Writing Something");
    }

    public void printcolor(){
        System.out.println(this.color);
    }
}

class Student {
    String name;
    int age;

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    //    Student(String name, int age){     // parameterized Constructor defined by user
//        this.name = name;
//        this.age = age;
//    }
    Student(Student s3) {     // copy Constructor defined by user
        this.name = s3.name;
        this.age = s3.age;
    }
    Student(){

    }
}

public class OOPS {
    public static void main(String args[]){
        Pen pen1 = new Pen();  // non parameterized Constructor / default constructor
        pen1.color="blue";
        pen1.Type="gel";

        Pen pen2 = new Pen();
        pen2.color="black";
        pen2.Type="ballpoint";

//        pen1.printcolor();
//        pen2.printcolor();

//        Student s1 = new Student();
//        s1.name = "Khushi";
//        s1.age=21;

//        Student s2 = new Student("Khushi", 21);

        Student s1 = new Student();
        s1.name = "Khushi";
        s1.age=21;

        Student s3 = new Student(s1);
        s3.printInfo();
    }
}
