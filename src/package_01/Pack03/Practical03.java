class Employee{  // Parent Class   SUPER Code   Base Code
    float salary;

    void show(){
        System.out.println("Show from Employee. " + salary);
    }

    protected void greet(){
        System.out.println("Greet from Employee");
    }
}

class Developer extends Employee{  // Child class   Derived code   Inheritence 
    int bonus = 30000;

    void show(){ // Function Override
        System.out.println("Developer Salary " + salary);
        System.out.println("Developer Bonus " + bonus);
    }
}

class Practical03{
    public static void main(String ...args){
        System.out.println("-----------------------------------------");
        Employee e2 = new Employee(); 
        e2.salary = 70000;
        e2.show();
        e2.greet(); 

        System.out.println("-----------------------------------------");
        Developer d = new Developer(); 
        d.salary = 90000;
        d.show(); 
        d.greet();

        System.out.println("-----------------------------------------");
        Employee e = new Developer();  // Super class reference into Stack memory to Derived class object in Heap memory
        e.salary = 80000;
        e.show(); // Method Overriding or Late Binding or Dynamic Polymorphism
        // Upcasting is possible in C++ as well as JAVA
        e.greet();

        System.out.println("-----------------------------------------");
        // Developer d2 = new Employee();  // Downcasting is not possible in JAVA  but in C++
        // d2.salary = 90000;
        // d2.show(); 

        
        // System.out.println("-----------------------------------------");
    }
}