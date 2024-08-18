package OOPS;

class Shape{           // inheritance increases the reusability of the code
    String color;// base class ---> parent class

    public void area(){
        System.out.println("Displays area");
    }
}

class Triangle extends Shape{  // sub class ---> child class
    public void area(int l, int h){
        System.out.println(1/2*l*h);
    }
}

class Circle extends Shape{
    public void area(int r){
        System.out.println((3.14)*r*r);
    }
}

class EquilateralTriangle extends Triangle{
    public void area(int l, int h){
        System.out.println(1/2*l*h);
    }
}
public class Inheritance {        // jab ek class dusri class ki properties ko lena chahti hai ..
    public static void main(String args[]){         // 4 Types --> single level, Multi level, Hierarchial, Hybrid
       Triangle t1 = new Triangle();
       t1.color = "red";
    }
}
