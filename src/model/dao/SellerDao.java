package model.dao;

import java.util.List;

import model.entities.Departament;
import model.entities.Seller;

public interface SellerDao {

	
	void update(Seller obj);
	void deleteById(Integer id);
	Seller findById(Integer id);
	List<Seller> findAll();
	//Opeção de busca por departamento
	List<Seller> findByDepartament(Departament departement);
	void insert(Seller newSeller);
	
	
}
