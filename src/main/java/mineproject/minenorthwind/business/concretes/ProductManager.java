package mineproject.minenorthwind.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mineproject.minenorthwind.business.abstracts.ProductService;
import mineproject.minenorthwind.core.utilities.DataResult;
import mineproject.minenorthwind.core.utilities.SuccessDataResult;
import mineproject.minenorthwind.dataAcess.abstracts.ProductDao;
import mineproject.minenorthwind.entities.concretes.Product;

@Service
public class ProductManager implements ProductService {

	private ProductDao productDao;
	
	@Autowired
	public ProductManager(ProductDao productDao) {
		super();
		this.productDao = productDao;
	}


	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		
		return this.productDao.findAll();
	}

	@Override
	public DataResult<List<Product>> findByCategory_CategoryId(int categoryId) {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<Product>>(this.productDao.findByCategory_CategoryId(categoryId));
	}
	

	

}
