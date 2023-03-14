package methodOverloading;

public class IsPrime {

        public boolean isPrime (int number){
        for (int b = 2; b < number; b++){
           if (number % b == 0){
              return false;
                          }
          }
        return true;
    }


    public boolean isPrime (short number){
        for (int b = 2; b < number; b++){
            if (number % b == 0){
                return false;
            }
        }
        return true;
    }

    public boolean isPrime (long number){
        for (int b = 2; b < number; b++){
            if (number % b == 0){
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        IsPrime isPrime1 = new IsPrime();

        System.out.println(isPrime1.isPrime(7));
    }
}
