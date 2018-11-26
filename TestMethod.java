import java.lang.*;
import java.util.Scanner;
public class TestMethod
{
	public static void main(String[] args)
	{
	int size=5; char display='*';				//defining variable size and character
	for (int row = 0; row<size; row++)  		// for loop for row iterations
	        {  
	            for (int col=0; col<size; col++) // nested for loop for column iterations
	            {  
	                  if (row==0 && col==0){           // if conditions to print the character
	                  System.out.print(display);}
	                  if (row==0 && col==4){  
	                  System.out.print(display);}
	                  if(row==1 && col==1){
	                  System.out.print(display);}
	                  if(row==1 && col==3){
	                  System.out.print(display);}
	                  if(row==2 && col==2){
	                  System.out.print(display);}
	                  if(row==3 && col==1){
	                  System.out.print(display);}
	                  if(row==3 && col==3){
	                  System.out.print(display);}
	                  if(row==4 && col==0){
	                  System.out.print(display);}
	                  if(row==4 && col==4){
	                  System.out.print(display);}
	                
	                 
	                  else{                           // else condition to print empty space
	                    System.out.print(" ");
	                   }  

			}
		}
	}

}
