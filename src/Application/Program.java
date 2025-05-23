package Application;

import java.util.Date;
import java.util.List;

import entities.Department;
import entities.Seller;
import model.dao.DaoFactory;
import model.dao.SellerDao;

public class Program {

	public static void main(String[] args) {
		System.out.println("Encontrar por ID");
		Department obj = new Department(1, "Books");
		SellerDao sellerDao = DaoFactory.createSellerDao();
		Seller seller = sellerDao.findById(3);
		
		System.out.println(obj);
		System.out.println(seller);
		
		
		System.out.println("Encontrar por departamento");
		Department department = new Department(1, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		
		for (Seller objt : list) {
			System.out.println(objt);
		}
		
		System.out.println("Encontar tudo");
		
		List<Seller> list2 = sellerDao.findAll();
		
		for (Seller objt : list2) {
			System.out.println(objt);
		}
		
		System.out.println("Insert");
		Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 400.00, department);
		sellerDao.insert(newSeller);
		System.out.println("Inserted! new Seller in ID: " + newSeller.getId());
		
		
		
		System.out.println("Update");
		seller = sellerDao.findById(1);
		seller.setName("Elaine");
		sellerDao.update(seller);
		System.out.println("Update completed");
		
		System.out.println("Delete");
		sellerDao.deleteById(2);
		System.out.println("Delete completed");
	}

}
