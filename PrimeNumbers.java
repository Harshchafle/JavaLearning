import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Please enter the rannge from 1 to ? ");
        int range = scn.nextInt();
        int count=0;
        for(int i=1; i<=range; i++){
            for(int j=2; j<i; j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count ==0 ){
                System.out.print(i);
            }
            count = 0;
        }
    }    
}
