/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kodlamaio.hrms1.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author omerfaruk
 */
@Data
@Entity
@Table(name="employer")
public class Employer {
            
    @Id
    @GeneratedValue
    @Column(name="employer_UserId")        
    int id;
     
    @Column(name="emloyer_website")
    String website;
    
    @Column(name="emloyer_companyName")
    String companyName;
    
    @Column(name="emloyer_PhoneNumber")
    String phoneNumber;
        
}
