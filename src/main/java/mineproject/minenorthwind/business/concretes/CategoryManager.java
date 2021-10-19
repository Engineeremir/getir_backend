package mineproject.minenorthwind.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mineproject.minenorthwind.business.abstracts.CategoryService;
import mineproject.minenorthwind.core.utilities.DataResult;
import mineproject.minenorthwind.core.utilities.SuccessDataResult;
import mineproject.minenorthwind.dataAcess.abstracts.CategoryDao;
import mineproject.minenorthwind.entities.concretes.Category;



@Service
public class CategoryManager implements CategoryService{
	
	private CategoryDao categoryDao;
	
	@Autowired
	public CategoryManager(CategoryDao categoryDao) {
		super();
		this.categoryDao = categoryDao;
	}


	@Override
	public DataResult<List<Category>> getAll() {
		
		return new SuccessDataResult<List<Category>>
		(
				this.categoryDao.findAll(),
				"Data Listelendi"
		);
	}

	

}
