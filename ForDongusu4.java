import java.util.Scanner;

public class ForDongusu4 {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Sayıyı gir: ");
        int sayi = input.nextInt();
        for (int i=2; i<sayi; i+=2){
            System.out.println("Yazılım mühendisliği-" +
                    (i-1) + "\nÇok çalışmalıyız-" + i);
        }
    }
}
