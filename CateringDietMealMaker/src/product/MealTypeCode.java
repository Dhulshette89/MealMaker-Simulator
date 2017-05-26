package product;

public enum MealTypeCode {
	
	MAINCOURSE("A"),
	SIDEDISH("B");
	
	private final String value;
	
	
	MealTypeCode(final String newValue) {
        value = newValue;
    }

    public String getValue() { return value; }



}
