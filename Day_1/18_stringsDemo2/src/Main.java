public class Main {

    public static void main(String[] args) {
        String mesaj = "Bugün hava çok güzel.";
        System.out.println(mesaj);
        
        String yeniMesaj = mesaj.replace(" " , "-");
        System.out.println(yeniMesaj);
        
        System.out.println(mesaj.substring(2)); //2. indeksten başlayarak yazdırmak için
        System.out.println(mesaj.substring(2 , 4)); //2. indeksten başla 4. indekse kadar yaz.
        
        System.out.println("****************");
        for (String kelime : mesaj.split(" ")) {  // boşluklarda stringi böl 
            System.out.println(kelime);
        }
        System.out.println("****************");
        
        System.out.println(mesaj.toLowerCase()); //harfleri küçült
        System.out.println(mesaj.toUpperCase()); //harfleri büyüt
        
        String mesaj2 = "      Bugün hava çok güzel.       ";
        System.out.println(mesaj2.trim()); //baş ve sondaki boşlukları siler.
        
    }
    
}
