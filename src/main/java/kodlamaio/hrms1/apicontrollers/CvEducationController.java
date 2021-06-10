/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kodlamaio.hrms1.apicontrollers;

import java.util.List;
import kodlamaio.hrms1.business.abstracts.CvEducationService;
import kodlamaio.hrms1.core.utilities.result.DataResult;
import kodlamaio.hrms1.core.utilities.result.Result;
import kodlamaio.hrms1.entities.concretes.CvEducation;
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
@RequestMapping("/api/educations")
public class CvEducationController {
    private CvEducationService _cvEducationService;
    
    @Autowired
   public CvEducationController(CvEducationService cvEducationService){
     _cvEducationService=cvEducationService;
   }
   
      @PostMapping("/add")
	public Result add(@RequestBody CvEducation cvEducation) {
		return _cvEducationService.add(cvEducation);

	}
    @GetMapping("/getAllByJobSeekerIdOrderByGraduationYearDec")
    public DataResult<List<CvEducation>> getAllByJobSeekerIdOrderByGraduationYearDesc(@RequestParam int id) {
    return _cvEducationService.getAllByJobSeekerIdOrderByGraduationYearDesc(id);
    } 
      @GetMapping("/getAllByUserId")
    public DataResult<List<CvEducation>> getAllByJobSeekerId(@RequestParam int id) {
    return _cvEducationService.getAllByJobSeekerId(id);
    } 
}


 
