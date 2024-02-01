import java.util.*;

class T {
    public static void main(String args[]) {
        int i, j, row, col;
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the size of row: ");
        row = ob.nextInt();

        for (i = 0; i <= row; i++) {
            for (j = 4; j < i; j++)
{
  System.out.print(" ");
} 
for(int k=0; k<=i; k++) 
  {
if(k==0||k==i)
{
System.out.println("1");
}
else{
System.out.print("0");}
if(k<i)
{
System.out.print(" " );
}}


          
            System.out.println();
        }
    }
}