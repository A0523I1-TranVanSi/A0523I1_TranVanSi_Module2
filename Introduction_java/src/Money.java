import java.util.Scanner;

public class Money {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double vnd = 23000 ;
        double usd ;
        System.out.println("Enter usd : ");
        usd = sc.nextDouble();
        double swapMoney = usd * vnd ;
        System.out.println(" VND : " + swapMoney);
    }
}
