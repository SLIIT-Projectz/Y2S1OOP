package Question4;

public class Breakfast extends Meal {
	
	@Override
	public void displayMeal() {
		// TODO Auto-generated method stub
		System.out.println("Preparing Breakfast ......");
		mealWithFlavour();
		mealInDuration();
		displayCost();
		
	}

	@Override
	public void displayCost() {
		// TODO Auto-generated method stub
		System.out.println("Cost for the meal is = " + ipd.getCost() + "\n");
	}

}
