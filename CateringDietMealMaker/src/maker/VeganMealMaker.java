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
import product.MealTypeCode;
import product.MainCourse;
import product.SideDish;
import product.MealType;
import product.VeganMainCourse;
import product.VeganSideDish;

public class VeganMealMaker implements MealMaker
{

	private ArrayList<VeganMainCourse> veganMainCourseList;

	private static ArrayList<VeganSideDish> veganSideDishList;
	

	public VeganMealMaker(String FileName) throws FileNotFoundException
	{
		loadMealInfoFromFile(FileName);
		
	}

	public void loadMealInfoFromFile(String FileName) throws FileNotFoundException
	{
		veganMainCourseList = new ArrayList<VeganMainCourse>();
		veganSideDishList = new ArrayList<VeganSideDish>();
		
		File file = new File(FileName);
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(file);
	    while(scanner.hasNext())
	    {
	        String[] tokens = scanner.nextLine().split(",");
	     
	        String mealType = tokens[0];
	        if(mealType.equals(MealType.VEGAN.getValue()))
	        {
	        	String[] temp  = tokens[1].split(":");
	        	if(temp[0].equals(MealTypeCode.MAINCOURSE.getValue()))
	        	{
	        		veganMainCourseList.add(new VeganMainCourse(temp[1],Integer.valueOf(tokens[2]), temp[0], Double.valueOf(tokens[3])));
	        	}
	        	else if(temp[0].equals(MealTypeCode.SIDEDISH.getValue()))
	        	{
	        		veganSideDishList.add(new VeganSideDish(temp[1],Integer.valueOf(tokens[2]), Double.valueOf(tokens[3]),temp[0]));
	        	}
	        }
	       
	    }
	    
	    
	        
	}

	public void showMeals()
	{
		System.out.println("This is the Vegan Main Course List:");
		for(VeganMainCourse vC: veganMainCourseList)
	    {
	    	System.out.println("the Name is: "+vC.getName());
	    	System.out.print(" cost is: "+vC.getCost());
	    	System.out.print(" Calories are: "+vC.getCalories());
	    	System.out.print(" ID is: "+vC.getId());
	    }
		System.out.println("This is the Vegan SideDish List:");
		for(VeganSideDish vC: veganSideDishList)
	    {
	    	System.out.println("the Name is: "+vC.getName());
	    	System.out.print(" cost is: "+vC.getCost());
	    	System.out.print(" Calories are: "+vC.getCalories());}
		
	}
	public void showMealDetails(MainCourse m,SideDish s)
	{
				
		System.out.println("\nMealType:1-Vegan: ");
		System.out.print(m.getId());
		System.out.print(": "+m.getName());
		System.out.print(": "+m.getCalories());
    	System.out.println(": "+m.getCost());
    	//System.out.println("MealType:1-Vegan: ");
    	System.out.print(s.getId());
		System.out.print(": "+s.getName());
		System.out.print(": "+s.getCalories());	
    	System.out.print(": "+s.getCost()+"\n");
    	
		
	}

	

	@Override
	public MainCourse createMainCourse()
	{
		
		 Random rand = new Random();
		    
		 return (veganMainCourseList.get(rand.nextInt(veganMainCourseList.size())));
	}

	@Override
	public SideDish createSideDish() 
	{
		
		 Random rand1 = new Random();
		    
		 return (veganSideDishList.get(rand1.nextInt(veganSideDishList.size())));
	}


}
