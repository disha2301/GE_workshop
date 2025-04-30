package com.gevernova.workshopfour;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Top3LongestStringsUsingJavaEight {
    public static void main(String[] args){
        // list of names
        List<String> names = Arrays.asList("disha","evan","davidson","christopher","bob", "alex");
        List<String> finalListOfNames = new ArrayList<>();
        int longest = 0; // flag to compare the two strings
        for(String name : names){ // iterating through the list of names
            if(name.length() >= longest){
                finalListOfNames.add(name);
                longest = name.length();
            }
        }
        System.out.println(finalListOfNames);
    }
}
