import java.util.*;
class positivesum{
public static void main(String k[])
{
int N;
Scanner ob= new Scanner(System.in);
System.out.println("enter the size of array");
N=ob.nextInt();
int a[]= new int[N];
int i,s=0;
System.out.println("enter the values of array");
for(i=0; i<N; i++)
{
a[i]= ob.nextInt();
}
for(i=0; i<N; i++)
{
if(a[i]>0)
s=s+a[i];
}
System.out.println("the sum of positive number is: "+s);


}}