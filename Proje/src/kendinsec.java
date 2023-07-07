import java.util.Scanner;

public class kendinsec {

    public void kendinsec(){
        Scanner klavye = new Scanner(System.in);
        int a = 0;
        int secim = 0;
        while (a == 0) {
            System.out.println("1-Alışveriş Merkezleri\n" +
                    "2-Müzeler\n" +
                    "3-Parklar\n" +
                    "4-Diğer\n");
            System.out.println("Bugün yukarıdaki seçeneklerden hangisini gezmek istersiniz ?");
            System.out.print("Seçiminiz: ");
            secim = klavye.nextInt();
            klavye.nextLine();
            switch (secim) {
                default:
                    System.out.println("\nYanlış bir tuşlama yaptınız ana ekrana yönlendiriliyorsunuz...");
                    a=0;
                    break;
                case 1:
                    System.out.println("\nAlışveriz Merkezlerini gezmek istediğinizden emin misiniz ? ( Evet ya da Hayır)");
                    System.out.print("Cevabınız: ");
                    String secim1 = klavye.nextLine();
                    if (secim1.equalsIgnoreCase("evet")) {
                        System.out.println("Alışveriş Merkezleri ekranına yönlendiriliyorsunuz...");
                        Avmcalistir avm = new Avmcalistir();
                        avm.calistir();
                        a = 1;
                    } else if (secim1.equalsIgnoreCase("hayır")) {
                        System.out.println("Ana ekrana yönlendiriliyorsunuz...");
                        a = 0;
                    } else {
                        System.out.println("Yanlış bir tuşlama yaptınız ana ekrana yönlendiriliyorsunuz...");
                        a = 0;
                    }
                    break;
                case 2:
                    System.out.println("\nMüzeleri gezmek istediğinizden emin misiniz ? ( Evet ya da Hayır)");
                    System.out.print("Cevabınız: ");
                    String secim2 = klavye.nextLine();
                    if (secim2.equalsIgnoreCase("evet")) {
                        System.out.println("Müzeler ekranına yönlendiriliyorsunuz...");
                        müzeCalistir müze=new müzeCalistir();
                        müze.müzeCalistir();
                        a = 1;
                    } else if (secim2.equalsIgnoreCase("hayır")) {
                        System.out.println("Ana ekrana yönlendiriliyorsunuz...");
                        a = 0;
                    } else {
                        System.out.println("Yanlış bir tuşlama yaptınız ana ekrana yönlendiriliyorsunuz...");
                        a = 0;
                    }
                    break;
                case 3:
                    System.out.println("\nParkları gezmek istediğinizden emin misiniz ? ( Evet ya da Hayır)");
                    System.out.print("Cevabınız: ");
                    String secim3 = klavye.nextLine();
                    if (secim3.equalsIgnoreCase("evet")) {
                        System.out.println("\nParklar ekranına yönlendiriliyorsunuz...");
                        parklar parklar=new parklar();
                        parklar.bilgilerigoster();
                        a = 1;
                    } else if (secim3.equalsIgnoreCase("hayır")) {
                        System.out.println("Ana ekrana yönlendiriliyorsunuz...");
                        a = 0;
                    } else {
                        System.out.println("Yanlış bir tuşlama yaptınız ana ekrana yönlendiriliyorsunuz...");
                        a = 0;
                    }
                    break;
                case 4:
                    System.out.println("\nDiğer yerleri gezmek istediğinizden emin misiniz ? ( Evet ya da Hayır)");
                    System.out.print("Cevabınız: ");
                    String secim4 = klavye.nextLine();
                    if (secim4.equalsIgnoreCase("evet")) {
                        System.out.println("\nDiğer etkinlikler ekranına yönlendiriliyorsunuz...");
                        digerCalistir digerCalistir=new digerCalistir();
                        digerCalistir.calistir();
                        a = 1;
                    } else if (secim4.equalsIgnoreCase("hayır")) {
                        System.out.println("Ana ekrana yönlendiriliyorsunuz...");
                        a = 0;
                    } else {
                        System.out.println("Yanlış bir tuşlama yaptınız ana ekrana yönlendiriliyorsunuz...");
                        a = 0;
                    }
                    break;

            }


        }
    }
}

