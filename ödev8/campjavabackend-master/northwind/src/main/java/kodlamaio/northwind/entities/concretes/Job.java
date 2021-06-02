package kodlamaio.northwind.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="workers")
@AllArgsConstructor
@NoArgsConstructor
public class Job {
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name="job_name")
		private String jobName;
	    
	    //@Column(name="category_id")
		//private int categoryId;
	    
	    
	    
	    @ManyToOne()
	    @JoinColumn(name="job_salary")
	    private Salary salary;
	
}
