/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kodlamaio.hrms1.dataaccess.abstracts;

import java.util.List;
import kodlamaio.hrms1.entities.concretes.JobSeeker;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author omerfaruk
 */
public interface JobSeekerDao  extends JpaRepository<JobSeeker, Integer>{
   
    List<JobSeeker> getByFirstName(String firstName);
    List<JobSeeker> getById(int id );
            
}
