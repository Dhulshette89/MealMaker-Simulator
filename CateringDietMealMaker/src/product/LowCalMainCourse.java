/* Student id :1341632
 Name : Vaishali Rameshrao Dhulshette
 Course number : COEN 275
 Programming Assignment #2
 Date : 05/08/17*/
package product;

public class LowCalMainCourse implements MainCourse{
	private String name;
	private Integer calories;
	private String id;
	private Double cost;
	
	
	
	public LowCalMainCourse(String name, Integer calories, String id, Double cost) 
	{
		this.name=name;
		this.calories=calories;
		this.id=id;
		this.cost=cost;
	}


	public double addExtraCost() {
		
		double c=(cost*(110.0/100.0));
		c=(double)Math.round(c*100d)/100d;
		return c;

	}

	public double getCost() {
		
		return(addExtraCost()) ;

	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public Integer getCalories() {
		// TODO Auto-generated method stub
		return calories;
	}

	@Override
	public String getId() {
		// TODO Auto-generated method stub
		return id;
	}

}
