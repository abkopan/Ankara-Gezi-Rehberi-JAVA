import java.util.Scanner;

public class müzeCalistirrandom {

    public static int random(){
        int b=(int) ((Math.random())*4);
        return b;
    }
    public void müzeCalistirrandom() throws InterruptedException {
        Scanner klavye =new Scanner(System.in);
            System.out.println("\n\n******** MÜZELER EKRANI ********\n");
            System.out.println("1- Resim ve Heykel Müzesi\n" +
                    "2-Etnografya Müzesi\n" +
                    "3-Ulucanlar Cezaevi Müzesi\n" +
                    "4-Kelime Müzesi\n");
        System.out.println("***********************************************************\n");
        Thread.sleep(500);
            switch(random()){
                case 0:
                    resimHeykel resimHeykel=new resimHeykel();
                    resimHeykel.MüzeKart();
                    break;
                case 1:
                    etnografya etnografya =new etnografya();
                    etnografya.MüzeKart();
                    break;
                case 2 :
                    ulucanlar ulucanlar=new ulucanlar();
                    ulucanlar.MüzeKart();
                    break;
                case 3:
                    kelime kelime=new kelime();
                    kelime.MüzeKart();
                    break;

            }
        }
    }

