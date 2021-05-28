/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kodlamaio.hrms1.business.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kodlamaio.hrms1.business.abstracts.AuthService;
import org.springframework.stereotype.Service;

/**
 *
 * @author omerfaruk
 */
@Service
public class AuthManager implements AuthService {

    @Override
    public boolean isEmailVerified() {
        return true;
    }

    @Override
    public boolean CheckIfRealPerson() {
        return true;

    }
      @Override
    public  boolean isEmailValid(String email) {
    
                    return true;
     
    } 
}
