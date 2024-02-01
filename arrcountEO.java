import java.util.*;
class countEO{
public static void main(String k[])
{
int N;
Scanner ob= new Scanner(System.in);
System.out.println("Enter the size of array: ");
N=ob.nextInt();
int a[]= new int[N];
int e=0,od=0,i;
System.out.println("enter the values of array: ");
for(i=0; i<N; i++)
{
a[i]=ob.nextInt();
}
for(i=0; i<N; i++)

{
if(a[i]%2==0)

{
e++;
}
else{
od++;}
}
System.out.println("the even numbers are: "+e);
System.out.println("the odd numbers are: "+od);

}}