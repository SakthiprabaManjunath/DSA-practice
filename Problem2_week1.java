/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
// Prob 2: Write a program to check whether a triangle can be formed with the given values for the angles.

// If sum of angles is equal to 180, then triangle can be formed, else it can't be formed.

// Input: 45 45 45

// Expected Output: 

// Triangle cannot be formed

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();
		if(a+b+c == 180){
		    System.out.println("Traingle can be formed");
		}else{
		    System.out.println("Traingle cannot be formed");
		}
	}
}