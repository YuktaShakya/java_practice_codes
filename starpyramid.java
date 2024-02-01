import java.util.*;
class starpyramid{
public static void main(String l[])
{
int i,j,k;
for(i=1; i<=10; i++)
{
for(k=9; k>=i; k--)
{
System.out.print("  ");
}
for(j=1; j<=i; j++)
{
System.out.print("  * ");
}
System.out.println();
}}}