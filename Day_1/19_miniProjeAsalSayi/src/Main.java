public class Main {

    public static void main(String[] args) {
        int number = 23;
        int remainder ;
        boolean asalMi = true;
                
        if (number<2) {
            System.out.println(number + " sayısı asal değildir.");
            asalMi = false;
        }else{
            for (int i = 2; i < number; i++) {
                remainder = number % i;
                if (remainder == 0) {
                    System.out.println(number + " sayısı asal değildir.");
                    asalMi = false;
                    break;
                }
            }
            if (asalMi) {
                System.out.println(number + " sayısı asaldır.");
            }
        }
    }
    
}
