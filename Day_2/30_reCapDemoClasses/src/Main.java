public class Main {

    public static void main(String[] args) {
        
        DortIslem dortIslem = new DortIslem();
        int sonuc = dortIslem.topla(5, 6);
        System.out.println(sonuc);
        
        sonuc = dortIslem.cikar(6, 5);
        System.out.println(sonuc);
        
        sonuc = dortIslem.carp(6, 5);
        System.out.println(sonuc);
        
        sonuc = dortIslem.bol(6, 3);
        System.out.println(sonuc);
    }
    
}
