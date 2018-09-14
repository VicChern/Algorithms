package com.company;
import  java.util.*;
public class Tres2 {
    /*Lucky is the number where sum of one half equals other half
    * Example:
    * 113050 is Lucky number, because sum (1 + 1 + 3) == sum (0 + 5 + 0)
    * Create the function, that can explore stdin number is lucky or not.(You don't know what digit is)
    * */

    public static void main(String[] args) {
        isLucky(113050);
    }
// I cann't divide simple digits and receive two halves.
// I cann't add digit by digit to simple array
// That's why I created ArrayList
    static   boolean isLucky(int n) {
        ArrayList <Integer>  arrayList = new ArrayList<>();
// Now I adding digit by digit to ArrayList
// For this receiving numbers one by one with % operation
// and dividing by 10
        do {
            arrayList.add(n % 10);
            n= n / 10;
        }
        while (n != 0);

        int[] array = new int[arrayList.size()];
        for(int i = 0; i < arrayList.size(); i++){
            array[i] = arrayList.get(i);
        }
        int[] arrayPart1 = Arrays.copyOfRange(array,0,array.length /2);
        int[] arrayPart2 = Arrays.copyOfRange(array, array.length /2 ,array.length);
        if (Arrays.stream(arrayPart1).sum() == Arrays.stream(arrayPart2).sum()){
            System.out.println(true);
            return true;
        }
        System.out.println(false);
        return false;
    }

}
