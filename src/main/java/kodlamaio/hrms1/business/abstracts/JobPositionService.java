/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kodlamaio.hrms1.business.abstracts;

import java.util.List;
import kodlamaio.hrms1.entities.concretes.JobPosition;

/**
 *
 * @author omerfaruk
 */
public interface JobPositionService {
     List<JobPosition> getAll();
}