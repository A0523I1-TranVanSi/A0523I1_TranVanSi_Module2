import java.util.Scanner;

public class maxValue2WayArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so hang cua mang : ");
        int row = sc.nextInt();
        System.out.print("Nhap so cot cua mang :");
        int column = sc.nextInt();
        int[][] arr = new int[row][column] ;

        System.out.println("Nhap phan tu cua mang :");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("Nhap phan tu thu "+"["+i+"]"+"["+j+"] :");
                arr[i][j] = sc.nextInt();
            }
        }
        int max = arr[0][0] ;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if( arr[i][j] > max){
                    max = arr[i][j];
                }
            }
        }
        System.out.println("Phan tu lon nhat trong mang la : "+max);
    }
}
