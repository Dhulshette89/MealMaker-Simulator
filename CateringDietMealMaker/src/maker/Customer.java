/* Student id :1341632
 Name : Vaishali Rameshrao Dhulshette
 Course number : COEN 275
 Programming Assignment #2
 Date : 05/08/17*/
package maker;

import java.io.FileNotFoundException;

public class Customer {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		MealMaker veganMaker = new VeganMealMaker("meals.txt"); 
		DietPlan plan1 = new DietPlan("Vaishali", "1234567891", veganMaker);
		plan1. createMealSchedule(3); 
		System.out.println("The total cost for requested meal is: $"+plan1.getCost()); 
		System.out.println("The total calories for requested meal is: "+plan1.getTotalCalories()+"calories");
		plan1.acceptPayment("Master Card", "5312867534532100",plan1.getCost()); 
		// parameters are not shown 
		plan1.generateInvoice();
	
		MealMaker veganMaker1 = new LowCalMealMaker("meals.txt"); 
		DietPlan plan2 = new DietPlan("Vaishali", "1235555891", veganMaker1);
		plan2. createMealSchedule(3); 
		System.out.println("The total cost for requested meal is: $"+plan2.getCost()); 
		System.out.println("The total calories for request meal is: "+plan2.getTotalCalories()+"calories");
		plan2.acceptPayment("Visa Card", "4312867534532100",plan2.getCost()); 
		// parameters are not shown 
		plan2.generateInvoice();
}
}
