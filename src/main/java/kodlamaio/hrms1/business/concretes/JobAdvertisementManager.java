/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kodlamaio.hrms1.business.concretes;

import java.util.Date;
import java.util.List;
import kodlamaio.hrms1.business.abstracts.JobAdvertisementService;
import kodlamaio.hrms1.core.utilities.result.DataResult;
import kodlamaio.hrms1.core.utilities.result.Result;
import kodlamaio.hrms1.core.utilities.result.SuccessDataResult;
import kodlamaio.hrms1.core.utilities.result.SuccessResult;
import kodlamaio.hrms1.dataaccess.abstracts.JobAdvertisementDao;
import kodlamaio.hrms1.entities.concretes.JobAdvertisement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author omerfaruk
 */
@Service
public class JobAdvertisementManager implements JobAdvertisementService{

    private JobAdvertisementDao _jobAdvertisementDao;
    
    @Autowired
     public JobAdvertisementManager( JobAdvertisementDao jobAdvertisementDao){
     _jobAdvertisementDao=jobAdvertisementDao;
     }
     
    @Override
    public DataResult<List<JobAdvertisement>> getAll() {
    return new SuccessDataResult<List<JobAdvertisement>>(_jobAdvertisementDao.findAll(),true,"Data Listed") ;
    }

    @Override
    public Result add(JobAdvertisement jobAdvertisement) {
    _jobAdvertisementDao.save(jobAdvertisement) ;
    return new SuccessResult("Job advertisement added Successfully! ");
    }

    @Override
    public DataResult<List<JobAdvertisement>> getByApplicationDate(String applicationDate) {
return new SuccessDataResult<List<JobAdvertisement>>(_jobAdvertisementDao.getByApplicationDate(applicationDate) ,true);
    
    }

    @Override
    public DataResult<List<JobAdvertisement>> getByIsActive(boolean isActive) {
   return new SuccessDataResult<List<JobAdvertisement>>(_jobAdvertisementDao.getByIsActive(isActive) ,true);
    }
     

    
}
