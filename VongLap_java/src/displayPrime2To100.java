import java.util.Scanner;

public class displayPrime2To100 {
    public static void main(String[] args) {
        for (int num = 2; num <= 100 ; num++) {
            if(isPrime(num)){
                System.out.println(num);
            }
        }
    }
    public static boolean isPrime(int num){
        if( num <= 1 ){
            return false;
        }else {
            for (int i = 2; i <= Math.sqrt(num) ; i++) {
                if (num%i == 0 )
                    return false;
            }
        }
        return true;
    }
}
