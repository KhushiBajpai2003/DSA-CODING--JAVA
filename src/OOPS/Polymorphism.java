package OOPS;

class Students{
    String name;
    int age;

    public void printInfo(String name){  // Func overloading --> diff func with same name in same class
        System.out.println(name);      // yaa toh retun type alag hona chahiyee har func ka yaa phir no. of argu alag hone chahiye
                                      // aur agar retun type aur no. of arg same hai tohh datatype of argu alag hona chahiye
    }

    public void printInfo(int age){
        System.out.println(age);
    }

    public void printInfo(String name, int age){
        System.out.println(name +" "+ age);
    }
}
public class Polymorphism {     //poly--> many   morphism--> forms
     public static void main(String args[]){
         Students s1 = new Students();
         s1.name = "Khushi";
         s1.age = 21;

         s1.printInfo(s1.name, s1.age);
     }                               // 2 types -- Func overloading(compile time) & Func overriding(runtime time)
}
