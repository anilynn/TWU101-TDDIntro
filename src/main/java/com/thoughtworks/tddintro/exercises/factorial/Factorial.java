package com.thoughtworks.tddintro.exercises.factorial;

public class Factorial {
    public Integer compute(int i) {

        if(i < 0){
            throw new IllegalArgumentException("Cannot compute factorial on negative numbers");
        }
        if(i == 0){
            return 1;
        }
        else{
            return i * compute(i-1);
        }



    }
}