import java.util.Scanner;

public class parkCalistirrandom {
    public static int random() {
        int b= (int) (Math.random()*4) ;
        return b;
    }

    private String isim;
    private String özelAlan;
    private String kafeVar;
    private String selamlama;

    public parkCalistirrandom() throws InterruptedException {
        Scanner klavye=new Scanner(System.in);
            System.out.println("\n\n******** PARKLAR EKRANI ********\n");
            System.out.println("1-Kurtuluş Parkı\n" +
                    "2-Göksu Parkı\n" +
                    "3-Seğmenler Parkı\n" +
                    "4-Mogan Parkı\n");
        System.out.println("***********************************************************\n");
        Thread.sleep(500);
            switch (random()) {
                case 0:
                    System.out.println("\nKurtuluş Parkı'na gezmeye gideceksiniz...");
                    this.isim = "Kurtuluş Parkı";
                    this.özelAlan = "Kurtuluş Parkın'a ait olan özel alan yürüyüş alanı ve masa tenisi oynama alanıdır şimdiden iyi eğlenceler dileriz.";
                    this.kafeVar = "Kurtuluş Parkı'nda tek başınıza veya arkadaşlarınızla oturabileceğiniz hem de bir şeyler alabileceğiniz bir kafe bulunmaktadır.";
                    this.selamlama = "Kurtuluş Parkı'na gitmek istediniz... ";
                    break;
                case 1:
                    System.out.println("\nGöksu Parkı'na gezmeye gideceksiniz...");
                    this.isim = "Göksü Parkı";
                    this.özelAlan = "Göksu Parkın'a ait olan özel alan piknik alanı ve sinema salonudur şimdiden iyi eğlenceler dileriz.";
                    this.kafeVar = "Göksu Parkı'nda tek başınıza veya arkadaşlarınızla oturabileceğiniz hem de bir şeyler alabileceğiniz kafeler bulunmaktadır.";
                    this.selamlama = "Göksu Parkı'na gitmek istediniz... ";
                    break;
                case 2:
                    System.out.println("\nSeğmenler Parkı'na gezmeye gideceksiniz...");
                    this.isim = "Seğmenler Parkı";
                    this.özelAlan = "Seğmenler Parkın'a ait olan özel alan amfi tiyatro ve geniş gezi alanları vardır şimdiden iyi eğlenceler dileriz.";
                    this.kafeVar = "Seğmenler Parkı'nda tek başınıza veya arkadaşlarınızla oturabileceğiniz hem de bir şeyler alabileceğiniz kafeler bulunmaktadır.";
                    this.selamlama = "Seğmenler Parkı'na gitmek istediniz... ";
                    break;
                case 3:
                    System.out.println("\nMogan Parkı'na gezmeye gideceksiniz...");
                    this.isim = "Mogan Parkı";
                    this.özelAlan = "Mogan Parkın'a ait olan özel alan özel mangal yakma alanları ve farklı eğlence imkanları vardır şimdiden iyi eğlenceler dileriz.";
                    this.kafeVar = "Mogan Parkı'nda tek başınıza veya arkadaşlarınızla oturabileceğiniz hem de bir şeyler alabileceğiniz kafeler bulunmaktadır.";
                    this.selamlama = "Mogan Parkı'na gitmek istediniz... ";
                    break;
                default:
                    System.out.println("\nYanlış bir tuşlama yaptınız  parklar ekranına tekrardan yönlendiriliyorsunuz");

            }
        }

    public void bilgilerigoster(){

        System.out.println("\n" +this.selamlama);
        System.out.println(this.kafeVar);
        System.out.println(this.özelAlan);

    }
}
