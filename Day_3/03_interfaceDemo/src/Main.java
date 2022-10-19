public class Main {

    public static void main(String[] args) {
        //bir sınıf 1 tane sınıfı inherit edebilir ancak 1 sınıf 1 den fazla interface i implement edebilir.
        CustomerManager customerManager = new CustomerManager(new Customer(), new TeacherCreditManager());
        customerManager.giveCredit();
        
    }
    
}
