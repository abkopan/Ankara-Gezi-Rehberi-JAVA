import java.util.Scanner;

public class müzeCalistir {

    public void müzeCalistir(){
        Scanner klavye=new Scanner(System.in);
        int a=0;
        while(a==0){
            System.out.println("\n\n******** MÜZELER EKRANINA HOŞGELDİNİZ ********\n");
            System.out.println("1- Resim ve Heykel Müzesi\n" +
                    "2-Etnografya Müzesi\n" +
                    "3-Ulucanlar Cezaevi Müzesi\n" +
                    "4-Kelime Müzesi\n");
            System.out.println("Yukarıd listelenen müzelerden hangisini gezmek istersiniz ?");
            System.out.print("Cevabınız: ");
            int secim= klavye.nextInt();
            klavye.nextLine();
            switch(secim){
                default:
                    System.out.println("Yanlış bir tuşlama yaptınız Müzeler ekranına tekrardan yönlendiriliyorsunuz...");
                    a=0;
                    break;
                case 1:
                   resimHeykel resimHeykel=new resimHeykel();
                   if (resimHeykel.MüzeKart()){
                       System.out.println("\nBu seçimlerinizden memnun musunuz ? ( Evet ya da Hayır )");
                       System.out.print("Cevabınız: ");
                       String secim1= klavye.nextLine();
                       if (secim1.equalsIgnoreCase("Evet")){
                           System.out.println("\n***** İYİ EĞLENCELER DİLERİZ *****");
                           a=1;
                       }
                       else {
                           a=0;
                           System.out.println("Müzeler ekranına tekrardan yönlendiriliyorsunuz...");
                       }
                   }
                   else {
                       System.out.println("\nBu seçimlerinizden memnun musunuz ? ( Evet ya da Hayır )");
                       System.out.print("Cevabınız: ");
                       String secim1= klavye.nextLine();
                       if (secim1.equalsIgnoreCase("Evet")){
                           System.out.println("\n***** İYİ EĞLENCELER DİLERİZ *****");
                           a=1;
                       }
                       else {
                           a=0;
                           System.out.println("Müzeler ekranına tekrardan yönlendiriliyorsunuz...");
                       }
                   }
                   break;
                case 2:
                    etnografya etnografya =new etnografya();
                    if (etnografya.MüzeKart()){
                        System.out.println("\nBu seçimlerinizden memnun musunuz ? ( Evet ya da Hayır )");
                        System.out.print("Cevabınız: ");
                        String secim1= klavye.nextLine();
                        if (secim1.equalsIgnoreCase("Evet")){
                            System.out.println("\n***** İYİ EĞLENCELER DİLERİZ *****");
                            a=1;
                        }
                        else {
                            a=0;
                            System.out.println("Müzeler ekranına tekrardan yönlendiriliyorsunuz...");
                        }
                    }
                    else {
                        System.out.println("\nBu seçimlerinizden memnun musunuz ? ( Evet ya da Hayır )");
                        System.out.print("Cevabınız: ");
                        String secim1= klavye.nextLine();
                        if (secim1.equalsIgnoreCase("Evet")){
                            System.out.println("\n***** İYİ EĞLENCELER DİLERİZ *****");
                            a=1;
                        }
                        else {
                            a=0;
                            System.out.println("Müzeler ekranına tekrardan yönlendiriliyorsunuz...");
                        }
                    }
                    break;
                case 3 :
                    ulucanlar ulucanlar=new ulucanlar();
                    if (ulucanlar.MüzeKart()){
                        System.out.println("\nBu seçimlerinizden memnun musunuz ? ( Evet ya da Hayır )");
                        System.out.print("Cevabınız: ");
                        String secim1= klavye.nextLine();
                        if (secim1.equalsIgnoreCase("Evet")){
                            System.out.println("\n***** İYİ EĞLENCELER DİLERİZ *****");
                            a=1;
                        }
                        else {
                            a=0;
                            System.out.println("Müzeler ekranına tekrardan yönlendiriliyorsunuz...");
                        }
                    }
                    else {
                        System.out.println("\nBu seçimlerinizden memnun musunuz ? ( Evet ya da Hayır )");
                        System.out.print("Cevabınız: ");
                        String secim1= klavye.nextLine();
                        if (secim1.equalsIgnoreCase("Evet")){
                            System.out.println("\n***** İYİ EĞLENCELER DİLERİZ *****");
                            a=1;
                        }
                        else {
                            a=0;
                            System.out.println("Müzeler ekranına tekrardan yönlendiriliyorsunuz...");
                        }
                    }
                    break;
                case 4:
                    kelime kelime=new kelime();
                    if (kelime.MüzeKart()){
                        System.out.println("\nBu seçimlerinizden memnun musunuz ? ( Evet ya da Hayır )");
                        System.out.print("Cevabınız: ");
                        String secim1= klavye.nextLine();
                        if (secim1.equalsIgnoreCase("Evet")){
                            System.out.println("\n***** İYİ EĞLENCELER DİLERİZ *****");
                            a=1;
                        }
                        else {
                            a=0;
                            System.out.println("Müzeler ekranına tekrardan yönlendiriliyorsunuz...");
                        }
                    }
                    else {
                        System.out.println("\nBu seçimlerinizden memnun musunuz ? ( Evet ya da Hayır )");
                        System.out.print("Cevabınız: ");
                        String secim1= klavye.nextLine();
                        if (secim1.equalsIgnoreCase("Evet")){
                            System.out.println("\n***** İYİ EĞLENCELER DİLERİZ *****");
                            a=1;
                        }
                        else {
                            a=0;
                            System.out.println("Müzeler ekranına tekrardan yönlendiriliyorsunuz...");
                        }
                    }
                    break;

            }
        }
    }
}


