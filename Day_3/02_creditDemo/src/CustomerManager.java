public class CustomerManager {
    
    private Customer customer;
    
    public CustomerManager(Customer customer){
        this.customer = customer;
    }
    
    public void save(Customer customer){
        System.out.println("müşteri kaydedildi: " );
    }
    
    public void delete(Customer customer){
        System.out.println("müşteri silindi: " );
    }
    
}
