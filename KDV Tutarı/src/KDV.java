import java.util.Scanner;

public class KDV {
    public static void main(String[] args) {

        double kdv,kdvFiyat,kdvOran;
        int anaPara;
        boolean kdvDurumu= true;

        Scanner inp = new Scanner(System.in);
        System.out.println("Para miktarını giriniz: ");

        anaPara =inp.nextInt();

        kdvDurumu = (0 < anaPara) && (1000 > anaPara);
        kdvOran  = kdvDurumu ? 0.18d : 0.08d;
        kdv = anaPara * kdvOran;
        kdvFiyat = kdv + anaPara;


        System.out.println("Ana para: "+anaPara);
        System.out.println("Kdvli fiyat: "+kdvFiyat);
        System.out.println("Kdv oran: "+kdv);


    }
}
