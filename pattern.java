import java.util.Scanner;

class pattern
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter the number of rows");
int rows=sc.nextInt();
printPattern(rows);
sc.close();
}

static void printPattern(int numRows)
{
for(int i=1;i<=numRows;i++)
{

	for(int j=1; j<=i;j++)
	{
	System.out.print(j);
	}
for(int k = 2*(numRows-i);k>0;k--)
{
System.out.print(" ");
}

for(int l=i-1;l>0;l--)
{
System.out.print(l);
}

System.out.println();
}
}
}