import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int a=0,b=1,c=0;
        int n=scn.nextInt();
        System.out.println(a);
        System.out.println(b);
        for(int i=0; i<=n; i++){
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;
            
        }
        scn.close();    

    }    
}
