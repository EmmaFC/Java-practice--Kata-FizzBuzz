package com.fizzbuzz;

public class FizzBuzz {

    public static String getDivisors( int num )
    {
       return 
       ( num % 5 == 0 && num % 3 == 0 )? "FizzBuzz" :
       ( num % 5 == 0)? "Buzz" :
       ( num % 3 == 0 )? "Fizz" :
       String.valueOf(num);          
       
    }
}
