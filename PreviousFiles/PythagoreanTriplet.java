import java.util.Scanner;

public class PythagoreanTriplet {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Please enter Three numbers :");
        int num1 = scn.nextInt();
        int num2 = scn.nextInt();
        int num3 = scn.nextInt();
        int max = num1;
        if(max < num2){
            max = num2;
        }
        if(max < num3){
            max = num3;
        }

        if(num1 == max){
            if(num1*num1 == num2*num2 + num3*num3){
                System.out.println(true);
            }
        }else if(num2 == max){
            if(num2*num2 == num1*num1 + num3*num3){
                System.out.println(true);
            }
        }else if(num3 == max){
            if(num3*num3 == num2*num2 + num1*num1){
                System.out.println(true);
            }
        }else{
            System.out.println(false);
        }
    }
}
