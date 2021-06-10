/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kodlamaio.hrms1.business.concretes;

import kodlamaio.hrms1.business.abstracts.CvImageService;
import kodlamaio.hrms1.core.utilities.result.Result;
import kodlamaio.hrms1.core.utilities.result.SuccessResult;
import kodlamaio.hrms1.dataaccess.abstracts.CvImageDao;
import kodlamaio.hrms1.entities.concretes.CvImage;
import org.springframework.stereotype.Service;

/**
 *
 * @author omerfaruk
 */
@Service
public class CvImageManager implements CvImageService{

    private CvImageDao _cvImageDao;
    
    public CvImageManager(CvImageDao cvImageDao){
    _cvImageDao=cvImageDao;
    }
    
    @Override
    public Result Add(CvImage cvImage) {
        _cvImageDao.save(cvImage);
        return new SuccessResult("Image added Successfully!");     
    }
    
}
