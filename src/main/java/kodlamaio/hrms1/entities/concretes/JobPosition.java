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
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author omerfaruk
 */
@Data
@Entity
@Table(name="job_position")
@AllArgsConstructor
@NoArgsConstructor
public class JobPosition {
    
    @Id
    @GeneratedValue
    @Column(name="job_position_id")
    int id;
    
    @Column(name="job_position_position_name")
    String name;
}
