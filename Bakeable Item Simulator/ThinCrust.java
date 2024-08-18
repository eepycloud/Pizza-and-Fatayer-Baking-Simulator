

public class ThinCrust extends Pizza{
	
	
	
	public ThinCrust(String name, BakeSize size) {
		super(name, size);
		
	}

	@Override
	public double getWeight() {
		
		if(super.getSize()==BakeSize.LARGE) {
			double extraTopping=100*super.getToppings().size();
			return extraTopping+400 ;
		}
		else if(super.getSize()==BakeSize.MEDIUM) {
			double extraTopping=75*super.getToppings().size();
			return extraTopping+300 ;
		}
		else if(super.getSize()==BakeSize.SMALL) {
			double extraTopping=50*super.getToppings().size();
			return extraTopping+200 ;
		}
		else return 0;

		}
	

	@Override
	public double getPrice() {
		
		if(super.getSize()==BakeSize.SMALL) {
			double basePrice=10;
			double extraTopping=2.5*super.getToppings().size();
			return basePrice+extraTopping;
		
		}
		else if(super.getSize()==BakeSize.MEDIUM) {
			double basePrice=15;
			double extraTopping=3.5*super.getToppings().size();
			return basePrice+extraTopping;
		
		}
		else if(super.getSize()==BakeSize.LARGE) {
			double basePrice=20;
			double extraTopping=5.5*super.getToppings().size();
			return basePrice+extraTopping;
		}
			else return 0;
		
	}

	@Override
	public double getCalories() {
		if(super.getSize()==BakeSize.LARGE) {
			double extraTopping=150*super.getToppings().size();
			return extraTopping+700 ;
		}
		else if(super.getSize()==BakeSize.MEDIUM) {
			double extraTopping=120*super.getToppings().size();
			return extraTopping+500 ;
		}
		else if(super.getSize()==BakeSize.SMALL) {
			double extraTopping=80*super.getToppings().size();
			return extraTopping+300 ;
		}
		else return 0;
	}

	@Override
	public String getType() {
		if(super.getSize()==BakeSize.LARGE) {
			return "Large Thincrust" ;
		}
		else if(super.getSize()==BakeSize.MEDIUM) {
			return "Medium Thincrust" ;
		}
		else if(super.getSize()==BakeSize.SMALL) {
			return "Small Thincrust" ;
		}
		else return "Normal Thincrust";

	}
	public String toString() {
		return super.toString()+String.format("ThinCrust - weight (Grams):%.1f, Calories: %.1f, Price:%.1f\n",this.getWeight(),this.getCalories(),this.getPrice());
	}
	

}
