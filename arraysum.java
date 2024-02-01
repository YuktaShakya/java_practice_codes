import java.util.*;
class arrsum{
public static void main(String k[])
{
Scanner ob= new Scanner(System.in);
int N;
System.out.println("enter the size of array");
N=ob.nextInt();
int a[]=new int[N];
int i,sum=0;
System.out.println("ENTER THE VALUES:-  ");
for(i=0; i<N; i++)
{
a[i]=ob.nextInt();
}
for(i=0; i<N; i++)
{
sum= sum+a[i];
}
System.out.println("the sum of the array is :- "+sum);

}}