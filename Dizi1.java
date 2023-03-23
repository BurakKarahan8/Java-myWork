import java.util.Random;

public class Dizi1 {
    public static void main(String[] args) {
        Random input=new Random();
        int a=50+(int)(Math.random()*21);
        System.out.println(a);
        double[] liste = {1.2, 3.4, 5.6, 7.8};
        double toplam = 0;
        double max = liste[0];
        for (double sayilar : liste) {
            if (max < sayilar) {
                max = sayilar;
            }
            toplam = toplam + sayilar;
            System.out.println(sayilar);
        }
        System.out.println("Toplam = " + toplam);
        System.out.println("En Büyük = " + max);

    }
}
