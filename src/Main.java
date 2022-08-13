import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        int sum=0;
        Scanner scn = new Scanner(System.in);

        do {
            System.out.println("Sayı giriniz: ");
            n=scn.nextInt();
            if (n % 4 == 0){
                sum+=n;
            }
        }while(n%2!=1);

        System.out.println("4'ün katları olan sayıların toplamı: "+sum);

    }
}
