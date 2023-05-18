import java.io.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args){
    	
    	Scanner sc = new Scanner(System.in);
    	int a, b, v;
    	int day = 0;
    	a = sc.nextInt();
    	b = sc.nextInt();
    	v = sc.nextInt();
    	
    	day = (v-a) / (a-b);
    	if((v-a)%(a-b) != 0)
    		day ++;
    	System.out.println(day+1);
    	
 
    	
       
    }
}