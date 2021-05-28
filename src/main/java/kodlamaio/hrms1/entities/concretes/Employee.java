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
import lombok.Data;

/**
 *
 * @author omerfaruk
 */
@Data
@Entity
@Table(name="employees")
public class Employee  {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="employee_id")
     int id;
    
     @Column(name="first_name")
     String firstName;
     
     @Column(name="last_name")
     String lastName;
     
 
}
