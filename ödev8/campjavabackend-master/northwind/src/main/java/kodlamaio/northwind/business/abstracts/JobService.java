package kodlamaio.northwind.business.abstracts;

import java.util.List; 

import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.entities.concretes.Job;


public interface JobService {
      DataResult<List<Job>> getAll();
      DataResult<List<Job>> getAllSorted();
      DataResult<List<Job>> getAll(int pageNo, int pageSize);
      Result add(Job job);
	
	DataResult<List<Job>> getByJobNameContains(String jobName);
	DataResult<Job> getByJobNameAndSalary(String jobName, int salary);
	DataResult<Job> getByJobNameAndCategoryId(String jobName, int salary);
     
      
      
}
