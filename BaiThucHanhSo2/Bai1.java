import java.util.Scanner;
public class Bai1 {
    public static void main (String[] args){
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a :");
        a = sc.nextInt();
        System.out.println("Nhap b : ");
        b = sc.nextInt();
        System.out.println("Tong cua 2 so: " + (a + b));
        System.out.println("Tong cua 2 so: " + (a - b));
        System.out.println("Tong cua 2 so: " + (a * b));
        System.out.println("Tong cua 2 so: " + (a / b));
        System.out.println("Tong cua 2 so: " + (a % b));
        if(a > b ) {
            System.out.println("a lon hon b");
        }
        else if(a < b ) {
            System.out.println("b lon hon a");
        }
        else {
            System.out.println(" a bang b");
        }
    }
}
