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


        // Oobject Oriented Programming 
        Computer c = new Computer();
        int res = c.vowels("harshchafle");

        c.playMusic("violin");
        c.playMusic(9);
    }
}

class Computer {

    public static int vowels(String str){
        int count = 0;
        for(char ch : str.toCharArray()){
            if(ch == 'a' || ch=='e'||ch=='i'||ch=='o'||ch=='u') count++;
        }
        return count;
    }

    public void playMusic(String a){
        System.out.println("Music is Playing in String : "+a);
    }
    public int playMusic(int a){
        System.out.println("Music is Playing in Integer : "+a);
        return 0;
    }

    // Then we got the Method Overloading and Method Overriding part

    //1. Method Overloading : Methods with same name but different number of parameters

    //2. Method Overriding : Inherited class defining it own function which is available in parent class
}