public class SosyalSorumluluk extends  DevamDurumu{
    @Override
    public boolean Devam(){
        if (devamsizlik>15) {
            return true;
        }
        else {
            return false;
        }

    }

    public void Kalmadurumu() {
        if (Devam()) {
            System.out.println("Sosyal Sorumluluk : Devamsızlık hakkınız bitmiştir");
        }
        else {
            System.out.println("Sosyal Sorumluluk: Devamsızlık hakkınız var");
        }
    }
}
