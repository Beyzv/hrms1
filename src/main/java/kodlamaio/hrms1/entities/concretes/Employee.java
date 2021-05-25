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
@Table(name="employees")
public class Employee {
    
    @Id
    @GeneratedValue
    @Column(name="employees_UserId")
     int id;
    
     @Column(name="employees_firstName")
     String firstName;
     
     @Column(name="employees_lastName")
     String lastName;
     
}
