package mineproject.minenorthwind.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;




@Entity
@Table(name="products")
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="product_id")
	private int id;
	
	@Column(name="product_name")
	private String productName;
	
	@Column(name="image_path")
	private String imagePath;
	
	@Column(name="unit_price")
	private double unitPrice;
	
	
	
	@Column(name="quantity_per_unit")
	private String quantityPerUnit;
	
		
	@ManyToOne()
	@JoinColumn(name="category_id")
	private Category category;
	
	public Product() {}

	public Product(int id, String productName, String imagePath, double unitPrice, String quantityPerUnit,
			Category category) {
		super();
		this.id = id;
		this.productName = productName;
		this.imagePath = imagePath;
		this.unitPrice = unitPrice;
		this.quantityPerUnit = quantityPerUnit;
		this.category = category;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getQuantityPerUnit() {
		return quantityPerUnit;
	}

	public void setQuantityPerUnit(String quantityPerUnit) {
		this.quantityPerUnit = quantityPerUnit;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}
	


	
	
	
	
	
	
}
