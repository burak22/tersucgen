import java.util.Scanner;
public class HelloWorld{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int n = sc.nextInt();

        for (int i = n; i >=1; i--) {
            for (int j = 0; j <= (n-i); j++) {
                System.out.print(" ");
                if(j == (n-i)){
                    for (int j2 = 2*i-1; j2 >=1; j2--) {
                        System.out.print("*");
                    }
                    System.out.println("");
                }
            }
        }
        sc.close();
    }            
}