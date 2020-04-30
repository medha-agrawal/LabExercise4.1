package medha.cg.gla.spring.dao;

import java.util.List;

import medha.cg.gla.spring.entity.Product;


public interface ProductDaoInterface {
	
	public boolean create(Product product);
	public List<Product> reterive();
	

}
