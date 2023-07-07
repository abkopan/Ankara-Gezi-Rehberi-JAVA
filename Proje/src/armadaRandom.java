import java.util.Scanner;

public class armadaRandom implements Avm {
    public static int random2(){
        int b= (int) (Math.random()*3) ;
        return b;
    }

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

        public armadaRandom() throws InterruptedException {  // CONSTRUCTOR

            Scanner klavye = new Scanner(System.in);
            Thread.sleep(500);
            System.out.println("***** ARMADA ALIŞVERİŞ MERKEZİ *****");
            System.out.println("\t1-Sinema\n" +
                    "\t2-Mağaza\n" +
                    "\t3-Yemek\n" +
                    "\t4-Alışveriş Merkezine Özgü Alan\n");
            System.out.println("***********************************************************\n");
            Thread.sleep(500);
            switch (random()) {
                case 0:
                    this.sinema = true;
                    this.mağaza = false;
                    this.yemek = false;
                    this.özgüalan = false;
                    break;
                case 1:
                    this.sinema = false;
                    this.mağaza = true;
                    this.yemek = false;
                    this.özgüalan = false;
                    break;
                case 2:
                    this.sinema = false;
                    this.mağaza = false;
                    this.yemek = true;
                    this.özgüalan = false;
                    break;
                case 3:
                    this.sinema = false;
                    this.mağaza = false;
                    this.yemek = false;
                    this.özgüalan = true;
                    break;
                default:
                    break;
            }
        }

        @Override
        public boolean sinema() throws InterruptedException {
            if (this.sinema == true) {
                System.out.println("***** SİNEMA EKRANI *****");
                Scanner klavye = new Scanner(System.in);
                System.out.println("\n1-Müjdemi İsterim ( 50 TL )\n" +
                        "2-Panda ve Sevimli Canavarlar ( 60 TL )\n" +
                        "3-Black Panther : Yaşasın Wakanda  ( 70 TL )\n" +
                        "4-Black Adam ( 65 TL )\n");
                System.out.println("***********************************************************\n");
                Thread.sleep(500);
                switch (random()) {
                    case 0:
                        System.out.println("Müjdemi İsterim filmine gideceksiniz maaliyetinize 50 tl eklenecektir...");
                        break;
                    case 1:
                        System.out.println("Panda ve Sevimli Canavarlar filmine gideceksiniz maaliyetinize 60 tl eklenecektir...");
                        break;
                    case 2:
                        System.out.println("Black Panther : Yaşasın Wakanda filmine gideceksiniz maaliyetinize 70 tl eklenecektir...");
                        break;
                    case 3:
                        System.out.println("Black Adam filmine gideceksiniz maaliyetinize 65 tl eklenecektir...");
                    default:
                        break;
                }
                return true;
            } else {
                return false;
            }
        }

        @Override
        public boolean mağaza() throws InterruptedException {
            if (this.mağaza == true) {
                System.out.println("***** MAĞAZA EKRANI *****");
                Scanner klavye = new Scanner(System.in);
                System.out.println("\n1-D&R\n" +
                        "2-5M Migros\n" +
                        "3-Adidas\n" +
                        "4-Swatch\n");
                System.out.println("***********************************************************\n");
                Thread.sleep(500);
                switch (random()) {
                    case 0:
                        System.out.println("D&R mağazasına uğrayacaksınız buradan kesinlikle alışveriş yapacak mısınız ? (Evet ya da Hayır)");
                        System.out.print("Cevabınız: ");
                        String alisveris = klavye.nextLine();
                        if (alisveris.equalsIgnoreCase("evet")) {
                            System.out.println("Yaptığınız alışveriş doğrultusunda maaliyetiniz artacaktır.");
                        } else {
                            System.out.println("Alışveriş yapmayacaksınız...");
                        }
                        break;
                    case 1:
                        System.out.println("5M Migros'a uğrayacaksınız buradan kesinlikle alışveriş yapacak mısınız ? (Evet ya da Hayır)");
                        System.out.print("Cevabınız: ");
                        String alisveris2 = klavye.nextLine();
                        if (alisveris2.equalsIgnoreCase("evet")) {
                            System.out.println("Yaptığınız alışveriş doğrultusunda maaliyetiniz artacaktır.");
                        } else {
                            System.out.println("Alışveriş yapmayacaksınız...");
                        }
                        break;
                    case 2:
                        System.out.println("Adidas mağazasına uğrayacaksınız buradan kesinlikle alışveriş yapacak mısınız ? (Evet ya da Hayır)");
                        System.out.println("Cevabınız: ");
                        String alisveris3 = klavye.nextLine();
                        if (alisveris3.equalsIgnoreCase("evet")) {
                            System.out.print("Yaptığınız alışveriş doğrultusunda maaliyetiniz artacaktır.");
                        } else {
                            System.out.println("Alışveriş yapmayacaksınız...");
                        }
                        break;
                    case 3:
                        System.out.println("Swatch mağazasına uğrayacaksınız buradan kesinlikle alışveriş yapacak mısınız ? (Evet ya da Hayır)");
                        System.out.print("Cevabınız: ");
                        String alisveris4 = klavye.nextLine();
                        if (alisveris4.equalsIgnoreCase("evet")) {
                            System.out.println("Yaptığınız alışveriş doğrultusunda maaliyetiniz artacaktır.");
                        } else {
                            System.out.println("Alışveriş yapmayacaksınız...");
                        }
                        break;
                }
                return true;
            } else {
                return false;
            }
        }

