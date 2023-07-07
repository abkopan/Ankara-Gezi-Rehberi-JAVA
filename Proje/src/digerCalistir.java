import java.util.Scanner;

public class digerCalistir {

    public void calistir(){
        Scanner klavye=new Scanner(System.in);
        System.out.println("\n***** FARKLI ETKİNLİK ÖNERİLERİ EKRANINA HOŞGELDİNİZ *****\n");
        int a=0;
        while (a==0){
            System.out.println("1-Gençlik Parkı\n" +
                    "2-Millet Bahçesi\n" +
                    "3-Mogan Gölü (Gölbaşı)\n" +
                    "4-Teleferik\n" +
                    "5-Hamamönü\n");
            System.out.println("Size önerdiğimiz etkinliklerden hangisini yapmak istersiniz ?");
            System.out.print("Cevabınız: ");
            int secim= klavye.nextInt();
            switch (secim){
                default:
                    System.out.println("Yanlış bir tuşlama yaptınız seçim ekranına tekrardan yönlendiriliyorsunuz.");
                    a=0;
                case 1:
                    genclikParki genclikParki=new genclikParki("Gençlik Parkı");
                    genclikParki.bilgileri_goster();
                    System.out.println("\n***** İYİ EĞLENCELER DİLERİZ *****");
                    a=1;
                    break;
                case 2:
                    milletBahcesi milletBahcesi=new milletBahcesi("Millet Bahçesi");
                    milletBahcesi.bilgileri_goster();
                    System.out.println("\n***** İYİ EĞLENCELER DİLERİZ *****");
                    a=1;
                    break;
                case 3:
                    mogan mogan=new mogan("Mogan Gölü");
                    mogan.bilgileri_goster();
                    System.out.println("\n***** İYİ EĞLENCELER DİLERİZ *****");
                    a=1;
                    break;
                case 4:
                    teleferik teleferik=new teleferik("Teleferik");
                    teleferik.bilgileri_goster();
                    System.out.println("\n***** İYİ EĞLENCELER DİLERİZ *****");
                    a=1;
                    break;
                case 5:
                    hamamönü hamamönü=new hamamönü("Hamamönü");
                    hamamönü.bilgileri_goster();
                    System.out.println("\n***** İYİ EĞLENCELER DİLERİZ *****");
                    a=1;
                    break;
            }
        }
    }
}
