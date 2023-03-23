import java.util.Random;
import java.util.Scanner;

public class DoWhile1 {
    public static void main (String[] args){
        Random rnd = new Random();
        int sayi1 = rnd.nextInt(10);
        int sayi2 = rnd.nextInt(10);
        Scanner input = new Scanner(System.in);
        System.out.println(sayi1 + " + " + sayi2 + ": ?");
        int cevap=0;
        do {
             cevap=input.nextInt();

            if(sayi1+sayi2!=cevap){
                System.out.println("yanlış tekrar dene");
            }
        }

        while (sayi1+sayi2!=cevap);
        System.out.println("doğru");
    }
}