        @Override
        public boolean özgüalan() throws InterruptedException {
            if (this.özgüalan == true) {
                System.out.println("***** ÖZGÜL ALAN EKRANI *****");
                Scanner klavye = new Scanner(System.in);
                System.out.println("\nArmada alışveriş merkezinin diğer alışveriş merkezlerine göre özel olan alanı özel eğlence oyun merkezidir " +
                        "girişi ücretsizdir.Ayrıca IF Armada konspetinde açık hava konserleri verilmektedir.Sizin tercihiniz hangisidir ?");
                System.out.println("1-Eğlence Oyun Merkezi\n" +
                        "2-IF Armada Açık Hava Konserleri\n");
                System.out.println("***********************************************************\n");
                Thread.sleep(500);
                switch (random2()) {
                    case 0:
                        System.out.println("Eğlence Oyun Merkezine gideceksiniz.");
                        System.out.println("1-Bowling\n" +
                                "2-Korku Labirenti\n" +
                                "3-Eğlence Oyuncakları\n");
                        switch (random3()) {
                            case 1:
                                System.out.println("Bowling oynamayı tercih ettiniz.Giriş ücreti 50 TL'dir maaliyetinize 50 Tl ekleniyor...");
                                break;
                            case 2:
                                System.out.println("Korku Labirenti'ne girmeyi tercih ettiniz.Giriş ücreti 70 TL'dir maaliyetinize 70 TL ekleniyor...");
                                break;
                            case 3:
                                System.out.println("Eğlence Oyuncaklarında zaman geçirmeyi tercih ettiniz maaliyetlendirme kaç adet oyuncak aleti kullanacağınıza göre yapılacaktır...");
                                System.out.println("Kaç adet oyuncak aleti kullanmak istiyorsunuz ? ( Alet başı ücretlendirme 10 TL'dir )");
                                System.out.print("Adet: ");
                                int adet = klavye.nextInt();
                                System.out.println("Maaliyetinize eklenecek tutar "+10*adet+" TL'dir.");
                                break;
                        }
                    case 1:
                        System.out.println("IF Armada Açık Hava Konserlerine gideceksiniz.");
                        System.out.println("IF Armada Açık Hava Konserlerini'nin girişi 150 TL'dir maaliyetinize 150 TL ekleniyor...");
                }
                return true;
            } else {
                return false;
            }
        }

