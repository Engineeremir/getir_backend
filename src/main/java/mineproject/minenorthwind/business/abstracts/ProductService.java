package mineproject.minenorthwind.business.abstracts;

import java.util.List;

import mineproject.minenorthwind.core.utilities.DataResult;
import mineproject.minenorthwind.entities.concretes.Product;


public interface ProductService {
	
	List<Product> getAll();
	
	
	DataResult<List<Product>> findByCategory_CategoryId(int categoryId);
	
}
