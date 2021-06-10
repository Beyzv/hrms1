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
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author omerfaruk
 */
@Data
@Entity
@Table(name="cv_link")
@AllArgsConstructor
@NoArgsConstructor
public class CvLink {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    
    @Column(name="linked_in_url")
    private String linkedInUrl;
    
    @Column(name="git_hub_url")
    private String gitHubUrl;
  
    @ManyToOne()
    @JoinColumn(name="user_id")
    private JobSeeker jobSeeker;
  
}
