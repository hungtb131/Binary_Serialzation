package BT_QuanLySanPham;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
public class ProductDaO {
    private static final String Product_File_Name = "Product.txt";
    public void write (List<Product> productList){
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(new File(Product_File_Name));;
            oos = new ObjectOutputStream(fos);
            oos.writeObject(productList);
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        }
        finally {
            closeStream(fos);
            closeStream(oos);
        }

    }

    private void closeStream(FileOutputStream fos) {

    }

    private void closeStream(ObjectOutputStream oos) {

    }

    public List<Product> read(){
        List<Product> productList = new ArrayList<>();
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream(new File(Product_File_Name));
            ois = new ObjectInputStream(fis);
            productList = (List<Product> ) ois.readObject();

        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        }
        catch (ClassNotFoundException e){
            e.printStackTrace();
        }finally {
            closeStream(fis);
            closeStream(ois);
        }
        return productList;
    }
    private void closeStream(ObjectInputStream ois) {

    }

    private void closeStream(FileInputStream fis) {

    }



}
