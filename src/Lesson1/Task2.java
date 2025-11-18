package Lesson1;

public class Task2 {
    public static void main(String[] args) {
        //Kassa hesablanmas
        float  productPrice = 47;
        int discount = 20;
        double finalPrice;
        finalPrice=productPrice-(productPrice*discount/100);

        System.out.println("Orginal price:"+" "+productPrice);
        System.out.println("Discount"+" "+discount);
        System.out.println("Final price:"+" "+finalPrice);
    }
}
