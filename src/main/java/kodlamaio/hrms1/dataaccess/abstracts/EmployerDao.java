/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kodlamaio.hrms1.dataaccess.abstracts;

import java.util.List;
import kodlamaio.hrms1.entities.concretes.Employer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author omerfaruk
 */
public interface EmployerDao extends JpaRepository<Employer, Integer> {
  
    List<Employer> getByWebsite(String website);
    List<Employer> getById(int id );
}
