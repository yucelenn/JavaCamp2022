public class Main {

    public static void main(String[] args) {
        int[] sayilar = new int[] {1 , 2 , 5 , 7 , 9 , 0};
        int aranacak = 99;
        boolean mevcutMu = false;
        
        for (int sayi : sayilar) {
            if (aranacak == sayi) {
                mevcutMu = true;
                break;
            }
        }
        
        if (mevcutMu) {
            System.out.println("sayı mevcutur.");
        }
        else 
            System.out.println("sayı mevcut değildir.");
    }
    
}
