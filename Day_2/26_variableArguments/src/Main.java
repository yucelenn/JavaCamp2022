public class Main {

    public static void main(String[] args) {
        System.out.println(topla(1,2,3,4,5));
    }
    // eleman sayısı belirsiz array alabiliyor parametre olarak.
    public static int topla(int... sayilar){
        int toplam = 0;
        for (int sayi : sayilar) {
            toplam += sayi;
        }
        return toplam;
    }
}
