/* Student id :1341632
 Name : Vaishali Rameshrao Dhulshette
 Course number : COEN 275
 Programming Assignment #2
 Date : 05/08/17*/
package product;

public class LowCalSideDish implements SideDish{
	private String name;
	private Integer calories;
	private double cost;
	private String id;
	
	

	public LowCalSideDish(String name,Integer calories,double cost,String id)
	{
		this.name=name;
		this.calories=calories;
		this.cost=cost;
		this.id=id;
	}
	public String getName() {
		
		return name;
	}

	
	public Integer getCalories() {
	
		return calories;
	}


	public double getCost() {
		
		return cost;
	}
	public String getId()
	{
		return id;
	}

}
