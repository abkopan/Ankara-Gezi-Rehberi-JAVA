import java.util.Scanner;

public class Uygulama {
    public static void main(String[] args) throws InterruptedException {
        Scanner klavye = new Scanner(System.in);
        System.out.println("\n\n******** GEZİ REHBERİ UYGULAMAMIZA HOŞGELDİNİZ ********\n");
        int a = 0;
        while (a == 0) {
            System.out.println("-Gezi Rehberi Uygulamasının size rastgele öneri yapmasını istiyorsanız 1'i tuşlayınız.\n" +
                    "-Gezi Rehberi Uygulamasında siz tercih yapmak istiyorsanız 2'yi tuşlayınız. ");
            System.out.print("\nSeçiminiz: ");
            int secim = klavye.nextInt();
            switch (secim) {
                default:
                    System.out.println("\nYanlış bir tuşlama yaptınız tekrardan tuşlama yapmanız gerekiyor.\n ");
                    a=0;
                    break;
                case 1:
                    System.out.println("\n\n****** UYGULAMA RASTGELE BİR ETKİNLİK ÖNERECEK ******\n");
                    randomsec randomsec = new randomsec();
                    randomsec.randomsec();
                    a=1;
                    break;
                case 2:
                    System.out.println("\n\n****** UYGULAMADA KENDİNİZ SEÇİMLER YAPACAKSINIZ ******\n");
                    kendinsec kendinsec = new kendinsec();
                    kendinsec.kendinsec();
                    a=1;
                    break;
            }
        }
    }

}
