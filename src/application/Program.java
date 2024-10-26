package application;

import java.util.Date;

import model.entities.Departament;
import model.entities.Seller;

public class Program {

	public static void main (String[] args) {
		
	Departament obj = new Departament(1, "books");
	Seller seller = new Seller(21, "Bob" , "bob@gmail.com", new Date(), (double) 3000 , obj);
	System.out.println(seller);
	}
	
}
