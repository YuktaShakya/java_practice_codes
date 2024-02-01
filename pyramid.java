import java.util.*;
class pyramid{
public static void main(String k[])
{
int i,j,m;
for(i=1; i<=5; i++)
{
for(m=4; m>=i; m--)
{
System.out.print("   ");
}
for(j=1; j<=i; j++)
{
System.out.print(j+ "     ");
}
System.out.println(  );
}
}}