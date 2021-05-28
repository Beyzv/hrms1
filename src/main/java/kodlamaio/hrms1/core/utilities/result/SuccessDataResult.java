/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kodlamaio.hrms1.core.utilities.result;

/**
 *
 * @author omerfaruk
 */
public class SuccessDataResult<T> extends DataResult<T> {
    
    public SuccessDataResult(T data, boolean success) {
        super(data, success);
    }
    
    public SuccessDataResult(T data, boolean success, String message) {
        super(data, success, message);
    }
 
    public SuccessDataResult() {
        super(null,true);
    }
        public SuccessDataResult(String message) {
        super(null,true, message);
    }   

 
    
}
