import java.util.Scanner;

public class studentPass {
    public static void main(String[] args) {
        int size ;
        int[] arr ;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("Enter a size : ");
            size = sc.nextInt();
            if ( size > 30 ){
                System.out.println("Size should not exceed 30");
            }
        }while (size > 30 );

        arr = new int[size];
        int i = 0 ;
        while ( i < arr.length ){
            System.out.print("Enter a mark studen " +(i+1)+" :");
            arr[i] = sc.nextInt();
            i++ ;
        }
        int count =  0 ;
        System.out.print("List of mark : ");
        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]);
            if (arr[j] >= 5 && arr[j] <= 10){
                count++;
            }
        }
        System.out.println("The number of the students passing the exam is : "+ count);
    }
}
