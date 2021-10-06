package mineproject.minenorthwind.business.abstracts;

import java.util.List;



import mineproject.minenorthwind.entities.concretes.Product;


public interface ProductService {
	
	List<Product> getAll();
	
	
}
