public class YuksekLisans extends Egitim{
    @Override
    public boolean Mezuniyet(double aktsOrt){
        if (aktsOrt>2.5) {
            return true;
        }
        else {
            return false;
        }

    }
}
