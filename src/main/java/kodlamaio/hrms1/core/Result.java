/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kodlamaio.hrms1.core;

/**
 *
 * @author omerfaruk
 */
public class Result {
    
    private boolean success;
    private String _message;
    
    public Result(boolean success,String message){
      this(success);  
      _message=message;
    }
  
    public Result(boolean success){
       this.success=success;
    }

    /**
     * @return the _success
     */
    public boolean isSuccess() {
        return success;
    }

    /**
     * @return the _message
     */
    public String getMessage() {
        return _message;
    }
}
