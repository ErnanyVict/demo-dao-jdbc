package Application;

import java.util.List;

import entities.Department;
import entities.Seller;
import model.dao.DaoFactory;
import model.dao.SellerDao;

public class Program {

	public static void main(String[] args) {
		Department obj = new Department(1, "Books");
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		Seller seller = sellerDao.findById(3);
		
		System.out.println(obj);
		System.out.println(seller);
		
		Department department = new Department(1, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		
		for (Seller objt : list) {
			System.out.println(objt);
		}
		
		System.out.println("Test 3");
		
		List<Seller> list2 = sellerDao.findAll();
		
		for (Seller objt : list2) {
			System.out.println(objt);
		}
	}

}
