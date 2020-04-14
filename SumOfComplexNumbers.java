// Java program to find the sum of complex numbers provided by the user. 

import java.util.*;
public class SumOfComplexNumbers{
static void Sum(){
Scanner s = new Scanner(System.in);
System.out.println ("Enter the 2 Real numbers: "); 
int x = s.nextInt(); 
int y = s.nextInt();
int z = (x+y); 
System.out.println ("The sum of real numbers is: " + z + " " ); 
System.out.println ("Enter the 2 Imaginary numbers. "); 
int a = s.nextInt();
int b = s.nextInt();
int c = (a+b);
System.out.println ("The sum of Imaginary numbers is " + c + "i" + " "); 
if (c<0){
System.out.println ("The sum of Complex numbers is: " + z + "" + c + "i" ); }
else  
System.out.println ("The sum of Complex numbers is: " + z + " + " + c + "i" ); 
}

public static void main (String args[]){
Sum();
}}
