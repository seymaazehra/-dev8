package kodlamaio.northwind.business.concretes;
import java.util.List; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import kodlamaio.northwind.business.abstracts.JobService;
import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.core.utilities.results.SuccessDataResult;
import kodlamaio.northwind.core.utilities.results.SuccessResult;
import kodlamaio.northwind.dataAccess.abstracts.JobDao;
import kodlamaio.northwind.entities.concretes.Job;


@Service
public class JobManager implements JobService{

	private JobDao productDao;
	
	@Autowired
	public JobManager(JobDao productDao) {
		super();
		this.productDao = productDao;
	}

	@Override
	public DataResult<List<Job>> getAll() {
		    
			return new SuccessDataResult<List<Job>>
			(this.productDao.findAll(),"kişi listelendi");			
				
	}

	@Override
	public Result add(Job job) {
		this.productDao.save(job);
		return new SuccessResult(" kişi eklendi");
	}

	

	@Override
	public DataResult<List<Job>> getAll(int pageNo, int pageSize) {
		
		Pageable pageable = PageRequest.of(pageNo-1, pageSize);
		
		return new SuccessDataResult<List<Job>>
		(this.productDao.findAll(pageable).getContent());
	}

	@Override
	public DataResult<List<Job>> getAllSorted() {
		Sort sort = Sort.by(Sort.Direction.DESC,"jobName");
		return new SuccessDataResult<List<Job>>
		(this.productDao.findAll(sort),"Başarılı");
	}

	
	@Override
	public DataResult<Job> getByJobNameAndCategoryId(String jobName, int salary) {
		System.out.println();
		return null;
	}

	@Override
	public DataResult<List<Job>> getByJobNameContains(String jobName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<Job> getByJobNameAndSalary(String jobName, int salary) {
		// TODO Auto-generated method stub
		return null;
	}

	

	

}
