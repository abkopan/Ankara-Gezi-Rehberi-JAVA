import java.util.Scanner;

public class ankaMallrandom implements Avm{

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

    public ankaMallrandom() throws InterruptedException {  // CONSTRUCTOR

        Scanner klavye = new Scanner(System.in);
        System.out.println("***** ANKAMALL ALIŞVERİŞ MERKEZİ EKRANI *****");
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
            System.out.println("***** SİNEMA EKRANI *****");
            Scanner klavye=new Scanner(System.in);
            System.out.println("\n1-Çakallarla Dans 6 ( 50 TL )\n" +
                    "2-Vahşi Gece ( 60 TL )\n" +
                    "3-Barış Akarsu 'MERHABA'  ( 70 TL )\n" +
                    "4-Kendi Yolumda ( 65 TL )\n");
            System.out.println("***********************************************************\n");
            Thread.sleep(500);
            switch (random()){
                case 0:
                    System.out.println("Çakallarla Dans 6 filmine gideceksiniz maaliyetinize 50 tl eklenecektir...");
                    break;
                case 1:
                    System.out.println("Vahşi Gece filmine gideceksiniz maaliyetinize 60 tl eklenecektir...");
                    break;
                case 2:
                    System.out.println("Barış Akarsu 'MERHABA' filmine gideceksiniz maaliyetinize 70 tl eklenecektir...");
                    break;
                case 3:
                    System.out.println("Kendi Yolumda filmine gideceksiniz maaliyetinize 65 tl eklenecektir...");
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
            System.out.println("***** MAĞAZALAR EKRANINA HOŞGELDİNİZ *****");
            Scanner klavye = new Scanner(System.in);
            System.out.println("\n1-Koton\n" +
                    "2-Mavi\n" +
                    "3-Teknosa\n" +
                    "4-Atasun Optik\n");
            System.out.println("***********************************************************\n");
            Thread.sleep(500);
            switch (random()) {
                case 0:
                    System.out.println("Koton mağazasına uğrayacaksınız buradan kesinlikle alışveriş yapacak mısınız ? (Evet ya da Hayır)");
                    System.out.print("Cevabınız: ");
                    String alisveris = klavye.nextLine();
                    if (alisveris.equalsIgnoreCase("evet")) {
                        System.out.println("Yaptığınız alışveriş doğrultusunda maaliyetiniz artacaktır.");
                    } else {
                        System.out.println("Alışveriş yapmayacaksınız...");
                    }
                    break;
                case 1:
                    System.out.println("Mavi mağazasına uğrayacaksınız buradan kesinlikle alışveriş yapacak mısınız ? (Evet ya da Hayır)");
                    System.out.print("Cevabınız: ");
                    String alisveris2 = klavye.nextLine();
                    if (alisveris2.equalsIgnoreCase("evet")) {
                        System.out.println("Yaptığınız alışveriş doğrultusunda maaliyetiniz artacaktır.");
                    } else {
                        System.out.println("Alışveriş yapmayacaksınız...");
                    }
                    break;
                case 2:
                    System.out.println("Teknosa mağazasına uğrayacaksınız buradan kesinlikle alışveriş yapacak mısınız ? (Evet ya da Hayır)");
                    System.out.print("Cevabınız: ");
                    String alisveris3 = klavye.nextLine();
                    if (alisveris3.equalsIgnoreCase("evet")) {
                        System.out.println("Yaptığınız alışveriş doğrultusunda maaliyetiniz artacaktır.");
                    } else {
                        System.out.println("Alışveriş yapmayacaksınız...");
                    }
                    break;
                case 3:
                    System.out.println("Atasun Optik mağazasına uğrayacaksınız buradan kesinlikle alışveriş yapacak mısınız ? (Evet ya da Hayır)");
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
            System.out.println("***** RESTORANLAR EKRANI *****");
            Scanner klavye=new Scanner(System.in);
            System.out.println("\n1-Domino's Pizza\n" +
                    "2-Mc Donald's\n" +
                    "3-Starbucks\n" +
                    "4-Hmbrgr\n");
            System.out.println("***********************************************************\n");
            Thread.sleep(500);
            switch (random()){
                case 0:
                    System.out.println("Domino's Pizzada yemek yiyeceksiniz menüler listeleniyor...");
                    System.out.println("1-Margarita + Kola (80 Tl - 90 TL -100 TL)\n" +
                            "2-Sucuksever + Kola (70 TL - 80 TL - 90 Tl)\n" +
                            "3-Süperos + Kola (90 TL - 100 TL - 110 Tl)\n");
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
                            System.out.print("Sucuksever menüsünü yiyeceksiniz. ");
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
                            System.out.print("Süperos menüsünü yiyeceksiniz. ");
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
                    System.out.println("Mc Donald's'ta yemek yiyeceksiniz menüler listeleniyor...");
                    System.out.println("1-Big Mac Menü ( 80 TL )\n" +
                            "2-Double Cheeseburger Menü ( 65 TL )\n" +
                            "3-Daba Daba Burger Menü ( 70 TL )\n");
                    switch (random3()){
                        case 0:
                            System.out.println("Big Mac Menüyü yiyeceksiniz maaliyetinize 80 TL ekleniyor...");
                            break;
                        case 1:
                            System.out.println("Double Cheeseburger Menüyü yiyeceksiniz maaliyetinize 65 TL ekleniyor...");
                            break;
                        case 2:
                            System.out.println("Daba Daba Burger Menüyü yiyeceksiniz maaliyetinize 70 TL ekleniyor...");
                            break;

                    }
                    break;
                case 2:
                    System.out.println("Starbucks'ta bir şeyler içeceksiniz menüler listeleniyor...");
                    System.out.println("1-White Chocolate Mocha (35 TL - 40 TL - 45 TL)\n" +
                            "2-Filtre Kahve (25 TL - 30 TL - 34 TL)\n" +
                            "3-Latte (30 TL - 35 TL - 38 TL )\n" +
                            "4-Çay (15 TL - 20 TL)");
                    switch (random()){
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
                            System.out.println("Çay içeceksiniz.");
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
                    System.out.println("Hmbrgr'de yemek yiyeceksiniz menü listeleniyor...");
                    System.out.println("1-Tavuk Fileto Burger Menü ( 75 TL )\n" +
                            "2-Cheeseburger Menü ( 80 TL )\n" +
                            "3-Keçi Peynirli & Ananaslı Baba Burger Menü ( 99 TL )\n");
                    switch (random3()){
                        case 1:
                            System.out.println("Tavuk Fileto Burger Menü yiyeceksiniz maaliyetinize 75 TL ekleniyor...");
                            break;
                        case 2:
                            System.out.println("Cheeseburger Menü yiyeceksiniz maaliyetinize 80 TL ekleniyor...");
                            break;
                        case 3:
                            System.out.println("Keçi Peynirli & Ananaslı Baba Burger Menü yiyeceksiniz maaliyetinize 99 TL ekleniyor...");
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
        Scanner klavye=new Scanner(System.in);
        if(this.özgüalan==true){
            System.out.println("***** ÖZGÜL ALAN EKRANI *****");
            System.out.println("\nAnkaMall alışveriş merkezinin diğer alışveriş merkezlerine göre özel olan alanı özel eğlence oyun merkezidir ");
            int maaliyet=0;
            System.out.println("Kaç adet oyuncak aleti kullanmak istiyorsunuz ? ( Alet başı ücretlendirme 10 TL'dir )");
            System.out.println("***********************************************************\n");
            Thread.sleep(500);
            System.out.print("Adet: ");
            int adet= klavye.nextInt();
            maaliyet+=(10*adet);
            System.out.println("Maaliyetinize "+maaliyet+" TL ekleniyor...");
            return true;
        }
        else{
            return false;
        }
    }
}

