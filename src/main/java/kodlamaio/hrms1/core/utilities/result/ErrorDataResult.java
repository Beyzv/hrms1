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
public class ErrorDataResult<T> extends DataResult<T> {
    
    public ErrorDataResult(T data, boolean success, String message) {
        super(data, false, message);
    }
    public ErrorDataResult(T data, boolean success) {
        super(data, false);
    }
    public ErrorDataResult() {
        super(null, false);
    }
    public ErrorDataResult( String message) {
        super(null, false, message);
    }
       public ErrorDataResult(T data, String message) {
       super(data,false, message);
    }
      public ErrorDataResult(T data) {
        super(data,false);
    }
     
}
