package mineproject.minenorthwind.business.abstracts;
import java.util.List;

import mineproject.minenorthwind.core.utilities.DataResult;
import mineproject.minenorthwind.entities.concretes.Category;


public interface CategoryService {
	
	DataResult<List<Category>> getAll();
}
