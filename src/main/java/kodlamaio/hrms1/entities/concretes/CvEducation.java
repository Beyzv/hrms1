/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kodlamaio.hrms1.entities.concretes;



import java.sql.Date;
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
@NoArgsConstructor
@AllArgsConstructor
@Table(name="cv_education")
public class CvEducation {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    
    @Column(name="school_name")
    private String schoolName;
    
    @Column(name="graduation_year")
    private Date graduationYear;
    
    @Column(name="school_department")
    private String schoolDepartment;
    
    @ManyToOne()
    @JoinColumn(name="user_id")
    private JobSeeker jobSeeker;
    
   public String getGraduationYear(){
       if (this.graduationYear == null) {
           return "continues";
       }
       return this.graduationYear.toString();
   }
    

}
