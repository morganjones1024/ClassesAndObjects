
public class Fruit {
	private String name;
	private int servingSize;
	private String location;

	public Fruit() {

	}

	public Fruit(String name, int servingSize) {
		this.name = name;
		this.servingSize = servingSize;
	}

	public Fruit(String name, int servingSize, String location) {
		this.name = name;
		this.servingSize = servingSize;
		this.location = location;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getServingSize() {
		return servingSize;
	}

	public void setServingSize(int servingSize) {
		this.servingSize = servingSize;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public boolean isJuicy() {
		return true;
	}

	public String yummy() {
		return "Fruit is delicious!";
	}
}
