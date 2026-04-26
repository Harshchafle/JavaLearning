// Type conversion and typecasting
public class Lecture2 {
    public static void main(String[] args){

        int a = 270;
        byte b = 12;

        // 1. Type conversion (widening) : Automatic conversion of a smaller data type to a larger data type
        // a = b;

        // 2. Typecasting (narrowing) : Manual conversion of a larger data type to a smaller data type
        b = (byte) a; // This can lead to data loss if the value of 'a' exceeds the range of 'byte' (-128 to 127)
        System.out.println(b); // Output will be 14 due to overflow (270 - 256 = 14) Modulo operation

        // 3. Type promotion in expressions : When performing operations on mixed data types, Java promotes the smaller data type to the larger data type
        byte x = 10;
        byte y = 20;
        // byte z = x * y; // This will cause a compilation error because the result of the expression is promoted to 'int'
        int z = x*y;

        

    }
}