public abstract class diger{
    private String isim;

    public diger(String isim) {
        this.isim = isim;
    }

    abstract void bilgileri_goster();

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
}