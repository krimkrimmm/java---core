package extend_lesson.exception.sale.service;

import extend_lesson.exception.sale.database.Database;
import extend_lesson.exception.sale.entities.Product;
import extend_lesson.exception.sale.utils.Utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductService {
    public Product createProduct(Scanner scanner){
        System.out.println("Mời b nhập tên sp: ");
        String name = scanner.nextLine();
        System.out.println("Mời b nhập số lượng sp: ");
        int quantity = Utils.inputInteger(scanner);


        System.out.println("Mời b giá lượng sp: ");
        double price = Utils.inputDouble(scanner);

        return new Product(quantity, name, price);
    }

    public void filterProduct(){
        // Sử dụng tham số để giúp tái sử dụng hàm
        List<Product> productHNs = new ArrayList<>();
        for (Product product: Database.products){
            if(product.getArea().equalsIgnoreCase("HN")){
                productHNs.add(product);
            }
        }
        System.out.println("Danh sách các sp ở kv HN: "+ productHNs);
    }
}

