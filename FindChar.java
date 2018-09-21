package com.company;


public class FindChar {

    public static void main(String[] args) {
        String s = "abcdefghijklmnopqrstuvwxyziflskecznslkjfabe";
        firstNotRepeatingCharacter(s);
    }

   static char firstNotRepeatingCharacter(String s) {
        char[] c=s.toCharArray();
        for(int i=0;i<s.length();i++){
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
