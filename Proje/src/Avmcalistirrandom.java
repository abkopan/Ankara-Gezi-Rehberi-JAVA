import java.util.Scanner;

public class Avmcalistirrandom {
    public static int random() {
        int b= (int) (Math.random()*4) ;
        return b;
    }
    public  void calistirrandom() throws InterruptedException {
        Scanner klavye = new Scanner(System.in);
        System.out.println("\n\n******** ALIŞVERİŞ MERKEZLERİ EKRANI ********\n");
        System.out.println("\t1-Natavega\n" +
                "\t2-AnkaMall\n" +
                "\t3-Armada\n" +
                "\t4-Forum Ankara\n");
        System.out.println("***********************************************************\n");
        Thread.sleep(500);
        switch (random()) {
            case 0:
                nataVegarandom nataVegarandom = new nataVegarandom();
                if (nataVegarandom.sinema()) {
                }
                else if (nataVegarandom.mağaza()) {
                }
                else if (nataVegarandom.yemek()) {
                }
                else if (nataVegarandom.özgüalan()) {
                }
                break;
            case 1:
                ankaMallrandom ankaMallrandom=new ankaMallrandom();
                if (ankaMallrandom.sinema()) {
                }
                else if (ankaMallrandom.mağaza()) {
                }
                else if (ankaMallrandom.yemek()) {
                }
                else if (ankaMallrandom.özgüalan()) {
                }
                break;
            case 2:
                armadaRandom armadaRandom =new armadaRandom();
                if (armadaRandom.sinema()) {
                }
                else if (armadaRandom.mağaza()) {
                }
                else if (armadaRandom.yemek()) {
                }
                else if (armadaRandom.özgüalan()) {
                }
                break;
            case 3:
                forumAnkararandom forumAnkararandom =new forumAnkararandom();
                if (forumAnkararandom.sinema()) {
                }
                else if (forumAnkararandom.mağaza()) {
                }
                else if (forumAnkararandom.yemek()) {
                }
                else if (forumAnkararandom.özgüalan()) {
                }
                break;
        }
    }
}

