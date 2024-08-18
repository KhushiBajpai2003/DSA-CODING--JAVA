package OOPS;

interface Animal{
    int eyes=2;
    void walk(); //interfaces k constructors nhi ho sakte
                 // koi non abstract func nhi hona chahiye na hi koi func ki implementation
}

interface Herbivore{

}
class Horse implements Animal, Herbivore{   // multiple inheritance is possible in interfaces
    public void walk(){
        System.out.println("walks on 4 legs");
    }
}
// abstract class Animal{
//    abstract void walk();
//    Animal(){
//        System.out.println("creating a new animal");
//    }
//    public void eats(){
//        System.out.println("Animal eats");
//    }
//}
//
//class Horse extends Animal{
//    public void walk(){
//        System.out.println("walks on 4 legs");
//    }
//    Horse(){
//        System.out.println("Created a Horse");
//    }
//        }
//
//class Chicken extends Animal{
//    public void walk(){
//        System.out.println("walks on 2 legs");
//    }
//}
public class Abstraction {   //user ko imp cheeze dikhana aur faltu cheeze chupa lena
    public static void main(String args[]){
      Horse h1 = new Horse();
      h1.walk();
//      h1.eats();
//      Animal animal = new Animal();  //OOPS.Animal is abstract; cannot be instantiated
//      animal.walk();
    }
}
//Constructor chaining--> chain of constructors being called --> phele base class ka phir sub class ka


// An abstract class must be declared with an abstract keyword
// It can have abstract and non-abstract methods
// It cannot be instantiated.
// It can have constructors and static methods also
// It can have final methods which will force the subclass not to change the body of the method

// Interfaces---> Pure abstraction
// All the fields in interfaces are public, static and final by default
// All methods are public and abstract by default
// It supports the functionality of multiple inheritance

// static keyword
// static saare obj k liye same hota hai use class k name se call kr sakte hai obj create krne ki jarurat nhi padti
// static cheezo ko ek hi baar memory di jaati hai

//class Student {
//   static String school;
//   String name;
//}
//
//
//public class OOPS {
//   public static void main(String args[]) {
//       Student.school = "JMV";
//       Student s1 = new Student();
//       Student s2 = new Student();
//
//
//       s1.name = "Meena";
//       s2.name = "Beena";
//
//
//       System.out.println(s1.school);
//       System.out.println(s2.school);
//   }
//}