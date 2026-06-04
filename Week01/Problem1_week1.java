/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

//  Prob 1 : Write a program that takes an integer, then a string, then a char from the user and prints them in the screen.

//  Input:  2 Name y

//  Expected Output:
//  2
//  Name
// y

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int num=sc.nextInt();
       String word=sc.next();
       char letter=sc.next().charAt(0);
       System.out.println(num);
       System.out.println(word);
       System.out.println(letter);
        
    }
}
