import java.util.Scanner;
//defining a class 'Pattern53'
class Pattern53{
	//member data
	int n,p=1;
	//member methods
	//function to take inputs from user
	void accept()
	{
		//taking input from user
		Scanner sc=new Scanner(System.in);
		System.out.println("\nEnter the number of lines: ");
		n=sc.nextInt();
	}
	//function to print the pattern
	void pattern()
	{
		//declaring the variables
		int i,j,k;
		//displaying the pattern
		for(i=1;i<=n;i++)
		{
			for(j=n;j>=i;j--)
				System.out.print(j);
			for(k=j;k>=1;k--)
				System.out.print(" ");
			for(k=1;k<=j;k++)
				System.out.print(" ");
			for(j=i;j<=n;j++)
				System.out.print(j);
			System.out.println();
		}

}

//main function
public static void main(String[] args)
{
	//creating an object of class 'Pattern53'
	Pattern53 p=new Pattern53();
	//calling the functions to print the pattern
	p.accept();
	p.pattern();
}
}