package proje.OneOne.core.utilities.Results;

import lombok.Getter;
import lombok.Setter;

import javax.xml.crypto.Data;

public class ErrorDataResult<T> extends DataResult{
    public ErrorDataResult(T Data, String message ) {
        super(Data,false, message);
    }
    public ErrorDataResult(T Data){
        super(Data ,false);
    }
    public ErrorDataResult(String message){
        super(null,false,message);
    }
    public ErrorDataResult(){
        super(null,false);
    }
    public ErrorDataResult(T Data,boolean success ,String message){
        super(Data,false,message);
    }
    public ErrorDataResult(boolean success,String message){
        super(message ,false);
    }
}
