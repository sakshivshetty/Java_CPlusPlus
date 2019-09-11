//This is a project that generates a bill for items purchased at a store.

import java.util.*;
	public class Pro 
	{
		static double bill;
		String[] facecreams={"","For oily skin:","For dry skin:","For combination:"};
		String[] facecream_description={"","Combat oily skin with a lightweight cream that maintains the oil level of your skin.","Repair dry skin with a lush face moisturiser.","A cream fit for all types of skin."};
		int[] facecream_qty={0,50,50,50};
		double[] facecream_cost={0.0,450.0,450.0,500.0};
		
		String[] shampoo={"","Anti-Dandruff Shampoo","Anti-Hairfall Shampoo","Anti-Dryness Shampoo","Hair-oil"};
		String[] shampoo_description={"","Heal chronic or acute dandruff in just 3 weeks.","See reduced signs of hairfall in 4 weeks.","Add shine and volume to your hair with our anti-dryness shampoo.","A daily use hair oil that can be used both before and after hair wash."};
		int[] shampoo_qty={0,50,50,50,50};
		double[] shampoo_cost={0.0,180.0,200.0,190.0,100.0};
		
		String[] makeup={"","BodyPlus 24H Eye-liner","BodyPlus 24H Mascara","BodyPlus Universal Red Lipstick","Lip Balm"};
		String[] makeup_description={"","A smudge-proof and water-proof eyeliner of the finest and darkest shade of block.","Add volume and a jet black sheen to your lashes with our brand new mascara.","A universal shade of bold red that suits all skin colours.","An intensive care lip balm that offers 12 hour long protection from dryness and damage to your lips."};

		int[] makeup_qty={0,50,50,50,50,50};
		double[] makeup_cost={0.0,525.0,550.0,500.0,150.0,475.0};
		
		String[] itemsbought = new String[100];
		int[] quantity = new int[100];
		double[] price = new double[100];
		double[] amount = new double[100];
		int k=1;
		static Scanner sc = new Scanner(System.in);

		public static void main(String[] args) 
		{
			Pro B=new Pro();
			
			System.out.println("                        ~~~~~ BodyPlus: Exclusive Outlet ~~~~~                        ");
			System.out.println("Welcome to BodyPlus, a brand relied on by many and trusted since generations.\nChoose from our wide range of hair, skin, and make-up products: all paraben and sulphate free, and not tested on animals.\n");
			
			do{
			System.out.println("Please choose the option of your choice:");
			System.out.println("1. Moisturisers\n2. Hair Products\n3. Make-up\n4. Print Bill\n5. Exit the store\n");
			
			
			
			
				System.out.print("Enter your choice:  ");
				
			int c=sc.nextInt();
			System.out.println("\f");
			if(c==1)	
				{ 	System.out.println("You have chosen Moisturisers - \nAvailable products are listed below:\n");
					B.cream();
				}
			else if(c==2)
				{
					System.out.println("You have chosen Hair Products - \nAvailable products are listed below:\n");
					B.shampoo();
				}
			else if(c==3)
				{
					System.out.println("You have chosen Make-up - \nAvailable products are listed below\n");
					B.makeup();	
				}
			else if(c==4)
				{
					B.printbill();
				}
			else if(c==5)
				{
				System.out.println("Your bill for this purchase is:");
				B.printbill();
				System.out.println("Thank for your shopping with us! Have a great day!! :)");	
				System.exit(0);
				}
			else
				System.out.println("Invalid entry");
		}while(true);
	}

	   public void cream()
		{
			int x=1;
			while(x==1)
			{
			
			System.out.println("Available products are: ");
			for(int i=1;i<=3;i++)
			{
				System.out.println(i+". "+facecreams[i]+"\n"+facecream_description[i]+" ("+ facecream_qty[i]+" pieces available)  "+"\nPrice: "+facecream_cost[i]);
			}
			System.out.print("Enter your choice: ");
			int c=sc.nextInt();
			if(c>0&&c<4)
			{
				System.out.print("Enter the quantity of products that you wish to buy: ");
				int q=sc.nextInt();
				if(q>facecream_qty[c])
				{System.out.println("Sorry, we've run out of stock!");
				
				}
				else
					{facecream_qty[c]-=q;
					bill+=facecream_cost[c]*q;
					itemsbought[k]=facecreams[c];
					quantity[k]=q;
					price[k]=facecream_cost[c];
					amount[k]=q*facecream_cost[c];
					k++;
					}
				
				}
			
			else
			{
				System.out.println("Invalid input: ");
				
			}
			System.out.println("Press 1 to continue shopping or to view bill\nPress 2 to exit the store");
			int c1=sc.nextInt();
			switch(c1)
			{
				case 1: x=0;
				break;
				case 2: System.out.println("Thank for your shopping with us! Have a great day!! :)");	
						System.exit(0);
				default: System.out.println("Invalid Input");
			}
			}
			
			
		}
		public void shampoo()
		{
			int x=1;
			while(x==1)
			{
			
			System.out.println("Available products are: ");
			for(int i=1;i<=3;i++)
			{
				System.out.println(i+". "+shampoo[i]+" ("+ shampoo_qty[i]+" pieces available) "+"\nPrice: "+shampoo_cost[i]);
			}
			System.out.print("Enter your choice: ");
			int c=sc.nextInt();
			if(c>0&&c<4)
			{
				System.out.print("Enter the quantity of product that you wish to buy: ");
				int q=sc.nextInt();
				if(q>shampoo_qty[c])
				{System.out.println("Sorry, we've run out of stock!");
				}
					
				else
				{	
					shampoo_qty[c]-=q;
					bill+=shampoo_cost[c]*q;
					itemsbought[k]=shampoo[c];
					quantity[k]=q;
					price[k]=shampoo_cost[c];
					amount[k]=q*shampoo_cost[c];
					k++;
				}
			}
			else
			{
				System.out.println("Invalid input: ");
				
			}
			System.out.println("Press 1 to continue shopping or to view bill\nPress 2 to exit the store");
			int c1=sc.nextInt();
			switch(c1)
			{
				case 1: x=0;
						break;
						
				case 2: System.out.println("Thank for your shopping with us! Have a great day!! :)");	
				System.exit(0);
				default: System.out.println("Invalid Input");
			}
			}
			
			
		}
		public void makeup()
		{
			int x=1;
			while(x==1)
			{
			
			System.out.println("Available products are: ");
			for(int i=1;i<=3;i++)
			{
				System.out.println(i+". "+makeup[i]+" ("+ makeup_qty[i]+" pieces available) "+"\nPrice: "+makeup_cost[i]);
			}
			System.out.print("Enter your choice: ");
			int c=sc.nextInt();
			if(c>0&&c<4)
			{
				System.out.print("Enter the quantity of product that you wish to buy: ");
				int q=sc.nextInt();
				if(q>makeup_qty[c])
				{
					System.out.println("Sorry, we've run out of stock!");
				}
				else 
				{
					makeup_qty[c]-=q;
					bill+=makeup_cost[c]*q;
					itemsbought[k]=makeup[c];
					quantity[k]=q;
					price[k]=makeup_cost[c];
					amount[k]=q*makeup_cost[c];
					k++;
				}
			}
			else
			{
				System.out.println("Invalid input: ");
				
			}
			System.out.println("Press 1 to continue shopping or to view bill\nPress 2 to exit the store");
			int c1=sc.nextInt();
			switch(c1)
			{
				case 1: x=0;
				break;
				case 2: System.out.println("Thank for your shopping with us! Have a great day!! :)");	
				System.exit(0);
				default: System.out.println("Invalid Input");
			
			}
			}
			
			
		}
		
		public void printbill()
		{	if (bill>0)
		{	
			for(int i=1;i<k;i++)
			{
				
				System.out.println(i+". "+itemsbought[i]+"\tPrice of each: "+price[i]+"\tQuantity: "+quantity[i]+"\tAmount: "+amount[i]+"\n");
				
			}
			System.out.println("\nTotal bill: "+bill+"\n\n\n\n\n");
		}
		else
		{
			System.out.println("You have not purchased any item.");
		}
		}
	}






