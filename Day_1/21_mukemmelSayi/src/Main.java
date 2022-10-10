public class Main {
// bölenlerinin toplamı kendisine eşit olan sayılara mükemmel sayı denir.
    public static void main(String[] args) {
        
        int number = 28;
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum = sum + i;
            }
        }
        if (sum == number) {
            System.out.println(number + " sayısı mükemmel sayıdır.");
        }
        else
            System.out.println(number + " sayısı mükemmel sayı değildir.");
        
    }
    
}
