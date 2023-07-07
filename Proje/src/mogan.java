public class mogan extends diger{
    public mogan(String isim) {
        super(isim);
    }
    @Override
    void bilgileri_goster() {
        System.out.println("\n"+getIsim()+"'ne gitmek istediniz.Mogan Gölü ve etrafında isteklerinizi kolaylıkça karşılayabilecek etkinlik alanları bulunmaktadır.\n" +
                "Piknik alanları, koşu ve yürüyüş yolları, oyun alanları, arkadaşlarınızla ailenizle gölün etrafında oturup sohbet edeceğiniz kamelya alanları bulunmaktadır.\n" +
                "Bunların yanı sıra kafeteryalar, binicilik spor merkezleri ve dikkat çekici yapısıyla Deniz Feneri bulunmaktadır.");
    }
}
