import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();

        while(num > 0){
            int temp = num;
            temp %= 10;
            num /= 10;
            System.out.print(temp);
        }

    }
}
