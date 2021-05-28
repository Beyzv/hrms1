/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kodlamaio.hrms1.business.concretes;

//import java.util.List;

import java.util.List;
import kodlamaio.hrms1.business.abstracts.AuthService;
import kodlamaio.hrms1.business.abstracts.EmployerService;
import kodlamaio.hrms1.core.utilities.result.DataResult;
import kodlamaio.hrms1.core.utilities.result.ErrorResult;
import kodlamaio.hrms1.core.utilities.result.Result;
import kodlamaio.hrms1.core.utilities.result.SuccessDataResult;
import kodlamaio.hrms1.core.utilities.result.SuccessResult;
import kodlamaio.hrms1.dataaccess.abstracts.EmployerDao;
import kodlamaio.hrms1.entities.concretes.Employer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author omerfaruk
 */
@Service
public class EmployerManager implements EmployerService{

    private EmployerDao _employerDao;
    private AuthService  _authService;
   
    @Autowired
     public EmployerManager(EmployerDao employerDao,AuthService  authService){
     _employerDao=employerDao;
     _authService=authService;
     }
   
     @Override
    public Result Register(Employer employer) {
     if(_authService.isEmailVerified()&& _authService.isEmailValid(employer.getEPosta())){
           _employerDao.save(employer);
           return new SuccessResult("User Registration Successful! Please Login.");  }
             else{
            return new ErrorResult("User Registration is NOT Successful! Please try later"); }     }

    @Override
    public DataResult<List<Employer>> getAll() {
  return new SuccessDataResult<List<Employer>>(_employerDao.findAll(), true);
    }

    @Override
    public DataResult<List<Employer>> getById(int id) {
      return new SuccessDataResult<List<Employer>>(_employerDao.getById(id),true);
        }

}
