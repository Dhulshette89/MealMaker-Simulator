package product;

public class VeganSideDish implements SideDish {
	private String name;
	private Integer calories;
	private double cost;
	private String id;
	
	

	public VeganSideDish(String name,Integer calories,double cost,String id)
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
