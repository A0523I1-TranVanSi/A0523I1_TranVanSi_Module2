package exercise;

import java.util.*;

public class ProductManager {
    public ArrayList<Product> productArrayList = new ArrayList<>();
    private int nextProductId = 1;

    public void addProduct(String name , double price , String description){
        Product product = new Product(nextProductId,name,price,description);
        productArrayList.add(product);
        nextProductId++ ;
    }
    public void editProduct(int id , String name , double price , String description){
        for (Product product : productArrayList) {
            if (product.getId() == id){
                product.setId(id);
                product.setName(name);
                product.setPrice(price);
                product.setDescription(description);
                break;
            }
        }
    }
    public void deleteProduct(int id ){
        for (int i = 0; i < productArrayList.size(); i++) {
            if (productArrayList.get(i).getId() == id){
                productArrayList.remove(i);
                break;
            }
        }
    }

    public void displayProduct(){
        for (Product product : productArrayList){
            System.out.println(product);
        }
    }
    public ArrayList<Product> showProductByName( String name ){
        ArrayList<Product> arrayList = new ArrayList<>();
        for (Product product : productArrayList) {
            if (product.getName().equalsIgnoreCase(name)){
                arrayList.add(product);
            }
        }
        return arrayList ;
    }

    public void sortProductAscendingByPrice(){
        Collections.sort(productArrayList, Comparator.comparing(Product :: getPrice));
    }
    public void sortProductDescendingByPrice(){
        Collections.sort(productArrayList,Comparator.comparing(Product :: getPrice).reversed());
    }

    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        Scanner sc = new Scanner(System.in);



        while (true){
            System.out.println("------PRODUCT MANAGER-------");
            System.out.println("0.Display Product ");
            System.out.println("1.Add Product ");
            System.out.println("2.Delete Product ");
            System.out.println("3.Edit Product ");
            System.out.println("4.Find Product ");
            System.out.println("5.Sort Product (Ascending) ");
            System.out.println("6.Sort Product (Descending) ");
            System.out.println("7.Exit");
            System.out.print("Enter choice : ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice){
                case 0 :
                    productManager.displayProduct();
                    break;
                case 1 :
                    System.out.print("Enter name : ");
                    String name = sc.nextLine();
                    System.out.print("Enter price : ");
                    double price = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Enter description : ");
                    String description = sc.nextLine();
                    productManager.addProduct(name,price,description);
                    System.out.println("Product added success ! ");
                    break;
                case 2 :
                    System.out.print("Enter Product delete (id) : ");
                    int delId = sc.nextInt();
                    productManager.deleteProduct(delId);
                    break;
                case 3 :
                    System.out.print("Enter id you want to edit : ");
                    int deleteId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter name new : ");
                    String newNa = sc.nextLine();
                    System.out.print("Enter price new : ");
                    double newPr = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Enter description new : ");
                    String newDes = sc.nextLine();
                    productManager.editProduct(deleteId , newNa , newPr , newDes);
                    break;
                case 4 :
                    System.out.print("Enter name you want check : ");
                    String nameCheck = sc.nextLine();
                    ArrayList<Product> arrayList = productManager.showProductByName(nameCheck);
                    for (Product checkNa : arrayList ) {
                        System.out.println(checkNa);
                    }
                    break;
                case 5 :
                    productManager.sortProductAscendingByPrice();
                    System.out.println("Sorted product ascending by price :");
                    productManager.displayProduct();
                    break;
                case 6 :
                    productManager.sortProductDescendingByPrice();
                    System.out.println("Sorted product descending by price : ");
                    productManager.displayProduct();
                    break;
                case 7 :
                    System.out.println("Exiting the program . Goodbye !");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
                    break;
            }
        }
    }
}
