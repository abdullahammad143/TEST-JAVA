


                     //PROBLEM 1 SUM OF 3 NUMBERS BY TAKING INPUT FROM USERS

package com.company;
import java.util.Scanner;

public class program1 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter first number ");
    int a  = sc.nextInt();
    System.out.println("enter second number ");
    int b = sc.nextInt();
System.out.println("enter third number ");
    int c  = sc.nextInt();
    int sum = a+b+c;
    System.out.println(" The sum of these  three numbers is:");
    System.out.println(sum);
}
}