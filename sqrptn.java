 class sqrptn{
 public static void sqr(int row, int col)
{
int i,j;
for(i=1; i<=row; i++)
{
for(j=1; j<=col; j++)
if(i==1||i==row|| j==1||j==col)
{
System.out.print("*");
}
else{
System.out.print(" ");
}
System.out.println();
}

}
public static void main(String k[])
{
sqr(6,6);}}
