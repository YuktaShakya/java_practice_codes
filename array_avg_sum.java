import java.util.*;
class avg{
public static void main(String k[])
{
int n;
Scanner ob= new Scanner(System.in);
System.out.println("Enter the size of the array: ");
n=ob.nextInt();
int a[]= new int[n];
int i,sum=0,avg;
System.out.println("Enter the values of array:");
for(i=0; i<n; i++)
{
a[i]=ob.nextInt();
}
for(i=0; i<n; i++)
{
sum=sum+a[i];
}
avg=sum/n;
System.out.println("the average sum of given array is: "+avg);
}}