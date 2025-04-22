package com.gevernova.workshopthree;
//import java.util.*;
import java.util.HashMap; // import hashmap
import java.util.Scanner; // import scanner for user input
import java.util.Map; // import map for mapping

// class to evaluate the pairs equal to the sum
public class SumOfPair {

    // method to find the sum pairs with target and array elements
    public static void findSumPairs(int target, int[] arr){

        // creation of hashmap of key-value type integer
        Map<Integer, Integer> map = new HashMap<>();

        // flag to check is the pairs exists or not
        boolean found = false;

        // iterating throughout the array elements in arr
        for(int number : arr){
            // finding the complement element
            int subNum = target - number;
            // to check with the object key and integer default value
            if(map.getOrDefault(subNum,0) > 0) {
                found = true; // flag marked as founded pair
                System.out.println("Pair -  { " + subNum + " , " + number + " }"); // printing the pairs founded
                map.put(subNum, map.get(subNum)); // key = subNum and value is get(subNum)
            }
            else{
                map.put(number, map.getOrDefault(number,0)+1);
            }
        }
        if(!found){ // if found is false
            System.out.println("No pairs with sum "+target+" has been found");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // taking user inputs
        System.out.print("Enter number of elements in the array : ");
        int n = sc.nextInt();
        int[] arr = new int[n]; // array declaration

        // taking elements into the array
        System.out.println("Enter elements in the array");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target sum");
        int target = sc.nextInt();

        // calling the function with target value and the array elements
        findSumPairs(target,arr);
    }
}

// Question : Problem:
//Given an array and a sum, find all pairs of numbers that add up to the given sum.
//
//📥 Input: [1, 5, 7, -1, 5], sum = 6
//📤 Output: (1, 5), (7, -1), (1, 5)