
//Dunia Al'amal Hamada
//1201001
//Project 
import java.util.Objects;

//specific class / sub class
public class CoffeeMachines extends ElectronicDevices {// inheritance of super class
	// attributes
	private double cupCapacity;
	private String typeOfFilter;

	// no_arg. constructor
	public CoffeeMachines() {
		this(null, null, 0.0, 0.0, 0.0, null); // default values
	}

	// with_arg. constructor
	public CoffeeMachines(String name, String producingCompany, double weight, double unitPrice, double cupCapacity,
			String typeOfFilter) {
		super(name, producingCompany, weight, unitPrice);// To call a superclass constructor
		this.cupCapacity = cupCapacity;
		this.typeOfFilter = typeOfFilter;
	}

	// setter & getter methods
	public double getCupCapacity() {
		return cupCapacity;
	}

	public void setCupCapacity(double cupCapacity) {
		this.cupCapacity = cupCapacity;
	}

	public String getTypeOfFilter() {
		return typeOfFilter;
	}

	public void setTypeOfFilter(String typeOfFilter) {
		this.typeOfFilter = typeOfFilter;
	}

	@Override
	public String toString() {// to string method
		return "CoffeeMachines [cupCapacity=" + cupCapacity + ", typeOfFilter=" + typeOfFilter + "]";
	}

	@Override
	public boolean equals(Object obj) {// override equals method
		if (obj instanceof CoffeeMachines) {
			return cupCapacity == (((CoffeeMachines) obj).getCupCapacity());
		}
		return false;
	}

	@Override
	public void printReport() {// implements of super class
		System.out.println("name: " + getName());
		System.out.println("producing Company: " + getProducingCompany());
		System.out.println("weight: " + getWeight());
		System.out.println("unit Price: " + getUnitPrice());
		System.out.println("cup Capacity: " + cupCapacity);
		System.out.println("type Of Filter: " + typeOfFilter);

	}

}
