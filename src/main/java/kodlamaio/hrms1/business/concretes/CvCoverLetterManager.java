/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kodlamaio.hrms1.business.concretes;

import kodlamaio.hrms1.business.abstracts.CvCoverLetterService;
import kodlamaio.hrms1.core.utilities.result.Result;
import kodlamaio.hrms1.core.utilities.result.SuccessResult;
import kodlamaio.hrms1.dataaccess.abstracts.CvCoverLetterDao;
import kodlamaio.hrms1.entities.concretes.CvCoverLetter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author omerfaruk
 */
@Service
public class CvCoverLetterManager implements CvCoverLetterService {

    private CvCoverLetterDao _cvCoverLetterDao;
    
    @Autowired
     public CvCoverLetterManager(CvCoverLetterDao cvCoverLetterDao){
    _cvCoverLetterDao=cvCoverLetterDao;
     }
     
    @Override
    public Result Add(CvCoverLetter cvCoverLetter) {
          _cvCoverLetterDao.save(cvCoverLetter); 
        return new SuccessResult("Cover letter added Successfully!"); 
         
    }
  
}
