package BT_QuanLySanPham;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class ProductManager {
    public static Scanner sc = new Scanner(System.in);
    private List<Product> productList;
    private ProductDaO productDaO;
    public ProductManager(){
        productDaO = new ProductDaO();
        productList = new productDaO.read();
    }
    public void add(){
        int id = (productList.size() >0) ? (productList.size() +1 ) : 1;
        System.out.println("product Id = " + id);
        String Name = inputName();
        String Brand = inputBrand();
        int Price = inputPrice();
        String MoreInfo = inputMoreInfo();
        Product product = new Product(id,Name,Brand,Price,MoreInfo);
        productList.add(product);
        productDaO.write(productList);

    }
    public void edit (int id){
        boolean isExited = false;
        int size = productList.size();
        for (int i =0;i < size;i++){
            if (productList.get(i).getId()==i){
                isExited = true;
                productList.get(i).setName(inputName());
                productList.get(i).setBrand(inputBrand());
                productList.get(i).setPrice(inputPrice());
                productList.get(i).setMoreInfo(inputMoreInfo());
                break;

            }
        }
        if (!isExited){
            System.out.printf("id = %d not existed.\n",id );
        }else {
            productDaO.write(productList);
        }
    }
    public void delete(int id){
        Product product = null;
        int size = productList.size();
        for (int i =0;i<size;i++){
            if (productList.get(i).getId()==id){
                product = productList.get(i);
                break;
            }
        }if (product !=null){
            productList.remove(product);
            productDaO.write(productList);

        }else {
            System.out.printf("id = %d not existed.\n",id);
        }
    }
    public void show(){
        for (Product product : productList){
            System.out.format(" ",product.getId());
            System.out.format(" ",product.getName());
            System.out.format(" ",product.getBrand());
            System.out.format(" ",product.getPrice());
            System.out.format(" ",product.getMoreInfo());
        }
    }
    public int inputid(){
        System.out.print("Input product id : ");
        while (true){
            try {
                int id = Integer.parseInt((sc.nextLine()));
                return id;
            }catch (NumberFormatException ex) {
                System.out.print("invalid!Enter product id again! : ");
            }
        }
    }
    private String inputName(){
        System.out.print("Input product name : ");
        return sc.nextLine();
    }
    private String inputBrand(){
        System.out.print("Input product brand : ");
        return sc.nextLine();
    }
    private int inputPrice(){
        System.out.print("Input product price : ");
        return sc.nextInt();
    }
    private String inputMoreInfo(){
        System.out.print("Input product moreInfo : ");
        return sc.nextLine();
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }
}
