import java.util.Scanner;

public class insertValue2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số lượng phần tử của mảng: ");
        int N = scanner.nextInt();

        int[] array = new int[N];

        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < N; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.print("Nhập số cần chèn (X): ");
        int X = scanner.nextInt();

        System.out.print("Nhập vị trí index cần chèn (0 đến " + (N - 1) + "): ");
        int index = scanner.nextInt();

        if (index < 0 || index > N - 1) {
            System.out.println("Không chèn được phần tử vào mảng.");
        } else {
            for (int i = N - 1; i >= index; i--) {
                array[i + 1] = array[i];
            }
            array[index] = X;
            N++;

            System.out.println("Mảng sau khi chèn:");
            for (int i = 0; i < N; i++) {
                System.out.print(array[i] + " ");
            }
        }
    }
}
