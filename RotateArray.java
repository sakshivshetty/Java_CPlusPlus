import java.util.Arrays;
public class RotateArray
{
     public static void main(String []args)
     {
    	 int a[] = new int[]{ 1,2,3,4,5,6,7,8,9,10 };
    	 System.out.println("Given array is:");
    	 System.out.println(Arrays.toString(a));
    	 int t=a[a.length-1],i;
    	 for(i=a.length-1;i>0;--i)
            {a[i]=a[i-1];}
    	 a[0]=t;
    	 System.out.println("Rotated array is:");
    	 System.out.println(Arrays.toString(a));
     }
}