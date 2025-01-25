public class Lisans extends Egitim{
    @Override
    public boolean Mezuniyet(double aktsOrt){
        if (aktsOrt>2) {
            return true;
        }
        else {
            return false;
        }


    }
}
