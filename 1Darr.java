import java.util.*;
class arrsum
{
public static void main(String k[])
{
int N;
Scanner ob= new Scanner (System.in);
System.out.println("Enter the Size of array:     ");
N=ob.nextInt();
int a[]=new int[N];
int i,m;
System.out.println("Enter the array elements:  ");
for(i=0; i<N; i++)
{
a[i]=ob.nextInt();
}
int sum=0;
for(i=0; i<N; i++)
{
sum=a[i]+sum;
}
System.out.println("sum of the elements is : "+sum);
}}