package ra.run;

import ra.model.Product;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ShopManagerment {
    private static List<Product> productList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int productId = 1;
        do {
            System.out.println("\n============Lựa đi=============");
            System.out.println("1. Thêm mới");
            System.out.println("2. Danh sách");
            System.out.println("3. Sắp xếp sản phẩm theo giá tăng dần");
            System.out.println("4. Sắp xếp sản phẩm theo giá giảm dần");
            System.out.println("5. Cập nhật sản phẩm");
            System.out.println("6. Xóa sản phẩm");
            System.out.println("7. Thoát");
            System.out.println("\nNhập lựa chọn: ");
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    Product product = new Product();
                    product.setId(productId++);
                    product.inputData(sc);
                    productList.add(product);
                    break;
                case 2:
                    System.out.println("\n========Thông tin danh sách=========");
                    for (Product p : productList) {
                        p.display();
                        System.out.println("=====");
                    }
                    break;
                case 3:
                    productList.sort(new Comparator<Product>() {
                        @Override
                        public int compare(Product o1, Product o2) {
                            return Double.compare(o1.getPrice(), o2.getPrice());
                        }
                    });
                    for (Product p : productList) {
                        p.display();
                        System.out.println("====");
                    }
                    break;
                case 4:
                    productList.sort(new Comparator<Product>() {
                        @Override
                        public int compare(Product o1, Product o2) {
                            return Double.compare(o2.getPrice(), o1.getPrice());
                        }
                    });
                    for (Product p : productList) {
                        p.display();
                        System.out.println("====");
                    }
                    break;
                case 5:
                    System.out.print("\n Nhập id để cập nhật: ");
                    int id = Integer.parseInt(sc.nextLine());

                    for (Product p : productList) {
                        if (p.getId() == id) {
                            p.inputData(sc);
                            System.out.println("Cập nhật thành công!");
                            break;
                        }
                    }
                    break;
                case 6:
                    System.out.print("\nXóa sản phẩm: ");
                    int deletedId = Integer.parseInt(sc.nextLine());
                    for (Product p : productList) {
                        if (p.getId() == deletedId) {
                            productList.remove(p);
                            System.out.println("Xóa thành công");
                            break;
                        }
                    }
                    break;
                case 7:
                    System.out.println("Thoát chương trình");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Nhập lại: ");
            }
        } while (true);
    }
}
