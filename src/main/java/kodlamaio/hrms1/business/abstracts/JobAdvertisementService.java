/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kodlamaio.hrms1.business.abstracts;

import java.util.Date;
import java.util.List;
import kodlamaio.hrms1.core.utilities.result.DataResult;
import kodlamaio.hrms1.core.utilities.result.Result;
import kodlamaio.hrms1.entities.concretes.JobAdvertisement;

/**
 *
 * @author omerfaruk
 */
public interface JobAdvertisementService {
    
     DataResult<List<JobAdvertisement>> getAll();
     Result add(JobAdvertisement jobAdvertisement);
     DataResult<List<JobAdvertisement>> getByApplicationDate(String applicationDate);  
     DataResult<List<JobAdvertisement>>  getByIsActive(boolean isActive);
}
