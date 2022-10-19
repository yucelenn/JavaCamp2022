public class TeacherCreditManager implements ICreditManager{

    @Override
    public void calculate() {
        System.out.println("öğretmen kredisi hesaplandı.");
    }

    @Override
    public void save() {
        System.out.println("öğretmen kredisi verildi.");
    }
    
}
