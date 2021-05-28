/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kodlamaio.hrms1.business.abstracts;

import java.util.List;
import kodlamaio.hrms1.core.utilities.result.DataResult;
import kodlamaio.hrms1.core.utilities.result.Result;
import kodlamaio.hrms1.entities.concretes.Employer;

/**
 *
 * @author omerfaruk
 */
public interface EmployerService {
     
    Result Register(Employer employer);
    DataResult<List<Employer>>  getAll();   
    DataResult<List<Employer>> getById(int id );  
}
