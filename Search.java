import java.util.Scanner;
public class Search
{public static void main(String args[])
	{Scanner sc=new Scanner(System.in);
	System.out.println("Enter a string: ");
	String s=sc.nextLine();
	s=s.replace(",","");
	s=s.replace(".","");
	s=s.replace("?","");
	s=s.replace("!","");
	s=s.replace("'","");
	String a=s.toLowerCase();
	Scanner sca=new Scanner(System.in);
	System.out.println("Enter the word you want to search for: ");
	String e=sca.nextLine();
	String x=e.toLowerCase();
	String f[]=a.split(" ");
	int count=0;
	for(int k=0;k<f.length;k++)
		{if(x.equals(f[k]))
			count+=1;
		}
	System.out.println(e+" occurs "+count+" times.");
	}
}