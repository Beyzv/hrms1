/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kodlamaio.hrms1.business.concretes;

import java.util.List;
import kodlamaio.hrms1.business.abstracts.JobPositionService;
import kodlamaio.hrms1.dataaccess.abstracts.JobPositionDao;
import kodlamaio.hrms1.entities.concretes.JobPosition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author omerfaruk
 */
@Service
public class JobPositionManager implements JobPositionService{

    private JobPositionDao _jobPositionDao;
    
    @Autowired
    public JobPositionManager(JobPositionDao jobPositionDao){
    _jobPositionDao=jobPositionDao;
    }
    
    @Override
    public List<JobPosition> getAll() {
     return _jobPositionDao.findAll();
    }
    
}

