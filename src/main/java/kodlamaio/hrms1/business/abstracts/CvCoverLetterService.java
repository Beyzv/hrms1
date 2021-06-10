/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kodlamaio.hrms1.business.abstracts;

import kodlamaio.hrms1.core.utilities.result.Result;
import kodlamaio.hrms1.entities.concretes.CvCoverLetter;

/**
 *
 * @author omerfaruk
 */
public interface CvCoverLetterService {
     Result Add(CvCoverLetter cvCoverLetter);
}
