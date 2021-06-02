/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kodlamaio.hrms1.apicontrollers;

import java.util.Date;
import java.util.List;
import kodlamaio.hrms1.business.abstracts.JobAdvertisementService;
import kodlamaio.hrms1.core.utilities.result.DataResult;
import kodlamaio.hrms1.core.utilities.result.Result;
import kodlamaio.hrms1.entities.concretes.JobAdvertisement;
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
@RequestMapping("/api/jobAdvertisement")
public class JobAdvertisementController {
     private JobAdvertisementService _jobAdvertisementService;
    
   @Autowired
   public JobAdvertisementController( JobAdvertisementService jobAdvertisementService){
      _jobAdvertisementService=jobAdvertisementService;
   }
   
    @GetMapping("/getall")
    public DataResult<List<JobAdvertisement>> getAll(){
    return _jobAdvertisementService.getAll();
    }
   
    @PostMapping("/add")
	public Result add(@RequestBody JobAdvertisement jobAdvertisement) {
		return _jobAdvertisementService.add(jobAdvertisement);
	}
        
     @GetMapping("/getByApplicationDate")
    public DataResult<List<JobAdvertisement>> getByApplicationDate(String applicationDate){
    return _jobAdvertisementService.getByApplicationDate(applicationDate);
    }   
    @GetMapping("/getByIsActive")
    public DataResult<List<JobAdvertisement>> getByIsValid(boolean isActive){
    return _jobAdvertisementService.getByIsActive(isActive);
    }   
  
}
