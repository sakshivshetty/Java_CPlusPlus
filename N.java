import java.util.Scanner;
public class N
{public static int n;
 public static int sum=0;
 public static void main(String args[])
	{N obj=new N();
	obj.getInput();
	obj.compute();
	obj.display();
	}
 void getInput()
	{Scanner sc = new Scanner(System.in);
	System.out.println("Enter n: ");
	n=sc.nextInt();
	}
 int factorial(int n)
	{int fact=1;
	if(n==0)
		fact=1;
	else
	{for(int k=1;k<=n;k++)
	fact=fact*k;
	}
	return fact;
	}
 double compute()
	{int y;
	for(int j=1;j<=n;++j)
		{y=factorial(j)/factorial(j-1);
		sum+=y;
		}
	return sum;
	}
 void display()
	{System.out.println("Required sum is: "+sum);
	}
}