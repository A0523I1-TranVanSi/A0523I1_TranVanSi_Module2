import java.util.Scanner ;
public class phuongtrinh {
    public static void main(String[] args) {
        System.out.println("Phương trình có dạng 'ax + b = c ' , vui lòng điền các hằng số ");
        Scanner scanner = new Scanner(System.in);

        System.out.println("a : ");
        double a  = scanner.nextDouble();

        System.out.println("b : ");
        double b = scanner.nextDouble();

        System.out.println("c : ");
        double c = scanner.nextDouble();

        if( a != 0 ){
            double answer = ( c - b ) / a ;
            System.out.println(answer);
        }else {
            if ( b == c ){
                System.out.println("  vô số nghiệm ");
            }else {
                System.out.println(" PT không có nghiệm !");
            }
        }
    }
}
