public class Methods2 {

    public static void main(String[] args) {
        String mesaj = "Bugün hava çok güzel.";
        String yeniMesaj = sehirVer();
        System.out.println(yeniMesaj);
        int sayi = topla(5 , 7);
        System.out.println(sayi);
    }
    
    public static void ekle(){
        System.out.println("Eklendi.");
    }
    
    public static void sil(){
        System.out.println("Silindi.");
    }
    
    public static void guncelle(){
        System.out.println("Güncelendi.");
    } 
    
    public static int topla(int a , int b){
        return a + b;
    }
    
    public static String sehirVer(){
        return "Ankara";
    }
    
}
