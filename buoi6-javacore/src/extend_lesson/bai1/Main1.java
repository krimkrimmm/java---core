package extend_lesson.bai1;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập thong tin id: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập thong tin tên: ");
        String name = scanner.nextLine();
        System.out.println("Nhập thong tin giá: ");
        double price = Double.parseDouble(scanner.nextLine());
        // Cách 1:
        Produc produc= new Produc();
        produc.setName(name);
        produc.setId(id);
        produc.setPrice(price);
        // Cách 2:
        Produc pproduct2 = new Produc(id, name, price);

        // Tính thuế:
        calculateVAT(produc.getPrice());
        // Tính thuế:
        double vat = calculateVAT2(pproduct2.getPrice());
        System.out.println("VAT: "+vat);
    }

    // Cách 1:
    public static void calculateVAT(double price){
        double vatAmt = 0.1* price;
        System.out.println("VAT: "+ vatAmt);
    }

    // Cách 2:
    public static double calculateVAT2(double price){
        double vatAmt = 0.1* price;
        return vatAmt;
    }
}