/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kodlamaio.hrms1.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
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
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="employer_id")        
    int id;
     
    @NotBlank
    @NotNull
    @Column(name="website")
    String website;
    
    @NotBlank
     @NotNull
    @Column(name="company_name")
    String companyName;
    
    @NotBlank
     @NotNull
    @Column(name="phone_number")
    String phoneNumber;
    
    @NotBlank
     @NotNull
    @Column(name="eposta")
    String ePosta;
    
    @NotBlank
     @NotNull
     @Column(name="password")
    String password;
    
}
