/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kodlamaio.hrms1.entities.concretes;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
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
   
    @NotBlank
   @NotNull
    @Column(name="first_name")     
    String firstName;
   
    @NotBlank
     @NotNull
    @Column(name="last_name") 
    String lastName;
    
    @NotBlank
     @NotNull
    @Column(name="tc_no") 
    String TcNo;
    
    @NotBlank
     @NotNull
    @Column(name="year_of_birth")  
    int yearOfBirth;
    
    @NotBlank
     @NotNull
    @Column(name="password")
     String password;
    
     @Email
     @NotBlank
     @NotNull
     @Column(name="eposta")
     String ePosta;
    
    
	@OneToMany(mappedBy = "jobSeeker")
	private List<CvEducation> cvEducations;
//
//	@OneToMany(mappedBy = "jobSeeker")
//	private List<CvJobExperience> cvJobExperiences;
//
//	@OneToMany(mappedBy = "jobSeeker")
//	private List<CvLanguage> cvLanguages;
//	
//	
//	@OneToMany(mappedBy = "jobSeeker")
//	private List<CvCoverLetter> cvCoverLetters;
//	
//	
//	@OneToOne(mappedBy = "jobSeeker")
//	private CvImage cvImage;
//        
//        @OneToMany(mappedBy = "jobSeeker")
//        private List<CvLink> links;
//    
//    
    
    
}

