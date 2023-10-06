package exercise;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManagement {
    private static final String FILE_NAME = "C:\\Users\\SY\\Product.txt";
    public static void main(String[] args) {
        ArrayList<Product> products = loadProduct();
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("------ Product Management ------");
            System.out.println("1 . Add Product ");
            System.out.println("2 . Display Product ");
            System.out.println("3 . Find Product ");
            System.out.println("4 . Exit");
            System.out.print("Enter number : ");
            choice = sc.nextInt();
            switch (choice){
                case 1 :
                    Product product = addProduct();
                    products.add(product);
                    saveProduct(products);
                    break;
                case 2 :
                    displayProduct(products);
                    break;
                case 3 :
                    System.out.print("Enter the product code to search : ");
                    String searchCode = sc.nextLine();
                    findProduct(products,searchCode);
                    break;
                case 4 :
                    System.out.println("Exit!");
                    System.exit(0);
                default:
                    System.out.println("Enter again ! ");
            }
        }while (choice != 4 );
    }
    public static Product addProduct(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter product code : ");
        String code = sc.nextLine();
        System.out.print("Enter product's name : ");
        String name = sc.nextLine();
        System.out.print("Enter manufacturer : ");
        String manufacturer = sc.nextLine();
        System.out.print("Enter price :");
        double price = sc.nextDouble();
        return new Product(code , name , manufacturer , price );
    }
    public static void displayProduct(List<Product> productManagements){
        System.out.println("Display Product : ");
        for (Product p : productManagements) {
            System.out.println(p);
            System.out.println();
        }
    }
    public static void findProduct(List<Product> productManagements , String code){
        for (Product p : productManagements) {
            if (p.getProductCode().equalsIgnoreCase(code)){
                System.out.println("The product you are looking for is : ");
                System.out.println(p);
            }
        }
    }
    private static void saveProduct(ArrayList<Product> products){
        try {
            ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("C:\\Users\\SY\\Product.txt"));
            outputStream.writeObject(products);
            System.out.println("Saved to " + "C:\\Users\\SY\\Product.txt");
        }catch (IOException e ){
            e.printStackTrace();
        }
    }
    private static ArrayList<Product> loadProduct(){
        ArrayList<Product> products = new ArrayList<>();
        File file = new File("C:\\Users\\SY\\Product.txt");
        if (file.exists()){
            try {

                ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("C:\\Users\\SY\\Product.txt"));
                products = (ArrayList<Product>) objectInputStream.readObject();

            }catch (IOException | ClassNotFoundException e ){
                e.printStackTrace();
            }
        }
        return products ;
    }
}
