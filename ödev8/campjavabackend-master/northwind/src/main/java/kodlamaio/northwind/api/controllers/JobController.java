package kodlamaio.northwind.api.controllers;

import java.util.List; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.northwind.business.abstracts.JobService;
import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.entities.concretes.Job;


@RestController
@RequestMapping("/api/workers")
public class JobController {
	
	
	private JobService jobService;
	
	
	@Autowired
	public JobController(JobService productService) {
		super();
		this.jobService = jobService;
	}


	@GetMapping("/getall")
	public DataResult<List<Job>> getAll(){
		return this.jobService.getAll();
	}
	
	
	
	@PostMapping("/add")
	public Result add(@RequestBody Job product) {
		return this.jobService.add(product);
	}
	
	@GetMapping("/getByJobName")
	public DataResult<List<Job>> getByJobName(@RequestParam String jobName){
		return this.jobService.getByJobNameContains(jobName);
	}
	
	@GetMapping("/getByProductNameAndCategoryId")
	public DataResult<Job> 
	getByProductNameAndCategoryId(@RequestParam("jobName") String jobName,@RequestParam("categoryId") int salary){
		System.out.println(jobName);
		System.out.println(salary);
		
		return this.jobService.getByJobNameAndSalary
				(jobName, salary);
	}
	
	@GetMapping("/getByProductNameContains")
	public DataResult<List<Job>> getByProductNameContains(@RequestParam String jobName){
		return this.jobService.getByJobNameContains(jobName);
	}
	
	@GetMapping("/getAllByPage")
	DataResult<List<Job>> getAll(int pageNo, int pageSize){
		return this.jobService.getAll(pageNo, pageSize);
	}
	
	@GetMapping("/getAllDesc")
	public DataResult<List<Job>> getAllSorted() {
		return this.jobService.getAllSorted();
	}
	
	
}
