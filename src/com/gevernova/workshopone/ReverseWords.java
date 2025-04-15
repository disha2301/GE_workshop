package com.gevernova.workshopone;
import java.util.*;
public class ReverseWords{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any string : ");
        String str = sc.nextLine();
        str = " "+ str;
        String result ="";
        String word="";
        for(int i=str.length()-1;i>=0;i--){
            char ch = str.charAt(i);
            if(ch!=' '){
                word=ch+word; // reverse order
            }
            else{
                result = result + word + " ";
                word="";
            }
        }
        System.out.println(result);
    }
}
