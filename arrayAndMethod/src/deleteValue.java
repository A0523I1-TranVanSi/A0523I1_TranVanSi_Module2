import java.util.Scanner;

public class deleteValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = {10,4,6,7,8,6,0,0,0,0};
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.print("]");
        System.out.println();
        System.out.print("Enter number delete : ");
        int x = sc.nextInt();
        int index = -1  ;
        for (int i = 0; i < array.length; i++) {
            if ( x == array[i]){
                index = i ;
                System.out.println("Location number delete : " +index);
                break;
            }
        }
        for (int i = index; i < array.length - 1  ; i++) {
            array[i] = array[i + 1];
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
