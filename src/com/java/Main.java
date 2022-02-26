package com.java;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	static Scanner scanner = new Scanner(System.in);
	LinkedList<AddressBook> addressbook = new LinkedList<>();
	HashMap<Integer, AddressBook> addressbookNum = new HashMap<>();

	public void addingMultipleAddressBOOK() {

		while (true) {
			System.out.println("enter a option 1)to access address book 2)exit");
			int option = scanner.nextInt();
			switch (option) {
			case 0:
				System.out.println("Exit from addressbook");
				System.exit(0);
				break;

			case 1:
				System.out.println("enter to addresbook num");
				int N = scanner.nextInt();
				System.out.printf("welcome to addressbook_%d\n", N);

				if (addressbookNum.containsKey(N)) {
					System.out.printf("addressbook_%d is already present you cannot add one more time\n", N);
					break;
				} else {
					AddressBook addr = new AddressBook();
					addr.addingMultiplePerson(); // call function to add new person
					addressbookNum.put(N, addr);
					break;
				}

			default:
				System.out.println(" not a valid option");
				break;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Address Book program");
		Main addressBook = new Main();
		addressBook.addingMultipleAddressBOOK();

	}
}
