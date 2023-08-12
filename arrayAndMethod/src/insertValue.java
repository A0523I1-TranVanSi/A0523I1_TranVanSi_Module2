import java.util.Scanner;

public class insertValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong phan tu :");
        int N = sc.nextInt();
        int[] array = new int[N];

        for (int i = 0; i < N; i++) {
            System.out.print("Nhap phan tu thu " + (i + 1) + " la :");
            array[i] = sc.nextInt();
        }

        System.out.print("Nhap so can chen : ");
        int x = sc.nextInt();

        System.out.print("Nhap vi tri can chen " + x + " va trong mang :");
        int index_ins = sc.nextInt();

        if ( index_ins <= 1 && index_ins >= array.length - 1){
            System.out.println("Khong chen duoc phan tu vao mang !!!");
        }else {
            for (int i = index_ins; i < N - 1 ; i++) {
                array[i + 1] = array[i];
                array[i] = x ;
            }
            System.out.print("mang sau khi chen :");
            for (int i = 0; i < N ; i++) {
                System.out.print(array[i] + ",");
            }
        }
    }
}
