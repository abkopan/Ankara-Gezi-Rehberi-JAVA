import java.util.Scanner;

public class forumAnkararandom implements Avm{
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
    public forumAnkararandom() throws InterruptedException {  // CONSTRUCTOR

        Scanner klavye = new Scanner(System.in);
        System.out.println("***** FORUM ANKARA ALIŞVERİŞ MERKEZİ *****");
        System.out.println("\n1-Sinema\n" +
                "2-Mağaza\n" +
                "3-Yemek\n" +
                "4-Alışveriş Merkezine Özgü Alan\n");
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
            System.out.println("***** SİNEMA EKRANI *****");
            System.out.println("\n1-Buğday Tanesi ( 50 TL )\n" +
                    "2-Kemikler ve Her Şey ( 60 TL )\n" +
                    "3-The Menu  ( 70 TL )\n" +
                    "4-Mihrez 2: Cin Padişahı ( 55 TL )\n");
            System.out.println("***********************************************************\n");
            Thread.sleep(500);
            switch (random()){
                case 0:
                    System.out.println("Buğday Tanesi filmine gideceksiniz maaliyetinize 50 tl eklenecektir...");
                    break;
                case 1:
                    System.out.println("Kemikler ve Her Şey filmine gideceksiniz maaliyetinize 60 tl eklenecektir...");
                    break;
                case 2:
                    System.out.println("The Menu filmine gideceksiniz maaliyetinize 70 tl eklenecektir...");
                    break;
                case 3:
                    System.out.println("Black Adam filmine gideceksiniz maaliyetinize 55 tl eklenecektir...");
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
        if (this.mağaza == true) {
            Scanner klavye = new Scanner(System.in);
            System.out.println("***** MAĞAZALAR EKRANI *****");
            System.out.println("\n1-Gratis\n" +
                    "2-Tekzen\n" +
                    "3-Nike\n" +
                    "4-Deichmann\n");
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
                    System.out.println("Tekzen'e uğrayacaksınız buradan kesinlikle alışveriş yapacak mısınız ? (Evet ya da Hayır)");
                    System.out.print("Cevabınız: ");
                    String alisveris2 = klavye.nextLine();
                    if (alisveris2.equalsIgnoreCase("evet")) {
                        System.out.println("Yaptığınız alışveriş doğrultusunda maaliyetiniz artacaktır.");
                    } else {
                        System.out.println("Alışveriş yapmayacaksınız...");
                    }
                    break;
                case 2:
                    System.out.println("Nike mağazasına uğrayacaksınız buradan kesinlikle alışveriş yapacak mısınız ? (Evet ya da Hayır)");
                    System.out.print("Cevabınız: ");
                    String alisveris3 = klavye.nextLine();
                    if (alisveris3.equalsIgnoreCase("evet")) {
                        System.out.println("Yaptığınız alışveriş doğrultusunda maaliyetiniz artacaktır.");
                    } else {
                        System.out.println("Alışveriş yapmayacaksınız...");
                    }
                    break;
                case 3:
                    System.out.println("Deichmann mağazasına uğrayacaksınız buradan kesinlikle alışveriş yapacak mısınız ? (Evet ya da Hayır)");
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
    public boolean yemek() throws InterruptedException {
        if(this.yemek==true){
            System.out.println("***** RESTORAN EKRANI *****");
            Scanner klavye=new Scanner(System.in);
            System.out.println("\n1-Sbarro\n" +
                    "2-Popeyes\n" +
                    "3-Starbucks\n" +
                    "4-Baydöner\n");
            System.out.println("***********************************************************\n");
            Thread.sleep(500);
            switch (random()){
                case 0:
                    System.out.println("Sbarro'da yemek yiyeceksiniz menüler listeleniyor...");
                    System.out.println("1-Margarita + Kola (80 Tl - 90 TL -100 TL)\n" +
                            "2-Supreme + Kola (70 TL - 80 TL - 90 Tl)\n" +
                            "3-Barbekü Tavuklu + Kola (90 TL - 100 TL - 110 Tl)\n");
                    System.out.print("Menü Seçiminiz: ");
                    switch (random3()){
                        case 0:
                            int a=0;
                            System.out.println("Margarita menüsünü yiyeceksiniz. ");
                            while(a==0) {
                                System.out.println("\nHangi boyutta pizza tercih edersiniz ? ( Küçük Orta Büyük )");
                                System.out.print("Tercihiniz: ");
                                String boyutsecim = klavye.nextLine();
                                if (boyutsecim.equalsIgnoreCase("küçük")) {
                                    System.out.println("Küçük boy Margarita tercih ettiniz maaliyetinize 80 TL ekleniyor...");
                                    a=1;
                                } else if (boyutsecim.equalsIgnoreCase("orta")) {
                                    System.out.println("Orta boy Margarita tercih ettiniz maaliyetinize 90 TL ekleniyor...");
                                    a=1;
                                } else if (boyutsecim.equalsIgnoreCase("büyük")) {
                                    System.out.println("Büyük boy Margarita tercih ettiniz maaliyetinize 100 TL ekleniyor...");
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
                            System.out.print("Supreme menüsünü yiyeceksiniz ");
                            while(b==0) {
                                System.out.println("\nHangi boyutta pizza tercih edersiniz ? ( Küçük Orta Büyük )");
                                System.out.print("Tercihiniz: ");
                                String boyutsecim = klavye.nextLine();
                                if (boyutsecim.equalsIgnoreCase("küçük")) {
                                    System.out.println("Küçük boy Sucuksever tercih ettiniz maaliyetinize 70 TL ekleniyor...");
                                    b=1;
                                } else if (boyutsecim.equalsIgnoreCase("orta")) {
                                    System.out.println("Orta boy Sucuksever tercih ettiniz maaliyetinize 80 TL ekleniyor...");
                                    b=1;
                                } else if (boyutsecim.equalsIgnoreCase("büyük")) {
                                    System.out.println("Büyük boy Sucuksever tercih ettiniz maaliyetinize 90 TL ekleniyor...");
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
                            System.out.print("Barbekü Tavuklu menüsünü yiyeceksiniz ");
                            while(c==0) {
                                System.out.println("\nHangi boyutta pizza tercih edersiniz ? ( Küçük Orta Büyük )");
                                System.out.print("Tercihiniz: ");
                                String boyutsecim = klavye.nextLine();
                                if (boyutsecim.equalsIgnoreCase("küçük")) {
                                    System.out.println("Küçük boy Süperos tercih ettiniz maaliyetinize 90 TL ekleniyor...");
                                    c=1;
                                } else if (boyutsecim.equalsIgnoreCase("orta")) {
                                    System.out.println("Orta boy Süperos tercih ettiniz maaliyetinize 100 TL ekleniyor...");
                                    c=1;
                                } else if (boyutsecim.equalsIgnoreCase("büyük")) {
                                    System.out.println("Büyük boy Süperos tercih ettiniz maaliyetinize 110 TL ekleniyor...");
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
                case 1:
                    System.out.println("Popeyes'te yemek yiyeceksiniz menüler listeleniyor...");
                    System.out.println("1-10'lu Dip'n Chicken ( 85 TL )\n" +
                            "2-Golden Maxi Menü ( 112 TL )\n" +
                            "3-Double Popchicken Menü ( 65 TL )\n");
                    switch (random3()){
                        case 0:
                            System.out.println("10'lu Dip'n Chicken Menüyü yiyeceksiniz maaliyetinize 85 TL ekleniyor...");
                            break;
                        case 1:
                            System.out.println("Golden Maxi Menüyü yiyeceksiniz maaliyetinize 112 TL ekleniyor...");
                            break;
                        case 2:
                            System.out.println("Double Popchicken Menüyü yiyeceksiniz maaliyetinize 65 TL ekleniyor...");
                            break;

                    }
                    break;
                case 2:
                    System.out.println("Starbucks'ta bir şeyler içeceksiniz menüler listeleniyor...");
                    System.out.println("1-White Chocolate Mocha (35 TL - 40 TL - 45 TL)\n" +
                            "2-Filtre Kahve (25 TL - 30 TL - 34 TL)\n" +
                            "3-Latte (30 TL - 35 TL - 38 TL )\n" +
                            "4-Çay (15 TL - 20 TL)");
                    switch (random3()){
                        case 0:
                            int d=0;
                            System.out.println("White Chocolate Mocha içeceksiniz.");
                            while(d==0) {
                                System.out.println("\nHangi boyutta içecek tercih edersiniz ? ( Küçük Orta Büyük )");
                                System.out.print("Tercihiniz: ");
                                String boyutsecim = klavye.nextLine();
                                if (boyutsecim.equalsIgnoreCase("küçük")) {
                                    System.out.println("Küçük boy White Chocolate Mocha tercih ettiniz maaliyetinize 35 TL ekleniyor...");
                                    d=1;
                                } else if (boyutsecim.equalsIgnoreCase("orta")) {
                                    System.out.println("Orta boy White Chocolate Mocha tercih ettiniz maaliyetinize 40 TL ekleniyor...");
                                    d=1;
                                } else if (boyutsecim.equalsIgnoreCase("büyük")) {
                                    System.out.println("Büyük boy White Chocolate Mocha tercih ettiniz maaliyetinize 45 TL ekleniyor...");
                                    d=1;
                                }
                                else{
                                    System.out.println("Yanlış bir tuşlama yaptınız boyut seçme ekranına tekrardan yönlendiriliyorsunuz...");
                                    d=0;
                                }
                            }
                            break;
                        case 1:
                            int f=0;
                            System.out.println("Filtre Kahve içeceksiniz.");
                            while(f==0) {
                                System.out.println("\nHangi boyutta içecek tercih edersiniz ? ( Küçük Orta Büyük )");
                                System.out.print("Tercihiniz: ");
                                String boyutsecim = klavye.nextLine();
                                if (boyutsecim.equalsIgnoreCase("küçük")) {
                                    System.out.println("Küçük boy Filtre Kahve tercih ettiniz maaliyetinize 25 TL ekleniyor...");
                                    f=1;
                                } else if (boyutsecim.equalsIgnoreCase("orta")) {
                                    System.out.println("Orta boy Filtre Kahve tercih ettiniz maaliyetinize 30 TL ekleniyor...");
                                    f=1;
                                } else if (boyutsecim.equalsIgnoreCase("büyük")) {
                                    System.out.println("Büyük boy Filtre Kahve tercih ettiniz maaliyetinize 34 TL ekleniyor...");
                                    f=1;
                                }
                                else{
                                    System.out.println("Yanlış bir tuşlama yaptınız boyut seçme ekranına tekrardan yönlendiriliyorsunuz...");
                                    f=0;
                                }
                            }
                            break;
                        case 2:
                            int g=0;
                            System.out.println("Latte içeceksiniz.");
                            while(g==0) {
                                System.out.println("\nHangi boyutta içecek tercih edersiniz ? ( Küçük Orta Büyük )");
                                System.out.print("Tercihiniz: ");
                                String boyutsecim = klavye.nextLine();
                                if (boyutsecim.equalsIgnoreCase("küçük")) {
                                    System.out.println("Küçük boy Latte tercih ettiniz maaliyetinize 30 TL ekleniyor...");
                                    g=1;
                                } else if (boyutsecim.equalsIgnoreCase("orta")) {
                                    System.out.println("Orta boy Latte tercih ettiniz maaliyetinize 35 TL ekleniyor...");
                                    g=1;
                                } else if (boyutsecim.equalsIgnoreCase("büyük")) {
                                    System.out.println("Büyük boy Latte tercih ettiniz maaliyetinize 38 TL ekleniyor...");
                                    g=1;
                                }
                                else{
                                    System.out.println("Yanlış bir tuşlama yaptınız boyut seçme ekranına tekrardan yönlendiriliyorsunuz...");
                                    g=0;
                                }
                            }
                            break;
                        case 3:
                            int h=0;
                            System.out.println("Çay tercih ettiniz.");
                            while(h==0) {
                                System.out.println("\nHangi boyutta içecek tercih edersiniz ? ( Küçük Büyük )");
                                System.out.print("Tercihiniz: ");
                                String boyutsecim = klavye.nextLine();
                                if (boyutsecim.equalsIgnoreCase("küçük")) {
                                    System.out.println("Küçük boy Çay tercih ettiniz maaliyetinize 15 TL ekleniyor...");
                                    h=1;
                                } else if (boyutsecim.equalsIgnoreCase("büyük")) {
                                    System.out.println("Büyük boy Çay tercih ettiniz maaliyetinize 20 TL ekleniyor...");
                                    h=1;
                                }
                                else{
                                    System.out.println("Yanlış bir tuşlama yaptınız boyut seçme ekranına tekrardan yönlendiriliyorsunuz...");
                                    g=0;
                                }
                            }
                            break;
                    }
                    break;
                case 3:
                    System.out.println("Baydöner'de yemek yiyeceksiniz menü listeleniyor...");
                    System.out.println("1-İskender 1 Porsiyon  ( 60 TL )\n" +
                            "2-İskender 1,5 Porsiyon  ( 75 TL )\n" +
                            "3-İskender Duble Porsiyon ( 100 TL )\n");
                    switch (random3()){
                        case 0:
                            int a=0;
                            System.out.println("İskender 1 Porsiyon yiyeceksiniz .");
                            while(a==0) {
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
                                            a=1;
                                            break;
                                        case 2:
                                            System.out.println("1 porsiyon iskender ve sprite tercih ettiniz maaliyetinize 75 TL ekleniyor...");
                                            a=1;
                                            break;
                                        case 3:
                                            System.out.println("1 porsiyon iskender ve fanta tercih ettiniz maaliyetinize 75 TL ekleniyor...");
                                            a=1;
                                            break;
                                        case 4:
                                            System.out.println("1 porsiyon iskender ve ayran tercih ettiniz maaliyetinize 70 TL ekleniyor...");
                                            a=1;
                                            break;
                                    }
                                } else if (icecek.equalsIgnoreCase("hayır")) {
                                    System.out.println("1 porsiyon iskenderin yanına içecek tercih etmediniz maaliyetinize 60 TL ekleniyor...");
                                    a=1;
                                } else {
                                    System.out.println("Yanlış tuşlama yaptınız içecek ekranına tekrardan yönlendiriliyorsunuz...");
                                    a=0;
                                }
                            }
                            break;
                        case 1:
                            int b=0;
                            System.out.println("İskender 1,5 Porsiyon yiyeceksiniz.");
                            while(b==0) {
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
                                            b=1;
                                            break;
                                        case 2:
                                            System.out.println("1,5 porsiyon iskender ve sprite tercih ettiniz maaliyetinize 90 TL ekleniyor...");
                                            b=1;
                                            break;
                                        case 3:
                                            System.out.println("1,5 porsiyon iskender ve fanta tercih ettiniz maaliyetinize 90 TL ekleniyor...");
                                            b=1;
                                            break;
                                        case 4:
                                            System.out.println("1,5 porsiyon iskender ve ayran tercih ettiniz maaliyetinize 90 TL ekleniyor...");
                                            b=1;
                                            break;
                                    }
                                } else if (icecek.equalsIgnoreCase("hayır")) {
                                    System.out.println("1,5 porsiyon iskenderin yanına içecek tercih etmediniz maaliyetinize 75 TL ekleniyor...");
                                    b=1;
                                } else {
                                    System.out.println("Yanlış tuşlama yaptınız içecek ekranına tekrardan yönlendiriliyorsunuz...");
                                    b=0;
                                }
                            }
                            break;
                        case 2:
                            int c=0;
                            System.out.println("İskender Duble Porsiyon yiyeceksiniz.");
                            while(c==0) {
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
                                            c=1;
                                            break;
                                        case 2:
                                            System.out.println("Duble iskender ve sprite tercih ettiniz maaliyetinize 115 TL ekleniyor...");
                                            c=1;
                                            break;
                                        case 3:
                                            System.out.println("Duble iskender ve fanta tercih ettiniz maaliyetinize 115 TL ekleniyor...");
                                            c=1;
                                            break;
                                        case 4:
                                            System.out.println("Duble iskender ve ayran tercih ettiniz maaliyetinize 110 TL ekleniyor...");
                                            c=1;
                                            break;
                                    }
                                } else if (icecek.equalsIgnoreCase("hayır")) {
                                    System.out.println("Duble iskenderin yanına içecek tercih etmediniz maaliyetinize 100 TL ekleniyor...");
                                    c=1;
                                } else {
                                    System.out.println("Yanlış tuşlama yaptınız içecek ekranına tekrardan yönlendiriliyorsunuz...");
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
        if(this.özgüalan){
            System.out.println("***** ÖZGÜL ALAN EKRANI *****");
            System.out.println("Forum Ankara alışveriş merkezinin diğer alışveriş merkezlerine göre özel olan alanı kurulan sergi alanıdır girişi ücretsizdir maaliyetiniz 0 TL'dir.");
            System.out.println("***********************************************************\n");
            Thread.sleep(500);
            return true;
        }
        else{
            return false;
        }
    }
}
