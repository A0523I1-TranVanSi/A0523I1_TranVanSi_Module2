package exercise;

public class PhoneNumberTest   {
    private static PhoneNumber phoneNumber ;
    private static final String[]  validPhoneNumber = {"(84)-(0978489648)"};
    private static final String[] invalidPhoneNumber = {"(a8)-(22222222)"};

    public static void main(String[] args) {
        phoneNumber = new PhoneNumber();
        for (String name : validPhoneNumber) {
            boolean check = phoneNumber.validate(name);
            System.out.println(name + " : " + check);
        }
        for (String name : invalidPhoneNumber) {
            boolean check = phoneNumber.validate(name);
            System.out.println(name + " : " + check);
        }
    }
}
