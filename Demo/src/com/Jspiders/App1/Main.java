package com.Jspiders.App1;
import java.util.Scanner;

public class Main 
{
	
		public static void main(String[] args) 
		{
			Scanner sc = new Scanner(System.in);
			Bag b = new Bag();
			boolean flag = false;
			while(!flag)
			{
				System.out.println("=====================");
				System.out.println("1.Add Ball");
				System.out.println("2.Remove Ball");
				System.out.println("3.Check Bag is Empty??");
				System.out.println("4.Show Game");
				System.out.println("5.Exit");
				System.out.println("======================");
				int choice = sc.nextInt();
				
				switch(choice)
				{
					case 1:
					{
						System.out.println("Which ball you want to add");
						System.out.println("1.BasketBall");
						System.out.println("2.Tennis Ball");
						int choice1 = sc.nextInt();
						switch(choice1)
						{
							case 1:
							{
								b.addBall(new BasketBall());
							}break;
							
							case 2:
							{
								b.addBall(new TennisBall());
							}break;
							
							default :
							{
								System.out.println("Invalid choice");
							}
						}
					}break;
					
					case 2:
					{
						b.removeBall();
					}break;
					
					case 3:
					{
						System.out.println(b.isBagEmpty());
					}break;
					
					case 4:
					{
						b.showGame();
					}break;
					
					case 5:
					{
						flag = true;
					}break;
					
					default:
					{
						System.out.println("Invalid choice");
					}
					
					
				}
			}
		}
			
			System.out.println("Thank you for your patience!!!!");
}

