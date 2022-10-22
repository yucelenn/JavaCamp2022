public class MySqlCustomerDal implements ICustomerDal, IRepository{
//birden fazla interface i imp edebiliriz.
    @Override
    public void add() {
        System.out.println("MySql eklendi.");
    }
    
}
