package com.pairing4good;

public class FizzBuzz {

    public String fizz(Integer value) {
        if(value % 3 == 0){
            return "fizz";
        }else {
            return value.toString();
        }
    }

    public String buzz(Integer value) {
        if(value % 5 == 0){
            return "buzz";
        }else {
            return value.toString();
        }
    }

    public String fizzbuzz(Integer value) {
        if((value % 3 == 0) &&
        (value % 5 == 0)){
            return "fizzbuzz";
        }else {
            return value.toString();
        }
    }
}
