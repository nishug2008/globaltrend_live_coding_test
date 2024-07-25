// Problem Statement
// Write a function to find the longest common subsequence of two given strings.
// Sample Test Case
// Input: str1 = "abcde", str2 = "ace" Output: 3 (The LCS is "ace")

import java.io.*;
import java.util.Scanner;


public class Question1 
{

    int lcs(String s1,String s2,int m,int n)
    {
        if(m==0 || n==0)
        {
            return 0;
        }
        if(s1.charAt(m-1)==s2.charAt(n-1))
        {
            return 1 + lcs(s1,s2,m-1,n-1);
        }
        else
        {
            return Math.max(lcs(s1,s2,m,n-1),lcs(s1,s2,m-1,n));
        }
    }

    public static void main(String args[])
    {
      String s1;
      String s2;

      Scanner sc = new Scanner(System.in);
      
      s1 =sc.nextLine();
      s2=sc.nextLine();

      int m = s1.length();
      int n = s2.length();

      Question1 lcs = new  Question1();

      System.out.println("length is"+ lcs.lcs(s1,s2,m,n));

    }
}