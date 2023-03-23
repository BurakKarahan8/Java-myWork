public class String1 {
    public static void main(String[] args) {
        System.out.println("------------------------------------");
        String mesaj = "Bugün hava çok güzel.";
        System.out.println(mesaj);
        System.out.println("------------------------------------");
        System.out.println("Eleman sayısı : " +mesaj.length());
        System.out.println("------------------------");
        System.out.println("5. eleman : " +mesaj.charAt(4));
        System.out.println("------------------------------------");
        System.out.println(mesaj.concat(" Maça gidelim!"));
        System.out.println("------------------------------------");
        System.out.println(mesaj.startsWith("B"));
        System.out.println("------------------------------------");
        System.out.println(mesaj.endsWith("."));
        System.out.println("------------------------------------");
        char[] karakterler = new char [5];
        mesaj.getChars(0,5,karakterler,0);
        System.out.println(karakterler);
        System.out.println("------------------------------------");
        System.out.println(mesaj.indexOf("av"));
        System.out.println("------------------------------------");
        System.out.println(mesaj.lastIndexOf("a"));
        System.out.println("------------------------------------");
        String yeniMesaj = mesaj.replace(' ', '-');
        System.out.println(yeniMesaj);
        System.out.println("------------------------------------");
        System.out.println(mesaj.substring(2, 15));
        System.out.println("------------------------------------");

    }
}
