package com.company;
import java.util.*;

public class Main {

    static boolean contains(char b, char[] array) {
        for (char a : array) {
            if (a == b) {
                return true;
            }
        }
        return false;
    }

    static void RemoveAt(int index, char[] array)
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
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String s1, s2;

        System.out.println("Enter your first word.");
        s1 = scan.nextLine();
        System.out.println("Enter your second word.");
        s2 = scan.nextLine();

        char[] s1Array = s1.toCharArray();
        char[] s2Array = s2.toCharArray();

        for (char a: s1Array)
        {
            if (contains(a, s2Array))
            {

            }
        }

        RemoveAt(4, s1Array);

        System.out.println(s1Array.toString());
    }
}
