/* Student id :1341632
 Name : Vaishali Rameshrao Dhulshette
 Course number : COEN 275
 Programming Assignment #2
 Date : 05/08/17*/
package maker;

import java.io.FileNotFoundException;

import product.MainCourse;
import product.SideDish;

public interface MealMaker {

	public void showMeals();
	public void showMealDetails(MainCourse m,SideDish s);
	public MainCourse createMainCourse();
	public SideDish createSideDish();

	public void loadMealInfoFromFile(String FileName) throws FileNotFoundException;

}
