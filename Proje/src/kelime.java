import java.util.Scanner;

public class kelime implements Müze{
    private boolean müzeKart;
    public kelime() {
        Scanner klavye = new Scanner(System.in);

        System.out.println("Kelime Müzesi'ne gezi yapmayı istediniz...");
        int a = 0;
        while (a == 0) {
        System.out.println("\nMüze Karta sahip misiniz ? ( Evet ya da Hayır )");
        System.out.print("Cevabınız: ");
        String müzekart = klavye.nextLine();
        if (müzekart.equalsIgnoreCase("evet")) {
            System.out.println("\nMüze Kartına sahip olmanız göz önünde bulundurularak bilet ücretlendirilmesi yapılacaktır...");
            this.müzeKart = true;
            a = 0;
        }
        else if (müzekart.equalsIgnoreCase("hayır")) {
            System.out.println("\nMüze Karta sahip olmamanız göz önünde bulundurularak bilet ücretlendirilimesi yapılacaktır...");
            this.müzeKart = false;
            a = 0;
        }
        else {
            System.out.println("\nYanlış bir tuşlama yaptınız tekrardan tuşlama yapmanız gerekiyor.\n");
            a = 0;
        }
        }
    }

    @Override
    public boolean MüzeKart() {
        if (müzeKart == true) {
            System.out.println("Kelime Müzesi'nin girişi ücretsizdir maaliyetinize hiçbir tutar eklenmeyecektir... ");
            return true;
        }
        else if(müzeKart==false) {
            System.out.println("Kelime Müzesi'nin girişi 6 TL'dir maaliyetinize 6 TL eklenecektir...");
        }
        return false;
    }
}
