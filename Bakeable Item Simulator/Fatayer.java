
public class Fatayer implements Bakeable {
	private FatayerType fatayerType;

	public Fatayer(FatayerType fatayerType) {
		this.fatayerType=fatayerType;
	}
	public FatayerType getFatayerType() {
		return fatayerType;
	}

	public void setFatayerType(FatayerType fatayerType) {
		this.fatayerType = fatayerType;
	}
	public String getType() {
		if(fatayerType==FatayerType.CHEESE) {
			return "CHEESE";
		}else if(fatayerType==FatayerType.LHMAACHIN) {
			return"LHMAACHIN";
		}
		else if(fatayerType==FatayerType.SPINACH) {
			return"SPINACH";
		}
		else if(fatayerType==FatayerType.ZAATER) {
			return"ZAATER";
		}
		else
			return"PLAIN";
		
	}
	@Override
	public double getWeight() {
		
		if(fatayerType==FatayerType.CHEESE) {
			return 240;
		}else if(fatayerType==FatayerType.LHMAACHIN) {
			return 180;
		}
		else if(fatayerType==FatayerType.SPINACH) {
			return 250;
		}
		else if(fatayerType==FatayerType.ZAATER) {
			return 250;
		}
		else
			return 0;
	}

	@Override
	public double getPrice() {
		
		return 9;
	}

	@Override
	public double getCalories() {
		
		if(fatayerType==FatayerType.CHEESE) {
			return 300;
		}else if(fatayerType==FatayerType.LHMAACHIN) {
			return 250;
		}
		else if(fatayerType==FatayerType.SPINACH) {
			return 200;
		}
		else if(fatayerType==FatayerType.ZAATER) {
			return 250;
		}
		else
			return 0;
	}

	@Override
	public String getName() {
		return "Fatayer";
	}
	@Override
	public String toString() {
		return String.format("FATAYER: %s, Price: %.1f, Weight: %.1f, Calories: %.1f",this.getType(),this.getPrice(),this.getWeight(),this.getCalories());
	}
	
}
