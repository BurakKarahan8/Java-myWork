public class ForDongusu1 {
    public static void main(String[] args) {
        for (int i = 0; i <= 18; i += 3) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }System.out.println();
        }
        for (int i = 0; i <= 15; i += 3) {
            for (int j = 15; j >= i; j--) {
                System.out.print("*");
            }System.out.println();
        }
    }
}
