
//Dunia Al'amal Hamada
//1201001
//Project 
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Driver {

	// static ArrayList<ElectronicDevices> list = new ArrayList<>();

	public static void main(String[] args) throws FileNotFoundException {// Checked Exceptions
		ArrayList<ElectronicDevices> list = new ArrayList<>();// create the array list
		Scanner in = new Scanner(System.in);

		// create a file instance
		File f = new File("myFile1");
		Scanner s = new Scanner(f);// create a scanner for the file

		if (f.exists()) { // read data from a file
			while (s.hasNext()) {
				String sentence = s.next();
				String[] tkz = sentence.split(",");
				if (tkz[0].equalsIgnoreCase("m")) {
					list.add(new MemoryFlash(tkz[1], tkz[2], Double.valueOf(tkz[3]), Double.valueOf(tkz[4]),
							Double.valueOf(tkz[5]), tkz[6]));

				}

				if (tkz[0].equalsIgnoreCase("c")) {
					list.add(new CoffeeMachines(tkz[1], tkz[2], Double.valueOf(tkz[3]), Double.valueOf(tkz[4]),
							Double.valueOf(tkz[5]), tkz[6]));

				}

				if (tkz[0].equalsIgnoreCase("s")) {
					list.add(new Smartphones(tkz[1], tkz[2], Double.valueOf(tkz[3]), Double.valueOf(tkz[4]),
							Double.valueOf(tkz[5]), tkz[6], tkz[7], Double.valueOf(tkz[8])));

				}

			}
		} else
			System.out.println("file does not exists!");
		System.out.println("Welcome for Electronics library\n");
		while (true) {
			System.out.print("Please enter the name of an electronic to give you a report: ");
			String name = in.next();
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).getName().equalsIgnoreCase(name)) {
					printReports(list.get(i));

				}
			}
		}

	}

	public static void printReports(ElectronicDevices e) {
		e.printReport();//To call a print report
	}

}
