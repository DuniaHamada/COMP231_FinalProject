
//Dunia Al'amal Hamada
//1201001
//Project 
import java.util.Objects;

///super class /General class
public abstract class ElectronicDevices {// abstract class
	// attributes
	private String name;
	private String producingCompany;
	private double weight;
	private double unitPrice;

	// no_arg. constructor
	public ElectronicDevices() {
		this(null, null, 0.0, 0.0); // default values
	}

	// with_arg. constructor
	public ElectronicDevices(String name, String producingCompany, double weight, double unitPrice) {
		super();
		this.name = name;
		this.producingCompany = producingCompany;
		this.weight = weight;
		this.unitPrice = unitPrice;
	}

	// setter & getter methods
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProducingCompany() {
		return producingCompany;
	}

	public void setProducingCompany(String producingCompany) {
		this.producingCompany = producingCompany;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

// override methods
	@Override
	public abstract String toString();

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof ElectronicDevices) {
			return unitPrice == (((ElectronicDevices) obj).getUnitPrice());
		}
		return false;
	}

	public abstract void printReport(); // abstract method

}
