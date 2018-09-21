package com.company;

// Given a string s, find and return the first instance of a non-repeating character in it. 
// If there is no such character, return '_'.

public class FindChar {

    public static void main(String[] args) {
        String s = "abcdefghijklmnopqrstuvwxyziflskecznslkjfabe";
        firstNotRepeatingCharacter(s);
    }

   
   static char firstNotRepeatingCharacter(String s) {
       
// converting string to array for checking every character
        char[] c=s.toCharArray();
        for(int i=0;i<s.length();i++){
//this statement compareTo equality our characters in string 
            if(s.indexOf(c[i])==s.lastIndexOf(c[i]))
                return c[i];
        }
        return '_';
    }
}


//For
//        matrix = [[0, 1, 1, 2],
//                  [0, 5, 0, 0],
//                  [2, 0, 3, 3]]
//        the output should be
//        matrixElementsSum(matrix) = 9.
