/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kodlamaio.hrms1.apicontrollers;

import java.util.List;
import kodlamaio.hrms1.business.abstracts.JobSeekerService;
import kodlamaio.hrms1.core.utilities.result.DataResult;
import kodlamaio.hrms1.core.utilities.result.Result;
import kodlamaio.hrms1.entities.concretes.JobSeeker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author omerfaruk
 */
@RestController
@RequestMapping("/api/jobSeeker")
public class JobSeekerController {
  
    private JobSeekerService _jobSeekerService;
    
   @Autowired
   public JobSeekerController(JobSeekerService jobSeekerService){
      _jobSeekerService=jobSeekerService;
   }
   
    @GetMapping("/getall")
    public DataResult<List<JobSeeker>> getAll(){
    return _jobSeekerService.getAll();
    } 
    
    @PostMapping("/add")
	public Result add(@RequestBody JobSeeker jobSeeker) {
		return _jobSeekerService.Register(jobSeeker);
		
	}
         @GetMapping("/getbyid")
    public DataResult<List<JobSeeker>> getById(int id) {
    return _jobSeekerService.getById(id);
    } 
     
        
}
 
