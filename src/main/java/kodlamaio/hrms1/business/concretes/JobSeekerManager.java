/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kodlamaio.hrms1.business.concretes;

import java.util.List;
import kodlamaio.hrms1.business.abstracts.AuthService;
import kodlamaio.hrms1.business.abstracts.JobSeekerService;
import kodlamaio.hrms1.core.utilities.result.DataResult;
import kodlamaio.hrms1.core.utilities.result.ErrorResult;
import kodlamaio.hrms1.core.utilities.result.Result;
import kodlamaio.hrms1.core.utilities.result.SuccessDataResult;
import kodlamaio.hrms1.core.utilities.result.SuccessResult;
import kodlamaio.hrms1.dataaccess.abstracts.JobSeekerDao;
import kodlamaio.hrms1.entities.concretes.JobSeeker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 *
 * @author omerfaruk
 */
@Service
public class JobSeekerManager implements JobSeekerService{

     private JobSeekerDao _jobSeekerDao;
     private AuthService  _authService;
  
     @Autowired
     public JobSeekerManager(JobSeekerDao jobSeekerDao,AuthService  authService){
     _jobSeekerDao=jobSeekerDao;
     _authService=authService;
     }
  

    @Override
    public DataResult<List<JobSeeker>> getAll() {
    return new SuccessDataResult<List<JobSeeker>>(_jobSeekerDao.findAll(), true, "Data Listed");
    }
 
    @Override
    public Result Register(JobSeeker jobSeeker) {
             if(_authService.CheckIfRealPerson() && _authService.isEmailVerified()&& _authService.isEmailValid(jobSeeker.getEPosta())){
           _jobSeekerDao.save(jobSeeker);
           return new SuccessResult("User Registration Successful! Please Login.");  }
             else{
            return new ErrorResult("User Registration is NOT Successful! Please try later"); } 
     
    }

    @Override
    public DataResult<List<JobSeeker>> getById(int id) {
       return new SuccessDataResult<List<JobSeeker>>(_jobSeekerDao.getById(id), true);
    }

}

 
    

