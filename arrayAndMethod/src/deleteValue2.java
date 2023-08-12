import java.util.Scanner;

public class deleteValue2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so luong phan tu cua mang : ");
        int N = sc.nextInt();

        int[] array = new int[N];

        System.out.println("Nhap cac phan tu cau mang");
        for (int i = 0; i < N; i++) {
            System.out.print("Phan tu thu " + (i + 1) + " la :");
            array[i] = sc.nextInt();
        }

        System.out.print("Nhap phan tu can xoa : ");
        int x = sc.nextInt();

        int index_del = -1 ;
        for (int i = 0; i < N ; i++) {
            if ( array[i] == x ){
                index_del = i ;
                break;
            }
        }

        if (index_del != -1 ){
            System.out.println("vi tri cua x trong mang " + index_del);
            for (int i = index_del; i < N - 1  ; i++) {
                array[i] = array[ i + 1 ];
            }

            System.out.println("Mang sau khi xoa : ");
            for (int i = 0; i < N - 1; i++) {
                System.out.print(array[i] + ",");
            }
        }else {
            System.out.println("Ko tim thay x trong mang .");
        }

    }
}
