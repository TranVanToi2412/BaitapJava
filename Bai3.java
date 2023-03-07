import java.util.*;
public class Bai3 {
    public static void main(String[] args) {
        String ten;
        int nam;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten :");
        ten = sc.nextLine();
        System.out.println("Nhap nam sinh :");
        nam = sc.nextInt();
        int tuoi = 2023 - nam;
        if(tuoi < 16) {
            System.out.println("Ban"+" "+ten+" "+"o do tuoi vi thanh nien");
        }
        else if(tuoi >= 16) {
            System.out.println("Ban"+" "+ten+" "+"o do tuoi truong thanh");
        }
        else if(tuoi >= 18) {
            System.out.println("Ban"+" "+ten+" "+"da gia");
        }
    }
}