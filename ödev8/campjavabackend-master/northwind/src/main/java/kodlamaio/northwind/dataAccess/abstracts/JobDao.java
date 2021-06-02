package kodlamaio.northwind.dataAccess.abstracts;

import java.util.List; 

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import kodlamaio.northwind.entities.concretes.Job;


public interface JobDao extends JpaRepository<Job,Integer>{
	  /*Job getByProductName(String productName);
	  
	  Job getByProductNameAndCategory_CategoryId(String productName, int categoryId);
	  
	  List<Job> getByProductNameOrCategory_CategoryId(String productName, int categoryId);
	  
	  List<Job> getByCategoryIn(List<Integer> categories);
	  
	  List<Job> getByProductNameContains(String productName);
	  
	  List<Job> getByProductNameStartsWith(String productName);*/
	  
	  
	  
	  
	  //select p.productId,p.productName, c.categoryName  from Category c inner join Product p
	  //on c.categoryId = p.categoryId
	  
	 
}
