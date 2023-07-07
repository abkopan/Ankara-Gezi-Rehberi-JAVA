import java.util.Scanner;
public class Avmcalistir {
    public void calistir() {
        Scanner klavye = new Scanner(System.in);
        int a = 0;
        while (a == 0) {
            System.out.println("\n\n******** ALIŞVERİŞ MERKEZLERİ EKRANINA HOŞGELDİNİZ ********\n");
            System.out.println("\n1-Natavega\n" +
                    "2-AnkaMall\n" +
                    "3-Armada\n" +
                    "4-Forum Ankara\n");
            System.out.println("Alışveriş merkezlerimizden hangisini tercih etmek istersiniz ?");
            System.out.print("Seçiminiz: ");
            int avmsecim = klavye.nextInt();
            klavye.nextLine();
            switch (avmsecim) {
                default:
                    System.out.println("\nYanlış bir tuşlama yaptınız alışveriş merkezleri ekranına yönlendiriliyorsunuz...");
                    a=0;
                    break;
                case 1:
                    nataVega natavega = new nataVega();
                    if (natavega.sinema()) {
                        System.out.println("\nBu seçimlerinizden memnun musunuz ? ( Evet ya da Hayır )");
                        System.out.print("Cevabınız: ");
                        String secim1= klavye.nextLine();
                        if (secim1.equalsIgnoreCase("Evet")){
                            System.out.println("\n***** İYİ EĞLENCELER DİLERİZ *****");
                            a=1;
                        }
                        else {
                            a=0;
                            System.out.println("Alışveriş merkezleri ekranına tekrardan yönlendiriliyorsunuz...");
                        }
                    }
                    else if (natavega.mağaza()) {
                        System.out.println("\nBu seçimlerinizden memnun musunuz ? ( Evet ya da Hayır )");
                        System.out.print("Cevabınız: ");
                        String secim1= klavye.nextLine();
                        if (secim1.equalsIgnoreCase("Evet")){
                            System.out.println("\n***** İYİ EĞLENCELER DİLERİZ *****");
                            a=1;
                        }
                        else {
                            a=0;
                            System.out.println("Alışveriş merkezleri ekranına tekrardan yönlendiriliyorsunuz...");
                        }
                    }
                    else if (natavega.yemek()) {
                        System.out.println("\nBu seçimlerinizden memnun musunuz ? ( Evet ya da Hayır )");
                        System.out.print("Cevabınız: ");
                        String secim1= klavye.nextLine();
                        if (secim1.equalsIgnoreCase("Evet")){
                            System.out.println("\n***** İYİ EĞLENCELER DİLERİZ *****");
                            a=1;
                        }
                        else {
                            a=0;
                            System.out.println("Alışveriş merkezleri ekranına tekrardan yönlendiriliyorsunuz...");
                        }
                    }
                    else if (natavega.özgüalan()) {
                        System.out.println("\nBu seçimlerinizden memnun musunuz ? ( Evet ya da Hayır )");
                        System.out.print("Cevabınız: ");
                        String secim1= klavye.nextLine();
                        if (secim1.equalsIgnoreCase("Evet")){
                            System.out.println("\n***** İYİ EĞLENCELER DİLERİZ *****");
                            a=1;
                        }
                        else {
                            a=0;
                            System.out.println("Alışveriş merkezleri ekranına tekrardan yönlendiriliyorsunuz...");
                        }
                    }
                    break;
                case 2:
                    ankaMall ankaMall=new ankaMall();
                    if (ankaMall.sinema()) {
                        System.out.println("\nBu seçimlerinizden memnun musunuz ? ( Evet ya da Hayır )");
                        System.out.print("Cevabınız: ");
                        String secim1= klavye.nextLine();
                        if (secim1.equalsIgnoreCase("Evet")){
                            System.out.println("\n***** İYİ EĞLENCELER DİLERİZ *****");
                            a=1;
                        }
                        else {
                            a=0;
                            System.out.println("Alışveriş merkezleri ekranına tekrardan yönlendiriliyorsunuz...");
                        }
                    }
                    else if (ankaMall.mağaza()) {
                        System.out.println("\nBu seçimlerinizden memnun musunuz ? ( Evet ya da Hayır )");
                        System.out.print("Cevabınız: ");
                        String secim1= klavye.nextLine();
                        if (secim1.equalsIgnoreCase("Evet")){
                            System.out.println("\n***** İYİ EĞLENCELER DİLERİZ *****");
                            a=1;
                        }
                        else {
                            a=0;
                            System.out.println("Alışveriş merkezleri ekranına tekrardan yönlendiriliyorsunuz...");
                        }
                    }
                    else if (ankaMall.yemek()) {
                        System.out.println("\nBu seçimlerinizden memnun musunuz ? ( Evet ya da Hayır )");
                        System.out.print("Cevabınız: ");
                        String secim1= klavye.nextLine();
                        if (secim1.equalsIgnoreCase("Evet")){
                            System.out.println("\n***** İYİ EĞLENCELER DİLERİZ *****");
                            a=1;
                        }
                        else {
                            a=0;
                            System.out.println("Alışveriş merkezleri ekranına tekrardan yönlendiriliyorsunuz...");
                        }
                    }
                    else if (ankaMall.özgüalan()) {
                        System.out.println("\nBu seçimlerinizden memnun musunuz ? ( Evet ya da Hayır )");
                        System.out.print("Cevabınız: ");
                        String secim1= klavye.nextLine();
                        if (secim1.equalsIgnoreCase("Evet")){
                            System.out.println("\n***** İYİ EĞLENCELER DİLERİZ *****");
                            a=1;
                        }
                        else {
                            a=0;
                            System.out.println("Alışveriş merkezleri ekranına tekrardan yönlendiriliyorsunuz...");
                        }
                    }
                    break;
                case 3:
                    armada armada =new armada();
                    if (armada.sinema()) {
                        System.out.println("\nBu seçimlerinizden memnun musunuz ? ( Evet ya da Hayır )");
                        System.out.print("Cevabınız: ");
                        String secim1= klavye.nextLine();
                        if (secim1.equalsIgnoreCase("Evet")){
                            System.out.println("\n***** İYİ EĞLENCELER DİLERİZ *****");
                            a=1;
                        }
                        else {
                            a=0;
                            System.out.println("Alışveriş merkezleri ekranına tekrardan yönlendiriliyorsunuz...");
                        }
                    }
                    else if (armada.mağaza()) {
                        System.out.println("\nBu seçimlerinizden memnun musunuz ? ( Evet ya da Hayır )");
                        System.out.print("Cevabınız: ");
                        String secim1= klavye.nextLine();
                        if (secim1.equalsIgnoreCase("Evet")){
                            System.out.println("\n***** İYİ EĞLENCELER DİLERİZ *****");
                            a=1;
                        }
                        else {
                            a=0;
                            System.out.println("Alışveriş merkezleri ekranına tekrardan yönlendiriliyorsunuz...");
                        }
                    }
                    else if (armada.yemek()) {
                        System.out.println("\nBu seçimlerinizden memnun musunuz ? ( Evet ya da Hayır )");
                        System.out.print("Cevabınız: ");
                        String secim1= klavye.nextLine();
                        if (secim1.equalsIgnoreCase("Evet")){
                            System.out.println("\n***** İYİ EĞLENCELER DİLERİZ *****");
                            a=1;
                        }
                        else {
                            a=0;
                            System.out.println("Alışveriş merkezleri ekranına tekrardan yönlendiriliyorsunuz...");
                        }
                    }
                    else if (armada.özgüalan()) {
                        System.out.println("\nBu seçimlerinizden memnun musunuz ? ( Evet ya da Hayır )");
                        System.out.print("Cevabınız: ");
                        String secim1= klavye.nextLine();
                        if (secim1.equalsIgnoreCase("Evet")){
                            System.out.println("\n***** İYİ EĞLENCELER DİLERİZ *****");
                            a=1;
                        }
                        else {
                            a=0;
                            System.out.println("Alışveriş merkezleri ekranına tekrardan yönlendiriliyorsunuz...");
                        }
                    }
                    break;
                case 4:
                    forumAnkara forumAnkara =new forumAnkara();
                    if (forumAnkara.sinema()) {
                        System.out.println("\nBu seçimlerinizden memnun musunuz ? ( Evet ya da Hayır )");
                        System.out.print("Cevabınız: ");
                        String secim1= klavye.nextLine();
                        if (secim1.equalsIgnoreCase("Evet")){
                            System.out.println("\n***** İYİ EĞLENCELER DİLERİZ *****");
                            a=1;
                        }
                        else {
                            a=0;
                            System.out.println("Alışveriş merkezleri ekranına tekrardan yönlendiriliyorsunuz...");
                        }
                    }
                    else if (forumAnkara.mağaza()) {
                        System.out.println("\nBu seçimlerinizden memnun musunuz ? ( Evet ya da Hayır )");
                        System.out.print("Cevabınız: ");
                        String secim1= klavye.nextLine();
                        if (secim1.equalsIgnoreCase("Evet")){
                            System.out.println("\n***** İYİ EĞLENCELER DİLERİZ *****");
                            a=1;
                        }
                        else {
                            a=0;
                            System.out.println("Alışveriş merkezleri ekranına tekrardan yönlendiriliyorsunuz...");
                        }
                    }
                    else if (forumAnkara.yemek()) {
                        System.out.println("\nBu seçimlerinizden memnun musunuz ? ( Evet ya da Hayır )");
                        System.out.print("Cevabınız: ");
                        String secim1= klavye.nextLine();
                        if (secim1.equalsIgnoreCase("Evet")){
                            System.out.println("\n***** İYİ EĞLENCELER DİLERİZ *****");
                            a=1;
                        }
                        else {
                            a=0;
                            System.out.println("Alışveriş merkezleri ekranına tekrardan yönlendiriliyorsunuz...");
                        }
                    }
                    else if (forumAnkara.özgüalan()) {
                        System.out.println("\nBu seçimlerinizden memnun musunuz ? ( Evet ya da Hayır )");
                        System.out.print("Cevabınız: ");
                        String secim1= klavye.nextLine();
                        if (secim1.equalsIgnoreCase("Evet")){
                            System.out.println("\n***** İYİ EĞLENCELER DİLERİZ *****");
                            a=1;
                        }
                        else {
                            a=0;
                            System.out.println("Alışveriş merkezleri ekranına tekrardan yönlendiriliyorsunuz...");
                        }
                    }
                    break;
            }
        }
    }
}

