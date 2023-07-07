public class teleferik extends diger{
    public teleferik(String isim) {
        super(isim);
    }

    @Override
    void bilgileri_goster() {
        System.out.println("\n"+getIsim()+"'e gitmeyi tercih ettiniz.Toplu taşıma amacıyla yapılan teleferik Ankara'yı yukarıdan izleme fırsatı sunuyor.\n" +
                "Şentepe ile Yenimahalle arasında size hem ulaşım kolaylığı hem de güzel bir manzara izlemenizi sağlıyor.\n" +
                "Güzel vakit geçirmenizi sağlayan teleferik hattı sağladığı hizmete kıyasla da gayet makul bir fiyatla karşımıza çıkıyor.");
    }
}
