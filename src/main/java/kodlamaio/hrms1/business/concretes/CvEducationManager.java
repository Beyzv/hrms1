/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kodlamaio.hrms1.business.concretes;


import java.util.List;
import kodlamaio.hrms1.business.abstracts.CvEducationService;
import kodlamaio.hrms1.core.utilities.result.DataResult;
import kodlamaio.hrms1.core.utilities.result.Result;
import kodlamaio.hrms1.core.utilities.result.SuccessDataResult;
import kodlamaio.hrms1.core.utilities.result.SuccessResult;
import kodlamaio.hrms1.dataaccess.abstracts.CvEducationDao;
import kodlamaio.hrms1.entities.concretes.CvEducation;
import org.springframework.stereotype.Service;

/**
 *
 * @author omerfaruk
 */
@Service
public class CvEducationManager implements CvEducationService {
    private CvEducationDao _cvEducationDao;
    
    public CvEducationManager(CvEducationDao cvEducationDao){
    _cvEducationDao=cvEducationDao;
    }

    @Override
    public Result add(CvEducation cvEducation) {
    _cvEducationDao.save(cvEducation); 
       return new SuccessResult("Education added Successfully!");     }

    @Override
    public DataResult<List<CvEducation>> getAllByJobSeekerIdOrderByGraduationYearDesc(int id) {
           return new SuccessDataResult<List<CvEducation>>(_cvEducationDao.getAllByJobSeekerIdOrderByGraduationYearDesc(id),true);
    }

    @Override
    public DataResult<List<CvEducation>> getAllByJobSeekerId(int id) {
           return new SuccessDataResult<List<CvEducation>>(_cvEducationDao.getAllByJobSeekerId(id),true);
    }
}

  