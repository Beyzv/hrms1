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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
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
@Table(name="cv_language")
public class CvLanguage {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
   
    @Min(value = 1 )
    @Max(value = 5)
    @Column(name="language_level")
    private int languageLevel;
    
    @Column(name="language_name")
    private String languageName;
   
    @ManyToOne()
    @JoinColumn(name="user_id")
    private JobSeeker jobSeeker;
    
}
