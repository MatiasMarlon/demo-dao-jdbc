package application;

import java.util.Date;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Departament;
import model.entities.Seller;

public class Program {

	public static void main (String[] args) {
		
	Departament obj = new Departament(1, "books");
	//Seller seller = new Seller(21, "Bob" , "bob@gmail.com", new Date(), (double) 3000 , obj);
	
	SellerDao sellerDao = DaoFactory.createSellerDao();
	System.out.println("=== TEST 1: seller findById ====");
	Seller seller  = sellerDao.findById(3);
	
	System.out.println();
	}
	
}
