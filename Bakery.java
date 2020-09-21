
public class Bakery{

	public Bakery() {
	
		
	}
	public Cake orderCake(String type) {
		Cake cake = new Cake();
		cake=createCakey(type);
		System.out.println("Price: "+cake.getPrice());
		return cake;
		
	}
	/**
	 * @param type
	 * @return
	 */
	private Cake createCakey(String type) {
		if(type.equalsIgnoreCase("carrot cake")) {
			Cake carrotCake = new CarrotCake();
			carrotCake.createCake();
			return carrotCake;
		}
		if(type.equalsIgnoreCase("Black Forest Cake")) {
			Cake blackforestcake = new BlackForestCake();
			blackforestcake.createCake();
			return blackforestcake;
		}
		if(type.equalsIgnoreCase("Birthday Cake")) {
			Cake BirthdayCake = new BirthdayCake();
			BirthdayCake.createCake();
			return BirthdayCake;
		}else {
			return null;
		}
	}

}
