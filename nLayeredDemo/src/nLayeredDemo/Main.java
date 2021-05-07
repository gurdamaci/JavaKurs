package nLayeredDemo;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.business.concretes.ProductManager;
import nLayeredDemo.core.LoggerService;
import nLayeredDemo.core.jLoggerManagerAdapter;
import nLayeredDemo.dataAccess.concretes.HibernateProductDao;
import nLayeredDemo.entities.concretes.Product;
import nLayeredDemo.jLogger.JLoggerManager;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		ProductService productService = new ProductManager(new HibernateProductDao());
		LoggerService loggerService = new jLoggerManagerAdapter(new JLoggerManager());	
		Product product = new Product(1,1,"Test",1,1);
		productService.add(product);
		loggerService.Log("Bu bir jLogger test");
	}
}
