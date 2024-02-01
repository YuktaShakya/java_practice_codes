import java.util.*;
class arrbigno{
public static void main(String k[])
{
int N;
Scanner ob= new Scanner(System.in);
System.out.println("Enter the size of array");
N=ob.nextInt();
int a[]= new int[N];
int i,b;
System.out.println("Enter the values of array:  ");
for(i=0; i<N; i++)
{
a[i]= ob.nextInt();
}
b=a[0];
for(i=0; i<N; i++)
{
if(a[i]>b)
b=a[i];
}
System.out.println("the bigger number is = "+b);


}}
