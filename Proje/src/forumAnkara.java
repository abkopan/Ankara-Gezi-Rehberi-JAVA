import java.util.Scanner;

public class forumAnkara implements Avm{
    private boolean sinema;
    private boolean mağaza;
    private boolean yemek;
    private boolean özgüalan;
    public forumAnkara() {  // CONSTRUCTOR

        Scanner klavye = new Scanner(System.in);
        System.out.println("\n1-Sinema\n" +
                "2-Mağaza\n" +
                "3-Yemek\n" +
                "4-Alışveriş Merkezine Özgü Alan\n");
        System.out.println("Forum Ankara alışveriş merkezinde ne yapmak isterisiniz ? ");
        System.out.print("Seçiminiz: ");
        int secim = klavye.nextInt();
        switch (secim){
            case 1:
                this.sinema=true;
                this.mağaza=false;
                this.yemek=false;
                this.özgüalan=false;
                break;
            case 2:
                this.sinema=false;
                this.mağaza=true;
                this.yemek=false;
                this.özgüalan=false;
                break;
            case 3:
                this.sinema=false;
                this.mağaza=false;
                this.yemek=true;
                this.özgüalan=false;
                break;
            case 4:
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
    public boolean sinema() {
        if(this.sinema==true){
            Scanner klavye=new Scanner(System.in);
            System.out.println("\n1-Buğday Tanesi ( 50 TL )\n" +
                    "2-Kemikler ve Her Şey ( 60 TL )\n" +
                    "3-The Menu  ( 70 TL )\n" +
                    "4-Mihrez 2: Cin Padişahı ( 55 TL )\n");
            System.out.print("Lütfen hangi filmi izlemek istediğinizi seçiniz: ");
            int filmsecim= klavye.nextInt();
            switch (filmsecim){
                case 1:
                    System.out.println("Buğday Tanesi filmine gitmek istediniz maaliyetinize 50 tl eklenecektir...");
                    break;
                case 2:
                    System.out.println("Kemikler ve Her Şey filmine gitmek istediniz maaliyetinize 60 tl eklenecektir...");
                    break;
                case 3:
                    System.out.println("The Menu filmine gitmek istediniz maaliyetinize 70 tl eklenecektir...");
                    break;
                case 4:
                    System.out.println("Black Adam filmine gitmek istediniz maaliyetinize 55 tl eklenecektir...");
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
    public boolean mağaza() {
        if (this.mağaza == true) {
            Scanner klavye = new Scanner(System.in);
            System.out.println("\n1-Gratis\n" +
                    "2-Tekze\n" +
                    "3-Nike\n" +
                    "4-Deichmann\n");
            System.out.print("Mağazalardan hangisine uğramak istediğinizi seçiniz: ");
            int magazasecim = klavye.nextInt();
            klavye.nextLine();
            switch (magazasecim) {
                case 1:
                    System.out.println("D&R mağazasına uğramayı tercih ettiniz buradan kesinlikle alışveriş yapacak mısınız ? (Evet ya da Hayır)");
                    String alisveris = klavye.nextLine();
                    if (alisveris.equalsIgnoreCase("evet")) {
                        System.out.println("Yaptığınız alışveriş doğrultusunda maaliyetiniz artacaktır.");
                    } else {
                        System.out.println("Alışveriş yapmayacaksınız...");
                    }
                    break;
                case 2:
                    System.out.println("Tekzen'e uğramayı tercih ettiniz buradan kesinlikle alışveriş yapacak mısınız ? (Evet ya da Hayır)");
                    String alisveris2 = klavye.nextLine();
                    if (alisveris2.equalsIgnoreCase("evet")) {
                        System.out.println("Yaptığınız alışveriş doğrultusunda maaliyetiniz artacaktır.");
                    } else {
                        System.out.println("Alışveriş yapmayacaksınız...");
                    }
                    break;
                case 3:
                    System.out.println("Nike mağazasına uğramayı tarcih ettiniz buradan kesinlikle alışveriş yapacak mısınız ? (Evet ya da Hayır)");
                    String alisveris3 = klavye.nextLine();
                    if (alisveris3.equalsIgnoreCase("evet")) {
                        System.out.println("Yaptığınız alışveriş doğrultusunda maaliyetiniz artacaktır.");
                    } else {
                        System.out.println("Alışveriş yapmayacaksınız...");
                    }
                    break;
                case 4:
                    System.out.println("Deichmann mağazasına uğramayı tarcih ettiniz buradan kesinlikle alışveriş yapacak mısınız ? (Evet ya da Hayır)");
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
    public boolean yemek() {
        if(this.yemek==true){
            Scanner klavye=new Scanner(System.in);
            System.out.println("\n1-Sbarro\n" +
                    "2-Popeyes\n" +
                    "3-Starbucks\n" +
                    "4-Baydöner\n");
            System.out.print("Zincir restoranlardan hangisinde yemek yiyeceğinizi seçiniz: ");
            int yemeksecim=klavye.nextInt();
            klavye.nextLine();
            switch (yemeksecim) {
                case 1:
                    System.out.println("Sbarro'da yemek yemeyi tercih ettiniz menüler listeleniyor...");
                    System.out.println("1-Margarita + Kola (80 Tl - 90 TL -100 TL)\n" +
                            "2-Supreme + Kola (70 TL - 80 TL - 90 Tl)\n" +
                            "3-Barbekü Tavuklu + Kola (90 TL - 100 TL - 110 Tl)\n");
                    System.out.print("Menü Seçiminiz: ");
                    int menü1 = klavye.nextInt();
                    klavye.nextLine();
                    switch (menü1) {
                        case 1:
                            int a = 0;
                            System.out.println("Margarita menüsünü tercih ettiniz. ");
                            while (a == 0) {
                                System.out.println("\nHangi boyutta pizza tercih edersiniz ? ( Küçük Orta Büyük )");
                                System.out.print("Tercihiniz: ");
                                String boyutsecim = klavye.nextLine();
                                if (boyutsecim.equalsIgnoreCase("küçük")) {
                                    System.out.println("Küçük boy Margarita tercih ettiniz maaliyetinize 80 TL eklenecektir.");
                                    a = 1;
                                } else if (boyutsecim.equalsIgnoreCase("orta")) {
                                    System.out.println("Orta boy Margarita tercih ettiniz maaliyetinize 90 TL eklenecektir.");
                                    a = 1;
                                } else if (boyutsecim.equalsIgnoreCase("büyük")) {
                                    System.out.println("Büyük boy Margarita tercih ettiniz maaliyetinize 100 TL eklenecektir.");
                                    a = 1;
                                } else {
                                    System.out.println("Yanlış bir tuşlama yaptınız boyut seçme ekranına tekrardan yönlendiriliyorsunuz...");
                                    a = 0;
                                }
                            }

                            break;
                        case 2:
                            int b = 0;
                            System.out.print("Supreme menüsünü tercih ettiniz ");
                            while (b == 0) {
                                System.out.println("\nHangi boyutta pizza tercih edersiniz ? ( Küçük Orta Büyük )");
                                System.out.print("Tercihiniz: ");
                                String boyutsecim = klavye.nextLine();
                                if (boyutsecim.equalsIgnoreCase("küçük")) {
                                    System.out.println("Küçük boy Sucuksever tercih ettiniz maaliyetinize 70 TL eklenecektir.");
                                    b = 1;
                                } else if (boyutsecim.equalsIgnoreCase("orta")) {
                                    System.out.println("Orta boy Sucuksever tercih ettiniz maaliyetinize 80 TL eklenecektir.");
                                    b = 1;
                                } else if (boyutsecim.equalsIgnoreCase("büyük")) {
                                    System.out.println("Büyük boy Sucuksever tercih ettiniz maaliyetinize 90 TL eklenecektir.");
                                    b = 1;
                                } else {
                                    System.out.println("Yanlış bir tuşlama yaptınız boyut seçme ekranına tekrardan yönlendiriliyorsunuz...");
                                    b = 0;
                                }
                            }
                            break;
                        case 3:
                            int c = 0;
                            System.out.print("Barbekü Tavuklu menüsünü tercih ettiniz ");
                            while (c == 0) {
                                System.out.println("\nHangi boyutta pizza tercih edersiniz ? ( Küçük Orta Büyük )");
                                System.out.print("Tercihiniz: ");
                                String boyutsecim = klavye.nextLine();
                                if (boyutsecim.equalsIgnoreCase("küçük")) {
                                    System.out.println("Küçük boy Süperos tercih ettiniz maaliyetinize 90 TL eklenecektir.");
                                    c = 1;
                                } else if (boyutsecim.equalsIgnoreCase("orta")) {
                                    System.out.println("Orta boy Süperos tercih ettiniz maaliyetinize 100 TL eklenecektir.");
                                    c = 1;
                                } else if (boyutsecim.equalsIgnoreCase("büyük")) {
                                    System.out.println("Büyük boy Süperos tercih ettiniz maaliyetinize 110 TL eklenecektir.");
                                    c = 1;
                                } else {
                                    System.out.println("Yanlış bir tuşlama yaptınız boyut seçme ekranına tekrardan yönlendiriliyorsunuz...");
                                    c = 0;
                                }
                            }
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Popeyes'te yemek yemeyi tercih ettiniz menüler listeleniyor...");
                    System.out.println("1-10'lu Dip'n Chicken ( 85 TL )\n" +
                            "2-Golden Maxi Menü ( 112 TL )\n" +
                            "3-Double Popchicken Menü ( 65 TL )\n");
                    System.out.print("Menü Seçiminiz: ");
                    int menü2 = klavye.nextInt();
                    switch (menü2) {
                        case 1:
                            System.out.println("10'lu Dip'n Chicken Menüyü tercih ettiniz maaliyetinize 85 TL eklenecektir.");
                            break;
                        case 2:
                            System.out.println("Golden Maxi Menüyü tercih ettiniz maaliyetinize 112 TL eklenecektir.");
                            break;
                        case 3:
                            System.out.println("Double Popchicken Menüyü tercih ettiniz maaliyetinize 65 TL eklenecektir.");
                            break;

                    }
                    break;
                case 3:
                    System.out.println("Starbucks'ta bir şeyler içmeyi tercih ettiniz menüler listeleniyor...");
                    System.out.println("1-White Chocolate Mocha (35 TL - 40 TL - 45 TL)\n" +
                            "2-Filtre Kahve (25 TL - 30 TL - 34 TL)\n" +
                            "3-Latte (30 TL - 35 TL - 38 TL )\n" +
                            "4-Çay (15 TL - 20 TL)");
                    System.out.print("Menü seçiminiz: ");
                    int menü3 = klavye.nextInt();
                    klavye.nextLine();
                    switch (menü3) {
                        case 1:
                            int d = 0;
                            System.out.println("White Chocolate Mocha tercih ettiniz.");
                            while (d == 0) {
                                System.out.println("\nHangi boyutta içecek tercih edersiniz ? ( Küçük Orta Büyük )");
                                System.out.print("Tercihiniz: ");
                                String boyutsecim = klavye.nextLine();
                                if (boyutsecim.equalsIgnoreCase("küçük")) {
                                    System.out.println("Küçük boy White Chocolate Mocha tercih ettiniz maaliyetinize 35 TL eklenecektir.");
                                    d = 1;
                                } else if (boyutsecim.equalsIgnoreCase("orta")) {
                                    System.out.println("Orta boy White Chocolate Mocha tercih ettiniz maaliyetinize 40 TL eklenecektir.");
                                    d = 1;
                                } else if (boyutsecim.equalsIgnoreCase("büyük")) {
                                    System.out.println("Büyük boy White Chocolate Mocha tercih ettiniz maaliyetinize 45 TL eklenecektir.");
                                    d = 1;
                                } else {
                                    System.out.println("Yanlış bir tuşlama yaptınız boyut seçme ekranına tekrardan yönlendiriliyorsunuz...");
                                    d = 0;
                                }
                            }
                            break;
                        case 2:
                            int f = 0;
                            System.out.println("Filtre Kahve tercih ettiniz.");
                            while (f == 0) {
                                System.out.println("\nHangi boyutta içecek tercih edersiniz ? ( Küçük Orta Büyük )");
                                System.out.print("Tercihiniz: ");
                                String boyutsecim = klavye.nextLine();
                                if (boyutsecim.equalsIgnoreCase("küçük")) {
                                    System.out.println("Küçük boy Filtre Kahve tercih ettiniz maaliyetinize 25 TL eklenecektir.");
                                    f = 1;
                                } else if (boyutsecim.equalsIgnoreCase("orta")) {
                                    System.out.println("Orta boy Filtre Kahve tercih ettiniz maaliyetinize 30 TL eklenecektir.");
                                    f = 1;
                                } else if (boyutsecim.equalsIgnoreCase("büyük")) {
                                    System.out.println("Büyük boy Filtre Kahve tercih ettiniz maaliyetinize 34 TL eklenecektir.");
                                    f = 1;
                                } else {
                                    System.out.println("Yanlış bir tuşlama yaptınız boyut seçme ekranına tekrardan yönlendiriliyorsunuz...");
                                    f = 0;
                                }
                            }
                            break;
                        case 3:
                            int g = 0;
                            System.out.println("Latte tercih ettiniz.");
                            while (g == 0) {
                                System.out.println("\nHangi boyutta içecek tercih edersiniz ? ( Küçük Orta Büyük )");
                                System.out.print("Tercihiniz: ");
                                String boyutsecim = klavye.nextLine();
                                if (boyutsecim.equalsIgnoreCase("küçük")) {
                                    System.out.println("Küçük boy Latte tercih ettiniz maaliyetinize 30 TL eklenecektir.");
                                    g = 1;
                                } else if (boyutsecim.equalsIgnoreCase("orta")) {
                                    System.out.println("Orta boy Latte tercih ettiniz maaliyetinize 35 TL eklenecektir.");
                                    g = 1;
                                } else if (boyutsecim.equalsIgnoreCase("büyük")) {
                                    System.out.println("Büyük boy Latte tercih ettiniz maaliyetinize 38 TL eklenecektir.");
                                    g = 1;
                                } else {
                                    System.out.println("Yanlış bir tuşlama yaptınız boyut seçme ekranına tekrardan yönlendiriliyorsunuz...");
                                    g = 0;
                                }
                            }
                            break;
                        case 4:
                            System.out.println("Çay tercih ettiniz.");
                            int h = 0;
                            System.out.println("Çay tercih ettiniz.");
                            while (h == 0) {
                                System.out.println("\nHangi boyutta içecek tercih edersiniz ? ( Küçük Büyük )");
                                System.out.print("Tercihiniz: ");
                                String boyutsecim = klavye.nextLine();
                                if (boyutsecim.equalsIgnoreCase("küçük")) {
                                    System.out.println("Küçük boy Çay tercih ettiniz maaliyetinize 15 TL eklenecektir.");
                                    h = 1;
                                } else if (boyutsecim.equalsIgnoreCase("büyük")) {
                                    System.out.println("Büyük boy Çay tercih ettiniz maaliyetinize 20 TL eklenecektir.");
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
                    System.out.println("Baydöner'de yemek yemeyi tercih ettiniz menü listeleniyor...");
                    System.out.println("1-İskender 1 Porsiyon  ( 60 TL )\n" +
                            "2-İskender 1,5 Porsiyon  ( 75 TL )\n" +
                            "3-İskender Duble Porsiyon ( 100 TL )\n");
                    System.out.print("Menü seçiminiz: ");
                    int menü4 = klavye.nextInt();
                    klavye.nextLine();
                    switch (menü4) {
                        case 1:
                            int a = 0;
                            System.out.println("İskender 1 Porsiyon tercih ettiniz .");
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
                                            System.out.println("1 porsiyon iskender ve coca cola tercih ettiniz maaliyetinize 75 TL eklenecektir.");
                                            a = 1;
                                            break;
                                        case 2:
                                            System.out.println("1 porsiyon iskender ve sprite tercih ettiniz maaliyetinize 75 TL eklenecektir.");
                                            a = 1;
                                            break;
                                        case 3:
                                            System.out.println("1 porsiyon iskender ve fanta tercih ettiniz maaliyetinize 75 TL eklenecektir.");
                                            a = 1;
                                            break;
                                        case 4:
                                            System.out.println("1 porsiyon iskender ve ayran tercih ettiniz maaliyetinize 70 TL eklenecektir.");
                                            a = 1;
                                            break;
                                    }
                                } else if (icecek.equalsIgnoreCase("hayır")) {
                                    System.out.println("1 porsiyon iskenderin yanına içecek tercih etmediniz maaliyetinize 60 TL eklenecektir.");
                                    a = 1;
                                } else {
                                    System.out.println("Yanlış tuşlama yaptınız içecek ekranına tekrardan yönlendiriliyorsunuz...");
                                    a = 0;
                                }
                            }
                            break;
                        case 2:
                            int b = 0;
                            System.out.println("İskender 1,5 Porsiyon tercih ettiniz.");
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
                                            System.out.println("1,5 porsiyon iskender ve coca cola tercih ettiniz maaliyetinize 90 TL eklenecektir.");
                                            b = 1;
                                            break;
                                        case 2:
                                            System.out.println("1,5 porsiyon iskender ve sprite tercih ettiniz maaliyetinize 90 TL eklenecektir.");
                                            b = 1;
                                            break;
                                        case 3:
                                            System.out.println("1,5 porsiyon iskender ve fanta tercih ettiniz maaliyetinize 90 TL eklenecektir.");
                                            b = 1;
                                            break;
                                        case 4:
                                            System.out.println("1,5 porsiyon iskender ve ayran tercih ettiniz maaliyetinize 90 TL eklenecektir.");
                                            b = 1;
                                            break;
                                    }
                                } else if (icecek.equalsIgnoreCase("hayır")) {
                                    System.out.println("1,5 porsiyon iskenderin yanına içecek tercih etmediniz maaliyetinize 75 TL eklenecektir.");
                                    b = 1;
                                } else {
                                    System.out.println("Yanlış tuşlama yaptınız içecek ekranına tekrardan yönlendiriliyorsunuz...");
                                    b = 0;
                                }
                            }
                            break;
                        case 3:
                            int c = 0;
                            System.out.println("İskender Duble Porsiyon tercih ettiniz.");
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
                                            System.out.println("Duble iskender ve coca cola tercih ettiniz maaliyetinize 115 TL eklenecektir.");
                                            c = 1;
                                            break;
                                        case 2:
                                            System.out.println("Duble iskender ve sprite tercih ettiniz maaliyetinize 115 TL eklenecektir.");
                                            c = 1;
                                            break;
                                        case 3:
                                            System.out.println("Duble iskender ve fanta tercih ettiniz maaliyetinize 115 TL eklenecektir.");
                                            c = 1;
                                            break;
                                        case 4:
                                            System.out.println("Duble iskender ve ayran tercih ettiniz maaliyetinize 110 TL eklenecektir.");
                                            c = 1;
                                            break;
                                    }
                                } else if (icecek.equalsIgnoreCase("hayır")) {
                                    System.out.println("Duble iskenderin yanına içecek tercih etmediniz maaliyetinize 100 TL eklenecektir.");
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
        }
        else{
            return false;
        }
    }

    @Override
    public boolean özgüalan() {
        if(this.özgüalan){
            System.out.println("Forum Ankara alışveriş merkezinin diğer alışveriş merkezlerine göre özel olan alanı kurulan sergi alanıdır girişi ücretsizdir maaliyetiniz 0 TL'dir.");
            return true;
        }
        else{
            return false;
        }
    }
}
