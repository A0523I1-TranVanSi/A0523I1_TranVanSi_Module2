import java.util.Scanner;

public class swapValueArray {
    public static void main(String[] args) {
        int size ;
        int[] array;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter a size : ");
            size = sc.nextInt();
            if(size < 20 ) {
                System.out.println("Size dose not exceed 20");
            }
            }while (size < 20 );
            array = new int[size] ;
            int i = 0 ;
            while (i < array.length){
                System.out.println("Enter element " + (i + 1 ) + ": ");
                array[i] = sc.nextInt();
                i ++ ;
            }
            System.out.println("Elements in array : ");
            for (int j = 0; j < array.length ; j++) {
                System.out.println(array[j]);
            }
            for (int j = 0; j < array.length / 2 ; j++) {
                int temp = array[j];
                array[j] = array[size - 1 - j ];
                array[size - 1 - j ] = temp ;
            }
            System.out.println("Reverse array : ");
            for (int j = 0; j < array.length; j++) {
                System.out.println(array[j]);
            }
        }
    }
