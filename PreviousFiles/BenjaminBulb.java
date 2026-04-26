// Suppose we have n bulbs say 20 all bulbs initially off , in 1st turn all off bulbs are on then 2nd turn all even bulbs are turned (if on then off and if off then on) similarly turn three changes bulb state of multiple if three and so on until 20 . finally print the bulbss which are remained on.

// This concept works on no. of factors of perfect squares because perfect squares have odd no of factors while others have even number of factors so the initially off bulb will be on if odd no. of changes will be done and bulb with even no. of changes will be off.

import java.util.Scanner;

public class BenjaminBulb {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number of bulbs you have");
        int nob = scn.nextInt();
        // If initially all bulbs are off then print all perfect squares upto nob 
        // If initially all bulbs are on then print all no. except perfect squares
        System.out.println("On Bulbs are at Position :");
        for(int i=1; i*i<=nob; i++){
            System.out.println(i*i);
        }
    }
}
