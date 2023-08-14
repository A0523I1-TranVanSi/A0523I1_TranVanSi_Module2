import java.util.Scanner;

public class DemKyTuString {
    public static void main(String[] args) {
        Scanner si = new Scanner(System.in);
        String str = "TRAN VAN SI DEP TRAI" ;
        System.out.print("Nhap ky tu tu ba phim : ");
        char inputStr = si.next().charAt(0);
        int count = 0 ;
        for (int i = 0; i < str.length(); i++) {
            if ( inputStr == str.charAt(i)){
                count ++ ;
            }
        }
        System.out.println("So lan xuat hien cua ky tu "+inputStr+" la :"+count);
    }
}
