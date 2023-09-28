import java.util.Scanner;

public class IllegalTriangle_exception extends Exception    {
    public IllegalTriangle_exception(String message){
        super(message);
    }
    public static void validateTriangle(double side1 , double side2 , double side3) throws IllegalTriangle_exception{
        if (side2 < 0 || side1 < 0 || side3 < 0 || side1 + side2 <= side3 || side1 + side3 <= side2 || side3 + side2 <= side1){
            throw new IllegalTriangle_exception("Invalid triangle: The sum of any two sides must be greater than the third side, and all sides must be positive.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter side 1 : ");
            double side1 = sc.nextDouble();
            System.out.print("Enter side 2 : ");
            double side2 = sc.nextDouble();
            System.out.print("Enter side 3 : ");
            double side3 = sc.nextDouble();

            validateTriangle(side1,side2,side3);
            System.out.println("Valid triangle . ");
        }catch (IllegalTriangle_exception e ){
            //Bắt ngoại lệ nếu tam giác ko hợp lệ và in thông báo lỗi
            System.out.println("Error : " + e.getMessage());
        }catch (Exception e ){
            //Bắt ngoại lệ chung nếu có lỗi nhập liệu không hợp lệ
            System.out.println("Error : Invalid input .");
        }finally {
            //Đóng Scanner để tránh rò rỉ tài nguyên
            sc.close();
        }
    }
}
