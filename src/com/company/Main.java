package com.company;
import java.util.*;
// This was made before i knew java.util.Arrays existed so this is way more complicated then it needed to be

public class Main {

    private static boolean contains(char b, char[] array) {
        for (char a : array) {
            if (a == b) {
                return true;
            }
        }
        return false;
    }

    /*private static void RemoveAt(int index, char[] array)
    {
        char[] end = new char[array.length];

        for (int i = 0; i < index; i++)
        {
            end[i] = array[i];
        }

        for (int i = index; i < array.length; i++)
        {
            end[i] = array[i];
        }
    }*/

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String s1, s2;

        System.out.println("Enter your first word.");
        s1 = scan.nextLine();
        System.out.println("Enter your second word.");
        s2 = scan.nextLine();

        char[] s1Array = s1.toLowerCase().toCharArray();
        char[] s2Array = s2.toLowerCase().toCharArray();

        int count = 0;

        for (char a: s1Array)
        {
            if (contains(a, s2Array))
            {
                count++;
            }
        }

        if (count == s2Array.length)
        {
            System.out.println("Yes, they are anagrams.");
        }
        else
        {
            System.out.println("No, they are not anagrams.");
        }
    }
}
