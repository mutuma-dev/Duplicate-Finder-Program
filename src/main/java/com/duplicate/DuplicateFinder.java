package com.duplicate;

import java.util.*;

public class DuplicateFinder {

    //method for finding duplicates which returns a list of integers and accepts an array of integers as arguments

    public static List<Integer> findDuplicates(int[] numbers) {

        //we declare a set of integers to add integers from our array
        Set<Integer> checked = new HashSet<>();

        //Set of numbers to be which will be the duplicates in our array
        Set<Integer> duplicates = new HashSet<>();

        //for loop loops through our array of integers to add each to our set named checked
        for (int number : numbers) {
            if (!checked.add(number)) {  //add returns a boolean and if false we add that result duplicates
                duplicates.add(number);
            }
        }

        return duplicates.stream().sorted().toList();  //return the set of duplicates as a sorted list
    }
}