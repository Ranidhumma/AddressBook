package com.java;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
	static Scanner scanner = new Scanner(System.in);
	ArrayList<Contacts> person;

	public AddressBook() { // constructor same class name need to use
		person = new ArrayList<Contacts>();

	}

	public Contacts addperson() {
		System.out.println("Enter the First Name");
		String fName = scanner.next();
		System.out.println("Enter the Last Name");
		String lName = scanner.next();
		System.out.println("Enter the Address");
		String address = scanner.next();
		System.out.println("Enter the city");
		String city = scanner.next();
		System.out.println("Enter the State");
		String state = scanner.next();
		System.out.println("Enter the Zip");
		String zip = scanner.next();
		System.out.println("Enter the Phone number ");
		String phonenumber = scanner.next();
		System.out.println("Enter the email");
		String email = scanner.next();

		Contacts contacts = new Contacts(fName, lName, address, city, state, zip, phonenumber, email); // constructor eg
																										// in c int x=10

		person.add(contacts); // adding above list to array
		System.out.println(contacts); // printing contacts

		return contacts;
	}

	public void editPerson() {
		System.out.println("Enter name to Edit");
		String s = scanner.next();
		for (int i = 0; i < person.size(); i++) {
			Contacts p = person.get(i);
			if (s.equals(p.getFirstName())) {
				while (true) {
					System.out.println("Enter choice to edit 1)firstName\n2)lastName\n3)address\n"
							+ "4)city\n5)state\n6)zip\n7)phoneNumber\n8)email9)exit");
					int choice = scanner.nextInt();
					switch (choice) {
					case 1:
						p.setFirstName(scanner.next());
						break;
					case 2:
						p.setLastName(scanner.next());
						break;
					case 3:
						p.setAddress(scanner.next());
						break;
					case 4:
						p.setCity(scanner.next());
						break;
					case 5:
						p.setState(scanner.next());
						break;
					case 6:
						p.setZip(scanner.next());
						break;
					case 7:
						p.setPhoneNumber(scanner.next());
						break;
					case 8:
						p.setEmail(scanner.next());
						break;
					default:
						System.out.println("select correct choice");
						break;
					}
					if (choice == 9)
						break;
				} // here closing while loop
				person.set(i, p);
				System.out.println("person after editing");
				System.out.println(person);

			}
		}

	}

	public void deletePerson() {

		System.out.println("Enter the name to delete");
		String s = scanner.next();
		for (int i = 0; i < person.size(); i++) {
			Contacts p = person.get(i);
			if (s.equals(p.getFirstName())) {
				person.remove(i);
			}
		}
		System.out.println("Contact after deletion");
		if (person.isEmpty() != true)
			System.out.println(person);
		else {
			System.out.println("Deleted contact sucesfully");
		}
	}

	public static void main(String[] args) { // main
		System.out.println("Welcome to Address Book program");
		AddressBook addressBook = new AddressBook();
		addressBook.addperson();
		addressBook.editPerson();
		addressBook.deletePerson();

	}
}
