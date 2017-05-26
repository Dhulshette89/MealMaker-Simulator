/* Student id :1341632
 Name : Vaishali Rameshrao Dhulshette
 Course number : COEN 275
 Programming Assignment #2
 Date : 05/08/17*/
package maker;

import product.MainCourse;
import product.SideDish;

public class DietPlan {

	private String customerName;

	private String phone;

	private boolean paymentStatus;

	private MealMaker mealMaker;

	private Meal [] meals;

	public DietPlan(String customerName,String phone, MealMaker mealMaker) 
	{
		this.customerName=customerName;
		this.phone=phone;
		this.mealMaker=mealMaker;
		paymentStatus=false;
	}

	public void createMealSchedule(int days) 
	{
		meals = new  Meal[days];
		for(int i=0;i<days;i++)
			{
			
			meals[i]=new Meal(mealMaker.createMainCourse(),mealMaker.createSideDish());
		
			}
	
	}
	public double getCost() 
	{
		double totalCost=0;
		for(int i=0;i<meals.length;i++)
		{
		
			totalCost=meals[i].mainCourse.getCost()+meals[i].sideDish.getCost()+totalCost;
	
		}
		return totalCost;

		
	}
	public int getTotalCalories() 
	{
		int totalCalories=0;
		
		for(int i=0;i<meals.length;i++)
		{
		
			totalCalories=meals[i].mainCourse.getCalories()+meals[i].sideDish.getCalories()+totalCalories;
	
		}
		return totalCalories;
	}
	
	public int getAverageCalories()
	{
		int avg= (getTotalCalories()/meals.length);
		return avg;
		
	}
	public boolean acceptPayment(String cardName, String cardNumber, double amount)
	{	
		String str=cardNumber;
		if(cardName.equals("Master Card"))
		{
			
			if(str.length()==16 && str.charAt(0)=='5')
			{
	
				char a=str.charAt(1);
				if(a=='1' ||a=='2'||a=='3'||a=='4'||a=='5')
				{
					paymentStatus=true;
			
				}

		
			}
		}
		else if(cardName.equals("Visa Card"))
		{
			if((str.length()==13||str.length()==16) &&(str.charAt(0)=='4'))
			{
					paymentStatus=true;
			}
					
		}
				
		return paymentStatus;
	}
	public void generateInvoice()
	{
		System.out.println("---------------------------------Invoice---------------------------------");
		System.out.println("Customer Name:		"+customerName);
		System.out.println("Customer phone Number:"+phone);
		if(paymentStatus==true)
		{
			for(int i=0;i<meals.length;i++)
			{
				System.out.println("\n*********Day "+(i+1)+" meal*********");
				mealMaker.showMealDetails(meals[i].mainCourse, meals[i].sideDish);
				System.out.println("----------------------------------------");
			}
		}
	System.out.print("\nThe payment is");
	if(paymentStatus==true)
		System.out.print(" successful!!");
	else
		System.out.print(" failed , please try again!!");
	}
	public class Meal {

		private MainCourse mainCourse;

		private SideDish sideDish;

		public Meal(MainCourse maincourse,SideDish sideDish)
		{
			this.mainCourse=maincourse;
			this.sideDish=sideDish;
		}

	}

}
