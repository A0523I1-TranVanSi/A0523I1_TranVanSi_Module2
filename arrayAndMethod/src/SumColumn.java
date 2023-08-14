import java.util.Scanner;

public class SumColumn {
    public static void main(String[] args) {
        Scanner si = new Scanner(System.in);
        System.out.print("Nhap so hang cua mang : ");
        int row = si.nextInt();
        System.out.print("Nhap so cot cua mang : ");
        int col = si.nextInt();
        int[][] array = new int[row][col];
        int sum_col ;

        System.out.println("Nhap phan tu cua mang :");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print("Phan tu thu "+i+"|"+j+" la :");
                array[i][j] = si.nextInt();
            }
        }

        do {
            System.out.print("Nhap vao so cot tinh tong cac phan tu : ");
            sum_col = si.nextInt();
            if (sum_col > row){
                System.out.println("Vui long nhap lai -> ");
            }
        }while (sum_col > row);

        int total = 0 ;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if( sum_col - 1  == j){
                    total += array[i][j];
                }
            }
        }
        System.out.println("Tong so cua cot "+sum_col+" la :"+total);
    }
}
