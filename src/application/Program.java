package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Departament;
import model.entities.Seller;

public class Program {

	public static void main (String[] args) {
		
	//Departament obj = new Departament(1, "books");
	//Seller seller = new Seller(21, "Bob" , "bob@gmail.com", new Date(), (double) 3000 , obj);
	
	SellerDao sellerDao = DaoFactory.createSellerDao();
	System.out.println("=== TEST 1: seller findById ====");
	Seller seller  = sellerDao.findById(3);
	System.out.println(seller);
	
	System.out.println(" \n=== TEST 2: seller findByDepartament ====");
	Departament departament = new Departament(2,null);
	List<Seller> list = sellerDao.findByDepartament(departament);
	for(Seller obj : list) {
		System.out.println(obj);
	}
	
	System.out.println(" \n=== TEST 3: seller findAll ====");
	list = sellerDao.findAll();
	for(Seller obj : list) {
		System.out.println(obj);
	}
	System.out.println(" \n=== TEST 4: seller Insert ====");
	Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), (double) 4000, departament);
	sellerDao.insert(newSeller);
	System.out.println("Inserted! New id = " + newSeller.getId());

	System.out.println(" \n=== TEST 5: seller Update ====");
	seller = sellerDao.findById(1);
	seller.setName("Marlon");
	sellerDao.update(seller);
	System.out.println("Update completed!");
}

}

