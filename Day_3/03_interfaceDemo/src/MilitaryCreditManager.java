public class MilitaryCreditManager implements ICreditManager{

    @Override
    public void calculate() {
        System.out.println("asker kredisi hesaplandı.");
    }

    @Override
    public void save() {
        System.out.println("asker kredisi verildi.");
    }
    
}
