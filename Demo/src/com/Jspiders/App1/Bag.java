package com.Jspiders.App1;

public class Bag {
Ball ball;
	
	public void addBall(Ball ball)
	{
		if(this.ball==null)
		{
			this.ball = ball;
			System.out.println("Ball added successfully");
		}
		else
		{
			System.out.println("Ball already added cannot add another ball");
		}
	}
	
	public void removeBall()
	{
		if(this.ball!=null)
		{
			this.ball = null;
			System.out.println("Ball removed successfully");
		}
		else
		{
			System.out.println("There is no ball added");
		}
	}
	
	public boolean isBagEmpty()
	{
		if(this.ball==null)
			return true;
		else
			return false;
	}
	
	public void showGame()
	{
		if(this.ball instanceof BasketBall)
		{
			BasketBall bb = (BasketBall)ball;
			
			System.out.println("You can play with "+bb.name);
		}
		else if(this.ball instanceof TennisBall)
		{
			TennisBall tb = (TennisBall)ball;
			
			System.out.println("You can play with "+tb.name);
		}
		else
		{
			System.out.println("You cannot play with any of the ball");
		}
	}
}


