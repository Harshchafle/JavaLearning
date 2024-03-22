import java.util.*;

class Calculator{
    int a = 20;
    int b = 10;
    public static void main(String args[]){
        Calculator c1 = new Calculator();
        c1.add();
        c1.sub();
        c1.mul();
        c1.div();
    }

    int add(){
        return a+b;
    } 
    int sub(){
        return a-b;
    }
    int mul(){
        return a*b;
    }
    int div(){
        return a/b;
    }
    
}