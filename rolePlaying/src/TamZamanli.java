public class TamZamanli extends DevamDurumu {
    @Override
    public boolean Devam(){
        if (devamsizlik>10) {
            return true;
        }
        else {
            return false;
        }

    }

    public void Kalmadurumu() {
        if (Devam()) {
            System.out.println("Tam zamanlı : Devamsızlık hakkınız bitmiştir");
        }
        else {
            System.out.println("Tam zamanlı : Devamsızlık hakkınız var");
        }
    }

}
