import java.util.Scanner;
public class Decimal_To_Binary
{
public static long decimal_to_binary(int n)
{
long b= 0;
int r, i;
for(i = 1; n != 0; i = i * 10)
{
r = n % 2;
n=n/ 2;
b=b+r*i;
}
return b;
}
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter a decimal number:");
int n = sc.nextInt();
System.out.println("Equivalent binary number : " + decimal_to_binary(n));
}
}
