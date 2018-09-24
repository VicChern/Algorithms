package com.company;
public class Main {
    public static void main(String[] args) {
        String[] arr = {"aba", "aa", "ad", "vcd", "aba"};
        allLongestStrings(arr);
    }

    static String[] allLongestStrings(String[] inputArray) {

        String l = ""; //full string with "-" separator

        for( String s: inputArray )
        {
            //length is first index of substring
            //if list has same size strings, add this one
            if( l.indexOf("-") == s.length() ) l += s + "-";
                //reset if list has smaller strings
            else if ( l.indexOf("-") < s.length() ) l = s + "-";
        }

        return l.split( "-" );
    }
}

/*
 * Copy our array inputArray into ArrayList
 * checking if in for loop (arraylist [i + 1] > arraylist[i] remove arraylist[i])
 * copy arraylist to inputArray
 * return inputarray
 *
 *
 *
 *
 *
 *
 *
 *
 * */