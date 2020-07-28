package BT_QuanLySanPham;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String choose = null;
        boolean exit = false;
        ProductManager productManager = new ProductManager();
        int productId;
        showMenu();
        while (true){
            choose = scanner.nextLine();
            switch (choose){
                case "1":
                    productManager.add();
                    break;
                case "2":
                    productId = productManager.inputid();
                    productManager.edit(productId);
                    break;
                case "3":
                    productId = productManager.inputid();
                    productManager.delete(productId);
                    break;
                case "4":
                    productManager.show();
                    break;
                case "0":
                    System.out.println("exited!");
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid! please choose action in below menu: ");
                    break;
            }
            if (exit){
                break;
            }
            showMenu();

        }

    }

    public static void showMenu() {
        System.out.println("-----------menu------------");
        System.out.println("1.Add product.");
        System.out.println("2.Edit product by id.");
        System.out.println("3.Delete product by id.");
        System.out.println("4.Show product.");
        System.out.println("0.Exit");
        System.out.println("---------------------------");
        System.out.print("Please choose: ");


    }
}
