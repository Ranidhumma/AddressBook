package com.java;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
	static Scanner scanner = new Scanner(System.in);
	ArrayList<Contacts> person;

	public AddressBook() {
		person = new ArrayList<Contacts>();

	}

	public void addperson() {
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
	}

	public static void main(String[] args) { // main
		System.out.println("Welcome to Address Book");
		AddressBook addressBook = new AddressBook();
		addressBook.addperson();
	}
}
