import java.util.Scanner;

public class readNumberToString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number read : ");
        int number = sc.nextInt();

        if(number < 0 || number > 999){
            System.out.println("out of ability");
        }

        if( number < 10 && number > 0 ){
            switch (number){
                case 1 :
                    System.out.println("One");
                    break;
                case 2 :
                    System.out.println("Two");
                    break;
                case 3 :
                    System.out.println("Three");
                    break;
                case 4 :
                    System.out.println("Four");
                    break;
                case 5 :
                    System.out.println("five");
                    break;
                case 6 :
                    System.out.println("Six");
                    break;
                case 7 :
                    System.out.println("Seven");
                    break;
                case 8 :
                    System.out.println("Eight");
                    break;
                case 9 :
                    System.out.println("Nine");
                    break;
                default:
                    System.out.printf("");
            }
        }
        if( number < 20 && number >= 10 ){
            switch (number){
                case 10 :
                    System.out.println("Ten");
                    break;
                case 11 :
                    System.out.println("Eleven");
                    break;
                case 12 :
                    System.out.println("twelve");
                    break;
                case 13 :
                    System.out.println("Thirteen");
                    break;
                case 14 :
                    System.out.println("Fourteen");
                    break;
                case 15 :
                    System.out.println("Fifteen");
                    break;
                case 16 :
                    System.out.println("Sixteen");
                    break;
                case 17 :
                    System.out.println("Seventeen");
                    break;
                case 18 :
                    System.out.println("Eighteen");
                    break;
                case 19 :
                    System.out.println("Nineteen");
                    break;
            }
        }
        if( number < 100 && number >= 20 ){
             int firstNumber = number / 10 ;
             int lastNumber = number % 10 ;
             String firstNumberString ="" ;
             String lastNumberString = "";
             switch (firstNumber){
                 case 2 :
                     firstNumberString = "Twenty";
                     break;
                 case 3 :
                     firstNumberString = "Thirty";
                     break;
                 case 4 :
                     firstNumberString = "Forty";
                     break;
                 case 5 :
                     firstNumberString = "Fifty";
                     break;
                 case 6 :
                     firstNumberString = "Sixty";
                     break;
                 case 7 :
                     firstNumberString = "Seventy";
                     break;
                 case 8 :
                     firstNumberString = "Eighty";
                     break;
                 case 9 :
                     firstNumberString = "Ninety";
                     break;
             }
             switch (lastNumber){
                 case 0 :
                     lastNumberString = "" ;
                     break;
                 case 1 :
                     lastNumberString = "one" ;
                     break;
                 case 2 :
                     lastNumberString = "two" ;
                     break;
                 case 3 :
                     lastNumberString = "three" ;
                     break;
                 case 4 :
                     lastNumberString = "four" ;
                     break;
                 case 5 :
                     lastNumberString = "five" ;
                     break;
                 case 6 :
                     lastNumberString = "six" ;
                     break;
                 case 7 :
                     lastNumberString = "seven" ;
                     break;
                 case 8 :
                     lastNumberString = "eight" ;
                     break;
                 case 9 :
                     lastNumberString = "nine" ;
                     break;
             }
             String convertFirstAndLast = firstNumberString + lastNumberString ;
            System.out.println(convertFirstAndLast);
        }
        if(number >= 100 && number < 999){
            int firstNumber = number / 100 ;
            int twoNumber = number % 100 ;
            String twoNumberString = "";
            String firstNumberString = "";
            int twoNumberFirst = twoNumber / 10 ;
            int twoNumberLast = twoNumber % 10 ;
            String twoNumberFirstString = "" ;
            String twoNumberLastString = "";
            switch (firstNumber){
                case 1 :
                    firstNumberString = "one hundred" ;
                    break;
                case 2 :
                    firstNumberString = "two hundred" ;
                    break;
                case 3 :
                    firstNumberString = "three hundred" ;
                    break;
                case 4 :
                    firstNumberString = "four hundred" ;
                    break;
                case 5 :
                    firstNumberString = "five hundred" ;
                    break;
                case 6 :
                    firstNumberString = "six hundred" ;
                    break;
                case 7 :
                    firstNumberString = "seven hundred" ;
                    break;
                case 8 :
                    firstNumberString = "eight hundred" ;
                    break;
                case 9 :
                    firstNumberString = "nine hundred" ;
                    break;
            }
            switch (twoNumber){
                case 10 :
                    twoNumberString = "Ten";
                    break;
                case 11 :
                    twoNumberString = "Eleven";
                    break;
                case 12 :
                    twoNumberString = "Twelve";
                    break;
                case 13 :
                    twoNumberString = "Thirteen";
                    break;
                case 14 :
                    twoNumberString = "Fourteen";
                    break;
                case 15 :
                    twoNumberString = "Fifteen";
                    break;
                case 16 :
                    twoNumberString = "Sixteen";
                    break;
                case 17 :
                    twoNumberString = "Seventeen";
                    break;
                case 18 :
                    twoNumberString = "Eighteen";
                    break;
                case 19 :
                    twoNumberString = "Nineteen";
                    break;
            }
            switch (twoNumberFirst){
                case 2 :
                    twoNumberFirstString = "Twenty";
                    break;
                case 3 :
                    twoNumberFirstString = "Thirty";
                    break;
                case 4 :
                    twoNumberFirstString = "Forty";
                    break;
                case 5 :
                    twoNumberFirstString = "Fifty";
                    break;
                case 6 :
                    twoNumberFirstString = "Sixty";
                    break;
                case 7 :
                    twoNumberFirstString = "Seventy";
                    break;
                case 8 :
                    twoNumberFirstString = "Eighty";
                    break;
                case 9 :
                    twoNumberFirstString = "Ninety";
                    break;
            }
            switch (twoNumberLast){
                case 0 :
                    twoNumberLastString = "" ;
                    break;
                case 1 :
                    twoNumberLastString = "one" ;
                    break;
                case 2 :
                    twoNumberLastString = "two" ;
                    break;
                case 3 :
                    twoNumberLastString = "three" ;
                    break;
                case 4 :
                    twoNumberLastString = "four" ;
                    break;
                case 5 :
                    twoNumberLastString = "five" ;
                    break;
                case 6 :
                    twoNumberLastString = "six" ;
                    break;
                case 7 :
                    twoNumberLastString = "seven" ;
                    break;
                case 8 :
                    twoNumberLastString = "eight" ;
                    break;
                case 9 :
                    twoNumberLastString = "nine" ;
                    break;
            }
            if( twoNumber >= 10 && twoNumber < 20){
                String convertAll1 = firstNumberString + twoNumberString;
                System.out.println(convertAll1);
            }else {
                String convertTwoNumber = twoNumberFirstString + twoNumberLastString;
                String convertAll2 = firstNumberString + convertTwoNumber;
                System.out.println(convertAll2);
            }
        }

    }
}
