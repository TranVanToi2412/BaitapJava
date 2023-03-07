import java.util.Scanner;
public class Bai2 {
    public static void main (String[] arg){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap n :");
        n = sc.nextInt();
        if (n % 2 == 0){
            System.out.println("so chan");
        } 
        else {
            System.out.println("so le");
        } 
    }


}
