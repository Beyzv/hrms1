/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kodlamaio.hrms1.dataaccess.abstracts;

import java.util.Date;
import java.util.List;
import kodlamaio.hrms1.entities.concretes.JobAdvertisement;
import org.springframework.data.jpa.repository.JpaRepository;



/**
 *
 * @author omerfaruk
 */
public interface JobAdvertisementDao extends JpaRepository<JobAdvertisement, Integer>{
    List<JobAdvertisement> getByApplicationDate(String applicationDate);
    List<JobAdvertisement> getById(int id );
    List<JobAdvertisement> getByIsActive(boolean isValid);
}
