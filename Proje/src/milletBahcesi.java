public class milletBahcesi extends diger{
    public milletBahcesi(String isim) {
        super(isim);
    }
    @Override
    void bilgileri_goster() {
        System.out.println("\n"+getIsim()+"'ne gitmek istediniz.Millet Bahçesi'nde yapabileceğiniz birçok etkinlik bulunmaktadır\n" +
                "Bunlardan bir tanesi geniş yeşillik alanlarında yürüme alanlarında arkadaşlarınızla yürüyüş yapabileceğiniz ve oturup sohbet edebieceğiniz yerlerdir.\n" +
                "Yeşil alanların yanı sıra zaman zaman Altındağ Belediyesi'nin düzenlediği konserler ve etkinlikler olmaktadır.\n" +
                "Yine birçok insanın eğlenebileceği oyun parkı alanı vardır.Aynı zamanda yetişkinlerin de kolayca eğlenebilmesini sağlayabilecek zipline vardır.");
    }
}
