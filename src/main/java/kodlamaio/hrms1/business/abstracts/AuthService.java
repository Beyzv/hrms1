/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kodlamaio.hrms1.business.abstracts;

/**
 *
 * @author omerfaruk
 */
public interface AuthService {
    
     boolean isEmailVerified();
     boolean CheckIfRealPerson();
    boolean isEmailValid(String email);
}
