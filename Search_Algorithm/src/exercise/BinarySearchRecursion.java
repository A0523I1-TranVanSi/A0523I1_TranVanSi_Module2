package exercise;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchRecursion {
    public static int binarySearch(int[] array , int left ,int right , int value   ){
        if (left <= right){
            int middle = left + (right - left) / 2 ;
            if (array[middle] == value){
                return middle ;
            }else if (value > array[middle]){
                return binarySearch(array , middle + 1 , right , value );
            }
            return binarySearch(array , left  , middle - 1 , value );
        }
        return - 1 ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array : ");
        int number = sc.nextInt();
        int[] array = new int[number] ;
        System.out.println("Enter the elements of the array : ");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("Enter the value to search for : ");
        int value = sc.nextInt();

        Arrays.sort(array);
        int result = binarySearch(array, 0 , number - 1 , value);
        if (result != -1 ){
            System.out.println("Element found at index : " + result );
        }else {
            System.out.println("Element not found in the array . ");
        }
    }
}
