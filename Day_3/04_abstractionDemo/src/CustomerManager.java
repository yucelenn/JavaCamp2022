public class CustomerManager {
    
    private Customer customer;
    private ICreditManager _creditManager;
    
    public CustomerManager(Customer customer, ICreditManager creditManager){
        this.customer = customer;
        _creditManager = creditManager;
    }
    
    public void save(Customer customer){
        System.out.println("müşteri kaydedildi: " );
    }
    
    public void delete(Customer customer){
        System.out.println("müşteri silindi: " );
    }
    
    public void giveCredit(){
        _creditManager.calculate();
        System.out.println("kredi verildi.");
    }
}
