public class Main {

    public static void main(String[] args) {
        
        Product product = new Product();
        /*product.name = "Laptop";
        product.id = 1;
        product.description = "Asus Laptop";
        product.price = 5000;
        product.stockAmount = 3;*/
        //private çevirdiğimiz için(field) kullanamayız
        ProductManager productManager = new ProductManager();
        productManager.add(product);
    }
    
}
