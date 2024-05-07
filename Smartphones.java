//Dunia Al'amal Hamada
//1201001
//Project 

import java.util.Objects;

//specific class / sub class
public class Smartphones extends ElectronicDevices {// inheritance of super class
	// attributes
	private double screenWidth;
	private String processorType;
	private String storage;
	private double memory;

	// no_arg. constructor
	public Smartphones() {
		this(null, null, 0.0, 0.0, 0.0, null, null, 0.0); // default values
	}

	// with_arg. constructor
	public Smartphones(String name, String producingCompany, double weight, double unitPrice, double screenWidth,
			String processorType, String storage, double memory) {
		super(name, producingCompany, weight, unitPrice);// To call a superclass constructor
		this.screenWidth = screenWidth;
		this.processorType = processorType;
		this.storage = storage;
		this.memory = memory;
	}

	// setter & getter methods
	public double getScreenWidth() {
		return screenWidth;
	}

	public void setScreenWidth(double screenWidth) {
		this.screenWidth = screenWidth;
	}

	public String getProcessorType() {
		return processorType;
	}

	public void setProcessorType(String processorType) {
		this.processorType = processorType;
	}

	public String getStorage() {
		return storage;
	}

	public void setStorage(String storage) {
		this.storage = storage;
	}

	public double getMemory() {
		return memory;
	}

	public void setMemory(double memory) {
		this.memory = memory;
	}

	@Override
	public String toString() {// to string method
		return "Smartphones [screenWidth=" + screenWidth + ", processorType=" + processorType + ", storage=" + storage
				+ ", memory=" + memory + "]";
	}

	@Override
	public boolean equals(Object obj) {// override equals method
		if (obj instanceof Smartphones) {
			return screenWidth == (((Smartphones) obj).getScreenWidth());
		}
		return false;
	}

	@Override
	public void printReport() {// implements of super class
		System.out.println("name: " + getName());
		System.out.println("producing Company: " + getProducingCompany());
		System.out.println("weight: " + getWeight());
		System.out.println("unit Price: " + getUnitPrice());
		System.out.println("screen Width: " + screenWidth);
		System.out.println("processor Type: " + processorType);
		System.out.println("storage: " + storage);
		System.out.println("memory: " + memory);

	}

}
