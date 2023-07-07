import java.util.Scanner;

public class nataVegarandom implements Avm {

    public static int random() {
        int b= (int) (Math.random()*4) ;
        return b;
    }
    public static int random3() {
        int b= (int) (Math.random()*3) ;
        return b;
    }
        private boolean sinema;
        private boolean mağaza;
        private boolean yemek;
        private boolean özgüalan;
        public nataVegarandom() throws InterruptedException {  // CONSTRUCTOR

            Scanner klavye = new Scanner(System.in);
            System.out.println("***** NATAVEGA ALIŞVERİŞ MERKEZİ *****");
            System.out.println("\t1-Sinema\n" +
                    "\t2-Mağaza\n" +
                    "\t3-Yemek\n" +
                    "\t4-Alışveriş Merkezine Özgü Alan\n");
            System.out.println("***********************************************************\n");
            Thread.sleep(500);
            switch (random()){
                case 0:
                    this.sinema=true;
                    this.mağaza=false;
                    this.yemek=false;
                    this.özgüalan=false;
                    break;
                case 1:
                    this.sinema=false;
                    this.mağaza=true;
                    this.yemek=false;
                    this.özgüalan=false;
                    break;
                case 2:
                    this.sinema=false;
                    this.mağaza=false;
                    this.yemek=true;
                    this.özgüalan=false;
                    break;
                case 3:
                    this.sinema=false;
                    this.mağaza=false;
                    this.yemek=false;
                    this.özgüalan=true;
                    break;
                default:
                    break;
            }
        }


        @Override
        public boolean sinema() throws InterruptedException {
            if(this.sinema==true){
                Scanner klavye=new Scanner(System.in);
                System.out.println("***** SİNEMA SEÇİM EKRANI *****");
                System.out.println("\n1-Issız Ada ( 35 TL )\n" +
                        "2-Recep İvedik 7 ( 30 TL )\n" +
                        "3-Avatar 2  ( 70 TL )\n" +
                        "4-Korku Seansı 3 ( 50 TL )\n");
                System.out.println("***********************************************************\n");
                Thread.sleep(500);
                switch (random()){
                    case 0:
                        System.out.println("\nIssız Ada filmine gideceksiniz maaliyetinize 35 tl eklenecektir...");
                        break;
                    case 1:
                        System.out.println("\nRecep İvedik 7 filmine gideceksiniz maaliyetinize 30 tl eklenecektir...");
                        break;
                    case 2:
                        System.out.println("\nAvatar 2 filmine gideceksiniz maaliyetinize 70 tl eklenecektir...");
                        break;
                    case 3:
                        System.out.println("\nKorku Seansı 3 filmine gideceksiniz maaliyetinize 50 tl eklenecektir...");
                    default:
                        break;
                }
                return true;
            }
            else{
                return false;
            }
        }

        @Override
        public boolean mağaza() throws InterruptedException {
            if(this.mağaza==true){
                Scanner klavye=new Scanner(System.in);
                System.out.println("***** MAĞAZALAR EKRANI *****");
                System.out.println("\n1-Lc Waikiki\n" +
                        "2-Defacto\n" +
                        "3-MediaMarkt\n" +
                        "4-Zen Pırlanta\n");
                System.out.println("***********************************************************\n");
                Thread.sleep(500);
                switch (random()){
                    case 0:
                        System.out.println("Lc Waikiki mağazasına uğrayacaksınız buradan kesinlikle alışveriş yapacak mısınız ? (Evet ya da Hayır)");
                        System.out.print("Cevabınız: ");
                        String alisveris= klavye.nextLine();
                        if(alisveris.equalsIgnoreCase("evet")){
                            System.out.println("Yaptığınız alışveriş doğrultusunda maaliyetiniz artacaktır.");
                        }
                        else{
                            System.out.println("Alışveriş yapmayacaksınız...");
                        }
                        break;
                    case 1:
                        System.out.println("Defacto mağazasına uğrayacaksınız buradan kesinlikle alışveriş yapacak mısınız ? (Evet ya da Hayır)");
                        System.out.print("Cevabınız: ");
                        String alisveris2= klavye.nextLine();
                        if(alisveris2.equalsIgnoreCase("evet")){
                            System.out.println("Yaptığınız alışveriş doğrultusunda maaliyetiniz artacaktır.");
                        }
                        else{
                            System.out.println("Alışveriş yapmayacaksınız...");
                        }
                        break;
                    case 2:
                        System.out.println("MediaMarkt mağazasına uğrayacaksınız buradan kesinlikle alışveriş yapacak mısınız ? (Evet ya da Hayır)");
                        System.out.print("Cevabınız: ");
                        String alisveris3= klavye.nextLine();
                        if(alisveris3.equalsIgnoreCase("evet")){
                            System.out.println("Yaptığınız alışveriş doğrultusunda maaliyetiniz artacaktır.");
                       }
                        else{
                            System.out.println("Alışveriş yapmayacaksınız...");
                        }
                        break;
                    case 3:
                        System.out.println("Zen Pırlanta mağazasına uğrayacaksınız buradan kesinlikle alışveriş yapacak mısınız ? (Evet ya da Hayır)");
                        System.out.print("Cevabınız: ");
                        String alisveris4= klavye.nextLine();
                        if(alisveris4.equalsIgnoreCase("evet")){
                            System.out.println("Yaptığınız alışveriş doğrultusunda maaliyetiniz artacaktır.");
                        }
                        else{
                            System.out.println("Alışveriş yapmayacaksınız...");
                        }
                        break;
                }
                return true;
            }
            else{
                return false;
            }


        }

