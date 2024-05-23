import java.util.Scanner;

public class DigitsOfNum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Please enter your numbr :");
        int num = scn.nextInt();
        int digit = 0;
        int temp = num;
        while(temp != 0){
            temp /= 10;
            digit++;
        }
        int div = (int)Math.pow(10,digit-1);
        while(div != 0){
            int q = num / div;
            System.out.println(q);
            num %= div;
            div /= 10; 
        }
    }    
}
