/* Checking whether two strings are anagrams
Two strings that have the same characters, but that are in a different order, are anagrams.
For this exercise anagramas are case-insensitive and white spaces should be ignored.
*/

import java.util.*;

public class Exercise03{
    public static void main(String[] args)
    {
        String s1 = "hol  A".toLowerCase();
        String s2 = "ho L a".toLowerCase();
        boolean res = false;
       
        char[] array1 = s1.toCharArray();
        Arrays.sort(array1);
        String char1 = new String(array1);
                
        char[] array2 = s2.toCharArray();
        Arrays.sort(array2);
        String char2 = new String(array2);      
        
        if(char1.equals(char2))        
            res = true;        

        System.out.println("¿The words are anagramas? " + res);
        
    }
}