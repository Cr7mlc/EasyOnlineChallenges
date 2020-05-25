/**
 *
 * To prove whether a number is a prime number, first try dividing it by 2, and see if you get a whole number.
 * If you do, it can't be a prime number. If you don't get a whole number, next try dividing it
 * by prime numbers: 3, 5, 7, 11 (9 is divisible by 3) and so on, always dividing by a prime number.
 *
 *
 * */

public class IsNumberPrime {

    public static boolean isPrime(int number){

        if(number == 2 ) return true;
        else if(number % 2 == 0 ) return false;

        for (int i = 3; i * i<=number; i+=2){
            if(number % i == 0) return false;
        }

        return true;
    }
    public static int getNextPrime(int number){

        for(int i=number; true; i++){
            if(isPrime(i)) return i;
        }

    }


    public static void main(String[] args) {

        System.out.println(isPrime(247));
        System.out.println("The next Prime is: "+getNextPrime(247));

    }



}
