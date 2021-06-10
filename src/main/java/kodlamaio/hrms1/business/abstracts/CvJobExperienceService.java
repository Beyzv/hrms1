/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kodlamaio.hrms1.business.abstracts;

import java.util.List;
import kodlamaio.hrms1.core.utilities.result.DataResult;
import kodlamaio.hrms1.core.utilities.result.Result;
import kodlamaio.hrms1.entities.concretes.CvJobExperience;

/**
 *
 * @author omerfaruk
 */
public interface CvJobExperienceService {
     
    Result add(CvJobExperience cvJobExperience);
    DataResult<List<CvJobExperience>> getAllByJobSeekerId(int id); 
    DataResult<List<CvJobExperience>>  getAllByJobSeekerIdOrderByEndDateDesc(int id);
  
}
