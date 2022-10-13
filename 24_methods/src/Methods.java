public class Methods {

    public static void main(String[] args) {
        sayiBulmaca();
    }
    
    public static void sayiBulmaca(){
        int[] sayilar = new int[] {1 , 2 , 5 , 7 , 9 , 0};
        int aranacak = 44;
        boolean mevcutMu = false;
        
        for (int sayi : sayilar) {
            if (aranacak == sayi) {
                mevcutMu = true;
                break;
            }
        }
        
        if (mevcutMu) {
            mesajVer();
        }
        else 
            olumsuzMesajVer();
    }
    public static void mesajVer(){
        System.out.println("sayı mevcuttur.");
    }
    public static void olumsuzMesajVer(){
        System.out.println("sayı mevcut değildir.");
    }
}
