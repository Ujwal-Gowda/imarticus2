import java.util.Scanner;
public class MultiDimensionalArray
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int row=s.nextInt();
		int col=s.nextInt();
		int [][]a=new int[row][col];
		for(int i=0; i<a.length; i++)
		{
			System.out.println("Enter the" +(i+1)+ "row");
			for( int j=0; j<a[0].length; j++)
			{
				a[i][j]=s.nextInt();
			}
		}
		System.out.println("===============");
		for(int i=0; i<a.length; i++)
		{
			
			for( int j=0; j<a[0].length;j++)	
			{
				System.out.print(a[i][j]+"");
				
			}
			System.out.println();
		}
	}
}


