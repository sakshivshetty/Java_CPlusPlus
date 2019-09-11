import java.util.Scanner;
public class SumPattern
{
     public static void main(String args[])
	{Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number of rows you need: ");
	int n=sc.nextInt();
	int k,j,sum;
	for(k=1;k<=n;++k)
		{sum=0;
		for(j=1;j<=k;++j)
			{if(j!=k)
				{System.out.print(j+"+");
				sum=sum+j;
				}
			else
				{sum=sum+j;
				System.out.println(j+"="+sum);
				}
			}
		}
		
	}
}