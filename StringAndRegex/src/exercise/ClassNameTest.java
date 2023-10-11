package exercise;

public class ClassNameTest {
    private static ClassName className ;
    private static final String[] validClassName = {"C0318G"};
    private static final String[] invalidClassName = {"M0318G"," P0323A"};

    public static void main(String[] args) {
        className = new ClassName();
        for (String name : validClassName) {
            boolean check = className.validate(name);
            System.out.println(name+" : " + check);
        }
        for (String name : invalidClassName) {
            boolean check = className.validate(name);
            System.out.println(name+" : " + check);
        }

    }
}
