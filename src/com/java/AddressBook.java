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
		System.out.println("Enter the Phone number");
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
		AddressBook addressBook = new AddressBook();

		for (int i = 0; i < person.size(); i++) {
			Contacts p = (Contacts) person.get(i);
			if (s.equals(p.getFirstName())) {
				System.out.println(p);
				p = addressBook.addperson();/// calling add person to replace

				for (int j = 0; j < person.size(); j++) {
					person.set(j, p);
				}
				System.out.println("Contacts");
			}
		}
	}

	public void deletePerson() {
		System.out.println("Enter name to delete");
		String s = scanner.next();

		for (int i = 0; i < person.size(); i++) {
			Contacts p = (Contacts) person.get(i);
			if (s.equals(p.getFirstName())) {
				System.out.println(p);
				person.remove(i);
				System.out.println(person.isEmpty());
			}
		}

	}

	public static void main(String[] args) { // main
		System.out.println("Welcome to Address Book");
		AddressBook addressBook = new AddressBook();
		addressBook.addperson();
		addressBook.editPerson();
		addressBook.deletePerson();
	}
}
