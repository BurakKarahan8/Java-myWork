import java.util.Scanner;

public class Methods1
{
    public static int sifreUzunluk(String sifre)
    {
        return sifre.length();
    }
    public static boolean sifreMinUzunluk(String sifre)
    {
        if(sifreUzunluk(sifre)<10) {
            return false;
        }
        else {
            return true;
        }
    }
    public static int karakterKontrolEt(String sifre)
    {
        String K1 = "-";
        String K2 = "@";
        String K3 = "!";
        int a=0;
        for(int i=0; i<=sifreUzunluk(sifre); i++){
            String K = sifre.substring(i,(i+1));
            if(K.equals(K1) || K.equals(K2) || K.equals(K3)){
                a=1;
                break;
            }
        }
        return a;
    }
    public static boolean sifreUygun(String sifre){
        if((sifreMinUzunluk(sifre) == true) && (karakterKontrolEt(sifre) == 1)){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Methods1 a = new Methods1();
        Scanner input = new Scanner(System.in);
        System.out.print("Şifrenizi giriniz: ");
        String sifre = input.nextLine();

        if(a.sifreUygun(sifre)==true){
            System.out.println("Geçerli şifre girdiniz...");
        }
        else{
            System.out.println("Geçersiz şifre...");
        }

    }
}
