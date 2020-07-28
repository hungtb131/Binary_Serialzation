package BT_QuanLySanPham;

import java.io.Serializable;


public class Product implements Serializable{
    private int id;
    private String Name;
    private String Brand;
    private int Price;
    private String MoreInfo;

    public Product() {
    }
    public Product(int ProductID,String Name, String Brand,int Price,String MoreInfo){
        super();
        this.id = id;
        this.Name =Name;
        this.Brand = Brand;
        this.Price=Price;
        this.MoreInfo=MoreInfo;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }

    public String getMoreInfo() {
        return MoreInfo;
    }

    public void setMoreInfo(String moreInfo) {
        MoreInfo = moreInfo;
    }
}