        @Override
        public boolean yemek() throws InterruptedException {
            if (this.yemek == true) {
                System.out.println("***** RESTORAN EKRANI *****");
                Scanner klavye = new Scanner(System.in);
                System.out.println("\n1-Domino's Pizza\n" +
                        "2-Arby's\n" +
                        "3-Starbucks\n" +
                        "4-HD İskender\n");
                System.out.println("***********************************************************\n");
                Thread.sleep(500);
                switch (random()) {
                    case 0:
                        System.out.println("Domino's Pizzada yemek yiyeceksiniz menüler listeleniyor...");
                        System.out.println("1-Margarita + Kola (80 Tl - 90 TL -100 TL)\n" +
                                "2-Sucuksever + Kola (70 TL - 80 TL - 90 Tl)\n" +
                                "3-Süperos + Kola (90 TL - 100 TL - 110 Tl)\n");
                        switch (random3()) {
                            case 0:
                                int a = 0;
                                System.out.println("Margarita menüsünü yiyeceksiniz. ");
                                while (a == 0) {
                                    System.out.println("\nHangi boyutta pizza tercih edersiniz ? ( Küçük Orta Büyük )");
                                    System.out.print("Tercihiniz: ");
                                    String boyutsecim = klavye.nextLine();
                                    if (boyutsecim.equalsIgnoreCase("küçük")) {
                                        System.out.println("Küçük boy Margarita tercih ettiniz maaliyetinize 80 TL ekleniyor...");
                                        a = 1;
                                    } else if (boyutsecim.equalsIgnoreCase("orta")) {
                                        System.out.println("Orta boy Margarita tercih ettiniz maaliyetinize 90 TL ekleniyor...");
                                        a = 1;
                                    } else if (boyutsecim.equalsIgnoreCase("büyük")) {
                                        System.out.println("Büyük boy Margarita tercih ettiniz maaliyetinize 100 TL ekleniyor...");
                                        a = 1;
                                    } else {
                                        System.out.println("Yanlış bir tuşlama yaptınız boyut seçme ekranına tekrardan yönlendiriliyorsunuz...");
                                        a = 0;
                                    }
                                }

                                break;
                            case 1:
                                int b = 0;
                                System.out.print("Sucuksever menüsünü yiyeceksiniz. ");
                                while (b == 0) {
                                    System.out.println("\nHangi boyutta pizza tercih edersiniz ? ( Küçük Orta Büyük )");
                                    System.out.print("Tercihiniz: ");
                                    String boyutsecim = klavye.nextLine();
                                    if (boyutsecim.equalsIgnoreCase("küçük")) {
                                        System.out.println("Küçük boy Sucuksever tercih ettiniz maaliyetinize 70 TL ekleniyor...");
                                        b = 1;
                                    } else if (boyutsecim.equalsIgnoreCase("orta")) {
                                        System.out.println("Orta boy Sucuksever tercih ettiniz maaliyetinize 80 TL ekleniyor...");
                                        b = 1;
                                    } else if (boyutsecim.equalsIgnoreCase("büyük")) {
                                        System.out.println("Büyük boy Sucuksever tercih ettiniz maaliyetinize 90 TL ekleniyor...");
                                        b = 1;
                                    } else {
                                        System.out.println("Yanlış bir tuşlama yaptınız boyut seçme ekranına tekrardan yönlendiriliyorsunuz...");
                                        b = 0;
                                    }
                                }
                                break;
                            case 2:
                                int c = 0;
                                System.out.print("Süperos menüsünü yiyeceksiniz. ");
                                while (c == 0) {
                                    System.out.println("\nHangi boyutta pizza tercih edersiniz ? ( Küçük Orta Büyük )");
                                    System.out.print("Tercihiniz: ");
                                    String boyutsecim = klavye.nextLine();
                                    if (boyutsecim.equalsIgnoreCase("küçük")) {
                                        System.out.println("Küçük boy Süperos tercih ettiniz maaliyetinize 90 TL ekleniyor...");
                                        c = 1;
                                    } else if (boyutsecim.equalsIgnoreCase("orta")) {
                                        System.out.println("Orta boy Süperos tercih ettiniz maaliyetinize 100 TL ekleniyor...");
                                        c = 1;
                                    } else if (boyutsecim.equalsIgnoreCase("büyük")) {
                                        System.out.println("Büyük boy Süperos tercih ettiniz maaliyetinize 110 TL ekleniyor...");
                                        c = 1;
                                    } else {
                                        System.out.println("Yanlış bir tuşlama yaptınız boyut seçme ekranına tekrardan yönlendiriliyorsunuz...");
                                        c = 0;
                                    }
                                }
                                break;
                        }
                        break;
                    case 1:
                        System.out.println("Arby's'te yemek yiyeceksiniz menüler listeleniyor...");
                        System.out.println("1-Barbekü Deluxe XL Menü ( 85 TL )\n" +
                                "2-Biftek Philly Brioche Menü ( 83 TL )\n" +
                                "3-BBQ Gurme Tavuk Menü ( 73 TL )\n");
                        switch (random3()) {
                            case 0:
                                System.out.println("Barbekü Deluxe XL Menüyü yiyeceksiniz maaliyetinize 85 TL ekleniyor...");
                                break;
                            case 1:
                                System.out.println("Biftek Philly Brioche Menüyü yiyeceksiniz maaliyetinize 83 TL ekleniyor...");
                                break;
                            case 2:
                                System.out.println("BBQ Gurme Tavuk Menüyü yiyeceksiniz maaliyetinize 73 TL ekleniyor...");
                                break;

                        }
                        break;
                    case 2:
                        System.out.println("Starbucks'ta bir şeyler içeceksiniz menüler listeleniyor...");
                        System.out.println("1-White Chocolate Mocha (35 TL - 40 TL - 45 TL)\n" +
                                "2-Filtre Kahve (25 TL - 30 TL - 34 TL)\n" +
                                "3-Latte (30 TL - 35 TL - 38 TL )\n" +
                                "4-Çay (15 TL - 20 TL)");
                        switch (random()) {
                            case 1:
                                int d = 0;
                                System.out.println("White Chocolate Mocha içeceksiniz.");
                                while (d == 0) {
                                    System.out.println("\nHangi boyutta içecek tercih edersiniz ? ( Küçük Orta Büyük )");
                                    System.out.print("Tercihiniz: ");
                                    String boyutsecim = klavye.nextLine();
                                    if (boyutsecim.equalsIgnoreCase("küçük")) {
                                        System.out.println("Küçük boy White Chocolate Mocha tercih ettiniz maaliyetinize 35 TL ekleniyor...");
                                        d = 1;
                                    } else if (boyutsecim.equalsIgnoreCase("orta")) {
                                        System.out.println("Orta boy White Chocolate Mocha tercih ettiniz maaliyetinize 40 TL ekleniyor...");
                                        d = 1;
                                    } else if (boyutsecim.equalsIgnoreCase("büyük")) {
                                        System.out.println("Büyük boy White Chocolate Mocha tercih ettiniz maaliyetinize 45 TL ekleniyor...");
                                        d = 1;
                                    } else {
                                        System.out.println("Yanlış bir tuşlama yaptınız boyut seçme ekranına tekrardan yönlendiriliyorsunuz...");
                                        d = 0;
                                    }
                                }
                                break;
                            case 2:
                                int f = 0;
                                System.out.println("Filtre Kahve içeceksiniz.");
                                while (f == 0) {
                                    System.out.println("\nHangi boyutta içecek tercih edersiniz ? ( Küçük Orta Büyük )");
                                    System.out.print("Tercihiniz: ");
                                    String boyutsecim = klavye.nextLine();
                                    if (boyutsecim.equalsIgnoreCase("küçük")) {
                                        System.out.println("Küçük boy Filtre Kahve tercih ettiniz maaliyetinize 25 TL ekleniyor...");
                                        f = 1;
                                    } else if (boyutsecim.equalsIgnoreCase("orta")) {
                                        System.out.println("Orta boy Filtre Kahve tercih ettiniz maaliyetinize 30 TL ekleniyor...");
                                        f = 1;
                                    } else if (boyutsecim.equalsIgnoreCase("büyük")) {
                                        System.out.println("Büyük boy Filtre Kahve tercih ettiniz maaliyetinize 34 TL ekleniyor...");
                                        f = 1;
                                    } else {
                                        System.out.println("Yanlış bir tuşlama yaptınız boyut seçme ekranına tekrardan yönlendiriliyorsunuz...");
                                        f = 0;
                                    }
                                }
                                break;
                            case 3:
                                int g = 0;
                                System.out.println("Latte içeceksiniz.");
                                while (g == 0) {
                                    System.out.println("\nHangi boyutta içecek tercih edersiniz ? ( Küçük Orta Büyük )");
                                    System.out.print("Tercihiniz: ");
                                    String boyutsecim = klavye.nextLine();
                                    if (boyutsecim.equalsIgnoreCase("küçük")) {
                                        System.out.println("Küçük boy Latte tercih ettiniz maaliyetinize 30 TL ekleniyor...");
                                        g = 1;
                                    } else if (boyutsecim.equalsIgnoreCase("orta")) {
                                        System.out.println("Orta boy Latte tercih ettiniz maaliyetinize 35 TL ekleniyor...");
                                        g = 1;
                                    } else if (boyutsecim.equalsIgnoreCase("büyük")) {
                                        System.out.println("Büyük boy Latte tercih ettiniz maaliyetinize 38 TL ekleniyor...");
                                        g = 1;
                                    } else {
                                        System.out.println("Yanlış bir tuşlama yaptınız boyut seçme ekranına tekrardan yönlendiriliyorsunuz...");
                                        g = 0;
                                    }
                                }
                                break;
                            case 4:
                                int h = 0;
                                System.out.println("Çay tercih içeceksiniz.");
                                while (h == 0) {
                                    System.out.println("\nHangi boyutta içecek tercih edersiniz ? ( Küçük Büyük )");
                                    System.out.print("Tercihiniz: ");
                                    String boyutsecim = klavye.nextLine();
                                    if (boyutsecim.equalsIgnoreCase("küçük")) {
                                        System.out.println("Küçük boy Çay tercih ettiniz maaliyetinize 15 TL ekleniyor...");
                                        h = 1;
                                    } else if (boyutsecim.equalsIgnoreCase("büyük")) {
                                        System.out.println("Büyük boy Çay tercih ettiniz maaliyetinize 20 TL ekleniyor...");
                                        h = 1;
                                    } else {
                                        System.out.println("Yanlış bir tuşlama yaptınız boyut seçme ekranına tekrardan yönlendiriliyorsunuz...");
                                        g = 0;
                                    }
                                }
                                break;
                        }
                        break;
                    case 4:
                        System.out.println("HD İskender'de yemek yiyeceksiniz menü listeleniyor...");
                        System.out.println("1-İskender 1 Porsiyon  ( 60 TL )\n" +
                                "2-İskender 1,5 Porsiyon  ( 75 TL )\n" +
                                "3-İskender Duble Porsiyon ( 100 TL )\n");
                        switch (random3()) {
                            case 0:
                                int a = 0;
                                System.out.println("İskender 1 Porsiyon yiyeceksiniz.");
                                while (a == 0) {
                                    System.out.println("İçecek istiyor musunuz ? ( Evet ya da Hayır )");
                                    System.out.print("Cevabınız: ");
                                    String icecek = klavye.nextLine();
                                    if (icecek.equalsIgnoreCase("evet")) {
                                        System.out.println("Hangi içecekten istiyorsunuz ? \n1-Coca Cola ( 15 TL)\n" +
                                                "2-Sprite ( 15 TL )\n" +
                                                "3-Fanta ( 15 TL )\n" +
                                                "4-Ayran ( 10 TL )\n");
                                        System.out.print("Tercihiniz: ");
                                        int icecek2 = klavye.nextInt();
                                        switch (icecek2) {
                                            case 1:
                                                System.out.println("1 porsiyon iskender ve coca cola tercih ettiniz maaliyetinize 75 TL ekleniyor...");
                                                a = 1;
                                                break;
                                            case 2:
                                                System.out.println("1 porsiyon iskender ve sprite tercih ettiniz maaliyetinize 75 TL ekleniyor...");
                                                a = 1;
                                                break;
                                            case 3:
                                                System.out.println("1 porsiyon iskender ve fanta tercih ettiniz maaliyetinize 75 TL ekleniyor...");
                                                a = 1;
                                                break;
                                            case 4:
                                                System.out.println("1 porsiyon iskender ve ayran tercih ettiniz maaliyetinize 70 TL ekleniyor...");
                                                a = 1;
                                                break;
                                        }
                                    } else if (icecek.equalsIgnoreCase("hayır")) {
                                        System.out.println("1 porsiyon iskenderin yanına içecek tercih etmediniz maaliyetinize 60 TL ekleniyor...");
                                        a = 1;
                                    } else {
                                        System.out.println("Yanlış tuşlama yaptınız içecek ekranına tekrardan yönlendiriliyorsunuz...");
                                        a = 0;
                                    }
                                }
                                break;
                            case 1:
                                int b = 0;
                                System.out.println("İskender 1,5 Porsiyon yiyeceksiniz.");
                                while (b == 0) {
                                    System.out.println("İçecek istiyor musunuz ? ( Evet ya da Hayır )");
                                    System.out.print("Cevabınız: ");
                                    String icecek = klavye.nextLine();
                                    if (icecek.equalsIgnoreCase("evet")) {
                                        System.out.println("Hangi içecekten istiyorsunuz ? \n1-Coca Cola ( 15 TL)\n" +
                                                "2-Sprite ( 15 TL )\n" +
                                                "3-Fanta ( 15 TL )\n" +
                                                "4-Ayran ( 10 TL )\n");
                                        System.out.print("Tercihiniz: ");
                                        int icecek2 = klavye.nextInt();
                                        switch (icecek2) {
                                            case 1:
                                                System.out.println("1,5 porsiyon iskender ve coca cola tercih ettiniz maaliyetinize 90 TL ekleniyor...");
                                                b = 1;
                                                break;
                                            case 2:
                                                System.out.println("1,5 porsiyon iskender ve sprite tercih ettiniz maaliyetinize 90 TL ekleniyor...");
                                                b = 1;
                                                break;
                                            case 3:
                                                System.out.println("1,5 porsiyon iskender ve fanta tercih ettiniz maaliyetinize 90 TL ekleniyor...");
                                                b = 1;
                                                break;
                                            case 4:
                                                System.out.println("1,5 porsiyon iskender ve ayran tercih ettiniz maaliyetinize 90 TL ekleniyor...");
                                                b = 1;
                                                break;
                                        }
                                    } else if (icecek.equalsIgnoreCase("hayır")) {
                                        System.out.println("1,5 porsiyon iskenderin yanına içecek tercih etmediniz maaliyetinize 75 TL ekleniyor...");
                                        b = 1;
                                    } else {
                                        System.out.println("Yanlış tuşlama yaptınız içecek ekranına tekrardan yönlendiriliyorsunuz...");
                                        b = 0;
                                    }
                                }
                                break;
                            case 2:
                                int c = 0;
                                System.out.println("İskender Duble Porsiyon yiyeceksiniz.");
                                while (c == 0) {
                                    System.out.println("İçecek istiyor musunuz ? ( Evet ya da Hayır )");
                                    System.out.print("Cevabınız: ");
                                    String icecek = klavye.nextLine();
                                    if (icecek.equalsIgnoreCase("evet")) {
                                        System.out.println("Hangi içecekten istiyorsunuz ? \n1-Coca Cola ( 15 TL)\n" +
                                                "2-Sprite ( 15 TL )\n" +
                                                "3-Fanta ( 15 TL )\n" +
                                                "4-Ayran ( 10 TL )\n");
                                        System.out.print("Tercihiniz: ");
                                        int icecek2 = klavye.nextInt();
                                        switch (icecek2) {
                                            case 1:
                                                System.out.println("Duble iskender ve coca cola tercih ettiniz maaliyetinize 115 TL ekleniyor...");
                                                c = 1;
                                                break;
                                            case 2:
                                                System.out.println("Duble iskender ve sprite tercih ettiniz maaliyetinize 115 TL ekleniyor...");
                                                c = 1;
                                                break;
                                            case 3:
                                                System.out.println("Duble iskender ve fanta tercih ettiniz maaliyetinize 115 TL ekleniyor...");
                                                c = 1;
                                                break;
                                            case 4:
                                                System.out.println("Duble iskender ve ayran tercih ettiniz maaliyetinize 110 TL ekleniyor...");
                                                c = 1;
                                                break;
                                        }
                                    } else if (icecek.equalsIgnoreCase("hayır")) {
                                        System.out.println("Duble iskenderin yanına içecek tercih etmediniz maaliyetinize 100 TL ekleniyor...");
                                        c = 1;
                                    } else {
                                        System.out.println("Yanlış tuşlama yaptınız içecek ekranına tekrardan yönlendiriliyorsunuz...");
                                        c = 0;
                                    }
                                }
                                break;
                        }
                        break;
                }
                return true;
            } else {
                return false;
            }
        }
    }

