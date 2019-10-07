import java.util.*;
import java.lang.*;
import java.io.*;
class Decimal_To_Octal
{
	public static void main (String[] args)
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=1,r,oct=0;
		while(n!=0){
			r=n%8;
			n/=8;
			oct+=r*i;
			i=i*10;
		}
		System.out.println("Octal value:"+oct);
	}
}
