public class ProductValidator {

    static {
        System.out.println("static yapıcı blok çalıştı.");
    }
    
    public ProductValidator(){
        System.out.println("yapıcı blok çalıştı.");
    }
    
    public static boolean isValid(Product product){

        if (product.price>0 && !product.name.isEmpty()) {
            return true;
        }
        else
            return false;
    }
    //inner class
    /*public static class BaskaBirClass {
        public static void sil(){
             
        }
    }*/
}
