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
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** 
 * @author omerfaruk
 */
@Data
@Entity
@Table(name="job_seekers")
@AllArgsConstructor
@NoArgsConstructor
public class JobSeeker{
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="user_id")     
    int id;
    
    @Column(name="first_name")     
    String firstName;
    
    @Column(name="last_name") 
    String lastName;
    
    @Column(name="tc_no") 
    String TcNo;
    
    @Column(name="year_of_birth")  
    int yearOfBirth;
    
    @Column(name="password")
     String password;
    
     @Column(name="eposta")
     String ePosta;
    
    
    
    
    
    
}

