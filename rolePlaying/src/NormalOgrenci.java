public class NormalOgrenci extends DevamDurumu{
    @Override
    public boolean Devam(){
        if (devamsizlik>5) {
            return true;
        }
        else {
            return false;
        }

    }

    public void Kalmadurumu() {
        if (Devam()) {
            System.out.println("Normal : Devamsızlık hakkınız bitmiştir");
        }
        else {
            System.out.println("Normal : Devamsızlık hakkınız var");
        }
    }
}
