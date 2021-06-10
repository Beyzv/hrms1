/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kodlamaio.hrms1.business.concretes;

import kodlamaio.hrms1.business.abstracts.CvLinkService;
import kodlamaio.hrms1.core.utilities.result.Result;
import kodlamaio.hrms1.core.utilities.result.SuccessResult;
import kodlamaio.hrms1.dataaccess.abstracts.CvLinkDao;
import kodlamaio.hrms1.entities.concretes.CvLink;
import org.springframework.stereotype.Service;

/**
 *
 * @author omerfaruk
 */
@Service
public class CvLinkManager implements CvLinkService{

    private CvLinkDao _cvLinkDao;
    
    public CvLinkManager(CvLinkDao cvLinkDao){
    _cvLinkDao=cvLinkDao;
    }
    
    @Override
    public Result add(CvLink cvLink) {
        _cvLinkDao.save(cvLink);
     return new SuccessResult("Links added Successfully!");  
    }
    
}
