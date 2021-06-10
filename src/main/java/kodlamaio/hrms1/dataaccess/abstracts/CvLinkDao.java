/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kodlamaio.hrms1.dataaccess.abstracts;

import kodlamaio.hrms1.entities.concretes.CvLink;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author omerfaruk
 */
public interface CvLinkDao extends JpaRepository<CvLink,Integer> {
    
}
