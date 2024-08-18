import java.util.ArrayList;

public abstract class Pizza implements Bakeable{
	private String name;
	private BakeSize size;
	private ArrayList<Topping> toppings;
	public Pizza(String name,BakeSize size) {
		this.name=name;
		this.size=size;
		this.toppings=new ArrayList<Topping>();
		
	}
	
	public Pizza(String name,BakeSize size ,ArrayList<Topping>toppings) {
		this.name=name;
		this.size=size;
		this.toppings=toppings;
		
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BakeSize getSize() {
		return size;
	}

	public void setSize(BakeSize size) {
		this.size = size;
	}

	public ArrayList<Topping> getToppings() {
		return toppings;
	}

	public void setToppings(ArrayList<Topping> toppings) {
		this.toppings = toppings;
	}
	public void addToppings(Topping topping) {
		toppings.add(topping);
	}
	public int getToppingCount() {
		return getToppings().size();
		
	}
	public String getType() {
		return this.getName();
	}
	@Override
	public String toString() {
		
		StringBuilder toppingLine = new StringBuilder();
		for(int i=0;i<toppings.size();i++) {
			toppingLine.append(toppings.get(i)+" ");
		}
		String firstLine= String.format("PIZZA: %s, size:%s\n",getName(),getSize());
		String secondLine=String.format("Toppings(%s): %s \n",this.getToppingCount(),toppingLine);
		
		
		return firstLine+secondLine;
		
		
		
	}
}
