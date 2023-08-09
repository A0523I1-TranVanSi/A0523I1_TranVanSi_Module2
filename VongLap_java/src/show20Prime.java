import java.awt.*;
import java.util.Scanner;

public class show20Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int number = sc.nextInt();
        int count = 0 ;
        int N = 2 ;

        while ( count < number ){
            if(isPrime(N)){
                System.out.println(N);
                count ++ ;
            }
            N ++ ;
        }
    }
    public static boolean isPrime(int N){
        if( N <= 1 ){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(N) ; i++) {
            if( N % i == 0 ){
                return false;
            }
        }
        return true;
    }
}
