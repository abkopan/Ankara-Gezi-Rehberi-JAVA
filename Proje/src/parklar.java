import java.util.Scanner;

public class parklar {
    private String isim;
    private String özelAlan;
    private String kafeVar;
    private String selamlama;

    public parklar(){
        Scanner klavye=new Scanner(System.in);
        int a=0;
        while(a==0) {
            System.out.println("\n\n******** PARKLAR EKRANINA HOŞGELDİNİZ ********\n");
            System.out.println("1-Kurtuluş Parkı\n" +
                    "2-Göksu Parkı\n" +
                    "3-Seğmenler Parkı\n" +
                    "4-Mogan Parkı\n");
            System.out.println("Yukarıdaki parklardan hangisine gitmek istersiniz ?");
            System.out.print("Cevabınız: ");
            int secim = klavye.nextInt();
            klavye.nextLine();
            switch (secim) {
                case 1:
                    System.out.println("\nKurtuluş Parkı'na gezmeye gideceksiniz...");
                    this.isim = "Kurtuluş Parkı";
                    this.özelAlan = "Kurtuluş Parkın'a ait olan özel alan yürüyüş alanı ve masa tenisi oynama alanıdır şimdiden iyi eğlenceler dileriz.";
                    this.kafeVar = "Kurtuluş Parkı'nda tek başınıza veya arkadaşlarınızla oturabileceğiniz hem de bir şeyler alabileceğiniz bir kafe bulunmaktadır.";
                    this.selamlama = "Kurtuluş Parkı'na gitmek istediniz... ";
                    System.out.println("\nBu park seçiminizden memnun musunuz ? ( Evet ya da Hayır )");
                    System.out.print("Cevabınız: ");
                    String secim1= klavye.nextLine();
                    if (secim1.equalsIgnoreCase("Evet")){
                        System.out.println("İyi eğlenceler dileriz...");
                    }
                    else {
                        System.out.println("Parklar ekranına tekrardan yönlendiriliyorsunuz...");
                    }
                    a=1;
                    break;
                case 2:
                    System.out.println("\nGöksu Parkı'na gezmeye gideceksiniz...");
                    this.isim = "Göksü Parkı";
                    this.özelAlan = "Göksu Parkın'a ait olan özel alan piknik alanı ve sinema salonudur şimdiden iyi eğlenceler dileriz.";
                    this.kafeVar = "Göksu Parkı'nda tek başınıza veya arkadaşlarınızla oturabileceğiniz hem de bir şeyler alabileceğiniz kafeler bulunmaktadır.";
                    this.selamlama = "Göksu Parkı'na gitmek istediniz... ";
                    System.out.println("\nBu park seçiminizden memnun musunuz ? ( Evet ya da Hayır )");
                    System.out.print("Cevabınız: ");
                    String secim2= klavye.nextLine();
                    if (secim2.equalsIgnoreCase("Evet")){
                        System.out.println("İyi eğlenceler dileriz...");
                    }
                    else {
                        System.out.println("Parklar ekranına tekrardan yönlendiriliyorsunuz...");
                    }
                    a=1;
                    break;
                case 3:
                    System.out.println("\nSeğmenler Parkı'na gezmeye gideceksiniz...");
                    this.isim = "Seğmenler Parkı";
                    this.özelAlan = "Seğmenler Parkın'a ait olan özel alan amfi tiyatro ve geniş gezi alanları vardır şimdiden iyi eğlenceler dileriz.";
                    this.kafeVar = "Seğmenler Parkı'nda tek başınıza veya arkadaşlarınızla oturabileceğiniz hem de bir şeyler alabileceğiniz kafeler bulunmaktadır.";
                    this.selamlama = "Seğmenler Parkı'na gitmek istediniz... ";
                    System.out.println("\nBu park seçiminizden memnun musunuz ? ( Evet ya da Hayır )");
                    System.out.print("Cevabınız: ");
                    String secim3= klavye.nextLine();
                    if (secim3.equalsIgnoreCase("Evet")){
                        System.out.println("İyi eğlenceler dileriz...");
                    }
                    else {
                        System.out.println("Parklar ekranına tekrardan yönlendiriliyorsunuz...");
                    }
                    a=1;
                    break;
                case 4:
                    System.out.println("\nMogan Parkı'na gezmeye gideceksiniz...");
                    this.isim = "Mogan Parkı";
                    this.özelAlan = "Mogan Parkın'a ait olan özel alan özel mangal yakma alanları ve farklı eğlence imkanları vardır şimdiden iyi eğlenceler dileriz.";
                    this.kafeVar = "Mogan Parkı'nda tek başınıza veya arkadaşlarınızla oturabileceğiniz hem de bir şeyler alabileceğiniz kafeler bulunmaktadır.";
                    this.selamlama = "Mogan Parkı'na gitmek istediniz... ";
                    System.out.println("\nBu park seçiminizden memnun musunuz ? ( Evet ya da Hayır )");
                    System.out.print("Cevabınız: ");
                    String secim4= klavye.nextLine();
                    if (secim4.equalsIgnoreCase("Evet")){
                        System.out.println("İyi eğlenceler dileriz...");
                    }
                    else {
                        System.out.println("Parklar ekranına tekrardan yönlendiriliyorsunuz...");
                    }
                    a=1;
                    break;
                default:
                    System.out.println("\nYanlış bir tuşlama yaptınız  parklar ekranına tekrardan yönlendiriliyorsunuz");
                    a=0;
            }
        }
    }

    public void bilgilerigoster(){

        System.out.println("\n" +this.selamlama);
        System.out.println(this.kafeVar);
        System.out.println(this.özelAlan);

    }

}
