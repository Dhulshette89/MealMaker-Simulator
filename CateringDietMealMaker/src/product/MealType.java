package product;

public enum MealType {
	VEGAN("1"),
	LOWCARB("2"),
	LOWCAL("3");
	
	private final String value;
	
	
	MealType(final String newValue) {
        value = newValue;
    }

    public String getValue() { return value; }

    
}
