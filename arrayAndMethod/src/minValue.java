import java.util.Scanner;

public class minValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong phan tu trong mang: ");
        int size = sc.nextInt();

        int[] array = new int[size] ;
        System.out.println("Nhap phan tu vao mang : ");
        for (int i = 0; i < array.length; i++) {
            System.out.print("Phan tu thu "+(i+1)+" :");
            array[i] = sc.nextInt();
        }

        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min){
                min = array[i] ;
            }
        }
        System.out.println("Phan tu nho nhat trong mang la : " + min);
    }
}
