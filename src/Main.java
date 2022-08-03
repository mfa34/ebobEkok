import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a , b ;

        // Kullancidan iki deger alinir ↓
        Scanner input = new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz :");
        a = input.nextInt();
        System.out.println("Lutfen ikinci sayiyi giriniz :");
        b=input.nextInt();
        int ebob=1;
        if (b>a){
            for (int i =1 ; i<=a ;i++){
                if (a%i==0 && b%i==0){
                    ebob   = i;
                }
            }
            System.out.println("EBOB= "+ebob );

        }
        else {
            for (int i =1 ; i<=b ;i++){
                if (a%i==0 && b%i==0){
                    ebob = i;
                }
            }
            System.out.println("EBOB= "+ebob );
        }
        int ekok = ((a*b)/ebob);
        System.out.println("EKOK= " + ekok);
    }
}
