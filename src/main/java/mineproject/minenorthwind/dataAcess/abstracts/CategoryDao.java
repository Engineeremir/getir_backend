package mineproject.minenorthwind.dataAcess.abstracts;



import org.springframework.data.jpa.repository.JpaRepository;

import mineproject.minenorthwind.entities.concretes.Category;



public interface CategoryDao  extends JpaRepository<Category, Integer>{
	
}

