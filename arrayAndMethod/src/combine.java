import java.util.Scanner;

public class combine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong phan tu cua mang 1 :");
        int size1 = sc.nextInt();
        System.out.print("Nhap so luong phan tu cua mang 2 :");
        int size2 = sc.nextInt();
        int[] arr1 = new int[size1] ;
        int[] arr2 = new int[size2];

        System.out.println("Nhap pha tu cua mang 1 : ");
        for (int i = 0; i < size1; i++) {
            System.out.print("nhap phan tu thu " + (i + 1) + " :");
            arr1[i] = sc.nextInt();
        }

        System.out.println("Nhap pha tu cua mang 2 : ");
        for (int i = 0; i < size2; i++) {
            System.out.print("nhap phan tu thu " + (i + 1) + " :");
            arr2[i] = sc.nextInt();
        }

        int[] arr3 = new int[size1 + size2] ;
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i] ;
        }
        for (int i = 0; i < arr2.length; i++) {
            arr3[arr1.length + i ] = arr2[i];
        }

        System.out.println("Mang sau khi noi :");
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " , ");
        }
    }
}
