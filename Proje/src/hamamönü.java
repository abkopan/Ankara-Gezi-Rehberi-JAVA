public class hamamönü extends diger{
    public hamamönü(String isim) {
        super(isim);
    }

    @Override
    void bilgileri_goster() {
        System.out.println("\n"+getIsim()+"'e gitmek istediniz.Hamamönün'de restore edilmiş tarihi eskiye dayanan evler bulunmaktadır.\n" +
                "Hamamönü'ne gittiğinizde ailenizle arkadaşlarınızla gezip vakit geçirdikten sonra dinlenip sohbet edebileceğiniz kafeteryalar bulunmaktadır.\n" +
                "Kafeteryaların yanısıra alışveriş yapabileceğiniz el işi standları da bulunmaktadır.");
    }
}
