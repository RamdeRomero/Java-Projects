
package trialprimedirective;

import java.util.ArrayList;


class PrimeDirective {

    public static boolean isPrime(int number){
               
        if(number < 2){
            return false;
        }
        else if(number >1){
            for(int x=2; x<= number-1 ;x++ ){
                    if( number%x == 0 ){
                    return false;
                }
            }
        }
        return true;
        
    }
    public ArrayList<Integer> onlyPrimes(int numbers[]){
        ArrayList<Integer> primes = new ArrayList<>();
        for(int number: numbers){
            if(isPrime(number) == true){
                primes.add(number);
            }
        }        
        return primes;
    }

    public static void main(String[] args) {
        
        PrimeDirective pd = new PrimeDirective();
        int[] numbers = {6, 29, 28, 33, 11, 100, 101, 43, 89};
        System.out.println(isPrime(2));
        System.out.println(isPrime(7));
        System.out.println(isPrime(6));
        System.out.println(isPrime(9));
        
        System.out.println(pd.onlyPrimes(numbers));

    } 
    
}

