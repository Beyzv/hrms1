/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kodlamaio.hrms1.apicontrollers;

import java.util.List;
import kodlamaio.hrms1.business.abstracts.JobPositionService;
import kodlamaio.hrms1.entities.concretes.JobPosition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author omerfaruk
 */
@RestController
@RequestMapping("/api/jobPosition")
public class JobPositionController {
    
    private JobPositionService _jobPositionService;
    
   @Autowired
   public JobPositionController(JobPositionService jobPositionService){
      _jobPositionService=jobPositionService;
   }
   
    @GetMapping("/getall")
    public List<JobPosition> getAll(){
    return _jobPositionService.getAll();
    }
}

