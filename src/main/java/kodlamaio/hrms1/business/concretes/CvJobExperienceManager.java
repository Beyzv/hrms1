/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kodlamaio.hrms1.business.concretes;

import java.util.List;
import kodlamaio.hrms1.business.abstracts.CvJobExperienceService;
import kodlamaio.hrms1.core.utilities.result.DataResult;
import kodlamaio.hrms1.core.utilities.result.Result;
import kodlamaio.hrms1.core.utilities.result.SuccessDataResult;
import kodlamaio.hrms1.core.utilities.result.SuccessResult;
import kodlamaio.hrms1.dataaccess.abstracts.CvJobExperienceDao;
import kodlamaio.hrms1.entities.concretes.CvJobExperience;
import org.springframework.stereotype.Service;

/**
 *
 * @author omerfaruk
 */
@Service
public class CvJobExperienceManager implements CvJobExperienceService{

    private CvJobExperienceDao _cvJobExperienceDao;
    
    @Override
    public Result add(CvJobExperience cvJobExperience) {
     _cvJobExperienceDao.save(cvJobExperience);
     return new SuccessResult("Job experiences added Successfully!");     
     
    }

    @Override
    public DataResult<List<CvJobExperience>> getAllByJobSeekerId(int id) {
           return new SuccessDataResult<List<CvJobExperience>>(_cvJobExperienceDao.getAllByJobSeekerId(id),true);
    }

    @Override
    public DataResult<List<CvJobExperience>> getAllByJobSeekerIdOrderByEndDateDesc(int id) {
           return new SuccessDataResult<List<CvJobExperience>>(_cvJobExperienceDao.getAllByJobSeekerIdOrderByEndDateDesc(id),true);
    }
    
}
