public class Main {

    public static void main(String[] args) {
        //bu döngü şart sağlanmasa bile en az 1 kere çalışır.
        int j = 1;
        do {            
            System.out.println(j);
            j += 2;
        } while (j<10);
        System.out.println("do-while döngüsü bitti.");
        
    }
    
}
