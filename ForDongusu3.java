import java.util.Random;

public class ForDongusu3 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int [][] dizi =new int[3][4];
        for (int i=0; i<3; i++){
            for(int a=0;a<4;a++){
                dizi[i][a]= rnd.nextInt(101);
            }
        }
        int eküçük=dizi[0][0];
        for (int i=0; i<3; i++){
            for(int j=0; j<4;j++){
                if(eküçük>dizi[i][j]){
                    eküçük=dizi[i][j];
                }
            }
        }
        System.out.println(eküçük);
    }
}
