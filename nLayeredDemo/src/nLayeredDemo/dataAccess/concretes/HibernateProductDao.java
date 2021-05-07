package nLayeredDemo.dataAccess.concretes;

import java.util.List;

import nLayeredDemo.dataAccess.abstracts.ProductDao;
import nLayeredDemo.entities.concretes.Product;

public class HibernateProductDao implements ProductDao {

	@Override //override yazmasanda oluyor.
	public void add(Product product) {
		// TODO Auto-generated method stub
		System.out.println("Hbirnate ile eklendi " + product.getName());
	}

	@Override
	public void update(Product product) {
		// TODO Auto-generated method stub
		System.out.println("Hbirnate ile eklendi" + product.getName());
	}

	@Override
	public void delete(Product product) {
		// TODO Auto-generated method stub
		System.out.println("Hbirnate ile silindi" + product.getName());
	}

	@Override
	public Product get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
