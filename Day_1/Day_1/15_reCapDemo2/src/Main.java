public class Main {

    public static void main(String[] args) {

        double[] myList = {1.2 , 1.3 , 4.3 , 5.6 , 7.7};
        double total = 0;
        double max = myList[0];
        
        for(double number: myList){
            if (max < number) {
                max = number;  // en büyüğü bulmak için if bloğu
            }
            total = total + number;
            System.out.println(number);
        }
        System.out.println("en büyük: " + max);
        System.out.println("toplam: " + total);
        
    }
    
}
