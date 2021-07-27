package com.example.product.model.resp;

public class Product {
    private String code;
    private String name;
    private String desc;
    private String pic;
    private float price;

    public Product() {

    }

    public Product(String code, String name){
        this.code = code;
        this.name = name;
        this.price = 0;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                ", pic='" + pic + '\'' +
                ", price=" + price +
                '}';
    }
}
