
public class Runner {
	public static void main(String args[]) {
		
	
	Fatayer f1= new Fatayer(FatayerType.CHEESE);
	Fatayer f2= new Fatayer(FatayerType.ZAATER);
	
	System.out.println(f1);
	System.out.println(f2);
	System.out.print("=================\n");
	ThinCrust tc1=new ThinCrust("Four Seasons",BakeSize.MEDIUM);
	tc1.addToppings(Topping.BEEF);
	tc1.addToppings(Topping.OLVIES);
	System.out.print(tc1);
	ThickCrust tc2=new ThickCrust("HAWAII Fresh",BakeSize.LARGE);
	tc2.addToppings(Topping.CHICKEN);
	tc2.addToppings(Topping.PEPPORONI);
	System.out.print(tc2);

	
	}
}
