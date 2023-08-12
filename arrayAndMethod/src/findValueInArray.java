import java.util.Scanner;

public class findValueInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] students = {"si" , "oanh" , "trang" , "phan" , "ly"};
        System.out.print("Enter a name's student : ");
        String input_name = sc.nextLine();

        for (int i = 0; i < students.length; i++) {
            if(students[i].equals(input_name)){
                System.out.println("Position of the students in the list " + input_name + " is :" + (i + 1 ));
                break;
            }else {
                System.out.println("Not found " + input_name + " in the list.");
                break;
            }
        }
    }
}
