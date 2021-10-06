package mineproject.minenorthwind.dataAcess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import mineproject.minenorthwind.entities.concretes.Product;

public interface ProductDao extends JpaRepository<Product, Integer> {

}
