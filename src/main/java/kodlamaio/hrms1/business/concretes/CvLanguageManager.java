/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kodlamaio.hrms1.business.concretes;

import kodlamaio.hrms1.business.abstracts.CvLanguageService;
import kodlamaio.hrms1.core.utilities.result.Result;
import kodlamaio.hrms1.core.utilities.result.SuccessResult;
import kodlamaio.hrms1.dataaccess.abstracts.CvLanguageDao;
import kodlamaio.hrms1.entities.concretes.CvLanguage;
import org.springframework.stereotype.Service;

/**
 *
 * @author omerfaruk
 */
@Service
public class CvLanguageManager implements CvLanguageService{

    private CvLanguageDao _cvLanguageDao;
    
    public CvLanguageManager(CvLanguageDao cvLanguageDao){
    _cvLanguageDao=cvLanguageDao;
    }
    
    @Override
    public Result add(CvLanguage cvLanguage) {
        _cvLanguageDao.save(cvLanguage);
     return new SuccessResult("Languages added Successfully!");   
    }
    
}
