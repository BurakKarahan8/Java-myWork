import java.util.Scanner;

public class ForDongusu2 {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen tabandaki x sayısını giriniz: ");
        int taban = input.nextInt();
        System.out.print("Lütfen kuvvetteki n sayısını giriniz: ");
        double kuvvet = input.nextInt();
        int toplam = 1;
        double sontoplam = 0;
        for (int i=1 ; i<(kuvvet+1); i++){
            toplam = toplam*i;
            double sonuc = (Math.pow(taban , i)/toplam);
            sontoplam += sonuc;
        }
        System.out.println("Cevap: "+ sontoplam);
    }
}