        @Override
        public boolean yemek() throws InterruptedException {
            if(this.yemek==true){
                System.out.println("***** RESTORAN EKRANI *****");
                Scanner klavye=new Scanner(System.in);
                System.out.println("\n1-Tavuk Dünyası\n" +
                        "2-Burger King\n" +
                        "3-Öncü Döner\n" +
                        "4-Helvacı Ali\n");
                System.out.println("***********************************************************\n");
                Thread.sleep(500);
                switch (random3()){
                    case 0:
                        System.out.println("Tavuk Dünyasın'da yemek yiyeceksiniz menüler listeleniyor...");
                        System.out.println("1-Kekiklim + Kola (80 TL)\n" +
                                "2-Baharatlım + Kola (70 TL)\n" +
                                "3-Kremantar + Kola (85 TL)\n");
                        System.out.print("Menü Seçiminiz: ");
                        switch (random()){
                            case 0:
                                System.out.println("Kekiklim menüsünü yiyeceksiniz maaliyetinize 80 TL ekleniyor...");
                                break;
                            case 1:
                                System.out.println("Baharatlım menüsünü yiyeceksiniz maaliyetinize 70 TL ekleniyor...");
                                break;
                            case 2:
                                System.out.println("Kremantar menüsünü yiyeceksiniz maaliyetinize 85 TL ekleniyor...");
                                break;
                        }
                        break;
                    case 1:
                        System.out.println("Burger King'de yemek yiyeceksiniz menüler listeleniyor...");
                        System.out.println("1- 2'li Tavukburger Menü ( 55TL )\n" +
                                "2- Whopper Menü ( 70 TL )\n" +
                                "3- King Chicken Menü ( 60 TL )\n");
                        System.out.print("Menü Seçiminiz: ");
                        switch (random3()){
                            case 0:
                                System.out.println("2'li Tavukburger Menüyü yiyeceksiniz maaliyetinize 55 TL ekleniyor...");
                                break;
                            case 1:
                                System.out.println("Whopper Menüyü yiyeceksiniz maaliyetinize 70 TL ekleniyor...");
                                break;
                            case 2:
                                System.out.println("King Chicken Menüyü yiyeceksiniz maaliyetinize 60 TL ekleniyor...");
                                break;
                        }
                        break;
                    case 2:
                        System.out.println("Öncü Döner'de yemek yiyeceksiniz menüler listeleniyor...");
                        System.out.println("1-Zurna Dürüm Menü ( 65 TL )\n" +
                                "2-Normal Dürüm Menü ( 55 TL )\n" +
                                "3-Çift Lavaş Dürüm Menü ( 50 TL )\n");
                        System.out.print("Menü seçiminiz: ");
                        switch (random3()){
                            case 0:
                                System.out.println("Zurna Dürüm Menüyü yiyeceksiniz maaliyetinize 65 TL ekleniyor...");
                                break;
                            case 1:
                                System.out.println("Normal Dürüm Menüyü yiyeceksiniz maaliyetinize 55 TL ekleniyor...");
                                break;
                            case 2:
                                System.out.println("Çift Lavaş Dürüm Menüyü yiyeceksiniz maaliyetinize 50 TL ekleniyor...");
                                break;
                        }
                        break;
                    case 3:
                        System.out.println("Helvacı Ali'den helva yiyeceksiniz helvalar listeleniyor...");
                        System.out.println("1- Standart İrmik Helvası (25 TL - 30TL - 35 TL)\n" +
                                "2-Çikolatalı İrmik Helvası (30 TL - 35 Tl - 40 TL)\n" +
                                "3-Cennet Çamuru (45 TL - 50 TL - 55 TL)\n");
                        System.out.print("Menü seçiminiz: ");
                        switch (random3()){
                            case 0:
                                int a=0;
                                System.out.println("Standart İrmik Helvasını yiyeceksiniz.");
                                while(a==0) {
                                    System.out.println("\nHangi boyutta helva tercih edersiniz ? ( Küçük Orta Büyük )");
                                    System.out.print("Tercihiniz: ");
                                    String boyutsecim = klavye.nextLine();
                                    if (boyutsecim.equalsIgnoreCase("küçük")) {
                                        System.out.println("Küçük boy Standart İrmik Helvası tercih ettiniz maaliyetinize 25 TL ekleniyor...");
                                        a=1;
                                    } else if (boyutsecim.equalsIgnoreCase("orta")) {
                                        System.out.println("Orta boy Standart İrmik Helvası tercih ettiniz maaliyetinize 30 TL ekleniyor...");
                                        a=1;
                                    } else if (boyutsecim.equalsIgnoreCase("büyük")) {
                                        System.out.println("Büyük boy Standart İrmik Helvası tercih ettiniz maaliyetinize 35 TL ekleniyor...");
                                        a=1;
                                    }
                                    else{
                                        System.out.println("Yanlış bir tuşlama yaptınız boyut seçme ekranına tekrardan yönlendiriliyorsunuz...");
                                        a=0;
                                    }
                                }
                                break;
                            case 1:
                                int b=0;
                                System.out.println("Çikolatalı İrmik Helvasını yiyeceksiniz.");
                                while(b==0) {
                                    System.out.println("\nHangi boyutta helva tercih edersiniz ? ( Küçük Orta Büyük )");
                                    System.out.print("Tercihiniz: ");
                                    String boyutsecim = klavye.nextLine();
                                    if (boyutsecim.equalsIgnoreCase("küçük")) {
                                        System.out.println("Küçük boy Çikolatalı İrmik Helvası tercih ettiniz maaliyetinize 30 TL ekleniyor...");
                                        b=1;
                                    } else if (boyutsecim.equalsIgnoreCase("orta")) {
                                        System.out.println("Orta boy Çikolatalı İrmik Helvası tercih ettiniz maaliyetinize 35 TL ekleniyor...");
                                        b=1;
                                    } else if (boyutsecim.equalsIgnoreCase("büyük")) {
                                        System.out.println("Büyük boy Çikolatalı İrmik Helvası tercih ettiniz maaliyetinize 40 TL ekleniyor...");
                                        b=1;
                                    }
                                    else{
                                        System.out.println("Yanlış bir tuşlama yaptınız boyut seçme ekranına tekrardan yönlendiriliyorsunuz...");
                                        b=0;
                                    }
                                }
                                break;
                            case 2:
                                int c=0;
                                System.out.println("Cennet Çamurunu yiyeceksiniz.");
                                while(c==0) {
                                    System.out.println("\nHangi boyutta helva tercih edersiniz ? ( Küçük Orta Büyük )");
                                    System.out.print("Tercihiniz: ");
                                    String boyutsecim = klavye.nextLine();
                                    if (boyutsecim.equalsIgnoreCase("küçük")) {
                                        System.out.println("Küçük boy Cennet Çamuru tercih ettiniz maaliyetinize 45 TL ekleniyor...");
                                        c=1;
                                    } else if (boyutsecim.equalsIgnoreCase("orta")) {
                                        System.out.println("Orta boy Cennet Çamuru tercih ettiniz maaliyetinize 50 TL ekleniyor...");
                                        c=1;
                                    } else if (boyutsecim.equalsIgnoreCase("büyük")) {
                                        System.out.println("Büyük boy Cennet Çamuru tercih ettiniz maaliyetinize 55 TL ekleniyor...");
                                        c=1;
                                    }
                                    else{
                                        System.out.println("Yanlış bir tuşlama yaptınız boyut seçme ekranına tekrardan yönlendiriliyorsunuz...");
                                        c=0;
                                    }
                                }
                                break;
                        }
                        break;

                }
                return true;
            }
            else{
                return false;
            }

        }

        @Override
        public boolean özgüalan() throws InterruptedException {
            if(this.özgüalan==true){
                System.out.println("***** ÖZGÜL ALAN EKRANI *****");
                System.out.println("\nNatavega alışveriş merkezinin diğer alışveriş merkezlerine göre özel olan eğlence alanı AQUAVEGA'dır ve giriş ücreti 70 TL dir " +
                        "maaliyetinize 70 tl ekleniyor...\n");
                System.out.println("***********************************************************\n");
                Thread.sleep(500);
                return true;
            }
            else{
                return false;
            }
        }
    }



