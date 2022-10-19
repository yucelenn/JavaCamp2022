public class Main {

    public static void main(String[] args) {
        
        CreditManager creditManager = new CreditManager();
        creditManager.calculate();
        creditManager.save();
        
        Customer customer = new Customer(); //instance oluşturduk. instance creation
        customer.id = 1;
        customer.city = "Ankara";
        
        CustomerManager customerManager = new CustomerManager(customer);
        customerManager.save(customer);
        customerManager.delete(customer);
        
        Company company = new Company();
        company.taxNumber = "113123123";
        company.companyName = "Arçelik";
        company.id = 100;
        
        CustomerManager customerManager2 = new CustomerManager(company);
        
        Person person = new Person();
        person.nationalIdentity = "123456";
        
        Customer c1 = new Customer();
        Customer c2 = new Person();
        Customer c3 = new Company();
        
    }
    
}
