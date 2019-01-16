/**
 * 
 */

/**
 * @author tbalasubramaniyan
 *
 */
public class Hashpractice
{
	public static void main(String[] args) 
	{
		int[][] arr= {{1,1,1},{1,1,1},{1,1,1}};
		int r=3;
		int c=3;
		int s=2;
		fill(arr,s);
		print(arr);
	}
	public static void fill(int[][] arr,int s)
	{
		int i,j;
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
				if(arr[i][j]==1 &&arr[i][j+1]==1)
				{
						arr[i][j]=0;
						arr[i][j+1]=0;
                 }
				if(arr[i][j]==1 &&arr[i+1][j]==1)
				{
						arr[i][j]=0;
						arr[i+1][j]=0;
                 }
			}
			if(arr[i][j]==1 &&arr[i][j-1]==1)
			{
					arr[i][j]=0;
					arr[i][j+1]=0;
             }
		}
		
	}
	public static void print(int[][] arr)
	{
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(arr[i][j]+"  ");
			}
			System.out.println();
		}
	}
}
