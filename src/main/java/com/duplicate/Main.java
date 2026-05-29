package com.duplicate;

public class Main {
    static void main(String[] args) {

        int[] arrayToTest = {1,2,3,4,2,5,1};   //we declare an array and initialize to be passed as input

        //output the result of the method (findDuplicates) to console and pass our array as arguments
        System.out.println(DuplicateFinder.findDuplicates(arrayToTest));
    }
}
