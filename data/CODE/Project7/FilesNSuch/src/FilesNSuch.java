/**
 * @author hbates@northmen.org
 * @version 1.0 - 1/22/2015
 * @see CREATED: 1/22/2015
 * @see PURPOSE: Demonstrate object file I/O
 */

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FilesNSuch {
	private List<Person> people;

	public FilesNSuch() {
		people = new ArrayList<Person>();
		readFile();
		printData();
	}

	public static void main(String[] args) {
		new FilesNSuch();
	}

	private void readFile() {
		String dataFile = "Z:/NCMC/225/Data/code/project7/FilesNSuch/data/file.csv";
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(new File(dataFile)));
			String line;
			while ((line = reader.readLine()) != null) {
				String[] entries = line.split(",");
				int zip = Integer.parseInt(entries[3]);
				Person person = new Person(entries[0], entries[1], entries[2], zip);
				people.add(person);
			}
		} catch (FileNotFoundException nf) {
			nf.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void printData() {
		for (Person person : people) {
			System.out.print("Name: " + person.getFirstName() + " ");
			System.out.println(person.getLastName());
			System.out.print("Residence: " + person.getStreet() + " ");
			System.out.println(person.getZip());
			System.out.println();
		}
	}
}