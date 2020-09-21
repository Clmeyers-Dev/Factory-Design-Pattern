import java.util.ArrayList;

/**
 * @author chris
 *
 */
public class Cake {
	protected String name;
	protected double price;
	protected int numLayer;
	protected ArrayList<String> decorations = new ArrayList<String>();
	protected Shape shape;
	protected String flavor;
	protected String icing;

	/**
	 * @param name
	 * @param price
	 * @param numLayer
	 * @param decorations
	 * @param shape
	 * @param flavor
	 * @param icing
	 */
	public Cake(String name, double price, int numLayer, ArrayList<String> decorations, Shape shape, String flavor,
			String icing) {
		super();
		this.name = name;
		this.price = price;
		this.numLayer = numLayer;
		this.shape = shape;
		this.flavor = flavor;
		this.icing = icing;
		this.decorations = decorations;
	}

	public Cake() {

	}

	public void createCake() {
		createLayers();
		frostCake();
		addDecorations();
	}

	private void createLayers() {
		System.out.println(
				"Creating a " + numLayer + " layerd " + shape.toString().toLowerCase() + " " + flavor + " cake");
	}

	private void frostCake() {
		System.out.println("Frost cake with " + icing + " icing");
	}

	private void addDecorations() {
		for (int i = 0; i < decorations.size(); i++) {
			System.out.println("Adding " + decorations.get(i));
		}
	}

	public double getPrice() {
		return price;
	}
}
