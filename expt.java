import java.util.*;
class expt
{
public static void main(String k[])
{
int a,b,c;
try{
Scanner ob=new Scanner(System.in);
System.out.println("ENTER  THE NO:  ");
a=ob.nextInt();
b=ob.nextInt();
c=a/b;
System.out.println("divide = "+c);
}
catch(ArithmeticException ob)
{
System.out.println("  NO number can be divided by 0   ");
}
catch(InputMismatchException ob)
{
System.out.println("enter only integer number:");
}
System.out.println("HII i am yukta shakya");

}}