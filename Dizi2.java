public class Dizi2 {
    public static void main(String[] args) {
        String[][] sehirler = new String[3][3];

        sehirler[0][0] = "/İstanbul                               /";
        sehirler[0][1] = "/Bursa                                  /";
        sehirler[0][2] = "/Bilecik                                /";
        sehirler[1][0] = "/Giresun                                /";
        sehirler[1][1] = "/Trabzon                                /";
        sehirler[1][2] = "/Ordu                                   /";
        sehirler[2][0] = "/Diyarbakır                             /";
        sehirler[2][1] = "/Gaziantep                              /";
        sehirler[2][2] = "/Şanlıurfa                              /";
        for (int i = 0; i < sehirler.length; i++) {
            System.out.println("----------------------------------------");
            if (i == 0)
                System.out.println("/Marmara bölgesindeki iller:            /\n----                                    /");
            else if (i == 1)
                System.out.println("/Karadeniz bölgesindeki iller:          /\n----                                    /");
            else if (i == 2)
                System.out.println("/Güneydoğu Anadolu bölgesindeki iller:  /\n----                                    /");
            for (int j = 0; j <= 2; j++) {
                System.out.println(sehirler[i][j]);
            }
        }
        System.out.println("----------------------------------------");
    }
}
