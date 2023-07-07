import java.util.Scanner;

public class digerCalistirRandom {

    public static int random() {
        int a= (int) (Math.random()*5) ;
        return a;
    }

    public void calistir(){
        Scanner klavye=new Scanner(System.in);
        System.out.println("\n***** FARKLI ETKİNLİK ÖNERİLERİ EKRANINA HOŞGELDİNİZ *****\n");
            System.out.println("1-Gençlik Parkı\n" +
                    "2-Millet Bahçesi\n" +
                    "3-Mogan Gölü (Gölbaşı)\n" +
                    "4-Teleferik\n" +
                    "5-Hamamönü\n");
            switch (random()){
                case 0:
                    genclikParki genclikParki=new genclikParki("Gençlik Parkı");
                    genclikParki.bilgileri_goster();
                    break;
                case 1:
                    milletBahcesi milletBahcesi=new milletBahcesi("Millet Bahçesi");
                    milletBahcesi.bilgileri_goster();
                    break;
                case 2:
                    mogan mogan=new mogan("Mogan Gölü");
                    mogan.bilgileri_goster();
                    break;
                case 3:
                    teleferik teleferik=new teleferik("Teleferik");
                    teleferik.bilgileri_goster();
                    break;
                case 4:
                    hamamönü hamamönü=new hamamönü("Hamamönü");
                    hamamönü.bilgileri_goster();
                    break;
            }
        }

}

