//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Ogrenci ogr = new Ogrenci();
        ogr.devamrolu= new SosyalSorumluluk();
        ogr.devamrolu.devamsizlik=12;
        System.out.println("Ogrenci dersten kaldı mı? "  + ogr.devamrolu.Devam());

        ogr.devamrolu= new NormalOgrenci();
        ogr.devamrolu.devamsizlik=12;
        System.out.println("Ogrenci dersten kaldı mı? "  + ogr.devamrolu.Devam());

        ogr.egitimrolu= new YuksekLisans();
        System.out.println("ogrenci mezun mu? " +ogr.egitimrolu.Mezuniyet(2.61));

        ogr.egitimrolu= new YuksekLisans();
        System.out.println("ogrenci mezun mu? " +ogr.egitimrolu.Mezuniyet(2.11));



    }
}