public class Main {

    public static void main(String[] args) {
        
        String mesaj = "Bugün hava çok güzel.";
        System.out.println(mesaj);
        
        System.out.println("Karakter sayısı: " + mesaj.length());
        System.out.println("Beşinci karakter: " + mesaj.charAt(4));
        System.out.println(mesaj.concat(" Yaşasın!"));   //stringleri birleştirir ama geçicidir
        System.out.println(mesaj.startsWith("b")); // true false döner. b ile mi başlıyor?
        System.out.println(mesaj.endsWith(".")); // true false döner. "." ile mi bitiyor?
        
        char[] karakterler = new char[5];
        mesaj.getChars(0, 5, karakterler, 0);
        System.out.println(karakterler);
        System.out.println(mesaj.indexOf("av"));     //soldan bulur
        System.out.println(mesaj.lastIndexOf("a"));  //sağdan bulur
        
    }
    
}
