import java.util.*;
import java.lang.*;
import java.io.*;
class Octal_To_Decimal
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=0,r,d=0;
		while(n!=0){
			r=n%10;
			n/=10;
			d+=r*Math.pow(8,i);
			i++;
		}
		System.out.println("Decimal value: "+d);
	}
}
