public class randomsec {
    public static int random(){
        int b=(int) ((Math.random())*4);
        return b;
    }
    public void randomsec() throws InterruptedException {
        switch (random()){
            case 0: //AVMLER
                Avmcalistirrandom avmcalistirrandom=new Avmcalistirrandom();
                avmcalistirrandom.calistirrandom();
                System.out.println("\n***** İYİ EĞLENCELER DİLERİZ *****");
                break;
            case 1: //MÜZELER
                müzeCalistirrandom müzeCalistirrandom=new müzeCalistirrandom();
                müzeCalistirrandom.müzeCalistirrandom();
                System.out.println("\n***** İYİ EĞLENCELER DİLERİZ *****");
                break;
            case 2: //PARKLAR
                parkCalistirrandom parkCalistirrandom=new parkCalistirrandom();
                parkCalistirrandom.bilgilerigoster();
                System.out.println("\n***** İYİ EĞLENCELER DİLERİZ *****");
                break;
            case 3: //kARIŞIK
                digerCalistirRandom digerCalistirRandom=new digerCalistirRandom();
                digerCalistirRandom.calistir();
                System.out.println("\n***** İYİ EĞLENCELER DİLERİZ *****");
                break;
        }

    }
}

