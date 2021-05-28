/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kodlamaio.hrms1.apicontrollers;

import java.util.List;
import kodlamaio.hrms1.business.abstracts.EmployerService;
import kodlamaio.hrms1.core.utilities.result.DataResult;
import kodlamaio.hrms1.core.utilities.result.Result;
import kodlamaio.hrms1.entities.concretes.Employer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author omerfaruk
 */
@RestController
@RequestMapping("/api/employer")
public class EmployerController {
        private EmployerService _employerService;
    
   @Autowired
   public EmployerController(EmployerService employerService){
      _employerService=employerService;
   }
   
    @GetMapping("/getall")
    public DataResult<List<Employer>> getAll(){
    return _employerService.getAll();
    } 
    
    @PostMapping("/add")
	public Result add(@RequestBody Employer employer) {
		return _employerService.Register(employer);
		
	}
    @GetMapping("/getbyid")
    public DataResult<List<Employer>> getById(@RequestParam int id) {
    return _employerService.getById(id);
    } 
}
