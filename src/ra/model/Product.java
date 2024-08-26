package ra.model;

import java.util.Scanner;

public class Product implements IShop {
    private int id;
    private String name;
    private double price;
    private boolean status;

    public Product() {
    }

    public Product(int id, String name, double price, boolean status) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public void inputData(Scanner sc) {

        System.out.print("Enter product name: ");
        name = sc.nextLine();
        System.out.print("Enter product price: ");
        price = Double.parseDouble(sc.nextLine());
        System.out.print("Enter product status: ");
        status = Boolean.parseBoolean(sc.nextLine());
    }

    @Override
    public void display() {
        System.out.println("Product ID: " + id);
        System.out.println("Product Name: " + name);
        System.out.println("Product Price: " + price);
        System.out.println("Product Status: " + (status ? "hoạt động" : "không hoạt động"));
    }
}
