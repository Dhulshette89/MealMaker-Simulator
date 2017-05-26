/* Student id :1341632
 Name : Vaishali Rameshrao Dhulshette
 Course number : COEN 275
 Programming Assignment #2
 Date : 05/08/17*/
package maker;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import product.MainCourse;
import product.MealType;
import product.SideDish;
import product.MealTypeCode;
import product.LowCalMainCourse;
import product.LowCalSideDish;


public class LowCalMealMaker implements MealMaker
{

	private ArrayList<LowCalMainCourse> lowCalMainCourseList;

	private static ArrayList<LowCalSideDish> lowCalSideDishList;
	

	public LowCalMealMaker(String FileName) throws FileNotFoundException
	{
		loadMealInfoFromFile(FileName);
		
	}

	public void loadMealInfoFromFile(String FileName) throws FileNotFoundException
	{
		lowCalMainCourseList = new ArrayList<LowCalMainCourse>();
		lowCalSideDishList = new ArrayList<LowCalSideDish>();
		
		File file = new File(FileName);
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(file);
	    while(scanner.hasNext())
	    {
	        String[] tokens = scanner.nextLine().split(",");
	     
	        String mealType = tokens[0];
	        if(mealType.equals(MealType.LOWCAL.getValue()))
	        {
	        	String[] temp  = tokens[1].split(":");
	        	if(temp[0].equals(MealTypeCode.MAINCOURSE.getValue()))
	        	{
	        		lowCalMainCourseList.add(new LowCalMainCourse(temp[1],Integer.valueOf(tokens[2]), temp[0], Double.valueOf(tokens[3])));
	        	}
	        	else if(temp[0].equals(MealTypeCode.SIDEDISH.getValue()))
	        	{
	        		lowCalSideDishList.add(new LowCalSideDish(temp[1],Integer.valueOf(tokens[2]), Double.valueOf(tokens[3]),temp[0]));
	        	}
	        }
	       
	    }
	    
	    
	        
	}

	public void showMeals()
	{
		System.out.println("This is the LowCal Main Course List:");
		for(LowCalMainCourse vC: lowCalMainCourseList)
	    {
	    	System.out.println("the Name is: "+vC.getName());
	    	System.out.print(" cost is: "+vC.getCost());
	    	System.out.print(" Calories are: "+vC.getCalories());
	    	System.out.print(" ID is: "+vC.getId());
	    }
		System.out.println("This is the LowCal SideDish List:");
		for(LowCalSideDish vC: lowCalSideDishList)
	    {
	    	System.out.println("the Name is: "+vC.getName());
	    	System.out.print(" cost is: "+vC.getCost());
	    	System.out.print(" Calories are: "+vC.getCalories());}
		
	}
	public void showMealDetails(MainCourse m,SideDish s)
	{
				
		System.out.println("\nMealType:1-LowCal: ");
		System.out.print(m.getId());
		System.out.print(": "+m.getName());
		System.out.print(": "+m.getCalories());
    	System.out.println(": "+m.getCost());
    	//System.out.println("MealType:1-LowCal: ");
    	System.out.print(s.getId());
		System.out.print(": "+s.getName());
		System.out.print(": "+s.getCalories());	
    	System.out.print(": "+s.getCost()+"\n");
    	
		
	}

	

	@Override
	public MainCourse createMainCourse() 
	{
		
		 Random rand = new Random();
		    
		 return (lowCalMainCourseList.get(rand.nextInt(lowCalMainCourseList.size())));
	}

	@Override
	public SideDish createSideDish()
	{
		
		 Random rand1 = new Random();
		    
		 return (lowCalSideDishList.get(rand1.nextInt(lowCalSideDishList.size())));
	}


}
