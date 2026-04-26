public class Hello {
    public static void main(String[] args){
        System.out.println("1. Remember Jshell");
        System.out.println("   Run jshell on terminal and write any code line of java\n\tJava is Platform Independent -> It can run application on any machine but that machine shold have JVM\n\tBut JVM itself is Platform dependent -> JVM can't run on ios : application is independent but JVM is not");

        System.out.println("2. So compiler converts source code into bytecode\n\tthen JVM converts bytecode into machine code\n\tSo java is platform independent because of bytecode but JVM is platform dependent because it converts byte code into machine code\n\tJAVA_CODE -> COMPILER -> BYTE_CODE -> JVM -> MACHINE_CODE");

        System.out.println("3. JVM (Java Virtual Machine) is responsible for executing the bytecode\n\tJRE (Java Runtime Environment) is a software package that provides the necessary libraries and components to run Java applications");

        System.out.println("4. JDK (Java Development Kit) is a software development kit that includes the JRE and additional tools for developing Java applications\n\tJDK includes JRE + Compiler + Debugger + other tools");      

        System.out.println("5. Java is a high-level, object-oriented programming language that is widely used for developing a variety of applications, including web applications, mobile applications, and enterprise software\n\tJava is known for its platform independence, security features, and robustness");   

        System.out.println("6. Java is a statically-typed language, which means that variable types must be declared at compile time\n\tThis allows for better performance and type safety, as the compiler can catch type-related errors before the program is run");

        System.out.println("7. Java supports object-oriented programming (OOP) principles, such as abstraction,encapsulation, inheritance, and polymorphism\n\tThis allows developers to create modular and reusable code, making it easier to maintain and extend applications\n\t1. Abstraction: Hiding complex implementation details and showing only the necessary features of an object\n\t2. Encapsulation: Bundling data and methods that operate on that data within a single unit (class) and restricting access to some of the object's components\n\t3. Inheritance: The mechanism by which one class can inherit properties and behaviors (fields and methods) from another class\n\t4. Polymorphism: The ability of different classes to be treated as instances of the same class through inheritance, allowing for dynamic method binding");  

        // Variables and Data Types : Variable is the storage that holds data in a program. It has a name, a type, and a value. Data types specify the type of data that a variable can hold, such as int, double, String, etc.

        // byte - 1 byte (-128 to 127)
        // short - 2 bytes (-2^15 to 2^15-1)
        // int - 4 bytes (-2^31 to 2^31-1)
        // long - 8 bytes (-2^63 to 2^63-1)
        // float - 4 bytes (single-precision floating-point)
        // double - 8 bytes (double-precision floating-point)
        // char - 2 bytes (single Unicode character)

        int num1 = 10;
        byte num2 = 100;
        short num3 = 30000;
        // Defaultly Java treats integer literals as int, so we need to suffix 'L' to indicate that it's a long
        long num4 = 10000000000L;
        // Defaultly Java treats floating-point literals as double, so we need to suffix 'f' to indicate that it's a float  
        float num5 = 3.14f;
        double num6 = 3.141592653589793;                
        System.out.println(num1+"\n"+num2+"\n"+num3+"\n"+num4+"\n"+num5+"\n"+num6);

        int bin = 0b1010; // Binary literal (10 in decimal)
        int oct = 012; // Octal literal (10 in decimal)
        int hex = 0xA; // Hexadecimal literal (10 in decimal)
        System.out.println(bin+"\n"+oct+"\n"+hex);  

        double x = 12e3; // Scientific notation (12 * 10^3 = 12000)
        System.out.println(x);

    }
}