import java.util.Scanner;

public class genclikParki extends diger{
    public genclikParki(String isim) {
        super(isim);
    }

    @Override
    void bilgileri_goster() {
        Scanner klavye=new Scanner(System.in);
        System.out.println( "\n"+getIsim()+"'na gitmeyi tercih ettiniz.Gençlik Parkı yapmak istediğiniz şeye göre isteklerinizi karşılayabilen bir yerdir.\n" +
                "Park içerisinde Ankara Büyükşehir Belediyesi Tiyatro Binası, Gençlik Merkezi, çay bahçeleri, büfeler, restoranlar bulunuyor.\n" +
                "Gençlik Parkı'nda eğlenebileceğiniz lunapark alanı bulunmaktadır." +
                "\nLunapark alanında eğlence aletlerinin tek biniş tek kişi bilet fiyatı 10 TL'dir. ");
    }
}
