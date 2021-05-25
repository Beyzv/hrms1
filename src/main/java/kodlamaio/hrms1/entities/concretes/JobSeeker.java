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
@Table(name="jobSeekers")
public class JobSeeker {
    
    @Id
    @GeneratedValue
    @Column(name="jobSeekers_UserId")     
    int id;
    
    @Column(name="jobSeekers_firstName")     
    String firstName;
    
    @Column(name="jobSeekers_lastName") 
    String lastName;
    
    @Column(name="jobSeekers_TcNo") 
    String TcNo;
    
    @Column(name="jobSeekers_yearOfBirth")  
    int yearOfBirth;
    
}

