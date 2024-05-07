
//Dunia Al'amal Hamada
//1201001
//Project 
import java.util.Objects;

//specific class / sub class
public class MemoryFlash extends ElectronicDevices {// inheritance of super class
	// attributes
	private double StorageCapacityInGB;
	private String Color;

	// no_arg. constructor
	public MemoryFlash() {
		this(null, null, 0.0, 0.0, 0.0, null); // default values
	}

	// with_arg. constructor
	public MemoryFlash(String name, String producingCompany, double weight, double unitPrice,
			double storageCapacityInGB, String color) {
		super(name, producingCompany, weight, unitPrice);// To call a superclass constructor
		StorageCapacityInGB = storageCapacityInGB;
		Color = color;
	}

	// setter & getter methods
	public double getStorageCapacityInGB() {
		return StorageCapacityInGB;
	}

	public void setStorageCapacityInGB(double storageCapacityInGB) {
		StorageCapacityInGB = storageCapacityInGB;
	}

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}

	@Override
	public String toString() {// to string method
		return "MemoryFlash [StorageCapacityInGB=" + StorageCapacityInGB + ", Color=" + Color + "]";
	}

	@Override
	public boolean equals(Object obj) {// override equals method
		if (obj instanceof MemoryFlash) {
			return StorageCapacityInGB == (((MemoryFlash) obj).getStorageCapacityInGB());
		}
		return false;
	}

	@Override
	public void printReport() {// implements of super class
		System.out.println("name: " + getName());
		System.out.println("producing Company: " + getProducingCompany());
		System.out.println("weight: " + getWeight());
		System.out.println("unit Price: " + getUnitPrice());
		System.out.println("Storage Capacity In GB: " + StorageCapacityInGB);
		System.out.println("Color: " + Color);

	}

}
