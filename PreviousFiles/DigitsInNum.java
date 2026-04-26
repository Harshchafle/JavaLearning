import java.util.Scanner;

public class DigitsInNum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter your number ");
        int num = scn.nextInt();
        int digit=0;
        while(num != 0){
            digit++;
            num /= 10;
        }    
        System.out.println(digit);
        scn.close();
    }    
}
