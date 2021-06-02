/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kodlamaio.hrms1.entities.concretes;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 *
 * @author omerfaruk
 */
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="job_advertisement")
public class JobAdvertisement {
  
     @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
            
    @Column(name="max_salary")
    private float maxSalary;
    
    @Column(name="min_salary")
    private float minSalary;
    
    @Column(name="application_date")
    private String applicationDate;
    
    @Column(name="job_description")
    private String jobDescription;
    
    @Column(name="number_of_vacancies")
    private int numberOfVacancies;
    
    @Column(name="is_active")
    private boolean isActive;

     @Column(name="city_name")
      private String cityName;
          
     @ManyToOne()
     @JoinColumn(name="employer_id")
     private Employer employer;
           
     @ManyToOne()
     @JoinColumn(name="job_position_id")
      private JobPosition jobPositions;
}
