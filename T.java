import java.util.*;
public class T{
public static void main(String args[]){
int i,j,row,col;
Scanner ob= new Scanner(System.in);
System.out.println("Enter the size of row: ");
row= ob.nextInt();
for(i=0;i<=row;i++)
if(i==3&&j==2||i==4&&j==2||i==4&&j==3)
{
for(j=1;j<=i;j++){
System.out.print(j%2);
}
System.out.println();}

}}