import java.util.Scanner;

public class interestRate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double money , interestRate ;
        int month ;
        double totalInterest = 0 ;
        System.out.println("Enter money : ");
        money = sc.nextDouble();

        System.out.println("Enter month : ");
        month = sc.nextInt();

        System.out.println("Enter interestRate");
        interestRate = sc.nextDouble();

        for (int i = 0; i < month; i++) {
            totalInterest += money * (interestRate/100)/12 * month ;
        }

        System.out.println("Total of interest : " + totalInterest);
    }
}
